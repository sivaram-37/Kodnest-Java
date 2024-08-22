package com.solution;
import java.util.*;
public class IsPrimeOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int c=0;
		for(int i=1;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==1) {
			System.out.print(n+" is a Prime Number");
		}
		else {
			System.out.print("Not a Prime Number");
		}

	}

}
