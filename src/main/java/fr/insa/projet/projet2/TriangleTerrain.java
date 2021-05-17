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
    private Segment s1;
    private Segment s2;
    private Segment s3;
    
    public TriangleTerrain (int identificateur, Point p1, Point p2, Point p3) {
        this.identificateur = identificateur;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.s1 = new Segment(p1,p2);
        this.s1 = new Segment(p2,p3);
        this.s1 = new Segment(p3,p1);
    }
    
    public int getIdentificateur() {
        return identificateur;
    }
    
    public void setIdentificateur(int identificateur) {
        this.identificateur = identificateur;
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
