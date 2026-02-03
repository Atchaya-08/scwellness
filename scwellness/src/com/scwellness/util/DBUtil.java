package com.scwellness.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String URL =
    	
    		 "jdbc:oracle:thin:@localhost:1521:XE";
    		private static final String USERNAME = "sc_wellness_user";
    		private static final String PASSWORD = "sc_wellness_pwd";

    public static Connection getDBConnection() throws SQLException {
        Connection con = null;
        try {
            // Load Oracle JDBC Driver
            Class.forName(DRIVER);

            // Create Connection
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found");
            e.printStackTrace();
        }
        return con;
    }
}
