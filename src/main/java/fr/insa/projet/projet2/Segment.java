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
public class Segment {
    
    private Point debut;
    private Point fin;

    public Segment(Point debut, Point fin) {
        this.debut = debut;
        this.fin = fin;
    }

    public Point getDebut() {
        return debut;
    }

    public Point getFin() {
        return fin;
    }

    public void setDebut(Point debut) {
        this.debut = debut;
    }

    public void setFin(Point fin) {
        this.fin = fin;
    }
    
    
    
}
