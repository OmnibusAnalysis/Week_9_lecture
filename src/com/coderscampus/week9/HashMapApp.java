package com.coderscampus.week9;

public class HashMapApp {

	public void hash_code_checking () {
		int first = "My first String".hashCode();
		System.out.println(first);
		System.out.println(Math.abs(first % 15));
		int second = "My second String".hashCode();
		System.out.println(second);
		System.out.println(Math.abs(second % 15));
		int third = "My third arm".hashCode();
		System.out.println(third);
		System.out.println(Math.abs(third % 15));
		int seventh = "My seventh serving".hashCode();
		System.out.println(seventh);
		System.out.println(Math.abs(seventh % 15));
		
	}
	
}
