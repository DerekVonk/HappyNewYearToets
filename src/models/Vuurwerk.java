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
 
    // Ik heb deze methode geschreven om een instructie terug te krijgen
    // zo kan ik testen in isLegaal of Vuurwerk een instructie heeft 
    public Instructie getInstructie() {
        return instructie;
    }
    
    public boolean isLegaal() {
       //if Vuurwerk has Instructie & Instructie is NL return true
       //else return false
        return (getInstructie() != null) && instructie.isNederlandstalig();
        // met instance of heb je geen extra methode nodig
        // return instructie instanceof Instructie && instructie.isNederlandstalig();
    }
    
    /**
     * Returns a String representation of Vuurwerk
     * @return String - Discription of Vuurwerk
     */
    @Override
    public String toString() {
        System.out.println("Naam: " + this.naam);
        
        String temp;
        if (getInstructie() == null) {
            temp = "Ontbreekt";
        } else {
            temp = this.instructie.toString();
        }
        
        return " Instructie: " + temp + "\n Prijs: \u20AC" + this.prijs +
                "\n Legaal: " + this.isLegaal();
    }
}
