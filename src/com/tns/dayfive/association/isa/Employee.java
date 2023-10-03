//Program to demonstrate usage of IS A relationship
package com.tns.dayfive.association.isa;

//Super class
public class Employee {
	private String name;
	private int empId;
	private String dept;
	//construtors
	public Employee() {
		super();
	}
	public Employee(String name, int empId, String dept) {
		super();
		this.name = name;
		this.empId = empId;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", dept=" + dept + "]";
	}
	
	

	

}
