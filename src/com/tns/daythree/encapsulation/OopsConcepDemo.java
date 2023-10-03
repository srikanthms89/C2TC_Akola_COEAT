package com.tns.daythree.encapsulation;

public class OopsConcepDemo {
	
	private int serialNum;
	private String name;
	private int age;
	
	
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "OopsConcepDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	

}
