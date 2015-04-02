package models;

/**
 *
 * @author odepj
 */
public class Vuurwerk {
    
    private String naam;
    private double prijs;
    private Instructie instructie;
    
    
    /**
     * Default Constructor
     */
    public Vuurwerk() {
        
    }

    
    public Vuurwerk(String naam, double prijs, Instructie instructie) {
        this.naam = naam;
        this.prijs = prijs;
        this.instructie = instructie;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public Instructie getInstructie() {
        return instructie;
    }

    public void setInstructie(Instructie instructie) {
        this.instructie = instructie;
    }
    
    public boolean isLegaal() {
       return false;
    }
    
    /**
     * Returns a String representation of Vuurwerk
     * @return String - Discription of Vuurwerk
     */
    @Override
    public String toString() {
        return "";
        
    }
}
