package de.zerocode.util;

public class SbiAtm implements Atm {
	int balance = 30000;

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double getWithdraw(int amount) {
		if (balance > amount) {
			return balance - amount;
		}
		return 0;
	}

	@Override
	public double getDeposit(int amount) {
		return amount + balance;
	}

	@Override
	public String getFundTransfer() {
		return "Transfer Sucessful";
	}
}
