package com.search;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the number to search :");
		int target=in.nextInt();
		in.close();
		int res=linearSearch(arr,target);
		if(res!=-1) {
			System.out.println("Element is found at "+res);
		}
		else {
			System.out.println("Element is not found");
		}
	}
	static int linearSearch(int[] a,int tar) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==tar) {
				return i;
			}
		}
		return -1;
	}
	
}
