/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NyFitia
 */
public class Connexion
{
    //String username="postgres";
    //String pwd="bass.1447";
    //String url="jdbc:postgresql://localhost:5432/rencontre";

    String username="avnadmin";
    String pwd="AVNS_HbgXCouogsekq2TNdmU";
    String url="jdbc:postgresql://pg-1447-nyfitiarandria1447-test1.aivencloud.com:18706/deploiment";
    
    public Connection connect() throws ClassNotFoundException
    {
        Class.forName("org.postgresql.Driver");
        Connection conn=null;
        try
        {
            conn = DriverManager.getConnection(url,username,pwd);
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
