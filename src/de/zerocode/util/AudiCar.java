package de.zerocode.util;

public class AudiCar extends Vehicle implements Runnable {
	
	@Override
	public String start() {
		return "withButton";
	}

	@Override
	public String stop() {
		return "WithButton";
	}

	@Override
	public String accelerate() {
		return "180Kmph";
	}

	@Override
	public String brake() {
		return "ABS";
	}

	@Override
	public void run() {
		System.out.println(start());
		System.out.println(accelerate());
		System.out.println(brake());
		System.out.println(stop());
	}

}
