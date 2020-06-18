package com.icicbank.pushapi.XmlPushService.model;

public class ExecuteFinacleScriptRequest {

	private ExecuteFinacleScriptInputVO executeFinacleScriptInputVO =  new ExecuteFinacleScriptInputVO();
	
	private ExecuteFinacleScript_CustomData executeFinacleScript_CustomData = new ExecuteFinacleScript_CustomData();

	public ExecuteFinacleScriptInputVO getExecuteFinacleScriptInputVO() {
		return executeFinacleScriptInputVO;
	}

	public void setExecuteFinacleScriptInputVO(ExecuteFinacleScriptInputVO executeFinacleScriptInputVO) {
		this.executeFinacleScriptInputVO = executeFinacleScriptInputVO;
	}

	public ExecuteFinacleScript_CustomData getExecuteFinacleScript_CustomData() {
		return executeFinacleScript_CustomData;
	}

	public void setExecuteFinacleScript_CustomData(ExecuteFinacleScript_CustomData executeFinacleScript_CustomData) {
		this.executeFinacleScript_CustomData = executeFinacleScript_CustomData;
	}

	public ExecuteFinacleScriptRequest() {
		
	}
	
}
