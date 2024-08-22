package com.solution;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		while(n!=0) {
			System.out.print(n%10);
			n=n/10;
		}
		
	}

}
