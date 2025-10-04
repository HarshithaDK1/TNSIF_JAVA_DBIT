package com.tns.exception;

class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0;
		try {
			int a= 42/d;
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled" + e.getMessage());
		}
		
		finally {
			System.out.println("it will always execute");
		}
		System.out.println("Will not be printed");
	

	}
}