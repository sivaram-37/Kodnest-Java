package com.alphabet;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || j==n || i==n || (i==j && i>=6)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
