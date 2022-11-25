package de.zerocode.util;

public class VoterApplication {
	String name;
	String fatherName;
	String address;
	String phno;

	public void isEligible(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not Eligible for voting");
		}
	}

	public void setDetails(String name, String fatherName, String address, String phno) {
		this.name = name;
		this.fatherName = fatherName;
		this.address = address;
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "VoterApplication [name=" + name + ", fatherName=" + fatherName + ", address=" + address + ", phno="
				+ phno + "]";
	}
	
}
