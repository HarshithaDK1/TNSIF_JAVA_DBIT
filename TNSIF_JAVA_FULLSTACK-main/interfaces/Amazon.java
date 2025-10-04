package com.tns.interfaces;

public interface Amazon {
	void welcome();
	void thankyou();
	
	default void servicecharge() {
		int amt=100;
		System.out.println("The service charge is "+ amt);
	}
	static void about() {
		System.out.println("This is an e-commerce website");
	}
}
