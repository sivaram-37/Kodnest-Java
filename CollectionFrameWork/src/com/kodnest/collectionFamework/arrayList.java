package com.kodnest.collectionFamework;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class arrayList {

	public static void main(String[] args) {

		System.out.println("<-------- ArrayList ------->");
		CopyOnWriteArrayList ar = new CopyOnWriteArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
//		for(int i=0;i<ar.size();i++) {
//			System.out.print(ar.get(i)+" ");
//			ar.add(40);
//		}
		
		
		Iterator i = ar.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
			ar.add(40);
		}
		
//		System.out.println(ar);
//		Collections.sort(ar);
//		System.out.println(ar);
//		System.out.println("<------- TreeSet ------>");
//		TreeSet ts = new TreeSet();
//		ts.addAll(ar);
//		System.out.println(ts);


	}
}
