package de.zerocode.testing;

import de.zerocode.util.AdvancedCalculator;
import de.zerocode.util.BasicCalculator;

public class ObjectCastingTesting {
	public static void main(String[] args) {
		// normal object
		AdvancedCalculator advancedCalculator = new AdvancedCalculator();
		System.out.println(advancedCalculator.getLargest(5, 4, 7));
		System.out.println(advancedCalculator.getSmallest(3, 5, 2));
		System.out.println(advancedCalculator.getLargest(7, 9));
		System.out.println(advancedCalculator.getAdd(5, 7));
		System.out.println(advancedCalculator.getSubtract(10, 50));
		System.out.println(advancedCalculator.getDivision(10, 2));
		System.out.println(advancedCalculator.getMulti(6, 7));

		// Up casting
		BasicCalculator basicCalculator = new AdvancedCalculator();
		System.out.println(basicCalculator.getAdd(5, 10));
		System.out.println(basicCalculator.getSubtract(120, 50));
		System.out.println(basicCalculator.getDivision(100, 2));
		System.out.println(basicCalculator.getMulti(60, 70));
		// we cannot access the methods or variable present inside the Subclass

		// down casting
		AdvancedCalculator advancedCalculatorOne = (AdvancedCalculator) basicCalculator;
		System.out.println(advancedCalculatorOne.getLargest(50, 44, 37));
		System.out.println(advancedCalculatorOne.getSmallest(38, 25, 72));
		System.out.println(advancedCalculatorOne.getLargest(70, 39));
		System.out.println(advancedCalculatorOne.getAdd(556, 78));
		System.out.println(advancedCalculatorOne.getSubtract(1000, 650));
		System.out.println(advancedCalculatorOne.getDivision(54, 2));
		System.out.println(advancedCalculatorOne.getMulti(89, 77));
	}

}
