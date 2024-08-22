package com.kodnest.cc;
import java.util.*;
public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		if(i>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		in.close();
	}

}
