package de.zerocode.testing;

import de.zerocode.util.StringsExample;

public class SentenceTesting {
	public static void main(String[] args) {
		StringsExample stringsExample = new StringsExample();
		try {
			System.out.println(stringsExample.sentenceCasing("hello hiii "));
			System.out.println(stringsExample.getSubString("084901000012949"));
			String [] input = {"ravi","ravi","ravi","Raju","Raju","ravi","ravi"};
			//String [] input = null;
			System.out.println(stringsExample.getCount(input));
		} catch (Exception e) {
			System.out.println("Not Possible");
		}
	}
}
