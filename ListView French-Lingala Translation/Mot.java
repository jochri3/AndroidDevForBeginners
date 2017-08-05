package com.example.lislis.mesexercices;

/**
 * Created by lislis on 31/07/2017.
 */

//Application pour l'argot lingala

public class Mot
{
    private String motFr;
    private String motLn;

    public Mot(String motFr, String motLn) {
        this.motFr = motFr;
        this.motLn = motLn;
    }

    public String getMotFr() {
        return motFr;
    }

    public String getMotLn() {
        return motLn;
    }
}
