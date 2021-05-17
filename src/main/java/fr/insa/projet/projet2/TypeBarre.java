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
public class TypeBarre  {
    
    private int idTypeBarre;
    private double cout;
    private double LongMin;
    private double LongMax;
    private double ResistanceMaxTension;
    private double ResistanceMaxCompression;

    public TypeBarre(int idTypeBarre, double cout, double LongMin, double LongMax, double ResistanceMaxTension, double ResistanceMaxCompression) {
        this.idTypeBarre = idTypeBarre;
        this.cout = cout;
        this.LongMin = LongMin;
        this.LongMax = LongMax;
        this.ResistanceMaxTension = ResistanceMaxTension;
        this.ResistanceMaxCompression = ResistanceMaxCompression;
    }

    public int getIdTypeBarre() {
        return idTypeBarre;
    }

    public double getCout() {
        return cout;
    }

    public double getLongMin() {
        return LongMin;
    }

    public double getLongMax() {
        return LongMax;
    }

    public double getResistanceMaxTension() {
        return ResistanceMaxTension;
    }

    public double getResistanceMaxCompression() {
        return ResistanceMaxCompression;
    }

    public void setIdTypeBarre(int idTypeBarre) {
        this.idTypeBarre = idTypeBarre;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    public void setLongMin(double LongMin) {
        this.LongMin = LongMin;
    }

    public void setLongMax(double LongMax) {
        this.LongMax = LongMax;
    }

    public void setResistanceMaxTension(double ResistanceMaxTension) {
        this.ResistanceMaxTension = ResistanceMaxTension;
    }

    public void setResistanceMaxCompression(double ResistanceMaxCompression) {
        this.ResistanceMaxCompression = ResistanceMaxCompression;
    }
    
}

    