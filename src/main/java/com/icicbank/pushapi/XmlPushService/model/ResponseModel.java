package com.icicbank.pushapi.XmlPushService.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseModel {

	@XmlElement
	private String status;
	
	@XmlElement
	private FIXML fixml;
	
	@XmlElement
	private String errorMessage;

	public ResponseModel() {
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public FIXML getFixml() {
		return fixml;
	}

	public void setFixml(FIXML fixml) {
		this.fixml = fixml;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
