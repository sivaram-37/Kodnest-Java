package com.polymorphism;


class Color{
	void display() {
		System.out.println("Color");
	}
}

class Red extends Color{
	void display() {
		System.out.println("Redish color");
	}
}

public class App {
	public static void main(String[] args) {
		
		Color c=new Red();
		c.display();
		((Red)c).display();
		
		
	}
}
