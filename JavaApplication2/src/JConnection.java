/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shivamkejriwal
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
 
public class JConnection {
        private static final String databaseURL = "jdbc:mysql://localhost:3306/new_schema";
        private static final String username = "root";
        private static final String password = "";
    public static Connection ConnecrDb() {
            Connection conn = null;
            try {
                    conn = DriverManager.getConnection(databaseURL, username, password);
                    System.out.println("Connected to the database");
                    return conn;
                }
            catch (Exception e) {
                System.out.println("An error occurred. User/Password maybe invalid");
                JOptionPane.showMessageDialog(null,e);
                return null;
            }
        }
    }

