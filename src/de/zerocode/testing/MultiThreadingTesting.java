package de.zerocode.testing;

import de.zerocode.util.AudiCar;
import de.zerocode.util.BenzCar;

public class MultiThreadingTesting  {
	public static void main(String[] args) throws InterruptedException {
		AudiCar audiCar = new AudiCar();
		BenzCar benzCar = new BenzCar();
		Thread threadone = new Thread(audiCar);
		Thread threadtwo = new Thread(benzCar);
		threadone.start();
		threadtwo.start();
		threadone.join();
		threadtwo.join();
		threadone.setPriority(Thread.MAX_PRIORITY);
		System.out.println(threadone.getPriority());
		System.out.println(threadtwo.getPriority());
		
	}
	

}
