package com.kodnset.main;

public class Solution {

	synchronized static public void main(String... siva) {
		System.out.println("hello");
		main(1);
		System.out.println(3);
		main('y');
		main(0.08);
		
	}
	private static void main(double d) {
		// TODO Auto-generated method stub
		System.out.println(d);
		
	}
	private static void main(int a) {
		System.out.println(a);
	}
	private static void main(char a) {
		System.out.println(a);
	}
	

}
