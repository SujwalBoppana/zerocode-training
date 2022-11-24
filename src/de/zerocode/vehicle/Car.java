package de.zerocode.vehicle;

public class Car extends Vehicle {
	public String colour;
	private int noOfAirBags;
	private int noOfSeats;

	public Car(int noOfWheels, String modelNo, String yearOfManufacturing, String colour) {
		super(noOfWheels, modelNo, yearOfManufacturing);
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}
	
	public int getNoOfAirBags() {
		return noOfAirBags;
	}

	public void setNoOfAirBags(int noOfAirBags) {
		this.noOfAirBags = noOfAirBags;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

}
