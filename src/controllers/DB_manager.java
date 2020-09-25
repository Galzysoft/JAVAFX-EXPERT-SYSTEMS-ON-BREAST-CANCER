/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.Alert;
import javafx.stage.Modality;

/**
 *
 * @author ONYEKA
 */
public class DB_manager {
//     
    Connection con=null; 
    DB_manager(){}
    public Connection connect() throws ClassNotFoundException{
  
         
    try {
        //   jdbc:mysql://localhost:3306/project_manager?zeroDateTimeBehavior=convertToNull [root on Default schema]
        
        Class.forName("org.h2.Driver");
             
       
        
             con = (Connection)DriverManager.getConnection("jdbc:h2:~/breastcancer70","test","test");
  System.out.println("connected successfull"); 
 /* 
          con = (Connection)DriverManager.getConnection("jdbc:mysql://sql2.freemysqlhosting.net:3306/sql2243538", "sql2243538","vZ6%dN2*");
  System.out.println("connected successfull"); 
 
      */ 
        //   String url = "jdbc:mysql://localhost/project_manager";
      } catch (SQLException ex) {
      System.out.println("connectedooo not"+ex.getMessage());
     System.out.println(" Server Timed Out OR UnReachable"); 
      
      
      }
        return con;
    
    
    }
     
    
    
    
    
     public void create_tables()  {
     try {
            Statement stmt=con.createStatement();
            stmt.execute("CREATE TABLE login1"
                    + "(username VARCHAR(20) NOT NULL,"
                
                   + "password VARCHAR(20) NOT NULL,"
                     + "user VARCHAR(20) NOT NULL,"
                   + "name VARCHAR(200) NOT NULL,"
                    + "phone VARCHAR(20) NOT NULL,"
                  + "age VARCHAR(7) NOT NULL,"
                    + "address VARCHAR(200) NOT NULL,"
                  + "gender VARCHAR(20) NOT NULL,"
                    + "date VARCHAR(20))"
                  
                    
            );
            
                   System.out.println(" login created " ); 
        } catch (SQLException ex) {
                        System.out.println("login not created "+ex.getMessage());           }
       
                try {
            Statement stmt=con.createStatement();
            stmt.execute("CREATE TABLE USERS"
                    + "(name VARCHAR(2000) NOT NULL,"
                    + "username VARCHAR(20) NOT NULL,"
                  + "diagnosis VARCHAR(100000) NOT NULL,"
                    
                    + "date VARCHAR(20)NOT NULL)"
                    
            );
            
        } catch (SQLException ex) {
                          System.out.println("USERS not created");       }  
        
    
        
        
        
        
        
        
        
        
         
    }
  
    
    
    }
  
 