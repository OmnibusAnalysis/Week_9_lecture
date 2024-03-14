package com.coderscampus.week9;

import java.util.HashMap;
import java.util.Map;

public class MapsApplication {
	//another data structure 
	// for collections 
	// stores two types of data

	public static void main(String args[]) {
		// key = ssn
		// value = person's name
		Map<Integer, String> people = new HashMap<>(); 
				
				//linked hash vs hash - linked maintains order
		
		// hash maps store data in *KEY VALUE* pairs or k/v
		// the purpse of a key is to uniquely identify data
		
		people.put(111111,"Casey Michael");
		people.put(222222, "Spud");
		people.put(333333, "crow");
		people.put(444444, "spit");
		
		
		System.out.println("Get data w invalid key: ");
		
		System.out.println(people.get(4555555));
		
		System.out.println("Get data w valid key: ");
		System.out.println(people.get(111111));
	}
}
