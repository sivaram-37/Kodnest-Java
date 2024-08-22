package com.string;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The Quick Brown fox jumps over the lazy dog.";
		boolean res = isPangram(s);
		if(res) {
			System.out.print("The given string is a Pangram");
		}
		else {
			System.out.print("The given string is not a pangram");
		}
	}

	private static boolean isPangram(String s) {
		
		s=s.toUpperCase();
		char[] ch=new char[256];
		for(int i=0;i<s.length();i++) {
			int k=s.charAt(i);
			ch[k]++;
		}
		for(int i=67;i<=90;i++) {
			if(ch[i]>0){
				continue;
			}
			else {
				return false;
			}
		}
		return true;
		
		
	}

}
