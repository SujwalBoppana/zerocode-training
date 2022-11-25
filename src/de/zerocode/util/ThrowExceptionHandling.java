package de.zerocode.util;

public class ThrowExceptionHandling {
	public String checkResult(int marks) throws Exception {
		if (marks < 50) {
			throw new Exception("failed");
		}
		return "Exam passed";
	}

	public int getDivision(int first, int second) throws ArithmeticException {
		return first / second;
	}

	public char getString(String name,int index) throws NullPointerException, StringIndexOutOfBoundsException {
		return name.charAt(index);
	}
}
