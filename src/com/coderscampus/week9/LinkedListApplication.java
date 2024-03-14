package com.coderscampus.week9;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApplication {
	//linked lists are easier to remove from 
	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();
		// the diamond operator - you don't  have to specify data type again but you do have to leave an open <>
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println("-------");
		
		printArrayListToConsole(numbers);	
		
		System.out.println("------");
		
		numbers.remove(0);
		printArrayListToConsole(numbers);
		
		System.out.println("-------");
		
		
		numbers.remove((Integer) 30);
		printArrayListToConsole(numbers);
		
	}

	private static void printArrayListToConsole(List<Integer> numbers) {
		for (Integer number : numbers) {
			System.out.println(number);
		
	}
	
	}
}

