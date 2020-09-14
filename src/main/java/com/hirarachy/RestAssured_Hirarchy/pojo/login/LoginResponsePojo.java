package com.hirarachy.RestAssured_Hirarchy.pojo.login;

public class LoginResponsePojo {
	
	private String accestoken;
	private String refreshToken;
	private String createdDate;
	private String expireDate;
	public String getAccestoken() {
		return accestoken;
	}
	public void setAccestoken(String accestoken) {
		this.accestoken = accestoken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	
	
}
