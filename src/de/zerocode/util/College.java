package de.zerocode.util;

public class College {
	public String collegeName;
	public String collegeAddress;
	public int noOfStudents;
	public int noOfTeachers;
	Student student;

	public College(String collegeName, String collegeAddress, int noOfStudents, int noOfTeachers, Student student) {
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.noOfStudents = noOfStudents;
		this.noOfTeachers = noOfTeachers;
		this.student = student;
	}
}
