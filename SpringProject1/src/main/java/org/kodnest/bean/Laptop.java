package org.kodnest.bean;

public class Laptop {
	String color;
	String name;
	public Laptop() {
		super();
	}
	public Laptop(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [color=" + color + ", name=" + name + "]";
	}
	

}
