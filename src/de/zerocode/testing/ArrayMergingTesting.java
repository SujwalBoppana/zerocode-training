package de.zerocode.testing;

import java.util.Arrays;

import de.zerocode.util.MergeArrays;

public class ArrayMergingTesting {
	public static void main(String[] args) {
		MergeArrays merge = new MergeArrays();
		int [] inputOne = {14,32,13,221,33};
		int [] inputTwo = {16,31,27,1,31};
		System.out.println(Arrays.toString(merge.getMerge(inputOne, inputTwo)));
	}
}
