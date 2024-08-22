package com.solution;
import java.util.*;
public class ProductOfNOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int product=1;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				product*=i;
			}
		}
		System.out.print(product);
	}

}
