package de.zerocode.testing;

import de.zerocode.util.Address;

public class AddressTesting {
	public static void main(String[] args) {
		Address[] address = { new Address("gudivada", "gudivada", "A.P", "521301"),
				new Address("vijayawada", "vijayawada", "A.P", "500002") };
		System.out.println(address[0].getAddress());
		System.out.println(address[1].getAddress());
	}

}
