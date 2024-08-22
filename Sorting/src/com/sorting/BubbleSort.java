package com.sorting;
import java.util.*;
public class BubbleSort {

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
		Sorting(a);
		System.out.println("Elements after Bubble sorting :-");
		System.out.print(Arrays.toString(a));
	}
	static void Sorting(int[] a) {
		int t;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		
	}

}
