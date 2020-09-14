package com.hirarachy.RestAssured_Hirarchy.implementation;

import com.hirarachy.RestAssured_Hirarchy.controllers.LoginController;
import com.hirarachy.RestAssured_Hirarchy.helpers.RestConsumer;
import com.hirarachy.RestAssured_Hirarchy.helpers.constants.Constants;
import com.hirarachy.RestAssured_Hirarchy.helpers.constants.EndPoints;
import com.hirarachy.RestAssured_Hirarchy.pojo.login.LoginPojo;
import com.hirarachy.RestAssured_Hirarchy.pojo.login.LoginResponsePojo;
import com.hirarachy.RestAssured_Hirarchy.utils.PropertyUtils;
import com.hirarachy.RestAssured_Hirarchy.utils.RestUtils;

public class LoginImplemetation extends RestConsumer implements LoginController {

	public void login(String username, String password) {
		post(PropertyUtils.readProperty("URL")+EndPoints.LOGIN);//.headers(loginHedaers()).body()
	}

	public void login() {
		// TODO Auto-generated method stub
		
	}

	public void loginHeaders() {
		
		
	}

	public void loginRequest() {
		LoginPojo login = new LoginPojo();
		login.setUsername(PropertyUtils.readProperty("username"));
		login.setPassword("password");
		RestUtils.converttoGson(login);
	}

	public void loginResponse() {
		//JSONObject objres = JsonObject(res.asString());
		LoginResponsePojo respojo = new LoginResponsePojo();
		//String accestoken = objrej.get("accestoken");
		respojo.setAccestoken("accestoken");
		
	}

	public void validateResponse() {
		// TODO Auto-generated method stub
		
	}

}
