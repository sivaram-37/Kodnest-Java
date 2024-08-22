package com.solution;
import java.util.*;
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=in.nextInt();
		in.close();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
