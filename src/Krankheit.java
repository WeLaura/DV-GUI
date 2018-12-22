import java.util.ArrayList;
import java.io.*;
import java.util.*;
/**
 * Eine Klasse zur Rückgabe von Medikamenten und Arzt, passend zu einer Krankheit
 *
 * @author Melisa Aslan, Sophie Ekincioglu
 * @version 04.12.2018
 */
public class Krankheit
{
    private String Name;
    private ArrayList<String>ZuordnungMed;
    private ArrayList<String>ZuordnungArzt;

    /**
     *Standardkonstruktor
     */
    public Krankheit()
    {
        Name="Parkinson";
    }
    /**
     * Konstruktor
     */
    public Krankheit(String N)
    {
        Name=N;
    }
    /**
     * set-Methode
     * @param ist der Name N der Krankheit
     */
    public void setzeName(String N)
    {
        Name=N;
    }
    /**
     * get-Methode
     * @return Name
     */
    public String gibName()
    {
        return Name;
    }

    /**
     * Zuordnung Medikamente zu den Krankheiten mithilfe einer schon vorhandenen HashMap, aus ihr werden die Medikamente mit 
     * zugehörigen Krankheiten eingelesen
     *
     * @param keine Parametereingabe
     * @return   Medikament
     */
    public ArrayList<String>ZuordnungMed()
    {
        Scanner s= new Scanner("Medikamente.txt");
        File f= new File("Medikamente.txt");
        ArrayList<String>list= new ArrayList<String>();
       
            while (s.hasNext()==true)
            {
                String m= s.nextLine();
                System.out.println("Das passende Medikament lautet:"+ZuordnungMed);
            }
        
        
            return ZuordnungMed;
    }
       
        

    /**
     * Zuordnung Arzt zur Krankheiten mithilfe einer schon vorhandenen Hashmap, aus ihr wird der passende Arzt eingelesen
     * @return Arzt
     */
    public ArrayList<String>ZuordnungArzt()
    {
        Scanner s= new Scanner("Medikamente.txt");
        File f= new File("Medikamente.txt");
        ArrayList<String>list= new ArrayList<String>();
 
        
             while (s.hasNext()==true)
             {
                 String a= s.nextLine();
                 System.out.println("Der passende Arzt waere ein:"+ ZuordnungArzt);
             }
        
        return ZuordnungArzt;
    }
    
    
    /**
     * Ausgabe der Krankheit auf dem Bildschirm 
     */
    public void AusgabeKrank()
    {
        System.out.println("Die Krankheit lautet:" +Name);
    }
}
