package de.zerocode.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public boolean verifyPhoneNumber(String input) {
		return Pattern.compile("[0/+91]?[6789][0-9]{9}").matcher(input).find();
	}

	public boolean verifyEmail(String input) {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9_.]*@[a-zA-Z]+[.][a-zA-Z]+");
		Matcher match = pattern.matcher(input);
		return match.find();
	}
}
