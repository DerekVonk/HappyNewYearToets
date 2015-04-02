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

    public double getPrijs() {
        return prijs;
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
     * @return String - Description of Vuurwerk
     */
    @Override
    public String toString() {
        System.out.println("Naam: " + getNaam());
        
        //if Vuurwerk has no instructie, print "ontbreekt"
        String temp;
        if (getInstructie() == null) {
            temp = "Ontbreekt";
        } else {
            temp = getInstructie().toString();
        }
        
        return " Instructie: " + temp + "\n Prijs: \u20AC" + getPrijs() +
                "\n Legaal: " + this.isLegaal();
    }
}
