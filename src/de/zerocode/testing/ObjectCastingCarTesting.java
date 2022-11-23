package de.zerocode.testing;

import de.zerocode.util.*;

public class ObjectCastingCarTesting {
	public static void main(String[] args) {
		
		Car car = new Car(4, "TAK231RA", "2022-01-21", "BLACK");
		car.setFuelType("Diesel");
		car.setNoOfAirBags(5);
		car.setNoOfSeats(6);
		System.out.println(car.getColour());
		System.out.println(car.getFuelType());
		System.out.println(car.getModelNo());
		System.out.println(car.getNoOfAirBags());
		System.out.println(car.getNoOfSeats());
		System.out.println(car.getNoOfWheels());
		System.out.println(car.getYearOfManufacturing());
		
		//upcasting
		Vehicle vehicle = new Car(6, "ABEF#450", "2022-07-12", "RED");
		vehicle.setFuelType("Petrol");
		System.out.println(vehicle.getFuelType());
		System.out.println(vehicle.getNoOfWheels());
		System.out.println(vehicle.getYearOfManufacturing());
		System.out.println(vehicle.getModelNo());
		
		//down casting
		Car carone = (Car) vehicle;
		carone.setFuelType("petrol");
		carone.setNoOfAirBags(5);
		carone.setNoOfSeats(6);
		System.out.println(carone.getColour());
		System.out.println(carone.getFuelType());
		System.out.println(carone.getModelNo());
		System.out.println(carone.getNoOfAirBags());
		System.out.println(carone.getNoOfSeats());
		System.out.println(carone.getNoOfWheels());
		System.out.println(carone.getYearOfManufacturing());

	}

}
