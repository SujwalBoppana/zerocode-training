package de.zerocode.util;

import java.util.Arrays;

public class RemoveDuplicatesArray {
	public int getDuplicatesCount(int[] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					count++;
					break;
				}

			}
		}
		return count;
	}

	public int[] getRemoveDuplicates(int[] input) {
		int temp = getDuplicatesCount(input);
		Arrays.sort(input);
		int[] arrayone = new int[input.length - temp];
		int value = 0;
		for (int i = 1; i <input.length; i++) {
			if (input[i] != input[i - 1]) {
				System.out.println(input[i]);
				arrayone[value++] = input[i-1];
			}

		}
		return arrayone;
	}

	public static void main(String[] args) {
		RemoveDuplicatesArray removeDuplicates = new RemoveDuplicatesArray();
		int[] input = { 1, 2, 3, 4, 1, 2, 3, 4 };
		System.out.println(removeDuplicates.getDuplicatesCount(input));
		System.out.println(removeDuplicates.getRemoveDuplicates(input));
	}

}
