package com.tns.constructor;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter full name:");
		String name=sc.nextLine();
		System.out.println("Enter roll:");
		long rollNo=sc.nextLong();
		System.out.println("Enter grade:");
		char grade=sc.next().charAt(0);
		System.out.println("Enter percentage:");
		String percentage=sc.next();
		System.out.println(" Student detials");
		System.out.println(name);
		System.out.println(rollNo);
        System.out.println(grade);
        System.out.println(percentage);
        sc.close();

	}

}
