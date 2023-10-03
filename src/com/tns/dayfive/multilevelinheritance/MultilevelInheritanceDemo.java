package com.tns.dayfive.multilevelinheritance;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		
		City city = new City ();
		city.setCityName("Akola");
		city.setArea(250.2f);
		city.setStateName("maharastra");
		city.setLanguage("Marati");
		city.setCountryname("India");
		city.setCapital("Mumbai");
		System.out.println(city);

	}

}
