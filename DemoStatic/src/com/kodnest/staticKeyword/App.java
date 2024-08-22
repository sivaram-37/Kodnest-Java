package com.kodnest.staticKeyword;

public class App {
	public App() {
		System.out.println("5");
	}
	static void display1() {
		System.out.println("1");
	}
	{
		System.out.println("3");
	}
	public App(int a) {
		System.out.println("7");
	}
	{
		System.out.println("4");
	}
	void display2() {
		System.out.println("2");
	}
	public static void main(String[] args) {
		new App();
		System.out.println("6");
		new App(45).display2();
		new App().display1();
	}

}
