package com.recursion;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1";
		s+=2*2;
		System.out.println(s);
		display(5);

	}

	private static void display(int n) {
		// TODO Auto-generated method stub
		if(n>0) {
			System.out.println("display");
			display(n-1);
		}
		
	}

}
