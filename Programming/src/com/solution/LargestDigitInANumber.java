package com.solution;
import java.util.*;
public class LargestDigitInANumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int max=0;
		while(n>0) {
			int rem=n%10;
			if(rem>max) {
				max=rem;
			}
			n/=10;
		}
		System.out.println(max);
		in.close();
	}
}
