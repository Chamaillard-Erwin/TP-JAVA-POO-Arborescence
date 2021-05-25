/**
 * Classe element avec un constructeur et des attributs d'instance
 */


package fr.eni.ecole;

public class Element {

    protected String nom;
    protected String chemin;

    public Element(String nom) {
        this.nom = nom;
        this.chemin = "\\" + this.nom;
    }
}
