package javaapplication1;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
             
            c =DriverManager.getConnection("jdbc:mysql:///bankusers","root","sql123");    
            s =c.createStatement(); 
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  