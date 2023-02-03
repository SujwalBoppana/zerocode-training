package de.zerocode.testing;

import java.util.Arrays;

public class EvenIndexTesting {

	public static void main(String[] args) {
		EvenIndex evenIndex = new EvenIndex();
		int input[] = { 2, 5, 6, 8, 0, 4 };
		System.out.println(Arrays.toString(evenIndex.getEvenIndex(input)));
	}

}
