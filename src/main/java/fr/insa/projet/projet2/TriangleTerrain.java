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
public class TriangleTerrain {
    
    private int identificateur;
    private Point p1;
    private Point p2;
    private Point p3;
    
    public TriangleTerrain (int identificateur, Point p1, Point p2, Point p3) {
        this.identificateur = identificateur;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        
    }
    
    public int getIdentificateur() {
        return identificateur;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setIdentificateur(int identificateur) {
        this.identificateur = identificateur;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
    
    
}
