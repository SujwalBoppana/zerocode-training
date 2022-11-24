package de.zerocode.util;

public interface Atm {
	double getWithdraw(int amount);

	double getDeposit(int amount);

	double getBalance();

	String getFundTransfer();

}
