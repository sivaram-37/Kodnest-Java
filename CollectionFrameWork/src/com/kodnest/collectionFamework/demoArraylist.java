package com.kodnest.collectionFamework;
import java.util.*;

public class demoArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> ar=readArray();
		System.out.println(ar);
		displayElementInReverse(ar);
		removeDuplicate(ar);
		displaySecondLargest(ar);
		reverseArrayList(ar);
	}
	private static ArrayList<Integer> readArray() {
		ArrayList<Integer>ar=new ArrayList<>();
		ar.add(20);
		ar.add(10);
		ar.add(30);
		ar.add(25);
		ar.add(10);
		ar.add(42);
		return ar;
	}
	private static void displayElementInReverse(ArrayList<Integer> ar) {
		System.out.println("<--- Elements in Reverse Order --->");
		for(int i=ar.size()-1;i>=0;i--) {
			System.out.print(ar.get(i)+" ");
		}
		System.out.println();
	}
	private static void displaySecondLargest(ArrayList<Integer> ar) {
		System.out.println("<--- Second largest element --->");
		Collections.sort(ar);
		System.out.println(ar.get(ar.size()-2));
	}
	private static void removeDuplicate(ArrayList<Integer> ar) {
		System.out.println("<--- Remove Duplicate elements --->");
		for(int i=0;i<ar.size()-1;i++) {
			for(int j=i+1;j<ar.size();j++) {
				if(ar.get(i)==ar.get(j)) {
					ar.remove(j);
				}
			}
		}
		for(int i:ar) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	private static void reverseArrayList(ArrayList<Integer> ar) {
		System.out.println("<--- Reverse the ArrayList --->");
		Collections.reverse(ar);
		System.out.println(ar);
	}
}
