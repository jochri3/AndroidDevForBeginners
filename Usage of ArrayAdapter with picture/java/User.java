package com.example.lislis.mesexercices;

/**
 * Created by lislis on 01/08/2017.
 */

public class User {
    private String nom;
    private String prenom;
    private String metier;
    private int photo;

    public User(String nom, String prenom, String metier, int photo) {
        this.nom = nom;
        this.prenom = prenom;
        this.metier = metier;
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMetier() {
        return metier;
    }

    public int getPhoto() {
        return photo;
    }
}
