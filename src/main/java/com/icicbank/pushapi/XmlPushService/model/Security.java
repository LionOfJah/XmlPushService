package com.icicbank.pushapi.XmlPushService.model;

public class Security {

	private Token token;
	
	private String fICertToken;
	
	private String realUserLoginSessionId;
	
	private String realUser;
	
	private String realUserPwd;
	
	private String sSOTransferToken;

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public String getfICertToken() {
		return fICertToken;
	}

	public void setfICertToken(String fICertToken) {
		this.fICertToken = fICertToken;
	}

	public String getRealUserLoginSessionId() {
		return realUserLoginSessionId;
	}

	public void setRealUserLoginSessionId(String realUserLoginSessionId) {
		this.realUserLoginSessionId = realUserLoginSessionId;
	}

	public String getRealUser() {
		return realUser;
	}

	public void setRealUser(String realUser) {
		this.realUser = realUser;
	}

	public String getRealUserPwd() {
		return realUserPwd;
	}

	public void setRealUserPwd(String realUserPwd) {
		this.realUserPwd = realUserPwd;
	}

	public String getsSOTransferToken() {
		return sSOTransferToken;
	}

	public void setsSOTransferToken(String sSOTransferToken) {
		this.sSOTransferToken = sSOTransferToken;
	}

	public Security() {
			}
}
