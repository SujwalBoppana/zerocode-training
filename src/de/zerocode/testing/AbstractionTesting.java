package de.zerocode.testing;

import de.zerocode.util.*;

public class AbstractionTesting {
	public static void main(String[] args) {
		
		Vehicle hondaCar = new HondaCar();
		System.out.println(hondaCar.accelerate());
		System.out.println(hondaCar.start());
		System.out.println(hondaCar.stop());
		System.out.println(hondaCar.brake());
		
		Vehicle benzCar = new BenzCar(); 
		System.out.println(benzCar.accelerate());
		System.out.println(benzCar.start());
		System.out.println(benzCar.stop());
		System.out.println(benzCar.brake());
		
		Vehicle audiCar = new AudiCar();
		System.out.println(audiCar.accelerate());
		System.out.println(audiCar.start());
		System.out.println(audiCar.stop());
		System.out.println(audiCar.brake());
	}
}
