package de.zerocode.util;

import java.util.Arrays;

public class ArraySearch {
	public int getIndex(int[] input, int element) {
		return Arrays.binarySearch(input, element);
	}

	public int getLargest(int[] input, int nthLargest) {
		Arrays.sort(input);
		try {
			return input[input.length-nthLargest];
		} catch (Exception e) {
			return 0;
		}	
	}
	public int[] getCopy(int [] input) {
		return input.clone();
	}
}
