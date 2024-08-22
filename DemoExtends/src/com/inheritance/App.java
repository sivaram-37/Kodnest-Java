package com.inheritance;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB b=new ClassB();
		System.out.println(b.b);
		b.displayB();
		System.out.println(b.a);
		b.displayA();
		
		ClassA a=new ClassA();
		System.out.println(a.a);
		a.displayA();
	
	}

}
