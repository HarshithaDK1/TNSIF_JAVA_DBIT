package com.tns.interfaces;

public class PrimeUser implements Amazon {
	@Override
	public void welcome() {
		System.out.println("Welcome Ravi ,a prime member");
	}

	@Override
	public void thankyou() {
		// TODO Auto-generated method stub
		System.out.println("Thank you Ravi ,a prime member");
	}

}
