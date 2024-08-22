package com.solution;
import java.util.*;
public class SumOfNNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
