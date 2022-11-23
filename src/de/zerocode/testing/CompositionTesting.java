package de.zerocode.testing;

import de.zerocode.util.College;
import de.zerocode.util.Student;

public class CompositionTesting {
	public static void main(String[] args) {
		Student student = new Student("Sujwal", "18NH1A0302", "6309638199", "Venkateswara Rao", "gudivada");
		College college = new College("VKR", "Gudivada", 1500, 150, student);
		System.out.println("College Name " + college.collegeName);
		System.out.println("College Address" + college.collegeAddress);
		System.out.println("Number of Students" + college.noOfStudents);
		System.out.println("Number of Teachers" + college.noOfTeachers);
		System.out.println("Student Name :" + student.studentName);
		System.out.println("Student Phno" + student.phno);
		System.out.println("Student Address" + student.address);
		System.out.println("Student Roll No" + student.rollNo);
		System.out.println("Student father Name" + student.fatherName);

		Student studentone = new Student("Bhanu", "18NH1A0304", "8919190233", "Prasad", "gudivada");
		College collegeone = new College("VKR", "Gudivada", 1500, 150, studentone);
		System.out.println("College Name " + collegeone.collegeName);
		System.out.println("College Address" + collegeone.collegeAddress);
		System.out.println("Number of Students" + collegeone.noOfStudents);
		System.out.println("Number of Teachers" + collegeone.noOfTeachers);
		System.out.println("Student Name :" + studentone.studentName);
		System.out.println("Student Phno " + studentone.phno);
		System.out.println("Student Address " + studentone.address);
		System.out.println("Student Roll No " + studentone.rollNo);
		System.out.println("Student father Name " + studentone.fatherName);

	}

}
