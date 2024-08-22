package com.alphabet;

public class U {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n || i==n){
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
