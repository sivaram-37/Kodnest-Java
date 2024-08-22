package com.string;

public class ReverseType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a java program";
		char[] ch=s.toCharArray();
		int l=0,r=ch.length-1;
		while(l<=r){
			if(ch[l]!=' ' && ch[r]!=' '){
				char t=ch[l];
				ch[l]=ch[r];
				ch[r]=t;
				l++;
				r--;
			}
			else if(ch[l]==' ') {
				l++;
			}
			else if(ch[r]==' ') {
				r--;
			}
		}
		System.out.print(new String(ch));
	}

}
