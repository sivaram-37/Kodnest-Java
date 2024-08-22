package com.kodnest.f;

class A{
	void display() {
		System.out.println("Hello");
	}
}

class B extends A{
	
}

public class Solution {

	public static void main(String[] args) {
		B b = new B();
		b.display();
	}

}
