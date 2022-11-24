package de.zerocode.util;

public class AudiCar extends Vehicle {
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

}
