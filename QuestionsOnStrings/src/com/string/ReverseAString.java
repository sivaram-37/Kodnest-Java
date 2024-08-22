package com.string;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Programming";
		String ns="";
		for(int i=s.length()-1;i>=0;i--) {
			ns+=s.charAt(i);
		}
		System.out.print(ns);

	}

}
