package com.kodnest.methods;

public class SolutionMethod1 {

	public static void main(String[] args) {
		System.out.println("start");
		int a=4;
		double b=6.8;
		addition(a,b);
		System.out.println("end");

	}
	static void addition(int a,double b) {
		double result=a+b;
		System.out.println(result);
	}

}
