package com.tns.collection;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List ob =new ArrayList<>();
		ob.add(4);
		ob.add(6);
		ob.add("abc");
		ob.add(13.65f);
		ob.add(4);
		ob.add(null);
		System.out.println(ob);
		
		
		boolean c=ob.contains(4);
		System.out.println(c); 
		
		boolean d=ob.isEmpty();
		System.out.println(d);
		
		ob.remove(2);
		System.out.println(ob);
		
		
		
		
		
		
	}

}
