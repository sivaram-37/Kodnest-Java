package com.alphabet;

public class GeneralSystax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n || i==j || i+j==n+1 || i==6 || j==6 || 
						i+j==((n+1)/2)+1 || j-i==((n+1)/2)-1 || i-j==((n+1)/2)-1 || i+j==n+(n+1)/2) {
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
