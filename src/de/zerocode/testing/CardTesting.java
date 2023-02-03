package de.zerocode.testing;

import de.zerocode.util.PanCard;

public class CardTesting {
	public static void main(String[] args) {
		PanCard panCard = new PanCard();
		System.out.println(panCard.getPanCardValidation("DXXPB6424E"));
		System.out.println(panCard.getAadharCardValidation("363910292267"));
	}

}
