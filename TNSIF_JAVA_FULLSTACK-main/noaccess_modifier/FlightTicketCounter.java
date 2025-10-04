package com.tns.noaccess_modifier;
import java.util.Scanner;

public class FlightTicketCounter {
	public static void main(String[] args) {
		int totalSeats = 10;
		int bookedseats=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(bookedseats<totalSeats) {
			System.out.println("Seats available: "+(totalSeats-bookedseats));
			System.out.print("Enter number of seats to book: ");
			
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid number of seats!");
            } else if (bookedseats + n > totalSeats) {
                System.out.println("Not enough seats available!");
            } else {
                bookedseats += n;
                System.out.println("Booking successful! Seats booked: " + n);
            }
            
        }
        System.out.println("All seats are booked. No seats available.");
        sc.close();
		}

}
