package com.tns.inheritance;

public class LevelOneEmployee extends Employee{
	private String project;

	public LevelOneEmployee() {
		super();
	}

	public LevelOneEmployee(String name, int age, String city,String eid, String position, int sal,String project) {
		super(name,age,city,eid,position,sal);
		this.project = project;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "LevelOneEmployee[Employee name="+super.getName()+"Employee age="+super.getAge()+"Employee city="+super.getCity()+"eid="+super.getEid()+"position=" +super.getPosition() + "sal=" +super.getSal() + "project=" + project+ "]";
	}
	
}
