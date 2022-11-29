package de.zerocode.util;

public class NetBanking {
	public String getLogin(String user, String password) {
		String userOne = "admin";
		String userTwo = "manager";
		String adminPassword = "Admin@452";
		String managerPassword = "Manager@812";
		if (((user.toLowerCase()).equals(userOne)) && password.equals(adminPassword)) {
			return "admin login succesful";
		} else if (((user.toLowerCase()).equals(userTwo)) && password.equals(managerPassword)) {
			return "Manager login succesful";
		} else {
			return "Invalid login";
		}
	}
}
