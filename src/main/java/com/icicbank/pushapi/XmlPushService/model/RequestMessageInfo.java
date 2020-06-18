package com.icicbank.pushapi.XmlPushService.model;


public class RequestMessageInfo {

	
	private String bankId;
	
	private String timeZone;
	
	private String entityId;
	
	private String entityType;
	
	private String armCorrelationId;
	
	private String msessageDateTime;

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getArmCorrelationId() {
		return armCorrelationId;
	}

	public void setArmCorrelationId(String armCorrelationId) {
		this.armCorrelationId = armCorrelationId;
	}

	public String getMsessageDateTime() {
		return msessageDateTime;
	}

	public void setMsessageDateTime(String msessageDateTime) {
		this.msessageDateTime = msessageDateTime;
	}

	public RequestMessageInfo() {
			} 
	
	
}
