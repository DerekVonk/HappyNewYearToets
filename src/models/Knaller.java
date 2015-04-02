/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Derek
 */
public class Knaller extends Vuurwerk {
    
    private int aantalKnallen;
    private int decibel;
    
    
    /**
     * Default Constructor
     */
    public Knaller() {
        
    }
    
    public Knaller(int aantalKnallen, int decibel, String naam, double prijs, 
            Instructie instructie) {
        super();
        this.aantalKnallen = aantalKnallen;
        this.decibel = decibel;
    }
    
    
    
    /**
     * Method to check of instance of Knaller is legal
     * @return boolean - true is legal, false is illegal
     */
    @Override
    public boolean isLegaal() {
        return false;
    }
    
    /**
     * String method to return string representation of instance of Knaller
     * @return String - description of Knaller
     */
    @Override
    public String toString() {
        return "";
    }
}


