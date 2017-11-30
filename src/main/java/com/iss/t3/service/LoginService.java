package com.iss.t3.service;

public class LoginService {

	public boolean validateUser(String name, String password) {
		return name.equalsIgnoreCase("vishald") && password.equals("Ramjane82");
	}

}
