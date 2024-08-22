package com.solution;

import java.util.Scanner;

public class HollowSquare3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n) {
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
