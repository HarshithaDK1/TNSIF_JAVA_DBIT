package com.tns.collections;

import java.util.Collections;
import java.util.ArrayList;

public class listDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Is the ArrayList empty? " + list.isEmpty());
		System.out.println("The size of the ArrayList: " + list.size());
		
		list.add(6);
		list.add(13);
		list.add(4);
		
		System.out.println("Element at position 0: "+list.get(0));
		System.out.println("Full list: "+list);
		
		boolean c = list.contains(4);
		System.out.println("Does list contain 4? "+c);
		
		list.remove(1);
		System.out.println("After removing index 1: "+list);
		
		Collections.sort(list);
		System.out.println("Sortedd list: "+list);
	}
}
