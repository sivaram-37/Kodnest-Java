package com.alphabet;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || ((i==1 ||i==6) && j<=6) || (j==6 && i<=6) || (i>=6 && i-j==5)) {
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
