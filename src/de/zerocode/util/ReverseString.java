package de.zerocode.util;

public class ReverseString {
	public boolean isPalindrome(String name) {
		String reversedString = "";
		String temp = name.toLowerCase();
		for (int i = temp.length() - 1; i >= 0; i--) {
			reversedString = reversedString + temp.charAt(i);
		}
		if (temp.equals(reversedString)) {
			return true;
		}
		return false;
	}

}
