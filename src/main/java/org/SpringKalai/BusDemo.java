package org.SpringKalai;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) throws ParseException {
        ArrayList<Bus> buses  = new ArrayList<>();
        buses.add(new Bus(1,true,45));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,50));

        ArrayList<Booking> bookings = new ArrayList<>();

        for(Bus b : buses){
             b.displayBusInfo();
        }
        int useroption = 1;
       Scanner scanner = new Scanner(System.in);

        while(useroption == 1) {
            System.out.println("Enter 1 to Book And Enter 2 To Exit:");
           useroption = scanner.nextInt();

           if(useroption == 1){
               Booking booking = new Booking();
               if(booking.isAvailable(bookings,buses)){
                bookings.add(booking);
                   System.out.println("Your Booking Is Confirmed");
               }
               else System.out.println("Sorry.Bus is Full.Try Another Bus Or Date.");
           }

        }
    }
}
