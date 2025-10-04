package com.tns.constructor;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		

		Student s1 = new Student();

       
        Commission c1 = new Commission();
        c1.acceptDetails();
        c1.calculateCommission();
    }
}


class Student {
  
    Student() {
        System.out.println("Student object is created");
    }
}


class Commission {
   
    String name, address, phone;
    double sales_amount;

    
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        sales_amount = sc.nextDouble();
    }

    
    void calculateCommission() {
        double commission = 0;

        if (sales_amount >= 100000) {
            commission = sales_amount * 0.10;
        } else if (sales_amount >= 50000) {
            commission = sales_amount * 0.05;
        } else if (sales_amount >= 30000) {
            commission = sales_amount * 0.03;
        }

        System.out.println("\nEmployee Commission Details:");
        System.out.println("Name: " + name);
        System.out.println("Sales Amount: " + sales_amount);
        System.out.println("Commission Earned: " + commission);
    }
}
