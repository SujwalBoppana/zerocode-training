package de.zerocode.util;

public class Triangle extends Shapes {
	@Override
	public String getArea() {
		return "1/2*base*height";
	}

	public double getArea(int base, int height) {
		return (base * height) / 2;
	}

}
