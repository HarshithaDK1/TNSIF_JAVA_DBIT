package com.tns.encapsulation;

public class StidentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setSid(105);
		s1.setName("Supriya");
		s1.setAvg(95.4f);
		System.out.println(s1);
		
		Student s2=new Student();
		
		s2.setSid(106);
		s2.setName("Suraiya");
		s2.setAvg(93.1f);
		System.out.println(s2);
		
		Student s3=new Student();
		
		s3.setSid(109);
		s3.setName("Taiyaba");
		s3.setAvg(91.1f);
		System.out.println("Average of Taiyaba is"+s3.getAvg());
	}

}
