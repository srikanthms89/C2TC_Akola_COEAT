package com.tns.dayeight.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		
		
		Square sq = new Square ();
		
		Rectangle re = new Rectangle ();
		sq.calArea();
		sq.show();
		
		re.calArea();
		re.show();
		
		System.out.println("....................................");
		
		//Runtime Polymorphism  / Dynamic binding  / late binding
		// ex: method overriding
		
		Shape sh;
		
		sh = new Square (12.5f);
		sh.calArea();
		sh.show();
		
		sh = new Rectangle (10, 20);
		sh.calArea();
		sh.show();
		
	}

}
