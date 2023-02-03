package de.zerocode.testing;

import de.zerocode.util.RegularExpression;

public class RegularExpressionTesting {
	public static void main(String[] args) {
		RegularExpression regular = new RegularExpression();
		System.out.println(regular.verifyPhoneNumber("06309638199"));
		System.out.println(regular.verifyEmail("sujwalboppana2000@gmail.com"));
		System.out.println(regular.verifyEmail("xx5335xxyyyyxwuqu._@gmail.com"));

	}

}
