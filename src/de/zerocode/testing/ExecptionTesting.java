package de.zerocode.testing;

import de.zerocode.util.ExceptionsHandling;

public class ExecptionTesting {
	public static void main(String[] args) {
		ExceptionsHandling exceptions = new ExceptionsHandling();
		System.out.println(exceptions.division(1, 0));
		exceptions.stringProgram(null);
		exceptions.arrayProgram(7,"hello");
	}
}
