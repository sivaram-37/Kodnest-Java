package com.string;

public class Palandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="racecar";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not a Palindrome");
		}

	}

}
