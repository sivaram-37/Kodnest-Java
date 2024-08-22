package com.alphabet;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==1 && j!=n) || j==1 || (j==n && i!=1 && i!=6 && i!=n) || (i==n && j!=n) || (i==6 && j!=n)) {
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
