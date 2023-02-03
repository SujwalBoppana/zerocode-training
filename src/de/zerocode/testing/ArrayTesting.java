package de.zerocode.testing;

import de.zerocode.util.ArrayExamples;

public class ArrayTesting {
	public static void main(String[] args) {
		ArrayExamples array = new ArrayExamples();
		int [] input = {2,4,31,455,531,1};
		System.out.println(array.getSum(input));
		System.out.println(array.getLargest(input));
		System.out.println(array.getSmallest(input));
	}

}
