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
public class Terrain {
    
    private double xmin;
    private double xmax;
    private double ymin;
    private double ymax;
    private List<TriangleTerrain> TT;

    public Terrain(double xmin, double xmax, double ymin, double ymax, List<TriangleTerrain> TT) {
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymin = ymin;
        this.ymax = ymax;
        this.TT = TT;
    }

    public double getXmin() {
        return xmin;
    }

    public double getXmax() {
        return xmax;
    }

    public double getYmin() {
        return ymin;
    }

    public double getYmax() {
        return ymax;
    }

    public List<TriangleTerrain> getTT() {
        return TT;
    }

    public void setXmin(double xmin) {
        this.xmin = xmin;
    }

    public void setXmax(double xmax) {
        this.xmax = xmax;
    }

    public void setYmin(double ymin) {
        this.ymin = ymin;
    }

    public void setYmax(double ymax) {
        this.ymax = ymax;
    }

    public void setTT(List<TriangleTerrain> TT) {
        this.TT = TT;
    }
    
    
}
