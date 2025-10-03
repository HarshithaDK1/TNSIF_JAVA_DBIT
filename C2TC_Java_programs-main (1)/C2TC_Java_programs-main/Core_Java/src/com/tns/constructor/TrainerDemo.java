package com.tns.constructor;

public class TrainerDemo {

	public static void main(String[] args) {
		Trainer t1=new Trainer();
		t1.setEname("Priya");
		t1.setEid(101);
		t1.setDesignation("Doctor");
		t1.setCity("Chennai");
		System.out.println(t1);
		
		Trainer t2=new Trainer(102,"Priyanka","SoftEngineer","Bangalore");
		System.out.println(t2);
		
		Trainer t3=new Trainer(103,"Preeti");
		t3.setDesignation("softDeveloper");
		t3.setCity("Krpuram");
		System.out.println(t3);
	}

}
