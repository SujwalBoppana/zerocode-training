package de.zerocode.util;

public class Student {
	public String studentName;
	public String rollNo;
	public String phno;
	public String fatherName;
	public String address;

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + ", phno=" + phno + ", fatherName="
				+ fatherName + ", address=" + address + "]";
	}

	public Student(String studentName, String rollNo, String phno, String fatherName, String address) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.phno = phno;
		this.fatherName = fatherName;
		this.address = address;
	}
}
