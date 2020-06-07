package com.cognixia.jump.corejava.enums;

public class Student {

	public enum Grade {
		FRESHMAN, SOPHMORE, JUNIOR, SENIOR, SUPER_SENIOR;
	}
	
	private String name;
	//private String grade;
	private Grade grade;
	
	public Student(String name, Grade grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	
	
	
}
