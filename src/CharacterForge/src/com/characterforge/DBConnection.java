package com.characterforge;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Database Connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/characterdb",
                    "root",
                    "Gujar@12");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}