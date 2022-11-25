package de.zerocode.testing;

import de.zerocode.util.ExceptionsHandling;

public class ExecptionTesting {
	public static void main(String[] args) {
		ExceptionsHandling exceptions = new ExceptionsHandling();
		System.out.println(exceptions.getDivision(1, 0));
		System.out.println(exceptions.getString(null));
		System.out.println(exceptions.getArray(5, 5,23));
	}
}
