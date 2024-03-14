package com.coderscampus.week9;

import java.util.Objects;

public class Person {

	private Integer ssn;
	private String firstName;
	private String lastName;

	public Person(int ssn, String firstName, String lastName) {
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	// a toStriing is a more readable output of the object 
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	// hashCode and equals are used to determine if two objects are equal
		// highly recommend to use this when using POJO 
		// use something unique to identify the object, in this case the ssn
	@Override
	public int hashCode() {
		return Objects.hash(ssn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(ssn, other.ssn);
		// if using a string, use "equalsIgnoreCase" instead of "equals"
	}

}
