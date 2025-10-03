package com.tns.abstractclass;

public class Circle extends AbstractDemo{
	protected float r;

	public Circle(float r) {
		super();
		this.r = 0.1f;
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		super.area=3.14f*r*r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

}
