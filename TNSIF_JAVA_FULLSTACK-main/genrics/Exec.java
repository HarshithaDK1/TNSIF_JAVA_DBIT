package com.tns.genrics;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericProgram<String> obj=new genericProgram();
		obj.setData("Hello");
		System.out.println("The string obj is " +obj.getData());
		
		genericProgram<Integer> iobj=new genericProgram();
		iobj.setData(22);
		System.out.println("The string obj is " +iobj.getData());
	
		genericProgram<Double> jobj=new genericProgram();
		jobj.setData(22.5);
		System.out.println("The string obj is " +jobj.getData());
	}

}
