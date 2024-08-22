package com.leetcode;
import java.util.*;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(check(nums,i)){
                l.add(nums[i]);
            }
        }
        return l;
    }
    static boolean check(int[] nums,int i){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
