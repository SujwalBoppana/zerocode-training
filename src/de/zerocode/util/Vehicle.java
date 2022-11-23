package de.zerocode.util;

public class Vehicle {
	public int noOfWheels;
	public String modelNo;
	public String yearOfManufacturing;
	private String fuelType;

	
	public Vehicle(int noOfWheels, String modelNo, String yearOfManufacturing) {
		this.noOfWheels = noOfWheels;
		this.modelNo = modelNo;
		this.yearOfManufacturing = yearOfManufacturing;
	}
	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public int getNoOfWheels() {
		return noOfWheels;
	}

	public String getModelNo() {
		return modelNo;
	}

	public String getYearOfManufacturing() {
		return yearOfManufacturing;
	}
}
