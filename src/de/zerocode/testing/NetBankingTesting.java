package de.zerocode.testing;

import de.zerocode.util.NetBanking;

public class NetBankingTesting {
	public static void main(String[] args) {
		NetBanking netBanking = new NetBanking();
		System.out.println(netBanking.getLogin("AdmiN", "Admin@452"));
		System.out.println(netBanking.getLogin("ManAger", "Manager@812"));
	}


}
