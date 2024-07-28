package org.SpringKalai;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) throws ParseException {
        ArrayList<Bus> buses  = new ArrayList<>();      //by the contructor passing the perameter of busNO,ac,capacity we're creating the
                                                         // arraylist to creating a  seqeunce of  object also
        buses.add(new Bus(1,true,45));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,50));
        buses.add(new Bus(4,false,15));

        for(Bus b : buses){
            b.displayBusInfo();
        }
        ArrayList<Booking> bookings = new ArrayList<>(); //creating the array list to stores the booking data for passengers

        int useroption = 1;
        Scanner scanner = new Scanner(System.in);

        while(useroption == 1) {
            System.out.println("Enter 1 to Book And Enter 2 To Exit:");
            useroption = scanner.nextInt();

           if(useroption == 1){
             Booking bookobj = new Booking(); //creating an object of booking to attain the access oof busNo,passengerName,Date;

               if(bookobj.isAvailable(bookings,buses)){ // isAvailble is an Method of Booking Class And we are passing an (buses) data form Arraylist
                                                        // and passing an booking data form ArrayList

                   bookings.add(bookobj);                   ///We're adding an (Booking of passenger) bookobj to booking List(ArrayList())
                   System.out.println("Your Booking Is Confirmed");
               }
               else System.out.println("Sorry.Bus is Full.Try Another Bus Or Date.");
           }

        }
    }
}
