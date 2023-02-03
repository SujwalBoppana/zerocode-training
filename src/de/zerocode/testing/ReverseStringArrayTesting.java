package de.zerocode.testing;

import java.util.Arrays;

import de.zerocode.util.ReverseStringArray;

public class ReverseStringArrayTesting {
	public static void main(String[] args) {
		ReverseStringArray reverse= new ReverseStringArray();
		String [] input = {null,"raju","sujwal"};
		System.out.println(Arrays.toString(reverse.getElementsReverse(input)));
	}

}
