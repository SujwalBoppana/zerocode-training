package de.zerocode.testing;

import de.zerocode.util.MultiThreading;

public class ThreadsTesting {
	public static void main(String[] args) throws InterruptedException {
		MultiThreading multi = new MultiThreading();
		Thread one = new Thread(multi);
		Thread two = new Thread(multi);
		one.start();
		two.start();
		two.join();
		System.out.println(multi.count);
		

	}

}
