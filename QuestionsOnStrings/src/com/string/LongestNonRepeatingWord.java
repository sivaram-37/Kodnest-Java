package com.string;

import java.util.*;

public class LongestNonRepeatingWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1="abcabcabcabc";
		String s2="javaisfun";
		String f = find(s2);
		System.out.print(f);

	}

	private static String find(String s) {
		// TODO Auto-generated method stub
		Map<Character,Integer>m=new HashMap<>();
		int max=0,l=0,st=0,curlen=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(m.containsKey(c) && m.get(c)>=st) {
				st=m.get(c)+1;
				curlen=i-st;
			}
			m.put(c,i);
			curlen++;
			if(max<curlen) {
					max=curlen;
					l=st;
			}
		}
		return s.substring(l,l+max);
	}
	

}
