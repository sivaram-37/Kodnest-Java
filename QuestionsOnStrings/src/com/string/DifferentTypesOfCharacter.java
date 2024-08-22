package com.string;

public class DifferentTypesOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This 4 Program!";
		s=s.toLowerCase();
		char[] c=s.toCharArray();
		int vc=0,dc=0,lc=0;
		for(int i=0;i<c.length;i++) {
			if(isVowel(c[i])) {
				vc++;
			}
			if(isletter(c[i])) {
				lc++;
			}
			if(isdigit(c[i])) {
				dc++;
			}
		}
		System.out.println("Letters = "+lc);
		System.out.println("Vowels = "+vc);
		System.out.println("Consonents = "+(lc-vc));
		System.out.println("Digits = "+dc);
		System.out.println("Special Character = "+(c.length-lc-dc));

	}

	private static boolean isdigit(char c) {
		// TODO Auto-generated method stub
		if(c>='0' && c<='9') {
			return true;
		}
		return false;
	}

	private static boolean isletter(char c) {
		// TODO Auto-generated method stub
		if(c>='a' && c<='z') {
			return true;
		}
		return false;
	}

	private static boolean isVowel(char c) {
		// TODO Auto-generated method stub
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			return true;
		}
		return false;
	}
	

}
