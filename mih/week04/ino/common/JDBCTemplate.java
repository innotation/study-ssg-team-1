package com.ino.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCTemplate {

    public static Connection getConnection() {
        Properties prop = new Properties();
        Connection conn = null;
        try {
            prop.load(new FileInputStream("src/main/java/com/ino/config/connection-config.properties"));
            String driver = prop.getProperty("driver");
            Class.forName(driver);
            conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
            conn.setAutoCommit(false);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Statement stmt) {
        try {
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rset) {
        try {
            if (rset != null && !rset.isClosed()) {
                rset.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void commit(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.commit();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollback(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
