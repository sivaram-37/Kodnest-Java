package org.kodnest.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Employee {
	private ArrayList<String> technologies;
	private HashSet<String> organisations;
	private HashMap<Integer,String> projects;
	public Employee() {
		super();
	}
	public Employee(ArrayList<String> technologies, HashSet<String> organisations, HashMap<Integer, String> projects) {
		super();
		this.technologies = technologies;
		this.organisations = organisations;
		this.projects = projects;
	}
	public ArrayList<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}
	public HashSet<String> getOrganisations() {
		return organisations;
	}
	public void setOrganisations(HashSet<String> organisations) {
		this.organisations = organisations;
	}
	public HashMap<Integer, String> getProjects() {
		return projects;
	}
	public void setProjects(HashMap<Integer, String> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", organisations=" + organisations + ", projects=" + projects
				+ "]";
	}

}
