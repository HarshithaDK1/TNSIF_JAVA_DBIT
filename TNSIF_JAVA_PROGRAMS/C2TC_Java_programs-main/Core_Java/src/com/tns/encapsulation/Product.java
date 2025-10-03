package com.tns.encapsulation;

public class Product {
	private int productid;
	private String productName;
	private double price;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
		else {
			this.price=-1;
			System.out.println("invalid price");
		}

	}
	
	
}
