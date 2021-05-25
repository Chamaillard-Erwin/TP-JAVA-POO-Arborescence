package fr.eni.ecole;

import java.util.ArrayList;
import java.util.List;

public class Element {

    protected String nom;
    protected String chemin;

    public Element(String nom) {
        this.nom = nom;
        this.chemin = "\\" + this.nom;
    }
}
