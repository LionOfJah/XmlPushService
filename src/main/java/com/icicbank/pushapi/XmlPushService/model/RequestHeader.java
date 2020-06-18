package com.icicbank.pushapi.XmlPushService.model;

public class RequestHeader {

	protected MessageKey messsageKey = new MessageKey();
	
	protected RequestMessageInfo requestMessageInfo = new RequestMessageInfo();
	
	protected Security security = new Security();

	public RequestHeader() {
	}

	public MessageKey getMesssageKey() {
		return messsageKey;
	}

	public void setMesssageKey(MessageKey messsageKey) {
		this.messsageKey = messsageKey;
	}

	public RequestMessageInfo getRequestMessageInfo() {
		return requestMessageInfo;
	}

	public void setRequestMessageInfo(RequestMessageInfo requestMessageInfo) {
		this.requestMessageInfo = requestMessageInfo;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}
}
