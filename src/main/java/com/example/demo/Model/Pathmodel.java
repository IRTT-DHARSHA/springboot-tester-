package com.example.demo.Model;

public class Pathmodel {
	private int rollno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	private String name ;
	public Pathmodel(int rollno, String name, String grade, String dpt) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.grade = grade;
		this.dpt = dpt;
	}
	public Pathmodel()
	{
		
	}
	private String grade;
	private String dpt;
	

}
