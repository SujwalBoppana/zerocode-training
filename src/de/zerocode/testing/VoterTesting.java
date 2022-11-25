package de.zerocode.testing;

import de.zerocode.util.VoterApplication;

public class VoterTesting {
	public static void main(String[] args) {
		VoterApplication voter = new VoterApplication();
		voter.isEligible(18);
		voter.setDetails("sujwal", "Venkateswara rao", "gudivada", "63098638199");
		System.out.println(voter);
	}
}
