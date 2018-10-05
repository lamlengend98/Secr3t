/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lamng
 */
public class Connector {

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/qlsv";
        String user = "root";
        String pass = "root123";
        Connection conn = DriverManager.getConnection(connStr, user, pass);
        if (conn != null) {
            return conn;
        } else {
            return null;
        }
    }
}
