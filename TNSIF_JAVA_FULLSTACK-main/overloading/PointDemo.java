package com.tns.overloading;

public class PointDemo {

	public static void main(String[] args) {
		Point p1=new Point();
		System.out.println(p1);
		Point p2=new Point(0.2f,0.5f);
		System.out.println(p2);
		Point p3=new Point(0.2f);
		System.out.println(p3);

	}

}
