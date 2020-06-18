package com.icicbank.pushapi.XmlPushService.model;

public class Header {

	protected RequestHeader requestheader = new RequestHeader();

	public Header() {
		
	}

	public RequestHeader getRequestheader() {
		return requestheader;
	}

	public void setRequestheader(RequestHeader requestheader) {
		this.requestheader = requestheader;
	}
}
