package com.javatunes.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
    public static void main(String[] args)
    {
        Connection conn = null;
        try
        {
            String url = "jdbc:derby://localhost:1527/JavaTunesDB";
            Class.forName("org.apache.derby.jdbc.ClientDriver");

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