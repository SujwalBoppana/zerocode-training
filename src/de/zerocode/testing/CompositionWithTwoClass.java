package de.zerocode.testing;

import de.zerocode.util.College;
import de.zerocode.util.Student;
import de.zerocode.util.University;

public class CompositionWithTwoClass {
	public static void main(String[] args) {
		Student student = new Student("Sujwal", "18NH1A0302", "6309638199", "Venkateswara Rao", "gudivada");
		College college = new College("VKR", "Gudivada", 1500, 150, student);
		University university = new University("Jntuk", 150, "Kakainda", 200, 200, college, student);
		System.out.println("Unversity Name " + university.unversityName);
		System.out.println("Unversity Address " + university.unversityAddress);
		System.out.println("Number of Colleges linked " + university.noOfColleges);
		System.out.println("Number of Students in the unversity " + university.noOfStudents);
		System.out.println("Number of Lecturers in the unversity " + university.noOfLecturers);
		System.out.println("College Name " + college.collegeName);
		System.out.println("College Address " + college.collegeAddress);
		System.out.println("Number of Students " + college.noOfStudents);
		System.out.println("Number of Teachers " + college.noOfTeachers);
		System.out.println("Student Name :" + student.studentName);
		System.out.println("Student Phno " + student.phno);
		System.out.println("Student Address " + student.address);
		System.out.println("Student Roll No " + student.rollNo);
		System.out.println("Student father Name " + student.fatherName);

		Student studentone = new Student("Raju", "195FG10307", "939393292", "Balaji", "Vijayawada");
		College collegeone = new College("Vishnu", "Bhimavaram", 2500, 250, studentone);
		University universityone = new University("Jntuk", 150, "Kakainda", 200, 200, collegeone, studentone);
		System.out.println("Unversity Name " + universityone.unversityName);
		System.out.println("Unversity Address " + universityone.unversityAddress);
		System.out.println("Number of Colleges linked " + universityone.noOfColleges);
		System.out.println("Number of Students in the unversity " + universityone.noOfStudents);
		System.out.println("Number of Lecturers in the unversity " + universityone.noOfLecturers);
		System.out.println("College Name " + collegeone.collegeName);
		System.out.println("College Address " + collegeone.collegeAddress);
		System.out.println("Number of Students " + collegeone.noOfStudents);
		System.out.println("Number of Teachers " + collegeone.noOfTeachers);
		System.out.println("Student Name : " + studentone.studentName);
		System.out.println("Student Phno " + studentone.phno);
		System.out.println("Student Address " + studentone.address);
		System.out.println("Student Roll No " + studentone.rollNo);
		System.out.println("Student father Name " + studentone.fatherName);
	}

}
