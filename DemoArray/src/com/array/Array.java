package com.array;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Even numbers are : ");
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd numbers are : ");
		for(int i=0;i<n;i++) {
			if(a[i]%2==1) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Elements in the even index are : ");
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Elements in the odd index are : ");
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("even elements present in the odd index position are :");
		for(int i=0;i<n;i++) {
			if(a[i]%2==0 && i%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("odd elements present in the even index :");
		for(int i=0;i<n;i++) {
			if(a[i]%2==1 && i%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("elements that are multiples of 4 :");
		for(int i=0;i<n;i++) {
			if(a[i]%4==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("elements that are not are divisible by 3 :");
		for(int i=0;i<n;i++) {
			if(a[i]%3!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("elements that are present in even index and divisible by 4 :");
		for(int i=0;i<n;i++) {
			if(a[i]%4==0 && i%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("elements present in odd index and not divisible by 3 :");
		for(int i=0;i<n;i++) {
			if(a[i]%3!=0 && i%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("elements that are multiple of 5, present in even index & not divisible by 3 :");
		for(int i=0;i<n;i++) {
			if(a[i]%3!=0 && i%2==0 && a[i]%5==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("elements that are both divisible by 2 & 3 and also present by even index position :");
		for(int i=0;i<n;i++) {
			if(a[i]%2==0 && a[i]%3==0 && i%2==0) {
				System.out.println(a[i]);
			}
		}
		
		in.close();
	}

}
