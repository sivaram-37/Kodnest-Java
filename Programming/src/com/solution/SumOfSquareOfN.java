package com.solution;
import java.util.*;
public class SumOfSquareOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=(int)Math.pow(i, 2);
		}
		System.out.print(s);

	}

}
