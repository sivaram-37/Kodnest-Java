package com.kodnest.or;

public class App {

	public static void main(String[] args) {
		int num=10;
		System.out.println("Original Number ="+num);
		modify(num);
		System.out.println("Number after the modify() ="+num);
		
	}

	static void modify(int numcopy) {
		// TODO Auto-generated method stub
		System.out.println("Original Number Copy ="+numcopy);
		numcopy=100;
		System.out.println("Number copy after modification ="+numcopy);
		
		
	}

}
