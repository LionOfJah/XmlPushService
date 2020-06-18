package com.icicbank.pushapi.XmlPushService.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Properties;

import com.icicbank.pushapi.XmlPushService.dao.ConnectionUtility;

public class TestUtility {

	
	  public static void main(String[] args) {
		  Properties props = new Properties();
		  try {
			props.load(TestUtility.class.getClassLoader().getResourceAsStream("application.properties"));
			System.out.println(props.getProperty("db.selectQuery"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
	  Timestamp tms = Timestamp.valueOf(LocalDateTime.now());
	  
	  
	  System.out.println(tms.toString().replace(" ", "T")); }
	 

}
