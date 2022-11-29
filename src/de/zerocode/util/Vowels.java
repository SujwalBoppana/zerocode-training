package de.zerocode.util;

public class Vowels {
	public int getVowelsCount(String input) {
		String vowel = "aeiouAEIOU";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < vowel.length(); j++) {
				if (input.charAt(i) == vowel.charAt(j)) {
					count++;
					break;
				}

			}

		}
		return count;
	}

	public int getLettersCount(String input) {
		int letterCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			if (temp >= 'a' && temp <= 'z' || temp >= 'A' && temp <= 'Z') {
				letterCount++;
			}

		}

		return letterCount;
	}

	public int getNumberCount(String input) {
		int numberCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 47 && input.charAt(i) <= 58) {
				numberCount++;
			}
		}
		return numberCount;

	}

	public int getSpecialCharCount(String input) {
		int specialCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			if (!((temp >= 47 && temp <= 58) || (temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z'))) {
				specialCount++;
			}
		}
		return specialCount;

	}

	public String getCount(String input) {
		return "The number of vowels  " + getVowelsCount(input)
				+ " The number of letters  " + getLettersCount(input)
				+ " The numbers present  " + getNumberCount(input)
				+ " The number of special char is  " + getSpecialCharCount(input);

	}

}
