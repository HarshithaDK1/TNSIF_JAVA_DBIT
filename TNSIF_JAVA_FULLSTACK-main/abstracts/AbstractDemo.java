package com.tns.abstracts;

public abstract class AbstractDemo {
	abstract void calculate();
	protected float area;
	
	void display() {
		System.out.println("Area of the given polynomial " +  area);
	}
}
