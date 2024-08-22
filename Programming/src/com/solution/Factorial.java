package com.solution;
import java.util.*;
public class Factorial {
	static int facto(int n) {
		if(n==0) {
			return 1;
		}
		return n*facto(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		System.out.print(facto(n));
		
		
	}

}
