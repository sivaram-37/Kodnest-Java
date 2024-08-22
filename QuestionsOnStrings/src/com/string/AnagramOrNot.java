package com.string;
import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="silent";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(new String(ch1).equals(new String(ch2))) {
			System.out.print("Anagram");
		}
		else {
			System.out.print("Not a Anagram");
		}
	}
	/*static String bubbleSorting(char[] a) {
		char t;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		return new String(a);
		
	}*/


}
