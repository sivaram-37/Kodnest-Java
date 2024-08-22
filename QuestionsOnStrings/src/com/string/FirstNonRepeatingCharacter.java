package com.string;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Programing";
		char ch=nonRepeating(s);
		if(ch!='\0') {
			System.out.print(ch);
		}
		else {
			System.out.print("No Non-Repeating character");
		}
	}

	private static char nonRepeating(String s) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<s.length();i++) {
			int c=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
				}
			}
			if(c==1) {
				return s.charAt(i);
			}
		}
		return '\0';
		
	}

}
