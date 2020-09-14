package com.hirarachy.RestAssured_Hirarchy.controllers;

public interface LoginController {

	void login(String username,String password);
	
	void login();
	
	void loginHeaders() ;
	void loginRequest();
	void loginResponse();
	void validateResponse();
}
