import java.util.*;
import java.io.*;
/**
 * Beschreiben Sie hier die Klasse Patient.
 * 
 * @author (Mehrin Azam, Franziska Binmöller) 
 * @version (05.12.18)
 */
public class Patient
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String Name;
    private int Alter;
    private double Groesse;
    private double Gewicht;
    private String Geschlecht;
    private ArrayList<String> FamKrankheiten;
    private ArrayList<String> Allergien;
    private ArrayList<String> weitKrankheiten;
    private String[] Angewohnheiten;
    private ArrayList<String> Symptome;         //wurde als Attribut nachträglich hinzugefügt
    private ArrayList<String> ListeAlteSuchen;

    /**
     * Standardkonstruktor für Objekte der Klasse Patient
     */
    public Patient()
    {
        Name=null;
        Alter=0;
        Groesse=0;
        Gewicht=0;
        Geschlecht=null;
        FamKrankheiten=new ArrayList<String>();
        Allergien=new ArrayList<String>();
        weitKrankheiten=new ArrayList<String>();
        Angewohnheiten=null;
        Symptome=new ArrayList<String>();
        ListeAlteSuchen=new ArrayList<String>();
    }

    /**
     * Methode Eingabe Daten
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void EingabeDaten(String n,int a,double g, double ge,String gesch,ArrayList<String> fam, ArrayList<String> all,ArrayList<String> we,String[] ang)
    {
        SetName(n);
        SetAlter(a);
        SetGroesse(g);
        SetGewicht(ge);
        SetGeschlecht(gesch);
        SetFamKrankheiten(fam);
        SetAllergien(all);
        SetweitKrankheiten(we);
        SetAngewohnheiten(ang);
    }
    
    /**
     * Methode Ergebnisse
     * 
     * Ruft Methode der Klasse Verwaltung auf, die passende Krankheiten sucht
     * Diese Krankheiten werden von einer Schleife auf dem Bildschirm ausgegeben und 
     * von einer anderen Schleife in ListeAlteSuchen gespeichert.
     */
    public void Ergebnisse()
    {
        String sympt;
        ArrayList<String> Ergebnisse=new ArrayList<String>();
        ArrayList<String> krankheiten= new ArrayList<String>();
        int i=0;
        int j=0;
        while(i<=Symptome.size())
        {
            sympt=Symptome.get(i);
            krankheiten=Verwaltungsklasse.SK.get(sympt); //Demo mit Verwaltungsklasse ersetzen
            while (j<krankheiten.size())
            {
                Ergebnisse.add(krankheiten.get(j));
                System.out.println(krankheiten.get(j));
                ListeAlteSuchen.add(Ergebnisse.get(j));
                j++;
            }
            i++;
        }
        
    }
    
    /**
     * Methode Eingabe Symptome
     * 
     * Eingabe Symptome lässt den Benutzer seine Symptome auswählen; dazu werden 2 Scanner Objekte erzeugt 
     * Die Datei Symptome enthält alle Symptome die auf die Krankheiten hinweisen können, diese werden nacheinander auf dem 
     * Bildschirm ausgegeben. Über die Tastatureingabe kann der Benutzer "Ja" eingeben, wenn er ein Symptom auswählen will, 
     * dadurch wird das Symptom dem Attribut Symptome hinzugefügt. Bei keiner oder einer anderen Eingabe wird das Symptom 
     * nicht gespeichert
     */
    public void EingabeSymptome()
    {
        Scanner eingabe=new Scanner(System.in);
        File ausgabe=new File("Symptome.txt");
        try
        {
            Scanner datei=new Scanner(ausgabe);
            System.out.println("Wählen Sie Ihre Symptome mit 'Ja' an");
            while (datei.hasNext()==true)
            {
                String a=datei.nextLine();
                System.out.print(a + ":  ");
                if(eingabe.nextLine().equals("Ja"))
                {
                    Symptome.add(a); 
                }
            }
        }
        catch(FileNotFoundException a)
        {
            System.out.print("Datei Symptome konnte nicht gefunden werden");
        }
    }
    
    /**
     * Methode vorherige Suchen
     * 
     * Methode ruft das Attribut ListeAlteSuchen auf und gibt die einzelnen
     * Elemente auf dem Bildschirm aus
     */
    public void vorherigeSuchen()
    {
        for(int i=0;i<=ListeAlteSuchen.size();i++)
        {
            System.out.println(ListeAlteSuchen.get(i));
        }
    }
    
    /**
     * Get-Methode für das Attribut Name
     * 
     * @return  Name    (Attribut Name)
     */
    public String GetName()
    {
        return Name;
    }

    /**
     * Set-Methode für das Attribut Name
     * 
     * @param  n    (String n zum setzen des Namens)
     */
    public void SetName(String n)
    {
        Name=n;
    }

    /**
     * Get-Methode für das Attribut Alter
     * 
     * @return  Alter   (Attribut Alter)
     */
    public int GetAlter()
    {
        return Alter;
    }

    /**
     * Set-Methode für das Attribut Alter
     * 
     * @param  a    (int a zum setzen des Alters)
     */
    public void SetAlter(int a)
    {
        Alter=a;
    }
    
    /**
     * Get-Methode für das Attribut Groesse
     * 
     * @return  Groeße  (Attribut Groesse)
     */
    public double GetGroesse()
    {
        return Groesse;
    }

    /**
     * Set-Methode für das Attribut Groeße
     * 
     * @param  n    (double n zum setzen der Groesse)
     */
    public void SetGroesse(double n)
    {
        Groesse=n;
    }
    
    /**
     * Get-Methode für das Attribut Gewicht
     * 
     * @return  Gewicht (Attribut Gewicht)
     */
    public double GetGewicht()
    {
        return Gewicht;
    }

    /**
     * Set-Methode für das Attribut Gewicht
     * 
     * @param  n    (double n zum setzen des Gewichts)
     */
    public void SetGewicht(double n)
    {
        Gewicht=n;
    }
    
    /**
     * Get-Methode für das Attribut Geschlecht
     * 
     * @return  Geschlecht  (Attribut Geschlecht)
     */
    public String GetGeschlecht()
    {
        return Geschlecht;
    }

    /**
     * Set-Methode für das Attribut Geschlecht
     * 
     * @param  n    (String n zum setzen des Geschlechts)
     */
    public void SetGeschlecht(String n)
    {
        Geschlecht=n;
    }
    
    /**
     * Get-Methode für das Attribut FamKrankheiten
     * 
     * @return  FamKrankheiten  (Attribut FamKrankheiten)
     */
    public ArrayList<String> GetFamKrankheiten()
    {
        return FamKrankheiten;
    }

    /**
     * Set-Methode für das Attribut FamKrankheiten
     * 
     * @param  n    (String[] n zum setzen der FamKrankheiten)
     */
    public void SetFamKrankheiten(ArrayList<String> n)
    {
        FamKrankheiten=n;
    }
    
    /**
     * Get-Methode für das Attribut Allergien
     * 
     * @return  Allergien   (Attribut Allergien)
     */
    public ArrayList<String> GetAllergien()
    {
        return Allergien;
    }

    /**
     * Set-Methode für das Attribut Allergien
     * 
     * @param  n    (String[] n zum setzen der Allergien)
     */
    public void SetAllergien(ArrayList<String> n)
    {
        Allergien=n;
    }
    
    /**
     * Get-Methode für das Attribut weitKrankheiten
     * 
     * @return  weitKrankheiten (Attribut weitKrankheiten)
     */
    public ArrayList<String> GetweitKrankheiten()
    {
        return weitKrankheiten;
    }

    /**
     * Set-Methode für das Attribut weitKrankheiten
     * 
     * @param  we    (String[] n zum setzen der weitKrankheiten)
     */
    public void SetweitKrankheiten(ArrayList<String> we)
    {
        weitKrankheiten=we;
    }
    
    
    /**
     * Get-Methode für das Attribut Angewohnheiten
     * 
     * @return  Angewohnheiten  (Attribut Angewohnheiten)
     */
    public String[] GetAngewohnheiten()
    {
        return Angewohnheiten;
    }

    /**
     * Set-Methode für das Attribut Angewohnheiten
     * 
     * @param  n    (String[] n zum setzen der Angewohnheiten)
     */
    public void SetAngewohnheiten(String[] n)
    {
        Angewohnheiten=n;
    }
    
    /**
     * Set-Methode f�r das Attribut Symptome
     * @param pSymptome
     */
    public void setSymptome(ArrayList<String> pSymptome) {
    	this.Symptome = pSymptome;
    }
    
    /**
     * Get-Methode f�r das Attribut Symptome
     * @return Liste mit Symptomen
     */
    public ArrayList<String> getSymptome() {
    	return this.Symptome;
    }
}
