package com.javatunes.util;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;

public class JDBCOracle {
    public static void main(String[] args)
    {
        Connection conn = null;
        try
        {
            String url = "jdbc:oracle:thin:@//localhost:9999/JavaTunesDB1";
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String user = "guest";
            String passwd = "password";
            conn = DriverManager.getConnection(url,user,passwd);

            DatabaseMetaData dbmd = conn.getMetaData();

            System.out.println();
            System.out.println("Connected to:     " + dbmd.getURL());
            System.out.println("Connected as:     " + dbmd.getUserName());
            System.out.println("Driver name:      " + dbmd.getDriverName());
            System.out.println("Driver version:   " + dbmd.getDriverVersion());
            System.out.println("Database name:    " + dbmd.getDatabaseProductName());
            System.out.println("Database version: " + dbmd.getDatabaseProductVersion());
            System.out.println();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (conn != null)
                {
                    conn.close();
                    System.out.println("Connection closed.");
                }
            }
            catch (SQLException ignored) { }
        }
    }
}
