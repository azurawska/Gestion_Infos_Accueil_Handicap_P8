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
		rdbtnNonRenseign.setBounds(18, 7, 150, 23);
		add(rdbtnNonRenseign);
		
		JRadioButton rdbtnHandicapTemporaire = new JRadioButton("Handicap temporaire");
		rdbtnHandicapTemporaire.setBounds(18, 33, 175, 23);
		add(rdbtnHandicapTemporaire);
		
		JLabel lblPrcisez = new JLabel("Précisez :");
		lblPrcisez.setBounds(226, 38, 71, 14);
		add(lblPrcisez);
		
		textField = new JTextField();
		textField.setBounds(324, 35, 146, 20);
		add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxTroublesMoteurs = new JCheckBox("Troubles moteurs :");
		chckbxTroublesMoteurs.setBounds(18, 66, 204, 23);
		add(chckbxTroublesMoteurs);
		
		JCheckBox chckbxFauteuilManuel = new JCheckBox("Fauteuil manuel");
		chckbxFauteuilManuel.setBounds(94, 104, 150, 23);
		add(chckbxFauteuilManuel);
		
		JCheckBox chckbxFauteuillectrique = new JCheckBox("Fauteuil électrique");
		chckbxFauteuillectrique.setBounds(238, 104, 154, 23);
		add(chckbxFauteuillectrique);
		
		JCheckBox chckbxBquilles = new JCheckBox("Béquilles");
		chckbxBquilles.setBounds(389, 104, 96, 23);
		add(chckbxBquilles);
		
		JCheckBox chckbxDyspraxie = new JCheckBox("Dyspraxie");
		chckbxDyspraxie.setBounds(484, 104, 100, 23);
		add(chckbxDyspraxie);
		
		JCheckBox chckbxEpilepsie = new JCheckBox("Epilepsie");
		chckbxEpilepsie.setBounds(585, 104, 108, 23);
		add(chckbxEpilepsie);
		
		JCheckBox chckbxSep = new JCheckBox("SEP");
		chckbxSep.setBounds(693, 104, 57, 23);
		add(chckbxSep);
		
		JCheckBox chckbxAutres = new JCheckBox("Autres");
		chckbxAutres.setBounds(762, 104, 96, 23);
		add(chckbxAutres);
		
		textField_1 = new JTextField();
		textField_1.setBounds(870, 106, 141, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxTroublesVisuels = new JCheckBox("Troubles visuels :");
		chckbxTroublesVisuels.setBounds(18, 142, 150, 23);
		add(chckbxTroublesVisuels);
		
		JCheckBox chckbxCcit = new JCheckBox("Cécité");
		chckbxCcit.setBounds(163, 180, 73, 23);
		add(chckbxCcit);
		
		JCheckBox chckbxAutresTroublesDes = new JCheckBox("Autres troubles des fonctions visuelles :");
		chckbxAutresTroublesDes.setBounds(252, 180, 291, 23);
		add(chckbxAutresTroublesDes);
		
		textField_2 = new JTextField();
		textField_2.setBounds(597, 182, 248, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Troubles auditifs :");
		chckbxNewCheckBox.setBounds(18, 205, 150, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox chckbxSurditSvreEt = new JCheckBox("Surdité sévère et profonde");
		chckbxSurditSvreEt.setBounds(79, 240, 218, 23);
		add(chckbxSurditSvreEt);
		
		JCheckBox chckbxAutresTroublesDes_1 = new JCheckBox("Autres troubles des fonctions auditives :");
		chckbxAutresTroublesDes_1.setBounds(300, 243, 314, 23);
		add(chckbxAutresTroublesDes_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(597, 244, 261, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JCheckBox chckbxTroublesCognitifs = new JCheckBox("Troubles cognitifs :");
		chckbxTroublesCognitifs.setBounds(18, 282, 175, 23);
		add(chckbxTroublesCognitifs);
		
		textField_4 = new JTextField();
		textField_4.setBounds(248, 284, 196, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxTsa = new JCheckBox("TSA :");
		chckbxTsa.setBounds(18, 313, 71, 23);
		add(chckbxTsa);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Autisme profond");
		rdbtnNewRadioButton.setBounds(72, 339, 150, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAutismeDeHaut = new JRadioButton("Autisme de haut niveau");
		rdbtnAutismeDeHaut.setBounds(222, 339, 190, 23);
		add(rdbtnAutismeDeHaut);
		
		JRadioButton rdbtnSyndrmeDasperger = new JRadioButton("Syndrôme d'Asperger");
		rdbtnSyndrmeDasperger.setBounds(424, 339, 190, 23);
		add(rdbtnSyndrmeDasperger);
		
		JCheckBox chckbxTroublesPsychiques = new JCheckBox("Troubles psychiques :");
		chckbxTroublesPsychiques.setBounds(18, 375, 175, 23);
		add(chckbxTroublesPsychiques);
		
		textField_5 = new JTextField();
		textField_5.setBounds(220, 376, 204, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JCheckBox chckbxTroublesDuLangage = new JCheckBox("Troubles du langage et de la parole :");
		chckbxTroublesDuLangage.setBounds(18, 413, 279, 23);
		add(chckbxTroublesDuLangage);
		
		textField_6 = new JTextField();
		textField_6.setBounds(324, 414, 204, 20);
		add(textField_6);
		textField_6.setColumns(10);
		
		JCheckBox chckbxTroublesViscraux = new JCheckBox("Troubles viscéraux :");
		chckbxTroublesViscraux.setBounds(16, 443, 190, 23);
		add(chckbxTroublesViscraux);
		
		JCheckBox chckbxMaladieCardiaque = new JCheckBox("Maladie cardiaque");
		chckbxMaladieCardiaque.setBounds(86, 469, 150, 23);
		add(chckbxMaladieCardiaque);
		
		JCheckBox chckbxMaladiePulmonaire = new JCheckBox("Maladie pulmonaire");
		chckbxMaladiePulmonaire.setBounds(231, 469, 161, 23);
		add(chckbxMaladiePulmonaire);
		
		JCheckBox chckbxMaladieDuSystme = new JCheckBox("Maladie du système digestif");
		chckbxMaladieDuSystme.setBounds(389, 469, 225, 23);
		add(chckbxMaladieDuSystme);
		
		JCheckBox chckbxPathologieCancreuse = new JCheckBox("Pathologie cancéreuse");
		chckbxPathologieCancreuse.setBounds(614, 469, 175, 23);
		add(chckbxPathologieCancreuse);
		
		JCheckBox chckbxAutrePrciser = new JCheckBox("Autre");
		chckbxAutrePrciser.setBounds(791, 469, 67, 23);
		add(chckbxAutrePrciser);
		
		textField_7 = new JTextField();
		textField_7.setBounds(870, 471, 141, 20);
		add(textField_7);
		textField_7.setColumns(10);
		
		JCheckBox chckbxAutresTroublesprciser = new JCheckBox("Autre(s) trouble(s) (préciser)");
		chckbxAutresTroublesprciser.setBounds(16, 497, 220, 23);
		add(chckbxAutresTroublesprciser);
		
		textField_8 = new JTextField();
		textField_8.setBounds(360, 499, 254, 20);
		add(textField_8);
		textField_8.setColumns(10);

	}
}
