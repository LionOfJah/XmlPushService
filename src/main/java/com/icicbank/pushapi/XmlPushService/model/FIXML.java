package com.icicbank.pushapi.XmlPushService.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FIXML {


	
	protected Header header = new Header();
	
	protected Body body = new Body();
	
	public FIXML() {
		
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
}
