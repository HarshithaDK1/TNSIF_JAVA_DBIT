package com.tns.encapsulation;

public class Student {
	private int sid;
	private String name;
	private float avg;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + sid + ", Name=" + name + ", Avg=" + avg + "]";
	}
	
}
