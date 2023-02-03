package de.zerocode.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanCard {
	public boolean getPanCardValidation(String input) {
		return Pattern.matches("[A-Za-z]{5}[0-9]{4}[a-zA-Z]", input);
	}

	public boolean getAadharCardValidation(String input) {
		Pattern one = Pattern.compile("[1-9][0-9]{11}");
		Matcher match = one.matcher(input);
		return match.find();

	}
}
