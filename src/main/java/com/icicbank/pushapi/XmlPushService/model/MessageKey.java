package com.icicbank.pushapi.XmlPushService.model;

public class MessageKey {
	
	private String requestUUID;
	
	private String serviceRequestId;
	
	private String serviceRequestVersion;
	
	private String channelId;
	
	private String languageId;

	public String getRequestUUID() {
		return requestUUID;
	}

	public void setRequestUUID(String requestUUID) {
		this.requestUUID = requestUUID;
	}

	public String getServiceRequestId() {
		return serviceRequestId;
	}

	public void setServiceRequestId(String serviceRequestId) {
		this.serviceRequestId = serviceRequestId;
	}

	public String getServiceRequestVersion() {
		return serviceRequestVersion;
	}

	public void setServiceRequestVersion(String serviceRequestVersion) {
		this.serviceRequestVersion = serviceRequestVersion;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getLanguageId() {
		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public MessageKey() {
		}
	
	

}
