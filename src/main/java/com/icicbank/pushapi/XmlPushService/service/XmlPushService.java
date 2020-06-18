package com.icicbank.pushapi.XmlPushService.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Properties;

import com.icicbank.pushapi.XmlPushService.dao.ConnectionUtility;
import com.icicbank.pushapi.XmlPushService.model.FIXML;

import oracle.sql.DATE;

public class XmlPushService {

	
	/*
	 * public static Properties loadProperties() {
	 * 
	 * Properties props = new Properties();
	 * 
	 * try { //ClassLoader loader = Thread.currentThread().getContextClassLoader();
	 * 
	 * InputStream input = getClass().getSystemClassLoader().getResourceAsStream(
	 * "src/main/resource/application.propeties");
	 * 
	 * 
	 * if(input==null) { System.out.println("Input is null"); } props.load(input);
	 * System.out.println(props.getProperty("db.selectQuery")); } catch (IOException
	 * e) { System.out.println("Exception occurred  in "+e.getMessage()); }
	 * 
	 * return props; }
	 */
	public FIXML pushXmlRecords() throws SQLException, IOException {
		

		FIXML xmlResponse = new FIXML();
		
		Double requestIdCount =  Math.random();
		Timestamp tms = Timestamp.valueOf(LocalDateTime.now());
		
		Properties props = new Properties();
		
		InputStream input = getClass().getClassLoader().getResourceAsStream("/application.properties");

		PreparedStatement pstSelect = null;
		PreparedStatement pstUpdate = null;
		Connection con =  null;
		
		try {
			//Properties props = XmlPushService.loadProperties();
			props.load(input);
			con= ConnectionUtility.getConnection(props);

			pstSelect = con.prepareStatement(props.getProperty("db.selectQuery"));
			
			pstUpdate = con.prepareStatement(props.getProperty("db.updateQuery"));
			ResultSet rs = pstSelect.executeQuery();
			
			xmlResponse.getBody().getExecuteFinacleScriptRequest().getExecuteFinacleScript_CustomData().setChq_line_1(rs.getString(3));
			xmlResponse.getBody().getExecuteFinacleScriptRequest().getExecuteFinacleScript_CustomData().setEmail_1(rs.getString(4));
			
			xmlResponse.getBody().getExecuteFinacleScriptRequest().getExecuteFinacleScript_CustomData().setPrint_date_from(DATE.getCurrentDate().stringValue());
			xmlResponse.getBody().getExecuteFinacleScriptRequest().getExecuteFinacleScript_CustomData().setDelivery_instrmnt(rs.getString(6));
			xmlResponse.getBody().getExecuteFinacleScriptRequest().getExecuteFinacleScript_CustomData().setForacid(rs.getString(1));
			xmlResponse.getHeader().getRequestheader().getMesssageKey().setRequestUUID("APIGW_"+requestIdCount.intValue());
			xmlResponse.getHeader().getRequestheader().getRequestMessageInfo().setMsessageDateTime(tms.toString().replace(" ", "T"));
			
			pstUpdate.setString(1, rs.getString(2));
			int flag=pstUpdate.executeUpdate();
			
			System.out.println("Rows Updated "+flag);
			
		}finally {
			pstSelect.close();
			pstUpdate.close();
			con.close();
		}

		
		return xmlResponse;
	}
}
