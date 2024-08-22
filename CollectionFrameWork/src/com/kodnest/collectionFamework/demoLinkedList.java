package com.kodnest.collectionFamework;
import java.util.*;
public class demoLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=readValue();
		System.out.println(ll);
		removeDuplicate(ll);
		middleElement(ll);
		mergeTwoSortedLinkedList();
		isPalindrome(ll);
	}

	private static void isPalindrome(LinkedList<Integer> ll) {
		
		LinkedList<Integer> org = new LinkedList<Integer>(ll);
		Collections.reverse(ll);
		int f=0;
		for(int i=0;i<ll.size();i++) {
			if(ll.get(i)!=org.get(i)) {
				f=1;
				break;
			}
		}
		if(f==0) {
			System.out.println("This LinkedList is a Palindrome");
		}
		else {			
			System.out.println("This LinkedList is not a Palindrome");
		}
		
	}

	private static void mergeTwoSortedLinkedList() {
		LinkedList<Integer> nl = new LinkedList<Integer>();
		nl.add(4);
		nl.add(1);
		nl.add(2);
		nl.add(5);
		
		LinkedList<Integer> nnl = new LinkedList<Integer>();
		nnl.add(9);
		nnl.add(6);
		nnl.add(13);
		
		Collections.sort(nl);
		Collections.sort(nnl);
		nl.addAll(nnl);
		
		System.out.println("merge Two Sorted LinkedList");
		System.out.println(nl);
	}

	private static void middleElement(LinkedList<Integer> ll) {
		System.out.println("middle element");
		int mid=ll.get(ll.size()/2);
		System.out.println(mid);
	}

	private static void removeDuplicate(LinkedList<Integer> ll) {
		System.out.println("Remove Duplicate");
		HashSet hs = new HashSet();
		hs.addAll(ll);
		System.out.println(hs);
	}

	private static LinkedList<Integer> readValue() {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(25);
		l.add(10);
		l.add(42);
		return l;
	}

}
