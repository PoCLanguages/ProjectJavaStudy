package com.gft.java;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		// HashSet does not retain order
		Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSet remember the order you added items in
		// Set<String> set1 = new LinkedHashSet<String>();
		
		// TreeSet sorts in natural order
		//Set<String> set1 = new TreeSet<String>();
				
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		

		System.out.println(set1);
	}

}
