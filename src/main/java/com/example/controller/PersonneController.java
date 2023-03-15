package com.example.controller;

import com.example.dao.Connexion;
import com.example.dao.PersonneDao;
import com.example.modele.Personne;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

@RestController
@RequestMapping("personne")
@CrossOrigin(origins={"http://localhost","http://localhost:3000"})
public class PersonneController
{
    @GetMapping("/getAll")
    @CrossOrigin("http://localhost:3000")
    public Personne[] getAll() throws ClassNotFoundException, SQLException {
        Connexion connexion=new Connexion();
        Connection con= connexion.connect();
        PersonneDao personneDao=new PersonneDao();
        return personneDao.getAllPersonne(con);
    }
}
