package com.leetcode;


public class LongestCommonPrefix {
	
	static String longest(String[] strs) {
		String f=strs[0];
        String ns="";
        for(int i=0;i<f.length();i++){
            int c=1;
            for(int j=1;j<strs.length;j++){
                if(f.charAt(i)==strs[j].charAt(i)){
                    c++;
                }
            }
            if(c==strs.length){
                ns+=f.charAt(i);
            }
            else{
                new String(ns);
            }
        }
        return ns;
	}

	public static void main(String[] args) {
		String[] s= {"Flower","flow","flight"};
		System.out.println(longest(s));
		
	}

}
