package de.zerocode.util;

public class BenzCar extends Vehicle implements Runnable {

	@Override
	public String start() {
		return "withoutkey";
	}

	@Override
	public String stop() {
		return "Withoutkey";
	}

	@Override
	public String accelerate() {
		return "200Kmph";
	}

	@Override
	public String brake() {
		return "Disc bakes";
	}

	@Override
	public void run() {
		System.out.println(start());
		System.out.println(accelerate());
		System.out.println(brake());
		System.out.println(stop());
	}

}
