package com.coderscampus.week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListApplication {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Mike Hunt");
		names.add("Shit C. Face");
		names.add("Tom & Crow");
		names.add("Spud P Cochran Eternal Slumber Lord");
		
		//Arrays.sort = collections.sort when using lists
		
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		//example 1 of creating a lambda expression 
		Collections.sort(names, (String o1, String o2) -> o2.compareTo(o1));
		
		//example 2 of creating a lambda expression
		Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
		
		//example 3 of creating a lambda expression\
		Collections.sort(names, (String o1, String o2) -> { return o2.compareTo(o1); });
		//or 
		Collections.sort(names, (String o1, String o2) -> {
			if (o2 != null && o1 != null) {
				return o2.compareTo(o1);
			} else {
				}
			
			
		printArrayListToConsole(names);
		
		}
		
	}

	}

	private static void printArrayListToConsole(List<String> names) {
		for (String name : names) {
            System.out.println(name);}
		
	}
} 