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
    
//    /**
//     * Default constructor
//     */
//    public Vuurpijl() {
//        
//    }
    
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
        super(naam, prijs, instructie);
        this.hoogte = hoogte;
        this.kleurverhouding = kleurverhouding;
        if (!correcteKleurverhouding(kleurverhouding)) {
            System.out.println("--> FOUT: Onjuiste kleurverhouding, kleur wordt rood");
            this.kleurverhouding[0] = 100;
            this.kleurverhouding[1] = 0;
            this.kleurverhouding[2] = 0;
            
        }
    }

    /**
     * Method tests if the integers in the array sum to 100
     * @param kleurverhouding array of integers
     * @return boolean - false: the array doesn't add up to 100; true sum = 100
     */
    public boolean correcteKleurverhouding(int[] kleurverhouding) {
        // if sum of array is not 100 return false
        int sum = 0;
        for (int i = 0; i < kleurverhouding.length; i++) 
            sum += kleurverhouding[i];
        return (sum == 100);
    }
    
    /**
     * Method to check if Vuurpijl is legal
     * @return boolean - true is legal, false is illegal
     */
    @Override
    public boolean isLegaal() {
        //dit stukje code haalt een null waarde van Instructie instancie uit de
        // vergelijking
        Instructie instructie = getInstructie();
        
        if(instructie != null)
            return instructie.getLeeftijd() > 16;
        
        return false;
    }
    
    /**
     * Method for returning String representation of Vuurpijl object
     * @return String - description of Vuurpijl 
     */
    @Override
    public String toString() {
        return super.toString() + "\n hoogte: " + this.hoogte + "meter" +
                "\n kleuren:\n\tROOD: " + kleurverhouding[0] + "\n\tGROEN: "
                + kleurverhouding[1] + "\n\tBLAUW: " + kleurverhouding[2] + "\n";
    }
    
}
