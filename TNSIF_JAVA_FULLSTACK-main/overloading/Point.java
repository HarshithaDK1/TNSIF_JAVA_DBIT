package com.tns.overloading;

public class Point {
	private float x;
	private float y;
	public Point() {
		x=0.0f;
		y=0.0f;
		System.out.println("Default constructor");
	}
	public Point(float x) {
		super();
		this.x = x;
	}
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
