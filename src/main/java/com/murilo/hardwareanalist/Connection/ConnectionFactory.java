package com.murilo.hardwareanalist.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * @author Murilo
 */
public class ConnectionFactory {

    String password = "hs@0120";
    String url = "jdbc:mysql://localhost:3306/hardwareanalist?user=root&password=" + password;

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(url);

        } catch (SQLException e) {
            throw new RuntimeException(e);        
        }
    }
}
