//Program to demonstrate multilevel Inheritance - State class
package com.tns.dayfive.multilevelinheritance;

public class State extends Country {
	private String stateName;
	private String language;
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
//	@Override
//	public String toString() {
//		return "State [stateName=" + stateName + ", language=" + language + ", getCountryname()=" + getCountryname()
//				+ ", getCapital()=" + getCapital() + ", toString()=" + super.toString() + "]";
//	}
	
	
	
	

}
