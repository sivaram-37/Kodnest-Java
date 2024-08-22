package com.solution;
import java.util.*;
public class FactorOfNValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}

	}

}
