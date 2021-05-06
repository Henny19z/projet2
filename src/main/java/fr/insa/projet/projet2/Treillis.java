/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.projet.projet2;

import java.util.List;

/**
 *
 * @author henny
 */
public class Treillis {
    
    private Terrain terrain;
    private List<Noeud> ensNoeud;
    private List<Barre> ensBarre; 
    private List<TypeBarre> catalogueBarre;

    public Treillis(Terrain terrain, List<Noeud> ensNoeud, List<Barre> ensBarre, List<TypeBarre> catalogueBarre) {
        this.terrain = terrain;
        this.ensNoeud = ensNoeud;
        this.ensBarre = ensBarre;
        this.catalogueBarre = catalogueBarre;
    }
    
    public static void main(String[] args) {
        System.out.println("");
              
    }
}