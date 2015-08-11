package com.hawk.c01.custom.db;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		// to read url, username, password from configuration file
		Properties configFile = new Properties();
		String url = "";
		String user_name = "";
		String password = "";
		String database = "";
		try {
			configFile.load(Main.class.getClassLoader().getResourceAsStream("config.properties"));
			url = configFile.getProperty("url");
			database = configFile.getProperty("database");
			user_name = configFile.getProperty("user_name");
			password = configFile.getProperty("password");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// instantiate a DB object
		DB db = new DB(url + database, user_name, password);
		try {
			ResultSet rs = db.runSql("select * from user");
			while (rs.next()) {
				System.out.println(rs.getString("user_name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
