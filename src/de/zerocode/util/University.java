package de.zerocode.util;

public class University {
	public String unversityName;
	public int noOfColleges;
	public String unversityAddress;
	public int noOfLecturers;
	public int noOfStudents;
	College college;
	Student student;

	public University(String unversityName, int noOfColleges, String unversityAddress, int noOfLecturers,
			int noOfStudents, College college, Student student) {
		this.unversityName = unversityName;
		this.unversityAddress = unversityAddress;
		this.noOfColleges = noOfColleges;
		this.noOfLecturers = noOfLecturers;
		this.noOfStudents = noOfStudents;
		this.college = college;
		this.student = student;
	}

}
