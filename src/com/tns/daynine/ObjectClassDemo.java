//Program to Demonstrate Object class
package com.tns.daynine;

class sample{
	
	
}

class Demo{
	
	public Demo() {
		//resource allocate
		System.out.println("In constructor");
	}
	
	protected void finalize() throws Throwable{
		// resource cleanup code
		System.out.println(" In finalize ");
		
	}
	
}
public class ObjectClassDemo {

	public static void main(String[] args) {
		
		sample s = new sample ();
		sample s1 = new sample ();
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		Demo d = new Demo ();
		System.out.println(d.hashCode());
		
		//Demo d1 = new Demo ();
		
		d= null;
		//System.out.println(d1);
		System.gc();

	}

}
