package de.zerocode.testing;

public class EvenIndex {
	public int[] getEvenIndex(int[] input) {
		int count = 0;
		int value = 0;
		for (int j = 0; j < input.length; j++) {
			if (j % 2 == 0) {
				count++;
			}
		}
		int[] temp = new int[count];
		for (int i = 0; i < input.length; i++) {

			if (i % 2 == 0) {
				temp[value++] = input[i];
			}
		}
		return temp;
	}

}
