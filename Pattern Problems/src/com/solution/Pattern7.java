package com.solution;
import java.util.*;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
