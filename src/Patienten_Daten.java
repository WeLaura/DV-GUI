import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Scrollbar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.List;
import java.awt.Choice;

import java.io.*;
import java.util.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Patienten_Daten extends JFrame {

	private JPanel contentPane;
	private JTextField tfeName;
	private JTextField tfeAlter;
	private JTextField tfeGroesse;
	private JTextField tfeGewicht;
	private JTextArea taPA; // unnötig?
	
	Patient objPatient = new Patient();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patienten_Daten frame = new Patienten_Daten();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public Patienten_Daten() throws Exception {
		setTitle("Pers\u00F6nliche Daten");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1330, 1038);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Textdatei Symptome einlesen:
		File symptome = new File("Symptome.txt");
		Scanner scSymptome = new Scanner(symptome, "UTF-8"); //UTF-8 um Umlaute einzulesen
		//Ende Datei einlesen!
		
		//Textdatei Symptome einlesen:
		File krankheiten = new File("Krankheit.txt");
		Scanner scKrankheiten = new Scanner(krankheiten, "UTF-8"); //UTF-8 um Umlaute einzulesen
		//Ende Datei einlesen!
		
		//Textdatei Symptome einlesen:
		File allergien = new File("Allergie.txt");
		Scanner scAllergien = new Scanner(allergien, "UTF-8"); //UTF-8 um Umlaute einzulesen
		//Ende Datei einlesen!
		
		//Objekt-Erzeugung
		//Verwaltungsklasse vk = new Verwaltungsklasse();
		
				
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(23, 32, 58, 33);
		contentPane.add(lblName);
		
		JLabel lblAlter = new JLabel("Alter:");
		lblAlter.setBounds(284, 40, 56, 16);
		contentPane.add(lblAlter);
		
		JLabel lblGrem = new JLabel("Gr\u00F6\u00DFe[m]:");
		lblGrem.setBounds(284, 81, 77, 16);
		contentPane.add(lblGrem);
		
		JLabel lblGewichtkg = new JLabel("Gewicht[kg]:");
		lblGewichtkg.setBounds(23, 81, 97, 16);
		contentPane.add(lblGewichtkg);
		
		JLabel lblGeschlecht = new JLabel("Geschlecht:");
		lblGeschlecht.setBounds(579, 40, 97, 16);
		contentPane.add(lblGeschlecht);
		
		JLabel lblFamilienkrankheiten = new JLabel("Familienkrankheiten:");
		lblFamilienkrankheiten.setBounds(23, 123, 157, 16);
		contentPane.add(lblFamilienkrankheiten);
		
		tfeName = new JTextField();
		tfeName.setBounds(108, 37, 116, 22);
		contentPane.add(tfeName);
		tfeName.setColumns(10);
		
		tfeAlter = new JTextField();
		tfeAlter.setColumns(10);
		tfeAlter.setBounds(402, 37, 90, 22);
		contentPane.add(tfeAlter);
		
		tfeGroesse = new JTextField();
		tfeGroesse.setColumns(10);
		tfeGroesse.setBounds(402, 78, 90, 22);
		contentPane.add(tfeGroesse);
		
		tfeGewicht = new JTextField();
		tfeGewicht.setColumns(10);
		tfeGewicht.setBounds(136, 78, 90, 22);
		contentPane.add(tfeGewicht);
		
		JLabel lblFamilienkrankWennJa = new JLabel("wenn ja, welche:");
		lblFamilienkrankWennJa.setBounds(421, 123, 143, 16);
		contentPane.add(lblFamilienkrankWennJa);
		
		JLabel lblWeitere = new JLabel("wenn ja, welche:");
		lblWeitere.setBounds(421, 273, 143, 16);
		contentPane.add(lblWeitere);
		
		JLabel lblAllergie = new JLabel("Allergien:");
		lblAllergie.setBounds(23, 270, 70, 22);
		contentPane.add(lblAllergie);
		
		JLabel lblWeitereKrankheiten = new JLabel("weitere Krankheiten:");
		lblWeitereKrankheiten.setBounds(28, 354, 152, 16);
		contentPane.add(lblWeitereKrankheiten);
		
		JLabel label = new JLabel("wenn ja, welche:");
		label.setBounds(421, 354, 143, 16);
		contentPane.add(label);
		
		JLabel lblAngewohnheiten = new JLabel("Angewohnheiten:");
		lblAngewohnheiten.setBounds(28, 420, 132, 25);
		contentPane.add(lblAngewohnheiten);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(175, 420, 1025, 198);
		contentPane.add(panel_1);
		
		
		JLabel lblHufigkeit = new JLabel("H\u00E4ufigkeit:");
		lblHufigkeit.setBounds(183, 24, 95, 16);
		panel_1.add(lblHufigkeit);
		
		JLabel label_1 = new JLabel("H\u00E4ufigkeit:");
		label_1.setBounds(183, 54, 95, 16);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("H\u00E4ufigkeit:");
		label_2.setBounds(183, 84, 95, 16);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("H\u00E4ufigkeit:");
		label_3.setBounds(183, 114, 95, 16);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("H\u00E4ufigkeit:");
		label_4.setBounds(183, 144, 95, 16);
		panel_1.add(label_4);
		
		JLabel lblAlkWas = new JLabel("Was:");
		lblAlkWas.setEnabled(false);
		lblAlkWas.setBounds(625, 19, 56, 16);
		panel_1.add(lblAlkWas);
		
		JTextArea taAlkWas = new JTextArea();
		taAlkWas.setEnabled(false);
		taAlkWas.setBounds(689, 16, 269, 24);
		panel_1.add(taAlkWas);
		
		JLabel lblRauchenAnz = new JLabel("Anzahl:");
		lblRauchenAnz.setEnabled(false);
		lblRauchenAnz.setBounds(625, 49, 56, 16);
		panel_1.add(lblRauchenAnz);
		
		JTextArea taRauchenAnz = new JTextArea();
		taRauchenAnz.setEnabled(false);
		taRauchenAnz.setBounds(689, 46, 269, 24);
		panel_1.add(taRauchenAnz);
		
		JLabel lblDrogenArt = new JLabel("Art:");
		lblDrogenArt.setEnabled(false);
		lblDrogenArt.setBounds(625, 79, 56, 16);
		panel_1.add(lblDrogenArt);
		
		JTextArea taDrogenArt = new JTextArea();
		taDrogenArt.setEnabled(false);
		taDrogenArt.setBounds(689, 76, 269, 24);
		panel_1.add(taDrogenArt);
		
		JCheckBox chckbxAuerhalbEuropas = new JCheckBox("Au\u00DFerhalb Europas?");
		chckbxAuerhalbEuropas.setBounds(625, 105, 176, 25);
		chckbxAuerhalbEuropas.setEnabled(false);
		panel_1.add(chckbxAuerhalbEuropas);
		
		JLabel lblAnzahl_1 = new JLabel("Anzahl:");
		lblAnzahl_1.setEnabled(false);
		lblAnzahl_1.setBounds(625, 139, 56, 16);
		panel_1.add(lblAnzahl_1);
		
		JTextArea taRegelBewegAnz = new JTextArea();
		taRegelBewegAnz.setEnabled(false);
		taRegelBewegAnz.setBounds(689, 136, 122, 24);
		panel_1.add(taRegelBewegAnz);
		
		JLabel lblWas_1 = new JLabel("Was:");
		lblWas_1.setEnabled(false);
		lblWas_1.setBounds(839, 144, 56, 16);
		panel_1.add(lblWas_1);
		
		JTextArea taRegelBewegWas = new JTextArea();
		taRegelBewegWas.setEnabled(false);
		taRegelBewegWas.setBounds(888, 137, 122, 24);
		panel_1.add(taRegelBewegWas);
		
		
		JComboBox combxalkh = new JComboBox();
		combxalkh.setEnabled(false);
		combxalkh.setBounds(293, 19, 176, 26);
		panel_1.add(combxalkh);
		
		JComboBox combxrauchh = new JComboBox();
		combxrauchh.setEnabled(false);
		combxrauchh.setBounds(293, 49, 176, 26);
		panel_1.add(combxrauchh);
		
		JComboBox combxdrh = new JComboBox();
		combxdrh.setEnabled(false);
		combxdrh.setBounds(293, 79, 176, 26);
		panel_1.add(combxdrh);
		
		JComboBox combxreh = new JComboBox();
		combxreh.setEnabled(false);
		combxreh.setBounds(293, 109, 176, 26);
		panel_1.add(combxreh);
		
		JComboBox combxbewh = new JComboBox();
		combxbewh.setEnabled(false);
		combxbewh.setBounds(293, 139, 176, 26);
		panel_1.add(combxbewh);
		
		JCheckBox chckbxAlkohol = new JCheckBox("Alkohol");
		chckbxAlkohol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(chckbxAlkohol.isSelected()) {
					combxalkh.setEnabled(true);
					lblAlkWas.setEnabled(true);
					taAlkWas.setEnabled(true);
				} else {
					combxalkh.setEnabled(false);
					lblAlkWas.setEnabled(false);
					taAlkWas.setEnabled(false);
				}
			}
		});
		chckbxAlkohol.setBounds(0, 20, 113, 25);
		panel_1.add(chckbxAlkohol);
		
		JCheckBox chckbxRauchen = new JCheckBox("Rauchen");
		chckbxRauchen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(chckbxRauchen.isSelected()) {
					combxrauchh.setEnabled(true);
					lblRauchenAnz.setEnabled(true);
					taRauchenAnz.setEnabled(true);
				} else {
					combxrauchh.setEnabled(false);
					lblRauchenAnz.setEnabled(false);
					taRauchenAnz.setEnabled(false);
				}
			}
		});
		chckbxRauchen.setBounds(0, 50, 113, 25);
		panel_1.add(chckbxRauchen);
		
		JCheckBox chckbxDrogen = new JCheckBox("Drogen");
		chckbxDrogen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(chckbxDrogen.isSelected()) {
					combxdrh.setEnabled(true);
					lblDrogenArt.setEnabled(true);
					taDrogenArt.setEnabled(true);
				} else {
					combxdrh.setEnabled(false);
					lblDrogenArt.setEnabled(false);
					taDrogenArt.setEnabled(false);
				}
			}
		});
		chckbxDrogen.setBounds(0, 80, 113, 25);
		panel_1.add(chckbxDrogen);
		
		JCheckBox chckbxReisen = new JCheckBox("Reisen");
		chckbxReisen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(chckbxReisen.isSelected()) {
					combxreh.setEnabled(true);
					chckbxAuerhalbEuropas.setEnabled(true);
				} else {
					combxreh.setEnabled(false);
					chckbxAuerhalbEuropas.setEnabled(false);
				}
			}
		});
		chckbxReisen.setBounds(0, 110, 113, 25);
		panel_1.add(chckbxReisen);
		
		JCheckBox chckbxRegelmBewegung = new JCheckBox("Regelm. Bewegung");
		chckbxRegelmBewegung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(chckbxRegelmBewegung.isSelected()) {
					combxbewh.setEnabled(true);
					lblAnzahl_1.setEnabled(true);
					lblWas_1.setEnabled(true);
					taRegelBewegAnz.setEnabled(true);
					taRegelBewegWas.setEnabled(true);
				} else {
					combxbewh.setEnabled(false);
					lblAnzahl_1.setEnabled(false);
					lblWas_1.setEnabled(false);
					taRegelBewegAnz.setEnabled(false);
					taRegelBewegWas.setEnabled(false);
				}
			}
		});
		chckbxRegelmBewegung.setBounds(0, 140, 176, 25);
		panel_1.add(chckbxRegelmBewegung);
		
		JCheckBox chckbxGesundeErnhrung = new JCheckBox("gesunde Ernährung");
		chckbxGesundeErnhrung.setBounds(0, 170, 191, 25);
		panel_1.add(chckbxGesundeErnhrung);
		
		
		
