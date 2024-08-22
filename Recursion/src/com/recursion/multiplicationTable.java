package com.recursion;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int i=1;
		mul(n,i);
	}

	private static void mul(int n,int i) {
		// TODO Auto-generated method stub
		if(i<=10) {
			System.out.println(n+"*"+i+"="+n*i);
			mul(n,i+1);
		}
	}

}
