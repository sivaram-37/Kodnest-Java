package com.string;
import java.util.Scanner;
public class SubStringOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String:-");
		String s=in.next();
		in.close();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}

}
