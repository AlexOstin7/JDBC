package com.my_project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


class JDBCTest {

    private static final String url = "jdbc:mysql://localhost/test";

    private static final String user = "root";

    private static final String password = "root";

    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Success");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
