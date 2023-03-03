package com.example.dao;

import com.example.modele.Personne;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonneDao
{
    public Personne[] getAllPersonne(Connection con) throws SQLException {
        Statement req;
        ResultSet res;

        req=con.createStatement();
        String sql="select*from personne";
        res=req.executeQuery(sql);

        ArrayList<Personne> liste=new ArrayList();

        while(res.next())
        {
            liste.add(new Personne(res.getInt("id"),res.getString("nom")));
        }
        Personne[] personnes=new Personne[liste.size()];
        for(int i=0;i<liste.size();i++)
        {
            personnes[i]=liste.get(i);
        }
        return personnes;
    }
}
