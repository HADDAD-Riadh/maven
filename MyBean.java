package com.haddad.tn.beans;

import java.io.Serializable;

public class MyBean implements Serializable {

    private static final long serialVersionUID = 6841484714879566025L;
    private String nom;

    private String prenom;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
