package com.tns.constructor;

public class Trainer {
	private int eid;
    private String ename;
    private String designation;
    private String city;
	public Trainer() {
		super();
	}
	public Trainer(int eid, String ename, String designation, String city) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
		this.city = city;
	}
	public Trainer(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trainer [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", city=" + city + "]";
	}
    
    

}
