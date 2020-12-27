package com.car.show;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author badsh
 */
public class MysqlConnect {
    Connection connection = null;
    public static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/SHOWROOM", "root", "12345");
            // JOptionPane.showMessageDialog(null, "Connected to Database");
            return connection;
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
