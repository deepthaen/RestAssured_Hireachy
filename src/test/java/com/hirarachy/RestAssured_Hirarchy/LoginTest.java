package com.hirarachy.RestAssured_Hirarchy;

import org.testng.annotations.Test;

import com.hirarachy.RestAssured_Hirarchy.controllers.LoginController;
import com.hirarachy.RestAssured_Hirarchy.implementation.LoginImplemetation;

public class LoginTest {
	
	@Test
	public void testLogin() {
		
		
		LoginController login = new LoginImplemetation();
		login.login();
		 login.loginResponse();
		login.validateResponse();
	}

}
