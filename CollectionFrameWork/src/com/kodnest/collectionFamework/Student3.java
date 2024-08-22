package com.kodnest.collectionFamework;

class Student3{
	int age;
	String name;
	public Student3(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student[age=" + age + ",name=" + name + "]";
	}
}