package com.Inheritance;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainerBot t = new TrainerBot();
		t.read();
		t.write();
		t.teaching();
		
		StudentBot s = new StudentBot();
		s.read();
		s.write();
		s.applySkillSet();
	}

}
