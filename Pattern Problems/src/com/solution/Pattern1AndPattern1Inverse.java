package com.solution;
import java.util.*;
public class Pattern1AndPattern1Inverse {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
