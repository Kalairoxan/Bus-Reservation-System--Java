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

    Booking() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name(Passenger): ");
        passengerName = scanner.next();

        System.out.println("Enter The Bus No:");
        busNo = scanner.nextInt();

        System.out.println("Enter Date dd--mm--yyyy");
        String dateInput = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd--MM--yyyy");
        try {
            date  =  dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
    }

    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
        int capacity = 0;
        for(Bus bus:buses){
         if(bus.getBusNo() == busNo )
            capacity = bus.getCapacity();
        }
        int booked = 0;
        for(Booking b :bookings){
            if(b.busNo == busNo && b.date.equals(date)){
                booked = booked + 1;

            }
        }
        return  booked<capacity?true:false;
    }
}
