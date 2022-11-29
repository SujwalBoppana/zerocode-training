package de.zerocode.util;

public class RemoveDuplicates {

	public String getRemoveDuplicates(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (result.contains(String.valueOf(input.charAt(i)))) {
				continue;
			} else {
				result += String.valueOf(input.charAt(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		System.out.println(removeDuplicates.getRemoveDuplicates("aaaabbcaabbbbcccssssujjwal"));
	}

}
