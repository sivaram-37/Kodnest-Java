package com.string;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String a1=createString1();
		//String a2=createString2();
		//String a3=createString3();
		//stringReverse(a3);
		//displayEvenIndexchar(a3);
		//displayOddIndexchar(a3);
		//String str = convertToUpperCase(a1);
		String str = convertToLowerCase(a1);
		displayString(str);
	}
	private static String convertToLowerCase(String a1) {
		// TODO Auto-generated method stub
		return a1.toLowerCase();
		
	}
	private static String convertToUpperCase(String a1) {
		// TODO Auto-generated method stub
		return a1.toUpperCase();
		
	}
	private static void displayOddIndexchar(String a3) {
		char[] ch=a3.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i%2!=0) {
				System.out.print(ch[i]+" ");
			}
		}
		System.out.println();
		
	}
	private static void displayEvenIndexchar(String a3) {
		char[] ch=a3.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i%2==0) {
				System.out.print(ch[i]+" ");
			}
		}
		System.out.println();
	}
	private static void stringReverse(String s) {
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	private static String createString3() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int n=in.nextInt();
		System.out.println("Enter the element of character Array:");
		char[] ch=new char[n];
		for(int i=0;i<n;i++) {
			ch[i]=in.next().charAt(0);
		}
		in.close();
		//char[] ch= {'s','i','v','a'};
		String s=new String(ch);
		return s;
	}
	static String createString2() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String value:-");
		String s=new String(in.next());	
		in.close();
		return s;
	}
	static String createString1() {
		String s="program";
		return s;
	}
	static void displayString(String v) {
		System.out.println(v);
	}

}
