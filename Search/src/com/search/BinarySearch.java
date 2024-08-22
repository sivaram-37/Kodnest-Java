package com.search;
import java.util.*;
public class BinarySearch {

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
		System.out.println("Enter the search element:");
		int target=in.nextInt();
		in.close();
		int r=binary(a,target);
		if(r!=-1) {
			System.out.println("Element is found at "+ r +" index");
		}
		else {
			System.out.println("Element is not found");
		}
	}
	static int binary(int[] a,int t) {
		int l=0,h=a.length-1;
		while(l<=h) {
			int mid=(l+h)/2;		
			if(t==a[mid]) {
				return mid;
			}
			else if(t<a[mid]) {
				h=mid-1;
			}
			else if(t>a[mid]){
				l=mid+1;
			}
		}
		return -1;
		
		
	}

}
