package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myConnection {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://database-2.ccgpqnp6qpps.us-east-2.rds.amazonaws.com:3306/A4_database";
	private static final String USER = "haolin";
	private static final String PASSWORD = "cs5200haolin";
	private static 	java.sql.Connection dbConnection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
    	Class.forName(DRIVER);

	if (dbConnection == null) {
		dbConnection = DriverManager.getConnection(URL, USER, PASSWORD);
		return dbConnection;
	} else { return dbConnection; } }
	
	public static void closeConnection() {
   	 try {
   		 if (dbConnection != null) {
		dbConnection.close();
		dbConnection = null; }
   	 } catch (SQLException e) {
   		 // TODO Auto-generated catch block
   		 e.printStackTrace();
   	 }
	}
}
