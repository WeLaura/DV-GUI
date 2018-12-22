
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
/**
 * Medikamente die bei der Behandlung der Krankheit eingesetzt werden.
 * 
 * @author (Mihrican Demirören, Rabia Yürümez) 
 * @version (29.11.2018)
 */
public class Medikament
{
    
    private String Name;
    private String Verwendungszweck;

    /**
     * Standartkonstruktor ohne Parameter
     */
    public Medikament()
    {
       Name = "Levodopa";
       Verwendungszweck = "Parkinson";
    }

    /**
     * Konstruktor mit Parameter
     * 
     * @param  n  Name
     * @param  v  Verwendungszweck
     */
    public Medikament(String n, String v)
    {
        Name = n;
        Verwendungszweck = v;
    }
    
    /**
     * Set-Methode für Name
     * @return n Name 
     */
     public void setzeName(String neuername)
     {
         {
             Name = neuername;
         }
     }
     
    /**
     * Get-Methode für Name
     * Gibt Name zurück
     * @return n Name 
     */
     public String gibName()
     {
         {
             return Name;
         }
     }
     
    /**
     * Set-Methode für Verwendungszweck
     * @return v Verwendungszweck 
     */
     public void setzeVerwendungszweck(String neuerverwendungszweck)
     {
         {
              Verwendungszweck= neuerverwendungszweck;
         }
     }
     
    /**
     * Get-Methode für Verwendungszweck
     * Gibt Verwendungszweck zurück
     * @return v Verwendungszweck 
     */
     public String gibVerwendungszweck()
     {
         {
             return Verwendungszweck;
         }
     }
     
    /**
     * Methode mit Parameter und ohne Rückgabetyp
     * Aufgabe: einzelne Medikamente werden in einer externen Datei für Medikamente
                eingegeben und gespeichert

     
     */
    public void speicherungMed(String neuername)
    {
        
    }    
}
