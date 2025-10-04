package com.tns.generic_Example;

import java.util.ArrayList;
import java.util.List;

public class GenericInventory<T> {
    private List<T> items;

    public GenericInventory() {
        items = new ArrayList<>();
    }
    public void addItem(T item) {
        items.add(item);
    }
    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getAllItems() {
        return items;
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
