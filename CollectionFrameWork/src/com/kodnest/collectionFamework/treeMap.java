package com.kodnest.collectionFamework;

import java.util.*;

public class treeMap {
	public static void main(String[] args) {
		TreeMap hm = new TreeMap();
		Student3 s1 = new Student3(20,"John");
		Student3 s2 = new Student3(10,"Jack");
		Student3 s3 = new Student3(15,"Ria");
		hm.put(10,s1);
		hm.put(2,s2);
		hm.put(33, s3);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm);
		
	}
}
