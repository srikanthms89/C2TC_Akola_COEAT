//Program to demonstrate multilevel Inheritance - City class
package com.tns.dayfive.multilevelinheritance;

public class City  extends State {
	private String cityName;
	private float area;
	
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + ", toString()=" + super.toString() + ", getCountryname()="
				+ getCountryname() + ", getCapital()=" + getCapital() + "]";
	}
	
	
	

}
