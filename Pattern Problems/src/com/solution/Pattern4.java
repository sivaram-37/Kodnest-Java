package com.solution;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int s=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				s+=10;
				System.out.print(s);
				if(j<i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
