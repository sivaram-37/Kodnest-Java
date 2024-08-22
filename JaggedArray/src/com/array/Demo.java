package com.array;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Employee[] a=new Employee[3];
		for(int i=0;i<3;i++) {
			a[i]=new Employee();
			System.out.println("Enter the name of Employee-"+(i+1));
			a[i].name=in.next();
			System.out.println("Enter the age of Employee-"+(i+1));
			a[i].age=in.nextInt();
		}
		for(int i=0;i<3;i++) {
			System.out.println("The name and age of Employee-"+(i+1));
			System.out.println(a[i].name);
			System.out.println(a[i].age);
			a[i].sleep();
			System.out.println("----------------------------------------");
		}
		in.close();
	}

}
