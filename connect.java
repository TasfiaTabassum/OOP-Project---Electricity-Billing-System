/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricitybillingsystem;

/**
 *
 * @author shamsi
 */

import java.sql.*;

public class connect {
    
     Connection c;
    Statement s;
    public connect(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            String url = "jdbc:mysql://localhost/oop";
            String username = "root";
            String password = "oopSql";
            c = DriverManager.getConnection(url, username, password);    
           // s =c.createStatement();  
            
            if (c != null) {
			System.out.println("Database Connected successfully");
		} else {
			System.out.println("Database Connection failed");
		}
           
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }  
    }  

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
