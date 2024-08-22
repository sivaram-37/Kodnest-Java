package com.search;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,9,4,5,6,7};
		int target=2;
		int res=linear(a,target);
		if(res>0) {
			System.out.println("Element is found - "+res);
		}
		else {
			System.out.println("Element is not found");
		}	
	}
	static int linear(int[] a,int t) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==t) {
				return i;
			}
		}
		return -1;
	}
}
