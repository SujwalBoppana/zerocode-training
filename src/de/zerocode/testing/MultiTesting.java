package de.zerocode.testing;

import de.zerocode.util.MultiThreading;
import de.zerocode.util.MultiThreadingOne;

public class MultiTesting {
	public static void main(String[] args)  {
		MultiThreading multi = new MultiThreading();
		MultiThreadingOne multiThreadingOne = new MultiThreadingOne();
		Thread one = new Thread(multi);
		Thread two = new Thread(multiThreadingOne);
		two.setPriority(10);
		one.setPriority(1);
		one.run();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		two.run();
		System.out.println(multi.count);
		System.out.println(multiThreadingOne.count);
		System.out.println(two.getPriority());
		System.out.println(one.getPriority());
		
		
	}

}
