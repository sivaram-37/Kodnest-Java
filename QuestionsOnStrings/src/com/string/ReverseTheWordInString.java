package com.string;

public class ReverseTheWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is String";
		String[] ns=s.split(" ");
		for(int i=ns.length-1;i>=0;i--) {
			System.out.print(ns[i]+" ");
		}

	}

}
