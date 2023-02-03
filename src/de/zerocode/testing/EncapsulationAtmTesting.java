package de.zerocode.testing;

import java.util.Scanner;

import de.zerocode.util.AtmPinChange;

public class EncapsulationAtmTesting {
	public static void main(String[] args) {
		try (Scanner scanone = new Scanner(System.in)) {
			AtmPinChange pinChange = new AtmPinChange();
			System.out.println("Enter pin");
			int pin = scanone.nextInt();
			pinChange.confirm(pin);
		}
	}

}
