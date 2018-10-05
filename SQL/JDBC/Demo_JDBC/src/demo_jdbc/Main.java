/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_jdbc;
import java.sql.*;

/**
 *
 * @author lamng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("demo_jdbc.Driver");
            String connStr = "jdbc:mysql//localhost:3306/QLTHUVIEN";
            Connection cnn = 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
