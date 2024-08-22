package com.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of an array : ");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		in.close();
		System.out.println("The elements of an array are : ");

		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
