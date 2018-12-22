import java.io.*;
import java.util.*;

/**
 * Verwaltungsklasse verwaltet die externen Dateien (Symptome,Krankheit)
 * und sucht jeweils die passende Krankheit
 * 
 * @author Melisa Aslan, Sophie Ekincioglu
 * @version 04.12.2018
 */
public abstract class Verwaltungsklasse
{
 public static HashMap<String, ArrayList<String>> SK;
    public static HashMap<String, ArrayList<String>> KM;
    public static HashMap<String, ArrayList<String>> KA;
   public Verwaltungsklasse()
   {
       SK =new HashMap<String, ArrayList<String>>();     //Zuordnung Symptom-Krankheiten
       KM =new HashMap<String, ArrayList<String>>();     //Zuordnung Krankheit-Medikamente
       KA =new HashMap<String, ArrayList<String>>();     //Zuordnung Krankheit-Ärzte
       
       File datei = new File("SymptomeundKrankheiten.txt");
       
       try
       {
       Scanner krank = new Scanner(datei);
       while(krank.hasNext()==true)
       {
           String a=krank.nextLine();
           Scanner scan=new Scanner(a);
           String sympt=scan.next();
           ArrayList<String> krankheiten=new ArrayList<String>();
            while(scan.hasNext()==true)
           {
               krankheiten.add(scan.next());
            }
            SK.put(sympt,krankheiten);
        }
    }
    catch(FileNotFoundException a)
    {
       System.out.println("Datei konnte nicht gefunden werden");
    }
    
       
       File datei2 = new File("KrankheitundMedikament.txt");
       
       try
       {
       Scanner med = new Scanner(datei2);
       while(med.hasNext()==true)
       {
           String a=med.nextLine();
           Scanner scan=new Scanner(a);
           String krank=scan.next();
           ArrayList<String> medikamente=new ArrayList<String>();
            while(scan.hasNext()==true)
           {
               medikamente.add(scan.next());
            }
            KM.put(krank,medikamente);
        }
    }
    catch(FileNotFoundException a)
    {
       System.out.println("Datei konnte nicht gefunden werden");
    }
    
     File datei3 = new File("KrankheitundArzt.txt");
       
       try
       {
       Scanner arzt = new Scanner(datei3);
       while(arzt.hasNext()==true)
       {
           String a=arzt.nextLine();
           Scanner scan=new Scanner(a);
           String krank=scan.next();
           ArrayList<String> aerzte=new ArrayList<String>();
            while(scan.hasNext()==true)
           {
               aerzte.add(scan.next());
            }
            KA.put(krank,aerzte);
        }
    }
    catch(FileNotFoundException a)
    {
       System.out.println("Datei konnte nicht gefunden werden");
    }
}
    /**
     * Mithilfe einer externen Datei, indem alle Symptome gespeichert sind, wird
     * eine Liste erstellt
     * 
     * @param Symptome.txt      externer Datei Symptome
     * @return ListeSymptome    Liste der Symptome
     */
    public String ListeallerSymptome()
    {
        String ListeSymptome;
        ListeSymptome= "X:/Symptome.txt";
        return ListeSymptome;
    }

    /**
     * Mithilfe einer externen Datei, indem alle Krankheiten gespeichert sind
       wird eine Liste erstellt
     * 
     * @param  y    Krankheiten.txt      externer Datei Symptome
     * @return        ListeKrank         Liste der Symptome
     */
    public String ListeallerKrank()
    {
        String ListeKrank;
        ListeKrank= "X:/Krankheiten.txt";
        return ListeKrank;
    }
}
