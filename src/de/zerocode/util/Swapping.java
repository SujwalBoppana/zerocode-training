package de.zerocode.util;

public class Swapping {
	String firstString;
	String secondString;

	public Swapping(String firstString, String secondString) {
		this.firstString = firstString + secondString;
		this.secondString = this.firstString.substring(0, (this.firstString.length() - secondString.length()));
		this.firstString = this.firstString.substring(secondString.length());
	}

	@Override
	public String toString() {
		return "Swapping [firstString=" + firstString + ", secondString=" + secondString + "]";
	}

}
