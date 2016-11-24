package utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author hp
 */
public class Conexion {
    
    public static Connection getConnection(String password) throws SQLException {
        String username = "is851618";
        String thinConn = "jdbc:oracle:thin:@orion.javeriana.edu.co:1521:PUJDISOR";
        DriverManager.registerDriver(new OracleDriver());
        Connection conn = DriverManager.getConnection(thinConn, username, password);
        conn.setAutoCommit(false);
        return conn;     
    }
}
