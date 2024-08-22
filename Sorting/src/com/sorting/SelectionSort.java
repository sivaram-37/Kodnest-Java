package com.sorting;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		in.close();
		Sorting(a,n);
		System.out.println("Elements after Selection sorting :-");
		for(int i:a) {
			System.out.print(i+" ");
		}
	
	}
	static void Sorting(int[] a,int n) {
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			int t=a[minIndex];
			a[minIndex]=a[i];
			a[i]=t;
		}
	}

}
