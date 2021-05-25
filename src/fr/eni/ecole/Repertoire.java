/**
 * Classe Répertoire qui hérite de Element
 */

package fr.eni.ecole;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends Element {

    protected List<Element> listeElements;

    public Repertoire(String nom) {
        super(nom);
        listeElements = new ArrayList<>();
    }

    /**
     * Méthode pour ajouter un element dans la liste
     * @param e
     */
    public void addElements(Element e) {
        e.chemin = this.chemin + "\\" + this.nom;
        this.listeElements.add(e);
    }


    /**
     * Fonction de recherche en fonction d'un nom
     * On rapelle la fonction dans la fonction
     * @param nom
     */
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
