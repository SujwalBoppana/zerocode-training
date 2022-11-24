package de.zerocode.util;

public class BenzCar extends Vehicle {

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
}
