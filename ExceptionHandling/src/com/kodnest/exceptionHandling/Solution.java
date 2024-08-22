package com.kodnest.exceptionHandling;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println("main() start");
		method1();
		System.out.println("main() stop");
	}

	public static void method1() {
		System.out.println("method1() start");
		method2();
		System.out.println("method1() stop");
	}

	public static void method2() {
		System.out.println("method2() start");
		method3();
		System.out.println("method2() stop");		
	}

	public static void method3() {
		System.out.println("method3() start");
		System.out.println(3/0);
		System.out.println("method3() stop");
	}

}
