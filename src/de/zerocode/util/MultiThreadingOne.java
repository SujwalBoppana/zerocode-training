package de.zerocode.util;

public class MultiThreadingOne extends Thread {
	public int count = 0;

	@Override
	public void run() {
		for (int i = 0; i <= 18; i++) {
			count++;
		}

	}

}
