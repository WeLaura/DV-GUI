
/**
 * Die Klasse dient dazu die passenden Fachbereiche eines Arztes zu finden
 * 
 * @author Melisa Aslan, Sophie Ekincioglu
 * @version 04.12.2018
 */
public class Arzt
{
    private String Fachbereich;

    /**
     * Standardkonstruktor
     */
    public Arzt()
    {
        Fachbereich= "Neurologie";
        
    }
    /**
     * Konstruktor mit übergebenen Parametern
     */
    public Arzt(String F)
    {
        Fachbereich=F;
    }
    /**
     * Set-Methode
     * @param ist der Fachbereich F
     */
    public void setzeFachbereich(String F)
    {
        Fachbereich=F;
    }
    /**
     * Get-Methode
     * @return Fachbereich
     */
    public String gibFachbereich()
    {
        return Fachbereich;
    }
    

    /**
     * Methode zur Ausgabe des Fachbereiches
     * 
     * @param nicht vorhanden
     * @return keine Rückgabe
     */
    public void AusgabeFach()
    {
        System.out.println("Der Fachbereich lautet:"+Fachbereich);
    }
}
