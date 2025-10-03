package com.tns.inheritance;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1=new Company("Supriya",22,"Bangalore");
		System.out.println(c1);
		Employee s1=new Employee("Priya",22,"Chennai","101","sales_manager",40000);
		System.out.println(s1);
		Employee s2=new Employee("Supriya",22,"Bangalore","105","sales_executive",50000);
		System.out.println(s2);
		Employee s3=new Employee("Priyanka",21,"Chennai","102","CEO",80000);
		System.out.println(s3);
		LevelOneEmployee l1=new LevelOneEmployee("Priya",22,"Chennai","101","sales_manager",40000,"Java");
		System.out.println(l1);
		LevelOneEmployee l2=new LevelOneEmployee("Supriya",22,"Bangalore","101","sales_executive",40000,"Python");
		System.out.println(l2);
		LevelOneEmployee l3=new LevelOneEmployee("Priyanka",21,"Chennai","101","CEO",40000,"AIML");
		System.out.println(l3);
	}
	

}
