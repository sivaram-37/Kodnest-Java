//Sorting Complex Object using Comparable interface

package com.kodnest.collectionFamework;

import java.util.*;

class Student implements Comparable<Student>{
	int roll;
	String name;
	int yop;
	public Student(int roll, String name, int yop) {
		super();
		this.roll = roll;
		this.name = name;
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "[roll=" + roll + ", name=" + name + ", yop=" + yop+"]";
	}
	@Override
	public int compareTo(Student other) {
		return this.yop - other.yop;
	}

}

public class Exp1SortingComplexObjectType1 {
	public static void main(String[] args) {

		Student s1 = new Student(1,"John",2023);
		Student s2 = new Student(2,"Jack",2021);
		Student s3 = new Student(3,"Ria",2020);
		Student s4 = new Student(4,"Ryan",2019);
		Student s5 = new Student(5,"Emma",2024);
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		ar.add(s5);

		Collections.sort(ar);
		System.out.println(ar);



	}
}