//////////////////////////////////////////////Listen//////////////////////////////////////
		
		// Listmodel für Krankheiten anlegen und Daten einlesen
		DefaultListModel dlmKrankheiten = new DefaultListModel();
		while(scKrankheiten.hasNextLine())
		{
			dlmKrankheiten.addElement(scKrankheiten.nextLine());
		}
		
		// Erstellen des Scrollfensters für die Krankheiten
		JScrollPane scrollPanelistKrankheiten = new JScrollPane();
		scrollPanelistKrankheiten.setSize(559, 59);
		scrollPanelistKrankheiten.setLocation(641, 121);
		contentPane.add(scrollPanelistKrankheiten);


		// Anlegen der Krankheitsliste
		JList lstFamilienKrankheiten = new JList();
		lstFamilienKrankheiten.setEnabled(false);
		lstFamilienKrankheiten.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // stellt sicher, dass eine Mehrauswahl möglich ist
		scrollPanelistKrankheiten.setViewportView(lstFamilienKrankheiten);
		lstFamilienKrankheiten.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{

			}
		});
		lstFamilienKrankheiten.setToolTipText("");
		lstFamilienKrankheiten.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstFamilienKrankheiten.setModel(dlmKrankheiten);



		//Listmodel für Krankheiten anlegen und Daten einlesen
		DefaultListModel dlmAllergien = new DefaultListModel();
		while(scAllergien.hasNextLine())
		{
			dlmAllergien.addElement(scAllergien.nextLine());
		}

		JScrollPane scrollPanelistSymp = new JScrollPane();
		scrollPanelistSymp.setBounds(175, 658, 293, 110);
		contentPane.add(scrollPanelistSymp);

		//GUI-Element JList anlegen
		JList listsymp = new JList();
		scrollPanelistSymp.setViewportView(listsymp);
		listsymp.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{

			}
		});
		listsymp.setToolTipText("");
		listsymp.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		//Listmodel anlegen und Daten einlesen
		DefaultListModel DLM = new DefaultListModel();
		while(scSymptome.hasNextLine())
		{
			DLM.addElement(scSymptome.nextLine());
		}
		//DLM.addElement(Verwaltungsklasse.SK.keySet());

		listsymp.setModel(DLM);
		scrollPanelistSymp.setBounds(250, 658, 293, 110);
		// Erstellen des Scrollfensters für die Krankheiten
		JScrollPane scrollPanelistAllergien = new JScrollPane();
		scrollPanelistAllergien.setSize(559, 59);
		scrollPanelistAllergien.setLocation(641, 332);
		scrollPanelistAllergien.setBounds(641, 260, 559, 59);
		contentPane.add(scrollPanelistAllergien);


		// Anlegen der Allergieliste
		JList lstAllergien = new JList();
		lstAllergien.setEnabled(false);
		scrollPanelistAllergien.setViewportView(lstAllergien);
		lstAllergien.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{

			}
		});
		lstAllergien.setToolTipText("");
		lstAllergien.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstAllergien.setModel(dlmAllergien);

		JTextArea taWeitereKrankheiten = new JTextArea();
		taWeitereKrankheiten.setEnabled(false);
		taWeitereKrankheiten.setBounds(641, 337, 559, 59);
		contentPane.add(taWeitereKrankheiten);
		
		
		
		
		
		JLabel lblSymptome = new JLabel("Symptome:");
		lblSymptome.setBounds(23, 661, 97, 16);
		contentPane.add(lblSymptome);
		
		JRadioButton rbALLja = new JRadioButton("Ja");
		rbALLja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				lstAllergien.setEnabled(true);
			}
		});
		rbALLja.setBounds(175, 269, 83, 25);
		contentPane.add(rbALLja);
		
		JRadioButton rbALLnein = new JRadioButton("Nein");
		rbALLnein.setSelected(true);
		rbALLnein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				lstAllergien.setEnabled(false);
			}
		});
		rbALLnein.setBounds(277, 269, 127, 25);
		contentPane.add(rbALLnein);
		
		JRadioButton rbWKja = new JRadioButton("Ja");
		rbWKja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				taWeitereKrankheiten.setEnabled(true);
			}
		});
		rbWKja.setBounds(180, 354, 83, 25);
		contentPane.add(rbWKja);
		
		JRadioButton rbWKnein = new JRadioButton("Nein");
		rbWKnein.setSelected(true);
		rbWKnein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				taWeitereKrankheiten.setEnabled(false);
			}
		});
		rbWKnein.setBounds(277, 354, 127, 25);
		contentPane.add(rbWKnein);
		
		JRadioButton rbFKja = new JRadioButton("Ja");
		rbFKja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lstFamilienKrankheiten.setEnabled(true);
			}
		});
		rbFKja.setBounds(180, 123, 83, 25);
		contentPane.add(rbFKja);
		
		JRadioButton rbFKnein = new JRadioButton("Nein");
		rbFKnein.setSelected(true);
		rbFKnein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lstFamilienKrankheiten.setEnabled(false);
			}
		});
		rbFKnein.setBounds(277, 123, 127, 25);
		contentPane.add(rbFKnein);
		
		final JRadioButton rbgschM = new JRadioButton("M\u00E4nnlich");
		rbgschM.setBounds(687, 36, 113, 25);
		contentPane.add(rbgschM);
		
		final JRadioButton rbgschW = new JRadioButton("Weiblich");
		rbgschW.setBounds(807, 36, 127, 25);
		contentPane.add(rbgschW);
		
		final JRadioButton rbgschX = new JRadioButton("Divers");
		rbgschX.setBounds(941, 36, 250, 25);
		contentPane.add(rbgschX);
		
		////////////////////////////////////////ButtonGroups/////////////////////////
		
		//ButtonGroup Geschlecht
		ButtonGroup Geschlecht = new ButtonGroup();
		Geschlecht.add(rbgschM);
		Geschlecht.add(rbgschW);
		Geschlecht.add(rbgschX);
		
		//ButtonGroup Familienkrankheiten
		ButtonGroup Familienkrankheiten = new ButtonGroup();
		Familienkrankheiten.add(rbFKja);
		Familienkrankheiten.add(rbFKnein);
		
		//ButtonGroup Allergien
		ButtonGroup Allergien = new ButtonGroup();
		Allergien.add(rbALLja);
		Allergien.add(rbALLnein);
		
		//ButtonGroup weitere Krankheiten
		ButtonGroup weitereKrankheiten = new ButtonGroup();
		weitereKrankheiten.add(rbWKja);
		weitereKrankheiten.add(rbWKnein);
		
		//Auswahlmöglichkeit für JComboBox für jeweilige Häufigkeit 
		//Alkohol-Häufigkeit
		combxalkh.addItem("täglich");
		combxalkh.addItem("wöchentlich");
		combxalkh.addItem("monatlich");
		//Rauchen-Häufigkeit
		combxrauchh.addItem("täglich");
		combxrauchh.addItem("wöchentlich");
		combxrauchh.addItem("monatlich");
		//Drogen-Häufigkeit
		combxdrh.addItem("täglich");
		combxdrh.addItem("wöchentlich");
		combxdrh.addItem("monatlich");
		//Reisen-Häufigkeit
		combxreh.addItem("täglich");
		combxreh.addItem("wöchentlich");
		combxreh.addItem("monatlich");
		//Regelmäßige-Bewegung-Häufigkeit
		combxbewh.addItem("täglich");
		combxbewh.addItem("wöchentlich");
		combxbewh.addItem("monatlich");
		
		
				
		
		
		final JTextArea taPA = new JTextArea();
		taPA.setEditable(false);
		taPA.setBounds(627, 646, 196, 127);
		contentPane.add(taPA);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Boolean datenSindOK = true;
				
				//Ausgabe in der TextArea für die Patientenakte
				taPA.setText("");
				taPA.append("Name: "+tfeName.getText()+"\n");
				taPA.append("Alter: "+tfeAlter.getText()+"\n");
				taPA.append("Größe: "+tfeGroesse.getText()+" m"+"\n");
				taPA.append("Gewicht: "+tfeGewicht.getText()+" kg"+"\n");
				
				//Ausgabe des Geschlecht in taPA anhand von rbgsch
				if(rbgschM.isSelected()==true)
					taPA.append("Geschlecht: "+"Männlich");
				else if (rbgschW.isSelected()==true)
					taPA.append("Geschlecht: "+"Weiblich");
				else if (rbgschX.isSelected()==true)
					taPA.append("Geschlecht: "+"Divers");
				else if (rbgschM.isSelected()==false && rbgschW.isSelected()==false && rbgschX.isSelected()==false)
					JOptionPane.showMessageDialog(null,"Bitte eines der beiden Geschlechter wählen!");
				
				
				
				/* Übergabe der Patientendaten an die Klasse Patient
				 * 
				 * Die Überprüfung der Daten muss erfolgen, bevor diese an die Klasse Patient übergeben werden.
				 * 
				 */
				if(datenSindOK == true) {
					objPatient.SetName(tfeName.getText());
					objPatient.SetAlter(Integer.parseInt(tfeAlter.getText()));
					objPatient.SetGroesse(Double.parseDouble(tfeGroesse.getText()));
					objPatient.SetGewicht(Double.parseDouble(tfeGewicht.getText()));
					
					if(rbgschM.isSelected()==true) {
						objPatient.SetGeschlecht("Männlich");
					} else if (rbgschW.isSelected()==true) {
						objPatient.SetGeschlecht("Weiblich");
					} else if (rbgschX.isSelected()==true) {
						objPatient.SetGeschlecht("Divers");
					}
					
					ArrayList<String> aktiveFamilienKrankheiten = new ArrayList<String>();
					// Wenn Familienkrankheiten vorliegen, werden diese übergeben, ansonsten wird die Liste leer übergeben
					if(rbFKja.isSelected()==true) {
						ListModel lm = lstFamilienKrankheiten.getModel();
						int sel[] = lstFamilienKrankheiten.getSelectedIndices();
						for(int i=0; i<sel.length; ++i) {
							aktiveFamilienKrankheiten.add((String)lm.getElementAt(sel[i]));
						}
					}
					objPatient.SetFamKrankheiten(aktiveFamilienKrankheiten);
					
					ArrayList<String> aktiveAllergien = new ArrayList<String>();
					// Wenn Allergien vorliegen, werden diese übergeben, ansonsten wird die Liste leer übergeben
					if(rbALLja.isSelected()==true) {
						ListModel lm = lstAllergien.getModel();
						int sel[] = lstAllergien.getSelectedIndices();
						for(int i=0; i<sel.length; ++i) {
							aktiveAllergien.add((String)lm.getElementAt(sel[i]));
						}
					}
					objPatient.SetAllergien(aktiveAllergien);
					
					ArrayList<String> aktiveWeitereKrankheiten = new ArrayList<String>();
					if(rbWKja.isSelected()==true && taWeitereKrankheiten.getText() != "") {
						int i = 0;
						try {
							while ( i < taWeitereKrankheiten.getLineCount() ) {
								int offset = taWeitereKrankheiten.getLineStartOffset( i );
								int len = taWeitereKrankheiten.getLineEndOffset( i ) - offset;
								aktiveWeitereKrankheiten.add( taWeitereKrankheiten.getText( offset, len ) );
								i++;
							}
						}
						catch ( Exception exc ) {
							exc.printStackTrace();
						}
					}
					objPatient.SetweitKrankheiten(aktiveWeitereKrankheiten);
					
					ArrayList<String> aktiveSymptome = new ArrayList<String>();
					// Wenn Symptome vorliegen, werden diese übergeben, ansonsten wird die Liste leer übergeben
					if(rbALLja.isSelected()==true) {
						ListModel lm = lstAllergien.getModel();
						int sel[] = lstAllergien.getSelectedIndices();
						for(int i=0; i<sel.length; ++i) {
							aktiveSymptome.add((String)lm.getElementAt(sel[i]));
						}
					}
					objPatient.setSymptome(aktiveSymptome);
				}
				//Methodenaufruf um als Datei zu speichern
				save();
			}
			//Methode um als Datei zu speichern
			protected void save() {
				// TODO Auto-generated method stub
				final JFileChooser fc = new JFileChooser();
				int returnVal = fc.showSaveDialog(getParent());

				if ( returnVal == JFileChooser.APPROVE_OPTION){
				File file = fc.getSelectedFile();
				saveText(file);
				}
				}

				private void saveText(File file){
				try{
				FileWriter writer = new FileWriter(file);
				String text = taPA.getText();
				writer.write(text);
				writer.flush();
				writer.close();
				}
				catch(IOException e) {
				e.printStackTrace();
				}

			}
		});
		btnSpeichern.setBounds(579, 858, 115, 29);
		contentPane.add(btnSpeichern);
		
		JLabel lblPatientendatenbersicht = new JLabel("Patientendaten\u00FCbersicht");
		lblPatientendatenbersicht.setBounds(630, 617, 170, 22);
		contentPane.add(lblPatientendatenbersicht);
		
		JButton btnLaden = new JButton("Laden");
		btnLaden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				load();
			}

			private void load() {
				// TODO Auto-generated method stub
				final JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(getParent());
				//JFrame durch getParent() ersetzt

				if(returnVal == JFileChooser.APPROVE_OPTION){
				File file = fc.getSelectedFile();
				showText(file);
				}}

				private void showText(File file)
				{
				StringBuffer buf = new StringBuffer();
				
				if(file.exists())
				{
				try{
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = "";
				while((line = reader.readLine())!=null)
				{
				buf.append(line+"\n");
				}
				reader.close();
				}
				catch(FileNotFoundException e){
				e.printStackTrace();
				}
				catch(IOException e){
				e.printStackTrace();
				}
				}
				taPA.setText(buf.toString());
			}
			});
		btnLaden.setBounds(740, 858, 115, 29);
		contentPane.add(btnLaden);
		
		
		//Fachklassenanbindung oder so
		//bzw. Variablenwerte
		
		
	}
}
