package com.tns.abstracts;

public class Square extends AbstractDemo{
	protected float s;
	public Square(float s) {
	    super();
	    this.s=0.2f;
	}
	void calculate() {
		super.area=s*s;
	}

	@Override
	public String toString() {
		return "Square [s= " + s + "]";
	}
}
