package com.coderscampus.week9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApplication {

	public static void main(String[] args) {
		Set<Person> people = new HashSet<>();
		
		people.add(new Person(111111111, "Mike", "Hunt"));
		people.add(new Person(222222222, "Shit C.", "Face"));
		
		
		//example1();
	}

	private static void example1() {
		Set<Integer> uniqueNumbers = new LinkedHashSet<>();
		
		System.out.println(uniqueNumbers.add(1));
		System.out.println(uniqueNumbers.add(2));
		System.out.println(uniqueNumbers.add(3));
		System.out.println(uniqueNumbers.add(4));
		System.out.println(uniqueNumbers.add(5));
		System.out.println(uniqueNumbers.add(6));
		System.out.println(uniqueNumbers.add(7)); 
		
		printSetToConsole(uniqueNumbers); 
			
	
		Set<String> uniqueNames = new HashSet<>();
		uniqueNames.add("Mike Hunt");
		uniqueNames.add("Shit C. Face");
		uniqueNames.add("Crow and Tom Servo");
		uniqueNames.add("Spud Eternal, Lord of all Slumber");
		
		for (String element : uniqueNames) {
			System.out.println(element);
		}
		
	    System.out.println("");
	}
		
	private static void printSetToConsole(Set<Integer> elements) {
		for (Integer element : elements) {
			System.out.println(element);
		}
	
		System.out.println("");
		
	
	}
}
