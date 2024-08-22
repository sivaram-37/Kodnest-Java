package com.solution;
import java.util.*;
public class Palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int temp=n;
		int rev=0;
		while(n!=0) {
			rev=rev*10+(n%10);
			n/=10;
		}
		if(temp==rev) {
			System.out.print("It is a Palendrome");
		}
		else {
			System.out.print("It is not a Palendrome");
		}
	}

}
