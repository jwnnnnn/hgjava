package com.yedamhotel;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

	public static Connection conn;

	public static Connection getConn() {
		
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.27:1521:xe","yedam","1234");
			} catch (Exception e) {
				e.printStackTrace();
		}
			return conn;
	}
}