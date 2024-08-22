package com.solution;
import java.util.*;
public class FirstNPrimeNumber {
	static int isprime(int n) {
		int c=0;
		for(int i=1;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==1) {
			return n;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int c=1;
		for(int i=2;c<=n;i++) {
			int r=isprime(i);
			if(r!=-1) {		
				System.out.print(r+" ");
				c++;
			}
		}
			
	}
}
