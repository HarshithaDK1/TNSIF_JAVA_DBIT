package com.tns.abstractclass;

public class Square extends AbstractDemo{
	protected float s;

	public Square(float s) {
		super();
		this.s = 0.2f;
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		super.area=s*s;
	}

	@Override
	public String toString() {
		return "Square [s=" + s + "]";
	}
	

}
