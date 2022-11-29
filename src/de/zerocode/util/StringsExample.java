package de.zerocode.util;

public class StringsExample {
	public String sentenceCasing(String input) throws NullPointerException, StringIndexOutOfBoundsException {
		String temp = "";
		temp = input.trim();
		temp = (temp.substring(0, 1)).toUpperCase() + (temp.substring(1)).toLowerCase();
		return temp;
	}

	public String getSubString(String input) throws NullPointerException, StringIndexOutOfBoundsException {
		String temp = "";
		temp = input.trim();
		temp = temp.substring(9, 15);
		return temp;
	}

	public int getCount(String[] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].equals(input[j])) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	
}
