package com.tns.constructor;

public class Customer_Demo {

	public static void main(String[] args) {
		Customer c1= new Customer();
		c1.setCid(105);
		c1.setCity("Bangalore");
		c1.setName("Supriya");
		System.out.println(c1);
		
		Customer c2= new Customer(106,"Ramnagar","Suraiya");
		System.out.println(c2);
	}

}
