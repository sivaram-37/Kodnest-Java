package com.solution;
import java.util.*;
public class Fiboacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}

}
