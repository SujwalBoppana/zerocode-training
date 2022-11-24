package de.zerocode.util;

public class HondaCar extends Vehicle {

	@Override
	public String start() {
		return "withKey";
	}

	@Override
	public String stop() {
		return "Withkey";
	}

	@Override
	public String accelerate() {
		return "120Kmph";
	}

	@Override
	public String brake() {
		return "Drum bakes";
	}
}
