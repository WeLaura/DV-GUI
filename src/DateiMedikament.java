import java.io.*;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * Erstellung einer externen Datei für die Medikamente die bei der
   Behandlung der Krankheit eingesetzt werden.
 * 
 * @author (Mihrican Demirören, Rabia Yürümez)  
 * @version (29.11.2018)
 */
public class DateiMedikament
{
    /**
     * Erstellung der Datei Medikament und Speicherung der Medikamente
     */
    public static void main(String[]args)
    {
       
        try {
            PrintWriter ausgabe = new PrintWriter (new FileOutputStream("Medikament.txt"));
            String Medikament1= "Levodopa";
            String Medikament2= "Blutverdünner Thrombolyse ";
            String Medikament3= "Osteoanabole ";
            String Medikament4= "Antimykotika ";
            String Medikament5= "Palbociclib";
            String Medikament6= "Carmenthin ";
            String Medikament7= "Sulfonylharnstoffe ";
            String Medikament8= "DPP-4-Hemmer  ";
            String Medikament9= "GLP-1-Analoga ";
            String Medikament10= "SGLT-2-Hemmer ";
            String Medikament11= "Paracetamol ";
            String Medikament12= "Metamizol ";
            String Medikament13= " Nichtsteroidale Antirheumatika(NSAR)";
            String Medikament14= "Coxibe";
            String Medikament15= "Opioide  ";
            String Medikament16= " Kortison zur Injektion ";
            String Medikament17= " Abirateronaceta";
            String Medikament18= "PROSTA VITAL Complex mit Plasys 300  ";
            String Medikament19= "PROSTAGUTT forte 160/120 mg Weichkapseln  ";
            String Medikament20= "NUROFEN IBUPROFEN 400 MG  ";
            String Medikament21= "ASS (900 bis 1000 mg)  ";
            String Medikament22= "Ibuprofen (400 mg) ";
            String Medikament23= "Paracetamol (1000 mg) ";
            String Medikament24= "Phenazon (1000 mg)   ";
       
            
            
            ausgabe.println(Medikament1);
            ausgabe.println(Medikament2);
            ausgabe.println(Medikament3);
            ausgabe.println(Medikament4);
            ausgabe.println(Medikament5);
            ausgabe.println(Medikament6);
            ausgabe.println(Medikament7);
            ausgabe.println(Medikament8);
            ausgabe.println(Medikament9);
            ausgabe.println(Medikament10);
            ausgabe.println(Medikament11);
            ausgabe.println(Medikament12);
            ausgabe.println(Medikament13);
            ausgabe.println(Medikament14);
            ausgabe.println(Medikament15);
            ausgabe.println(Medikament16);
            ausgabe.println(Medikament17);
            ausgabe.println(Medikament18);
            ausgabe.println(Medikament19);
            ausgabe.println(Medikament20);
            ausgabe.println(Medikament21);
            ausgabe.println(Medikament22);
            ausgabe.println(Medikament23);
            ausgabe.println(Medikament24);
            ausgabe.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    }

    
