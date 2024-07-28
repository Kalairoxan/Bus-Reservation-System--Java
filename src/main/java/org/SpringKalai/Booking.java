package org.SpringKalai;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking()  {                                        //Constructor  it calls when object is created
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name(Passenger): "); //Collecting Data From Passenger To Book Ticket
        passengerName = scanner.next();

        System.out.println("Enter The Bus No:");
        busNo = scanner.nextInt();

        System.out.println("Enter Date dd--mm--yyyy");
        String dateInput = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd--MM--yyyy");  //Since SimpleDateFormat Is a class used to  Convert your String into Date format
        try {
            date  =  dateFormat.parse(dateInput);          //Handling the Exceptions
        } catch (ParseException e) {
            throw new RuntimeException(e);
    }

    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){ //Method () isAvailable perameter of (<Booking>,<Bus>)
        int capacity = 0;
        for(Bus bs:buses){ //Bus is an DataType and bs is an variable name || we 're reading the data from buses Ararylist objectReference

         if(bs.getBusNo() == busNo ) //getBusNO is an getter of Bus class and busNo is an instanace varaible of Booking Class (passenger)
             capacity = bs.getCapacity(); //bs is an vaiable reference of forEachLoop || .getCapacity will Return the Capacity of the bus From the Bus Class
        }

        int booked = 0;
        for(Booking b :bookings){
            if(b.busNo == busNo && b.date.equals(date)){ //b.busNo is old || and we're comparing that with new busNo && date
                booked = booked + 1;
            }
        }
        return  booked<capacity?true:false;
    }
}
