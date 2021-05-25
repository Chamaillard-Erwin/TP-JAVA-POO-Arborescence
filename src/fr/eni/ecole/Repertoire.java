package fr.eni.ecole;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends Element {

    protected List<Element> listeElements;

    public Repertoire(String nom) {
        super(nom);
        listeElements = new ArrayList<>();
    }

    public void addElements(Element e) {
        e.chemin = this.chemin + "\\" + this.nom;
        this.listeElements.add(e);
    }


    public void recherche(String nom) {
        if (this.nom.equals(nom)) {
            System.out.println(this.chemin + "\\" + nom);
        }

        for (Element element : this.listeElements) {
            if (element instanceof Repertoire) {
                ((Repertoire) element).recherche(nom);
            }
            else if (element instanceof  Fichier){
                if (element.nom.equals(nom))
                System.out.println(element.chemin + "\\" + nom);
            }
        }
    }

}
