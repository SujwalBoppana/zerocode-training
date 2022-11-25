package de.zerocode.testing;

import de.zerocode.util.ThrowExceptionHandling;

public class ExceptionTesting {
	public static void main(String[] args) {

		ThrowExceptionHandling exceptionHandling = new ThrowExceptionHandling();
		try {
			System.out.println(exceptionHandling.checkResult(40));
		} catch (Exception e) {
			System.out.println("Failed in the exam");
		}

		try {
			System.out.println(exceptionHandling.getDivision(10, 0));

		} catch (ArithmeticException e) {
			System.out.println("Division Not possible");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(exceptionHandling.getString("Sujwal",7));
		} catch (NullPointerException e) {
			System.out.println("given String is Null");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
