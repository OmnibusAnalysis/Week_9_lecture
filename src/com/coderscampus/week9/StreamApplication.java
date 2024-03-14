package com.coderscampus.week9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApplication {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Tesla", "Model S", 2019));
		cars.add(new Car("Tesla", "Model S", 2018));
		cars.add(new Car("Tesla", "Model X", 2016));
		cars.add(new Car("Tesla", "Model 3", 2019));
		cars.add(new Car("Ford", "F-150", 2017));
		cars.add(new Car("Toyota", "Coroll", 1997));
		cars.add(new Car("Toyota", "Celica", 2002));
		
		List<String> models = cars.stream()
								   .map(car -> car.getModel())
								   .collect(Collectors.toList());

		Set<String> brands = cars.stream()
								 .map(car -> car.getBrand())
								 .collect(Collectors.toSet());
		
		
		models.stream()
			   .forEach(model -> System.out.println(model));
			   
		brands.stream()
			  .forEach(brand -> System.out.println(brand));
//		example1();
		}



	private static void example1() {
		List<String> names = new ArrayList<String>();
		populateNames(names);
//		for (String name : names) {
//			System.out.println(name);

			names.stream()
			      .forEach(name -> System.out.println(name));
	}
		
	

	private static void populateNames(List<String> names) {
		names.add("Mike Hunt");
        names.add("Shit C. Face");
        names.add("Tom & Crow");
        names.add("Spud P Cochran Eternal Slumber Lord");
        names.add("Clint 5-2");
        names.add("Nathan SUX"); 
        names.add("Trip Fisk");
        names.add("AJ");
        names.add("Frankie");
       
	}
	
}
