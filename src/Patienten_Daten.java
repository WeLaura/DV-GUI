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
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
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
	private JTextField tfeGroeﬂe;
	private JTextField tfeGewicht;
	private JTextArea taPA;

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
		File Symptome = new File("Symptome.txt");
		Scanner sc = new Scanner(Symptome, "UTF-8");
		//Ende Datei einlesen!
		
		
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
		
		tfeGroeﬂe = new JTextField();
		tfeGroeﬂe.setColumns(10);
		tfeGroeﬂe.setBounds(402, 78, 90, 22);
		contentPane.add(tfeGroeﬂe);
		
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
		
		JTextPane tpe_Allergien = new JTextPane();
		tpe_Allergien.setBounds(641, 251, 559, 59);
		contentPane.add(tpe_Allergien);
		
		JLabel lblWeitereKrankheiten = new JLabel("weitere Krankheiten:");
		lblWeitereKrankheiten.setBounds(28, 354, 152, 16);
		contentPane.add(lblWeitereKrankheiten);
		
		JLabel label = new JLabel("wenn ja, welche:");
		label.setBounds(421, 354, 143, 16);
		contentPane.add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(641, 338, 559, 59);
		contentPane.add(textPane);
		
		JLabel lblAngewohnheiten = new JLabel("Angewohnheiten:");
		lblAngewohnheiten.setBounds(28, 420, 132, 25);
		contentPane.add(lblAngewohnheiten);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(175, 420, 1025, 184);
		contentPane.add(panel_1);
		
		JCheckBox chckbxAlkohol = new JCheckBox("Alkohol");
		chckbxAlkohol.setBounds(0, 0, 113, 25);
		panel_1.add(chckbxAlkohol);
		
		JCheckBox chckbxRauchen = new JCheckBox("Rauchen");
		chckbxRauchen.setBounds(0, 30, 113, 25);
		panel_1.add(chckbxRauchen);
		
		JCheckBox chckbxDrogen = new JCheckBox("Drogen");
		chckbxDrogen.setBounds(0, 60, 113, 25);
		panel_1.add(chckbxDrogen);
		
		JCheckBox chckbxReisen = new JCheckBox("Reisen");
		chckbxReisen.setBounds(0, 90, 113, 25);
		panel_1.add(chckbxReisen);
		
		JCheckBox chckbxRegelmBewegung = new JCheckBox("Regelm. Bewegung");
		chckbxRegelmBewegung.setBounds(0, 120, 176, 25);
		panel_1.add(chckbxRegelmBewegung);
		
		JCheckBox chckbxGesundeErnhrung = new JCheckBox("gesunde Ern‰hrung");
		chckbxGesundeErnhrung.setBounds(0, 150, 191, 25);
		panel_1.add(chckbxGesundeErnhrung);
		
		JLabel lblHufigkeit = new JLabel("H\u00E4ufigkeit:");
		lblHufigkeit.setBounds(183, 4, 95, 16);
		panel_1.add(lblHufigkeit);
		
		JLabel label_1 = new JLabel("H\u00E4ufigkeit:");
		label_1.setBounds(183, 34, 95, 16);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("H\u00E4ufigkeit:");
		label_2.setBounds(183, 64, 95, 16);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("H\u00E4ufigkeit:");
		label_3.setBounds(183, 94, 95, 16);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("H\u00E4ufigkeit:");
		label_4.setBounds(183, 124, 95, 16);
		panel_1.add(label_4);
		
		JLabel lblWas = new JLabel("Was:");
		lblWas.setBounds(625, 4, 56, 16);
		panel_1.add(lblWas);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(689, 1, 269, 24);
		panel_1.add(textArea);
		
		JLabel lblAnzahl = new JLabel("Anzahl:");
		lblAnzahl.setBounds(625, 34, 56, 16);
		panel_1.add(lblAnzahl);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(689, 31, 269, 24);
		panel_1.add(textArea_1);
		
		JLabel lblArt = new JLabel("Art:");
		lblArt.setBounds(625, 64, 56, 16);
		panel_1.add(lblArt);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(689, 61, 269, 24);
		panel_1.add(textArea_2);
		
		JCheckBox chckbxAuerhalbEuropas = new JCheckBox("Au\u00DFerhalb Europas?");
		chckbxAuerhalbEuropas.setBounds(625, 90, 176, 25);
		panel_1.add(chckbxAuerhalbEuropas);
		
		JLabel lblAnzahl_1 = new JLabel("Anzahl:");
		lblAnzahl_1.setBounds(625, 124, 56, 16);
		panel_1.add(lblAnzahl_1);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(689, 121, 122, 24);
		panel_1.add(textArea_3);
		
		JLabel lblWas_1 = new JLabel("Was:");
		lblWas_1.setBounds(839, 124, 56, 16);
		panel_1.add(lblWas_1);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(891, 121, 122, 24);
		panel_1.add(textArea_4);
		
		JLabel lblSymptome = new JLabel("Symptome:");
		lblSymptome.setBounds(23, 661, 97, 16);
		contentPane.add(lblSymptome);
		
		JRadioButton rbALLja = new JRadioButton("Ja");
		rbALLja.setBounds(175, 269, 83, 25);
		contentPane.add(rbALLja);
		
		JRadioButton rbALLnein = new JRadioButton("Nein");
		rbALLnein.setBounds(277, 269, 127, 25);
		contentPane.add(rbALLnein);
		
		JRadioButton rbWKja = new JRadioButton("Ja");
		rbWKja.setBounds(180, 354, 83, 25);
		contentPane.add(rbWKja);
		
		JRadioButton rbWKnein = new JRadioButton("Nein");
		rbWKnein.setBounds(277, 354, 127, 25);
		contentPane.add(rbWKnein);
		
		JRadioButton rbFKja = new JRadioButton("Ja");
		rbFKja.setBounds(180, 123, 83, 25);
		contentPane.add(rbFKja);
		
		JRadioButton rbFKnein = new JRadioButton("Nein");
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
		
		
		
		//Listmodel anlegen und Daten einlesen
		DefaultListModel DLM = new DefaultListModel();
		while(sc.hasNextLine())
		{
			DLM.addElement(sc.nextLine());
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
		listsymp.setModel(DLM);
		
		final JTextArea taPA = new JTextArea();
		taPA.setEditable(false);
		taPA.setBounds(627, 646, 196, 127);
		contentPane.add(taPA);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Ausgabe in der TextArea f¸r die Patientenakte
				taPA.append("Name: "+tfeName.getText()+"\n");
				taPA.append("Alter: "+tfeAlter.getText()+"\n");
				taPA.append("Grˆﬂe: "+tfeGroeﬂe.getText()+" m"+"\n");
				taPA.append("Gewicht: "+tfeGewicht.getText()+" kg"+"\n");
				//Ausgabe des Geschlecht in taPA anhand von rbgsch
				if(rbgschM.isSelected()==true)
					taPA.append("Geschlecht: "+"M‰nnlich");
				else if (rbgschW.isSelected()==true)
					taPA.append("Geschlecht: "+"Weiblich");
				else if (rbgschX.isSelected()==true)
					taPA.append("Geschlecht: "+"Divers");
				else if (rbgschM.isSelected()==false && rbgschW.isSelected()==false && rbgschX.isSelected()==false)
					JOptionPane.showMessageDialog(null,"Bitte eines der beiden Geschlechter w‰hlen!");
				
				
			}
		});
		btnSpeichern.setBounds(641, 858, 115, 29);
		contentPane.add(btnSpeichern);
		
		
	}
}
