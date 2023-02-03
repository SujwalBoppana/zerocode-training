package de.zerocode.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[ab]");
		Matcher matcher = pattern.matcher("eabeeeabeeabe");
		while (matcher.find()) {
			System.out.println(matcher.start());
			System.out.println(matcher.end());
			System.out.println(matcher.group());
			System.out.println(matcher.groupCount());

		}
	}

}
