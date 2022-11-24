package de.zerocode.testing;

import de.zerocode.util.BankAccount;

public class EncapsulationTesting extends BankAccount {
	public static void main(String[] args) {
		EncapsulationTesting testing = new EncapsulationTesting();
		testing.setBalance(50000);
		testing.setCustomerName("Sujwal");
		testing.setCustomerPhno("6309638199");
		testing.setCustomerAddress("Gudivada");
		testing.setAccountNumber(848999785447l);
		System.out.println(testing.getCustomerName());
		System.out.println(testing.getCustomerPhno());
		System.out.println(testing.getCustomerAddress());
		System.out.println(testing.getAccountNumber());
		System.out.println(testing.getBalance());
	}

}
