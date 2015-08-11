package com.hawk.c01.custom.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private Connection conn = null;

	public DB(String url, String userName, String password) {
		try {
			Class.forName("com.mysql.jdbc.Dirver");
			conn = DriverManager.getConnection(url, userName, password);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet runSql(String sql) throws SQLException {
		Statement statement = conn.createStatement();
		return statement.executeQuery(sql);
	}

	@Override
	protected void finalize() throws Throwable {
		if (conn != null && !conn.isClosed()) {
			conn.close();
		}
	}
	
	

}
