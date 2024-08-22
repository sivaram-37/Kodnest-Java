package com.solution;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				char ch=(char) ('A'+j);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
