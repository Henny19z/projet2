/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.projet.projet2;

/**
 *
 * @author henny
 */
public class Barre {
    
    private Noeud debut; 
    private Noeud fin;
    private int idBarre;
    private TypeBarre type;
    
    public Barre(Noeud debut, Noeud fin, int idBarre, TypeBarre type) {
        this.debut = debut;
        this.fin = fin;
        this.idBarre = idBarre;
        this.type = type;
    }

    public Noeud getDebut() {
        return debut;
    }

    public Noeud getFin() {
        return fin;
    }

    public int getIdBarre() {
        return idBarre;
    }

    public TypeBarre getType() {
        return type;
    }

    public void setDebut(Noeud debut) {
        this.debut = debut;
    }

    public void setFin(Noeud fin) {
        this.fin = fin;
    }

    public void setIdBarre(int idBarre) {
        this.idBarre = idBarre;
    }

    public void setType(TypeBarre type) {
        this.type = type;
    }
        
}