package regalairways;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zeyad
 */
public class Connect {
    public static Connection conn;
       public static Connection getConnection() throws Exception{
      try{
         
          String driver ="com.mysql.jdbc.Driver";
          String url ="jdbc:mysql://localhost:3306/regalairways?useSSL=false";
          String username="root";
          String password="Korgpa600";
          Class.forName(driver);
          conn = DriverManager.getConnection(url,username,password);
          System.out.println("Connected Successfuly!");
          
          return conn;
      }
      catch(Exception e){
        System.out.println(e);
    }
        return null;
        
    }
}
