// Sorting Complex Object using Comparator interface

package com.kodnest.collectionFamework;
import java.util.*;

class Student2{
	int roll;
	String name;
	int yop;
	public Student2(int roll, String name, int yop) {
		this.roll = roll;
		this.name = name;
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "[roll=" + roll + ", name=" + name + ", yop=" + yop+"]";
	}
}

//Type-1
//Sorting yop in Ascending order
class Sorting1InAsc implements Comparator<Student2>{
	@Override
	public int compare(Student2 o1, Student2 o2) {
		if(o1.yop>o2.yop) {
			return 1;
		}
		if(o1.yop<o2.yop) {
			return -1;
		}
		return 0;
	}
}
//Sorting yop in Descending order
class Sorting1InDes implements Comparator<Student2>{
	@Override
	public int compare(Student2 o1, Student2 o2) {
		if(o1.yop>o2.yop) {
			return -1;
		}
		if(o1.yop<o2.yop) {
			return 1;
		}
		return 0;
	}
}

//Type-2
//Sorting yop in Ascending order
class Sorting2InAsc implements Comparator<Student2>{
	@Override
	public int compare(Student2 o1, Student2 o2) {
		return Integer.compare(o1.yop, o2.yop);
	}
}
//Sorting yop in Descending order
class Sorting2InDes implements Comparator<Student2>{
	@Override
	public int compare(Student2 o1, Student2 o2) {
		return Integer.compare(o2.yop, o1.yop);
	}
}

 
public class Exp1SortingComplexObjectType2 {
	public static void main(String[] args) {

		Student2 s1 = new Student2(1,"John",2023);
		Student2 s2 = new Student2(2,"Jack",2021);
		Student2 s3 = new Student2(3,"Ria",2020);
		Student2 s4 = new Student2(4,"Ryan",2019);
		Student2 s5 = new Student2(5,"Emma",2024);
		ArrayList<Student2> ar = new ArrayList<Student2>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		ar.add(s5);
		
		System.out.println("<<<  Type - 1 Ascending order  >>>");
		Collections.sort(ar,new Sorting1InAsc());
		System.out.println(ar);
		
		System.out.println("<<<  Type - 1 Descending order  >>>");
		Collections.sort(ar,new Sorting1InDes());
		System.out.println(ar);
		
		System.out.println("<<<  Type - 2 Ascending order  >>>");
		Collections.sort(ar,new Sorting2InAsc());
		System.out.println(ar);
		
		System.out.println("<<<  Type - 1 Descending order  >>>");
		Collections.sort(ar,new Sorting2InDes());
		System.out.println(ar);
	}
}
