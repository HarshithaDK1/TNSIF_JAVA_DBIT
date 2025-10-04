package com.tns.overriding;

public class SBI extends RBI {
	
	@Override
    public float getRateOfInterest() {
        return 7.2f;  
    }

	public static void main(String[] args) {     
		RBI r1 = new RBI();
		RBI r2 = new SBI();
        System.out.println("RBI Rate of Interest: " + r1.getRateOfInterest() + "%");
        System.out.println("SBI Rate of Interest: " + r2.getRateOfInterest() + "%");
	}
}
