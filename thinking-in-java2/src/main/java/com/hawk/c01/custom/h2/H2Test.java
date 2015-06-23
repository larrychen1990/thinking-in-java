package com.hawk.c01.custom.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import org.h2.jdbcx.JdbcConnectionPool;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.junit.Test;

public class H2Test {

	private String DRIVER = "org.h2.Driver";
	private String URL = "jdbc:h2:tcp://localhost/~/test";
	private String UESERNAME = "";
	private String PASSWORD = "";

	private String dataPath = "./data/test.csv";
	
	@Test
	public void testConnection1() throws ClassNotFoundException, SQLException {
		// First start the H2 databse

		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL);
		conn.close();
	}

	@Test
	public void testConnection2() throws SQLException {
		JdbcConnectionPool cp = JdbcConnectionPool.create(DRIVER, UESERNAME,
				PASSWORD);

		Connection connection = cp.getConnection();
		connection.close();
		cp.dispose();
	}

	@Test
	public void testWriteToCSV() throws SQLException {
		SimpleResultSet rs = new SimpleResultSet();
		rs.addColumn("ID", Types.INTEGER, 32, 0);
		rs.addColumn("NAME", Types.VARCHAR, 255, 0);
		rs.addRow(1, "Larry Chen");
		rs.addRow(2, "Terry Lee");

		new Csv().write(dataPath, rs, null);

	}

	@Test
	public void testReadFromCSV() throws SQLException {
		ResultSet rs = new Csv().read(dataPath, null, null);
		ResultSetMetaData metaData = rs.getMetaData();
		while(rs.next()){
			for(int i=0;i<metaData.getColumnCount();i++){
				System.out.println(metaData.getColumnLabel(i+1)+" "+rs.getString(i+1));
			}
			System.out.println();
		}
		rs.close();
	}

}
