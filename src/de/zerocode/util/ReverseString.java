package de.zerocode.util;

public class ReverseString {
	public String getReverse(String input) {
		String reversedString = "";
		String temp = input.toLowerCase();
		for (int i = temp.length() - 1; i >= 0; i--) {
			reversedString = reversedString + temp.charAt(i);
		}
		return reversedString;
	}

	public boolean isPalindrome(String input) {

		if (getReverse(input).equalsIgnoreCase(input)) {
			return true;
		}
		return false;
	}
}
