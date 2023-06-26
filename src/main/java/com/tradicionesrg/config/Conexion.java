/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradicionesrg.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gastonpauletti
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:8889/carrito_tradiciones";
    String user ="root";
    String pass="root";
    public Connection getConnection(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection(url,user,pass);
         }catch(Exception e){
             
         }
    
    return con;
}
}