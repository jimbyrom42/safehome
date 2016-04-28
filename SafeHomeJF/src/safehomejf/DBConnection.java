/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safehomejf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Benedict
 */
public class DBConnection {
    Connection conn;
        
    DBConnection()
    {
        try {
                       
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String filename = "SafeHomeDB.mdb";
            String database = "jdbc:ucanaccess://";
            database +=filename.trim()+"; DriverID=22;READONLY=false}";
            conn = DriverManager.getConnection(database, "", "");
            System.out.println("Safe Home Connection Passed");
        }
         catch (Exception e){  
              System.out.println(e);
              
         } 
    }
    
    public void WriteToDatabase(String Email, String Password, String VPassword, 
            String FirstName,String LastName, String Username, String MNumber, 
            String SAddress, String City, String ZipCode, String State){
        try{
             String filename = "SafeHomeDB.mdb";
            String database = "jdbc:ucanaccess://";
            database +=filename.trim()+"; DriverID=22;READONLY=false}";
            conn = DriverManager.getConnection(database, "", "");
            
            Statement sta = conn.createStatement();
            
            int s = sta.executeUpdate("INSERT INTO Register VALUES('" + Email + "', '" 
                                        + Password + "', '" + VPassword + "', '" + 
                                        FirstName + "', '" + LastName +"', '" + Username + "', '" + 
                                        MNumber + "', '" + SAddress + "', '" + City + "', '" + 
                                        ZipCode + "', '" + State + "')");
            
           final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "New user account successfully created", "Successful", JOptionPane.INFORMATION_MESSAGE);
                      
          //Account.setVisible(false);
            //new Login().setVisible(true);}
        }
        catch (Exception e)
        {
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "User already exist, Choose another Username", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }
    
    public boolean CheckLogin(String Username, String Password)
    {
        boolean check = false; 
        
         try {
                       
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String filename = "SafeHomeDB.mdb";
            String database = "jdbc:ucanaccess://";
            database +=filename.trim()+"; DriverID=22;READONLY=false}";
            conn = DriverManager.getConnection(database, "", "");
            
            Statement sta = conn.createStatement();
            String sql = "SELECT * FROM Register WHERE Username = '" + Username + "' AND Password = '" + Password + "'";
            ResultSet rs = sta.executeQuery(sql);
            
            while(rs.next())
            {
                check = true;
            }
            if(check == false)
            {
                 final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Incorrect login details, please try again", "Error", JOptionPane.ERROR_MESSAGE);;
            }
         }
         catch (Exception E){  
              System.out.println(E.toString());
         }
        return check;
    }
    
    }