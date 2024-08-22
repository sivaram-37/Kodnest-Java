package com.supaiinfotech.solution;
import java.util.*;
import java.util.Map.Entry;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int n=in.nextInt();
		in.close();
		s=s.toLowerCase();
		String[] str=s.replace(","," ").replace(";"," ").replace("."," ").split(" ");
		HashMap<String,Integer> t=new HashMap<>();
		for(String i:str) {
			t.put(i,t.getOrDefault(i,0)+1);
		}
		if(n==0) {
			
			for(Entry<String, Integer> e:t.entrySet()) {
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
		else if(n==1) {
			
			for(Entry<String, Integer> e:t.entrySet()) {
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
	}



}
