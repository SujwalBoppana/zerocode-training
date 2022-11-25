package de.zerocode.util;

public class ExceptionsHandling {

	public Object getDivision(int first, int second) {
		Object output = 0;
		try {
			output = (first / second);
		} catch (ArithmeticException arithmeticException) {
			output = "Cannot perform this operation";
		}
		return output;
	}

	public Object getString(String name) {
		Object output = 0;
		try {
			output = name.charAt(6);
		} catch (StringIndexOutOfBoundsException index) {
			output = index;
		} catch (NullPointerException pointer) {
			output = pointer;
		}
		return output;
	}

	public Object getArray(int size, int position,int value) {
		Object output;

		int array[] = new int[size];
		try {
			 array[position] = value;
			 output = array[position];
		} catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
			output = outOfBoundsException;
		}
		return output;
	}
}
