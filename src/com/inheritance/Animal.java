package com.inheritance;

public class Animal {
	
	private String legs;
	public String color;
	public String name;;
	
	public String gtLegs() {
		return legs;
	}
	public void stLegs(String legs) {
		this.legs = legs;
	}
	public String gtColor() {
		return color;
	}
	protected void stColor(String color) {
		this.color = color;
	}
	public String gtName() {
		return name;
	}
	public void stName(String name) {
		this.name = name;
	}

	
}
