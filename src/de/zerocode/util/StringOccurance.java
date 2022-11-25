package de.zerocode.util;

public class StringOccurance {
	public int noOfOccurance(String name, char value) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char temp = name.charAt(i);
			for (int j = 0; j < name.length(); j++) {
				if (value == temp) {
					count++;
					break;
				}
			}
		}
		return count;
	}
}
