package com.string;

public class FrequencyOfAllCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="programming";
		int[] a=new int[255];
		for(int i=0;i<s.length();i++) {
			int uni=s.charAt(i);
			a[uni]++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				System.out.println("Character : "+(char)i+" - Frequency : "+a[i]);
			}
		}

	}

}
