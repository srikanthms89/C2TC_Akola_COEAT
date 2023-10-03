package com.tns.daynine;

public class StringBufferClassDemo {

	public static void main(String[] args) {
		//String Buffer length vs capacity 
		StringBuffer buffer = new StringBuffer ("Hello");
		System.out.println("buffer = " +buffer );
		System.out.println("lenght = " +buffer.length());
		System.out.println("Capcity = " +buffer.capacity());
		
		// appending and inserting into StringBuffer
		
		String s;
		int a= 100;
		buffer = new StringBuffer(40);
		
		s= buffer.append("a= ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer = new StringBuffer ("I Java!");
		buffer.insert(2, "like  ");
		System.out.println(buffer);
		buffer.delete(7,10);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
		
		
		

	}

}
