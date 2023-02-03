package de.zerocode.util;

public class ArrayExamples {
	public int getSum(int[] input) {
		int sum = 0;
		for (int i : input) {
			sum += i;
		}
		return sum;

	}

	public int getLargest(int[] input) {
		int temp;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input[input.length - 1];
	}
	public int getSmallest(int[] input) {
		int temp;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] < input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input[input.length - 1];
	}

}