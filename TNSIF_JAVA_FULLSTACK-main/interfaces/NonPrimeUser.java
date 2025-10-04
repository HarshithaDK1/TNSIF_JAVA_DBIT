package com.tns.interfaces;

public class NonPrimeUser implements Amazon {

	@Override
	public void welcome() {
		System.out.println("Welcome Suma ,a non prime member");
	}

	@Override
	public void thankyou() {
		System.out.println("Thank you Suma ,a non prime member");
	}

}
