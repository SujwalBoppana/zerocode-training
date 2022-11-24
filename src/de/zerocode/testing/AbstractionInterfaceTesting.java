package de.zerocode.testing;

import de.zerocode.util.SbiAtm;

public class AbstractionInterfaceTesting {
	public static void main(String[] args) {

		SbiAtm sbiAtm = new SbiAtm();
		System.out.println(sbiAtm.getBalance());
		System.out.println(sbiAtm.getDeposit(20000));
		System.out.println(sbiAtm.getWithdraw(24000));
		System.out.println(sbiAtm.getFundTransfer());
	}

}
