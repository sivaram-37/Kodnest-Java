// Overriding the toString() 

package com.kodnest.collectionFamework;

class Student1{
	int roll;
	String name;
	int yop;
	public Student1(int roll, String name, int yop) {
		super();
		this.roll = roll;
		this.name = name;
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "[roll=" + roll + ", name=" + name + ", yop=" + yop+"]";
	}

}


public class ToStringMethod {
	public static void main(String[] args) {

		Student1 s = new Student1(1,"John",2023);
		System.out.println(s);

	}
}
