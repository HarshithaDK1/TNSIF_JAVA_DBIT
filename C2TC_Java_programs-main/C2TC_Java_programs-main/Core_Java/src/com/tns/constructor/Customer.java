package com.tns.constructor;

public class Customer {
	private int cid;
	private String city;
	private String name;
	
	
	public Customer() {
		super();
	}
	
	
	public Customer(int cid, String city, String name) {
		super();
		this.cid = cid;
		this.city = city;
		this.name = name;
	}


	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", city=" + city + ", name=" + name + "]";
	}
	

}
