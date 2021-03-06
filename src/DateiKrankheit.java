import java.io.*;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * Erstellung einer externen Datei für Krankheiten indem alle
   Krankheiten (mind. 10 Krankheiten)
   gespeichert sind, die vorkommen können.
 * 
 * @author (Mihrican Demirören, Rabia Yürümez)  
 * @version (29.11.2018)
 */
public class DateiKrankheit
{
    /**
     * Erstellung der Datei Krankheit und Speicherung der Krankheiten
     */
    public static void main(String[]args)
    {
       
        try {
            PrintWriter ausgabe = new PrintWriter (new FileOutputStream("Krankheit.txt"));
            String Krankheit1= "Parkinson ";
            String Krankheit2= "Thrombose ";
            String Krankheit3= "Osteoporose ";
            String Krankheit4= "Presbyopie ";
            String Krankheit5= "Dysphagie  ";
            String Krankheit6= "Brustkrebs  ";
            String Krankheit7= "Verdauungsstörung ";
            String Krankheit8= "Diabetes ";
            String Krankheit9= "Arthrose ";
            String Krankheit10= "Prostatakrebs ";
            String Krankheit11= "Migräne ";
            String Krankheit12= "Arteriosklerose ";
            
            
            
            
            ausgabe.println(Krankheit1);
            ausgabe.println(Krankheit2);
            ausgabe.println(Krankheit3);
            ausgabe.println(Krankheit4);
            ausgabe.println(Krankheit5);
            ausgabe.println(Krankheit6);
            ausgabe.println(Krankheit7);
            ausgabe.println(Krankheit8);
            ausgabe.println(Krankheit9);
            ausgabe.println(Krankheit10);
            ausgabe.println(Krankheit11);
            ausgabe.println(Krankheit12);
            ausgabe.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 }