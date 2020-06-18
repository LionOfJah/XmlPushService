package com.icicbank.pushapi.XmlPushService.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtility {

	/**
	 * @return
	 */
	public static Connection getConnection(Properties props) {

		Connection conn = null;
		
		try {
			
			String url = props.getProperty("db.url");
			String username = props.getProperty("db.username");
			String password = props.getProperty("db.password");

			conn  = DriverManager.getConnection(url, username, password);
		} catch ( SQLException e) {
			System.out.println(e.getMessage());
		}
		
	
			return conn;
		
	}

}
