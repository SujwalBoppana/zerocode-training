package de.zerocode.util;

public class ExceptionsHandling {

	public Object division(int first, int second) {
		Object op = 0;
		try {
			op = (first / second);
		} catch (ArithmeticException arithmeticException) {
			op = "Cannot perform this operation";
		}
		return op;
	}

	public void stringProgram(String name) {
		try {
			System.out.println(name.charAt(6));
		} catch (StringIndexOutOfBoundsException index) {
			System.out.println(index);
		} catch (NullPointerException pointer) {
			System.out.println(pointer + " the given string is null");
		}
	}

	public void arrayProgram(int size, String value) {
		int array[] = new int[size];
		try {
			array[8] = 10;
		} catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
			System.out.println(outOfBoundsException + "The length of the array is " + array.length);
		}

		try {
			int number = Integer.parseInt(value);
			System.out.println(number);
		} catch (NumberFormatException format) {
			System.out.println(format);
		}

	}
}
