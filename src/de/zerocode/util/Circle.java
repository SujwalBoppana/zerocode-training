package de.zerocode.util;

public class Circle extends Triangle {
	@Override
	public String getArea() {
		return "3.14*radius*radius";
	}

	public double getArea(int radius) {
		return 3.14 * radius * radius;
	}

}
