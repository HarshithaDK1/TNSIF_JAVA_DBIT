package com.tns.abstracts;

public class Circle extends AbstractDemo {
	protected float r;

	@Override
	void calculate() {
		super.area=3.14f*r*r;
	}
	 public Circle(float r) {
		    super();
		    this.r=0.3f;
	 }
	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

}
