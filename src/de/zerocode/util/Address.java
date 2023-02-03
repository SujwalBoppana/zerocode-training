package de.zerocode.util;

public class Address {
	String villageName;
	String mandalName;
	String stateName;
	String pincode;

	public Address(String villageName, String mandalName, String stateName, String pincode) {
		this.villageName = villageName;
		this.mandalName = mandalName;
		this.stateName = stateName;
		this.pincode = pincode;
	}
	/**
	 * this method will the address
	 * @author sujwal B
	 * @since 2022-12-02
	 * @return
	 */

	public String getAddress() {
		return "village name " + this.villageName + " Mandal name " + this.mandalName + " stateName " + this.stateName
				+ " stateName " + this.pincode;
	}

}
