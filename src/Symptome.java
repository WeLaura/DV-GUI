
/**
 * Symptome die bei den Krankheiten vorkommen können.
 * 
 * @author (Mihrican Demirören, Rabia Yürümez)  
 * @version (29.11.2018)
 */
public class Symptome
{
   
    private String Bezeichnung;

    /**
     * Standartkonstruktor ohne Parameter
     */
    public Symptome()
    {
        Bezeichnung = "Zittern";
        
    }

    
    /**
     * Konstruktor mit Parameter
     * 
     * @param b Bezeichnung
     *
     */
    public Symptome(String b)
    {
        Bezeichnung = b;
        
    }
    
    /**
     * Set-Methode für Bezeichnung
     * @return b Bezeichnung 
     */
     public void setzeBezeichnung(String neuebezeichnung)
     {
         {
             Bezeichnung = neuebezeichnung;
         }
     }
     
    /**
     * Get-Methode für Bezeichnung
     * Gibt Bezeichnung zurück
     * @return b Bezeichnung 
     */
     public String gibbezeichnung()
     {
         {
             return Bezeichnung;
         }
     }
     
     
     
}
