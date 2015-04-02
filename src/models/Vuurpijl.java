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
public class Vuurpijl extends Vuurwerk {
    
    private double hoogte;
    private int[] kleurverhouding;
    
    /**
     * Default constructor
     */
    public Vuurpijl() {
        
    }
    
    /**
     * Constructor for instance of Vuurpijl
     * @param hoogte double - the max height of the Vuurpijl
     * @param kleurverhouding int array - the colors in the Vuurpijl
     * @param naam String - the name of the Vuurpijl
     * @param prijs double - the price of the Vuurpijl
     * @param instructie Instructie object - the details of the Vuurpijl
     */
    public Vuurpijl(double hoogte, int[] kleurverhouding, String naam, double prijs, 
            Instructie instructie) {
        super();
        this.hoogte = hoogte;
        this.kleurverhouding = kleurverhouding;
    }

    /**
     * Method to check if Vuurpijl is legal
     * @return boolean - true is legal, false is illegal
     */
    @Override
    public boolean isLegaal() {
        return false;
    }
    
    /**
     * Method for returning String representation of Vuurpijl object
     * @return String - description of Vuurpijl 
     */
    @Override
    public String toString() {
        return "";
    }
    
}
