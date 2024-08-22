package com.encapusation;

import java.util.Scanner;

class Employees {
	private int id;
	private String name;
	private String project;
	private int salary;
	
	public Employees(int id, String name, String project, int salary) {
		
		this.id = id;
		this.name = name;
		this.project = project;
		this.salary = salary;
	}
	public Employees() {
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getProject() {
		return project;
	}
	public int getSalary() {
		return salary;
	}
}


public class MainApp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i=1;
		while(i<=2) {
			System.out.println("Enter the details for employee "+i);
			int id=in.nextInt();
			String name=in.next();
			String project=in.next();
			int salary=in.nextInt();
			Employees e=new Employees(id,name,project,salary);
			System.out.println(e.getId()+" "+e.getName()+" "+e.getProject()+" "+e.getSalary());
			i++;
			
		}
		in.close();
	}

}
