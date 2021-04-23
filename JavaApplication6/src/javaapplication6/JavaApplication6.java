/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Game MOA
 */
public class JavaApplication6 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Statement statement = null;
        try {
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/rental","root",""); 
       
         statement = conn.createStatement();
         System.out.print("Database Connected");
     } catch (Exception e) {
         System.out.print("Database Not Connected");
     } 
      

}
    }
    

