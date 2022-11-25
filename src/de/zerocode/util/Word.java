package de.zerocode.util;

public class Word {
	public int countWords(String inputString) {
		int wordCount = 0;
		String temp = inputString.trim(); // trim function
		int endOfString = temp.length() - 1;
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == ' ' && temp.charAt(i + 1) != ' ') {
				wordCount++;
			} else if (temp.charAt(i) == ' ' && temp.charAt(i + 1) == ' ') {
				i++;
			} else if (i == endOfString) {
				wordCount++;
			}
		}
		return wordCount;
	}

	public String[] wordSplit(String inputString) {
		return inputString.split(" ");
	}
}
