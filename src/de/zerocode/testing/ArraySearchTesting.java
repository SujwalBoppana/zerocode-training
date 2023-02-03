package de.zerocode.testing;

import java.util.Arrays;

import de.zerocode.util.ArraySearch;

public class ArraySearchTesting {
	public static void main(String[] args) {
		ArraySearch arraySearch = new ArraySearch();
		int input[] = { 2, 5, 6, 8, 0, 4 };
		System.out.println(arraySearch.getIndex(input, 5));
		System.out.println(arraySearch.getLargest(input, 7));
		System.out.println(Arrays.toString(arraySearch.getCopy(input)));
	}

}
