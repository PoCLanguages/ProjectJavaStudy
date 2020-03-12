package com.gft.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		// HashSet does not retain order
//		Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSet remember the order you added items in
		// Set<String> set1 = new LinkedHashSet<String>();
		
		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();
				
		if(set1.isEmpty()) {
			System.out.println("Set is empty");
		}
		
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		// Adding duplicate items does nothing
		set1.add("mouse");

		if(set1.isEmpty()) {
			System.out.println("Set is empty after adding (no!)");
		}
		
		
		System.out.println(set1);
		
		/////////////// Iteration ////////////////
		for (String element : set1) {
			System.out.println(element);
		}
		
		/////////////// Does set contains a given item? ////////////////
		if(set1.contains("aardvark")){
			System.out.println("Contains aadvark");
		}

		if(set1.contains("cat")){
			System.out.println("cat");
		}

		Set<String> set2 = new TreeSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");

		
		/////////////// Intersection  ////////////////
		Set<String> intersection = new HashSet<String>(set1);		
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		
		/////////////// Difference  ////////////////
		Set<String> intersection2 = new HashSet<String>(set1);		
		intersection2.removeAll(set2);
		System.out.println(intersection2);
		
	}

}
