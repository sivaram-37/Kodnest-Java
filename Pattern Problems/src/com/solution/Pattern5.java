package com.solution;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		for(int i=n;i>=1;i--) { 
			for(int j=i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
