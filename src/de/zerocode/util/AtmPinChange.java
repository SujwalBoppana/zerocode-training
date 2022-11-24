package de.zerocode.util;

import java.util.Scanner;

public class AtmPinChange {
	private int pin = 8213;
	Scanner scan = new Scanner(System.in);

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public boolean confirm(int pin) {
		if (this.pin == pin) {
			System.out.println("enter the new pin");
			pin = scan.nextInt();
			setPin(pin);
			System.out.println("Pin change Successful");
			return true;
		} else {
			System.out.println("wrong password");
			return false;
		}
	}

}
