package com.recursion;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of terms to display = ");
		int n=in.nextInt();
		in.close();
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		fab(n-2,a,b);
	}

	private static void fab(int n,int a,int b) {
		if(n>0) {
			System.out.print((a+b)+" ");
			fab(n-1,b,a+b);
		}
		
	}

}
