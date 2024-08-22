package com.skillrack;
import java.util.*;
public class minimumOccurance {
	public static void main(String[] args) {
		String s=createString();
		char min = minOccurance(s);
		System.out.print(min);
	}
	private static String createString() {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		in.close();
		return s;
	}
	private static char minOccurance(String s) {
		// TODO Auto-generated method stub
		char min=s.charAt(0);
		int mc = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				int c=0;
				for(int j=0;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						c++;
					}
				}
				if(i==1) {
					mc=c;
				}
				if(c<mc) {
					min=s.charAt(i);
					mc=c;
				}
				
			}
		}
		return min;
	}
	

}
