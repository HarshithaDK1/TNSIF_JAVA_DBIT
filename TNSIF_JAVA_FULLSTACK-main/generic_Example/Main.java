package com.tns.generic_Example;

public class Main {
    public static void main(String[] args) {
        GenericInventory<Product> productInventory = new GenericInventory<>();

        Product p1 = new Product("P101", "Laptop", 75000.00);
        Product p2 = new Product("P102", "Smartphone", 25000.00);
        Product p3 = new Product("P103", "Headphones", 1500.00);

        productInventory.addItem(p1);
        productInventory.addItem(p2);
        productInventory.addItem(p3);

        System.out.println("Product Inventory:");
        productInventory.displayItems();

        productInventory.removeItem(p2);

        System.out.println("\nAfter removing one product:");
        productInventory.displayItems();
    }
}
