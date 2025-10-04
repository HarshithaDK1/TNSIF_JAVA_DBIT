package com.tns.exceptionhandling;

import java.util.Scanner;

public class User {
	private static int age;
	
	static void validate() throws Age{
		System.out.println("Enter age: ");
		Scanner sc= new Scanner(System.in);
		age=sc.nextInt();
		if(age<18) {
			throw new Age("Invalid age.");
		}else {
			System.out.println("Valid age.");
		}
	}
}
