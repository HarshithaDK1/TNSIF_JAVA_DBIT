package com.tns.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class intermediateOperations {
	
	public static void main(String[] args) {
		
		List<String>li = Arrays.asList("Monday","Tuesday","Wednesday");
		
		List<String>up = li.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(up);
		
		List<Integer>even=Arrays.asList(1,2,3,4,5,6);
		
		List<Integer>le=even.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(le);
	}
}
