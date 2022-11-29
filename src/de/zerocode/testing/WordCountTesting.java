package de.zerocode.testing;

import de.zerocode.util.Word;

public class WordCountTesting {
	public static void main(String[] args) {
		Word word = new Word();
		System.out.println(word.countWords("If you     want to download Java      for another computer."));
		String[] value = word.wordSplit("hello world  ");
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
				
	}
	

}
