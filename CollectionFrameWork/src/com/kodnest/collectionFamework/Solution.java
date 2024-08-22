package com.kodnest.collectionFamework;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		int t=in.nextInt();
		String[] str=s.split(" ");
		int[] nums=new int[str.length];
		for(int i=0;i<str.length;i++) {
			nums[i]=Integer.parseInt(str[i]);
		}
		twoSum(nums,t);
		in.close();
	}

	private static void twoSum(int[] nums, int t) {
		// TODO Auto-generated method stub
		Map<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int compliment=t-nums[i];
			if(hm.containsKey(compliment)) {
				System.out.println(hm.get(compliment)+" "+i);
			}
			hm.put(nums[i],i);
		}
	}

}
