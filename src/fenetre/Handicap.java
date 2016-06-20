package fenetre;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Handicap extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public Handicap() {
		setLayout(null);
		
		JRadioButton rdbtnNonRenseign = new JRadioButton("Non renseigné");
		rdbtnNonRenseign.setBounds(18, 7, 110, 23);
		add(rdbtnNonRenseign);
		
		JRadioButton rdbtnHandicapTemporaire = new JRadioButton("Handicap temporaire");
		rdbtnHandicapTemporaire.setBounds(18, 33, 130, 23);
		add(rdbtnHandicapTemporaire);
		
		JLabel lblPrcisez = new JLabel("Précisez :");
		lblPrcisez.setBounds(165, 39, 57, 14);
		add(lblPrcisez);
		
		textField = new JTextField();
		textField.setBounds(275, 34, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxTroublesMoteurs = new JCheckBox("Troubles moteurs :");
		chckbxTroublesMoteurs.setBounds(18, 66, 150, 23);
		add(chckbxTroublesMoteurs);
		
		JCheckBox chckbxFauteuilManuel = new JCheckBox("Fauteuil manuel");
		chckbxFauteuilManuel.setBounds(18, 104, 100, 23);
		add(chckbxFauteuilManuel);
		
		JCheckBox chckbxFauteuillectrique = new JCheckBox("Fauteuil électrique");
		chckbxFauteuillectrique.setBounds(121, 104, 115, 23);
		add(chckbxFauteuillectrique);
		
		JCheckBox chckbxBquilles = new JCheckBox("Béquilles");
		chckbxBquilles.setBounds(238, 104, 84, 23);
		add(chckbxBquilles);
		
		JCheckBox chckbxDyspraxie = new JCheckBox("Dyspraxie");
		chckbxDyspraxie.setBounds(324, 104, 100, 23);
		add(chckbxDyspraxie);
		
		JCheckBox chckbxEpilepsie = new JCheckBox("Epilepsie");
		chckbxEpilepsie.setBounds(445, 104, 87, 23);
		add(chckbxEpilepsie);
		
		JCheckBox chckbxSep = new JCheckBox("SEP");
		chckbxSep.setBounds(534, 104, 57, 23);
		add(chckbxSep);
		
		JCheckBox chckbxAutres = new JCheckBox("Autres");
		chckbxAutres.setBounds(607, 104, 67, 23);
		add(chckbxAutres);
		
		textField_1 = new JTextField();
		textField_1.setBounds(689, 105, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxTroublesVisuels = new JCheckBox("Troubles visuels :");
		chckbxTroublesVisuels.setBounds(18, 142, 130, 23);
		add(chckbxTroublesVisuels);
		
		JCheckBox chckbxCcit = new JCheckBox("Cécité");
		chckbxCcit.setBounds(18, 180, 73, 23);
		add(chckbxCcit);
		
		JCheckBox chckbxAutresTroublesDes = new JCheckBox("Autres troubles des fonctions visuelles :");
		chckbxAutresTroublesDes.setBounds(199, 180, 260, 23);
		add(chckbxAutresTroublesDes);
		
		textField_2 = new JTextField();
		textField_2.setBounds(666, 192, 135, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Troubles auditifs :");
		chckbxNewCheckBox.setBounds(18, 217, 130, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox chckbxSurditSvreEt = new JCheckBox("Surdité sévère et profonde");
		chckbxSurditSvreEt.setBounds(18, 243, 180, 23);
		add(chckbxSurditSvreEt);
		
		JCheckBox chckbxAutresTroublesDes_1 = new JCheckBox("Autres troubles des fonctions auditives :");
		chckbxAutresTroublesDes_1.setBounds(199, 243, 260, 23);
		add(chckbxAutresTroublesDes_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(676, 244, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JCheckBox chckbxTroublesCognitifs = new JCheckBox("Troubles cognitifs :");
		chckbxTroublesCognitifs.setBounds(18, 283, 150, 23);
		add(chckbxTroublesCognitifs);
		
		textField_4 = new JTextField();
		textField_4.setBounds(248, 284, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxTsa = new JCheckBox("TSA :");
		chckbxTsa.setBounds(18, 313, 60, 23);
		add(chckbxTsa);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Autisme profond");
		rdbtnNewRadioButton.setBounds(18, 339, 130, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAutismeDeHaut = new JRadioButton("Autisme de haut niveau");
		rdbtnAutismeDeHaut.setBounds(167, 339, 162, 23);
		add(rdbtnAutismeDeHaut);
		
		JRadioButton rdbtnSyndrmeDasperger = new JRadioButton("Syndrôme d'Asperger");
		rdbtnSyndrmeDasperger.setBounds(382, 339, 161, 23);
		add(rdbtnSyndrmeDasperger);
		
		JCheckBox chckbxTroublesPsychiques = new JCheckBox("Troubles psychiques :");
		chckbxTroublesPsychiques.setBounds(18, 375, 150, 23);
		add(chckbxTroublesPsychiques);
		
		textField_5 = new JTextField();
		textField_5.setBounds(220, 376, 86, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JCheckBox chckbxTroublesDuLangage = new JCheckBox("Troubles du langage et de la parole :");
		chckbxTroublesDuLangage.setBounds(18, 413, 260, 23);
		add(chckbxTroublesDuLangage);
		
		textField_6 = new JTextField();
		textField_6.setBounds(324, 414, 86, 20);
		add(textField_6);
		textField_6.setColumns(10);
		
		JCheckBox chckbxTroublesViscraux = new JCheckBox("Troubles viscéraux :");
		chckbxTroublesViscraux.setBounds(16, 443, 150, 23);
		add(chckbxTroublesViscraux);
		
		JCheckBox chckbxMaladieCardiaque = new JCheckBox("Maladie cardiaque");
		chckbxMaladieCardiaque.setBounds(18, 469, 130, 23);
		add(chckbxMaladieCardiaque);
		
		JCheckBox chckbxMaladiePulmonaire = new JCheckBox("Maladie pulmonaire");
		chckbxMaladiePulmonaire.setBounds(145, 469, 143, 23);
		add(chckbxMaladiePulmonaire);
		
		JCheckBox chckbxMaladieDuSystme = new JCheckBox("Maladie du système digestif");
		chckbxMaladieDuSystme.setBounds(280, 469, 190, 23);
		add(chckbxMaladieDuSystme);
		
		JCheckBox chckbxPathologieCancreuse = new JCheckBox("Pathologie cancéreuse");
		chckbxPathologieCancreuse.setBounds(475, 469, 161, 23);
		add(chckbxPathologieCancreuse);
		
		JCheckBox chckbxAutrePrciser = new JCheckBox("Autre");
		chckbxAutrePrciser.setBounds(654, 469, 67, 23);
		add(chckbxAutrePrciser);
		
		textField_7 = new JTextField();
		textField_7.setBounds(747, 470, 86, 20);
		add(textField_7);
		textField_7.setColumns(10);
		
		JCheckBox chckbxAutresTroublesprciser = new JCheckBox("Autre(s) trouble(s) (pr\u00E9ciser)");
		chckbxAutresTroublesprciser.setBounds(16, 497, 220, 23);
		add(chckbxAutresTroublesprciser);
		
		textField_8 = new JTextField();
		textField_8.setBounds(360, 499, 86, 20);
		add(textField_8);
		textField_8.setColumns(10);

	}
}
