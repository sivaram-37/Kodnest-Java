package com.string;

public class FrequencyOfTheCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="antartica";
		char ch='a';
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				c++;
			}
		}
		System.out.print("The Frequency of "+ch+" = "+c);
		
		/*int[] a=new int[255];
		int unicode=ch;
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				a[unicode]++;
			}
		}
		System.out.print("The Frequency of "+ch+" = "+a[unicode]);
		*/

	}

}
