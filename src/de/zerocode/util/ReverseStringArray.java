package de.zerocode.util;

public class ReverseStringArray {
	public String[] getElementsReverse(String[] input) {
		for (int i = 0; i < input.length; i++) {
		 String value = input[i];
			String temp = "";
			try {
				for (int j = 0; j < value.length(); j++) {
					temp = value.charAt(j) + temp;
				}
			} catch (Exception e) {
				input[i] = input[i];
			}
			input[i] = temp;
		}
		return input;
	}

}
