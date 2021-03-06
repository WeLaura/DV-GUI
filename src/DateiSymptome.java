import java.io.*;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * Erstellung einer externen Datei für die Symptome die bei den
   Krankheiten vorkommen können.
 * 
 * @author (Mihrican Demirören, Rabia Yürümez)  
 * @version (29.11.2018)
 */
  public class DateiSymptome
    {
    /**
     * Erstellung der Datei Symptome und Speicherung der Symptome
     */
    public static void main(String[]args)
    {
       
        try {
            PrintWriter ausgabe = new PrintWriter (new FileOutputStream("Symptome.txt"));
            String Symptome1= "Bewegungsverlangsamung ";
            String Symptome2= "Muskelversteifung ";
            String Symptome3= "Zittern ";
            String Symptome4= "Störung der Halte- und Stellreflexe ";
            String Symptome5= "Schwellung ";
            String Symptome6= "Rötung ";
            String Symptome7= "Überwärmung ";
            String Symptome8= "Schmerzen ";
            String Symptome9= "Spannungsgefühl ";
            String Symptome10= "Fieber ";
            String Symptome11= "Beschleunigter Puls  ";
            String Symptome12= "Rückenschmerzen ";
            String Symptome13= "Knieschmerzen  ";
            String Symptome14= "Knochenbrüche  ";
            String Symptome15= "schlechteres Sehergebnis ";
            String Symptome16= "müde Augen ";
            String Symptome17= "Kopfschmerzen ";
            String Symptome18= "Geringe Stressresistenz  ";
            String Symptome19= "Schwindel  ";
            String Symptome20= "Verschlucken ";
            String Symptome21= "Husten beim/nach dem Essen ";
            String Symptome22= "Veränderung der Stimme  ";
            String Symptome23= "Wiederhochkommen von Nahrung";
            String Symptome24= "Verschleimung  ";
            String Symptome25= "Fremdkörpergefühl im Hals";
            String Symptome26= "Gewichtsverlust  ";
            String Symptome27= "Lungenentzündungen  ";
            String Symptome28= "Verhärtungen in der Brust ";
            String Symptome29= "veränderte Größe der Brust  ";
            String Symptome30= "Einziehungen der Brusthaut/Brustwarze  ";
            String Symptome31= "Unterschied bei Bewegung der Brüste ";
            String Symptome32= "Veränderungen der Farbe der Brust  ";
            String Symptome33= "Absonderungen  aus der Brustwarze";
            String Symptome34= "vergrößerte Lymphknoten   ";
            String Symptome35= "Rötung oder Schuppung der Brusthaut   ";
            String Symptome36= "Völlegefühl ";
            String Symptome37= "Blähungen ";
            String Symptome38= "Blähbauch  ";
            String Symptome39= "Magendrücken bzw. - schmerzen   ";
            String Symptome40= "Schmerzen im Oberbauch ";
            String Symptome41= "Übelkeit  ";
            String Symptome42= "Verstopfung ";
            String Symptome43= "starker Durst  ";
            String Symptome44= "vermehrtes Wasserlassen   ";
            String Symptome45= "Müdigkeit und Leistungsabfall   ";
            String Symptome46= "Heißhunger  ";
            String Symptome47= "Neigung zu Infektionen   ";
            String Symptome48= "schlecht heilende Wunden   ";
            String Symptome49= "Wadenkrämpfe ";
            String Symptome50= "Sehstörungen ";
            String Symptome51= "Juckreiz ";
            String Symptome52= "Azetongeruch der Atemluft  ";
            String Symptome53= "Gelenkschmerzen   ";
            String Symptome54= "Entzündungen";
            String Symptome55= "Probleme beim Wasserlassen ";
            String Symptome56= "vermehrter Harndrang    ";
            String Symptome57= "Schwierigkeiten bei Darmentleerung";
            String Symptome58= "Blut im Urin/Samenflüssigkeit ";
            String Symptome59= "Schmerzen beim Samenerguss  ";
            String Symptome60= "Schmerzen in der Prostata   ";
            String Symptome61= "Erektionsstörungen ";
            String Symptome62= "attackenartige, meist einseitige Kopfschmerzen  ";
            String Symptome63= "Wahrnehmungsstörungen ";
            String Symptome64= "Lichtempfindlichkeit ";
            String Symptome65= "Geruchsempfindlichkeit    ";
            String Symptome66= "Appetitlosigkeit ";
            String Symptome67= "Leistungsminderung ";
            String Symptome68= "Angina pectoris Symptome Anfall ";
            String Symptome69= "Gedächtnisstörungen ";
            String Symptome70= "Leistungschwäche ";
            String Symptome71= "  Lärmempfindlichkeit";
            String Symptome72= "  Erbrechen ";
            
           
            
            ausgabe.println(Symptome1);
            ausgabe.println(Symptome2);
            ausgabe.println(Symptome3);
            ausgabe.println(Symptome4);
            ausgabe.println(Symptome5);
            ausgabe.println(Symptome6);
            ausgabe.println(Symptome7);
            ausgabe.println(Symptome8);
            ausgabe.println(Symptome9);
            ausgabe.println(Symptome10);
            ausgabe.println(Symptome11);
            ausgabe.println(Symptome12);
            ausgabe.println(Symptome13);
            ausgabe.println(Symptome14);
            ausgabe.println(Symptome15);
            ausgabe.println(Symptome16);
            ausgabe.println(Symptome17);
            ausgabe.println(Symptome18);
            ausgabe.println(Symptome19);
            ausgabe.println(Symptome20);
            ausgabe.println(Symptome21);
            ausgabe.println(Symptome22);
            ausgabe.println(Symptome23);
            ausgabe.println(Symptome24);
            ausgabe.println(Symptome25);
            ausgabe.println(Symptome26);
            ausgabe.println(Symptome27);
            ausgabe.println(Symptome28);
            ausgabe.println(Symptome29);
            ausgabe.println(Symptome30);
            ausgabe.println(Symptome31);
            ausgabe.println(Symptome32);
            ausgabe.println(Symptome33);
            ausgabe.println(Symptome34);
            ausgabe.println(Symptome35);
            ausgabe.println(Symptome36);
            ausgabe.println(Symptome37);
            ausgabe.println(Symptome38);
            ausgabe.println(Symptome39);
            ausgabe.println(Symptome40);
            ausgabe.println(Symptome41);
            ausgabe.println(Symptome42);
            ausgabe.println(Symptome43);
            ausgabe.println(Symptome44);
            ausgabe.println(Symptome45);
            ausgabe.println(Symptome46);
            ausgabe.println(Symptome47);
            ausgabe.println(Symptome48);
            ausgabe.println(Symptome49);
            ausgabe.println(Symptome50);
            ausgabe.println(Symptome51);
            ausgabe.println(Symptome52);
            ausgabe.println(Symptome53);
            ausgabe.println(Symptome54);
            ausgabe.println(Symptome55);
            ausgabe.println(Symptome56);
            ausgabe.println(Symptome57);
            ausgabe.println(Symptome58);
            ausgabe.println(Symptome59);
            ausgabe.println(Symptome60);
            ausgabe.println(Symptome61);
            ausgabe.println(Symptome62);
            ausgabe.println(Symptome63);
            ausgabe.println(Symptome64);
            ausgabe.println(Symptome65);
            ausgabe.println(Symptome66);
            ausgabe.println(Symptome67);
            ausgabe.println(Symptome68);
            ausgabe.println(Symptome69);
            ausgabe.println(Symptome70);
            ausgabe.println(Symptome71);
            ausgabe.println(Symptome72);
            ausgabe.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 }

