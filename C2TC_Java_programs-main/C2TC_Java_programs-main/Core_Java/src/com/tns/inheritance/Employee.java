package com.tns.inheritance;

public class Employee extends Company {
	private String eid;
	private String position;
	private int sal;
	public Employee() {
		super();
	}
	public Employee(String name, int age, String city,String eid, String position, int sal) {
		super(name,age,city);
		this.eid = eid;
		this.position = position;
		this.sal = sal;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [Employee name="+super.getName()+"Employee age="+super.getAge()+"Employee city="+super.getCity()+"eid=" +eid+ ", position=" + position + ", sal=" + sal + "]";
	}
	

}
