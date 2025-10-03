package com.tns.encapsulation;

public class ProductDemo {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.setProductid(1);
		product.setProductName("Laptop");
		product.setPrice(65676.89);
		
		System.out.println("Product ID :"+product.getProductid());
		System.out.println("Product Name :"+product.getProductName());
		System.out.println("Product Price :"+product.getPrice());
	}

}
