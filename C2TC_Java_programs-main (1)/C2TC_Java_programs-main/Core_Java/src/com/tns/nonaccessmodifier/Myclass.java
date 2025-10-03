package com.tns.nonaccessmodifier;

public class Myclass {
private int section;
static int srNo;

static {
	System.out.println("Static block");
	
}
public Myclass() {
	super();
	System.out.println("default constructor");
}
static void display() {
	System.out.println("Static method");
	
	
}
@Override
public String toString() {
	return "Myclass [section=" + section + "]";
}



}
