package de.zerocode.util;

public class MultiThreading implements Runnable {
	public int count=0;

	@Override
	public synchronized void run() {
		for(int i=0;i<=200000;i++) {
			count++;
		}	
	}

	

}
