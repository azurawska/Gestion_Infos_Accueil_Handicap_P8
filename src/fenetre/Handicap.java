package fenetre;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
		rdbtnNonRenseign.setBounds(18, 7, 95, 23);
		add(rdbtnNonRenseign);
		
		JRadioButton rdbtnHandicapTemporaire = new JRadioButton("Handicap temporaire");
		rdbtnHandicapTemporaire.setBounds(18, 33, 131, 23);
		add(rdbtnHandicapTemporaire);
		
		JLabel lblPrcisez = new JLabel("Précisez :");
		lblPrcisez.setBounds(165, 39, 57, 14);
		add(lblPrcisez);
		
		textField = new JTextField();
		textField.setBounds(220, 36, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxTroublesMoteurs = new JCheckBox("Troubles moteurs :");
		chckbxTroublesMoteurs.setBounds(18, 66, 115, 23);
		add(chckbxTroublesMoteurs);
		
		JCheckBox chckbxFauteuilManuel = new JCheckBox("Fauteuil manuel");
		chckbxFauteuilManuel.setBounds(18, 104, 101, 23);
		add(chckbxFauteuilManuel);
		
		JCheckBox chckbxFauteuillectrique = new JCheckBox("Fauteuil électrique");
		chckbxFauteuillectrique.setBounds(121, 104, 115, 23);
		add(chckbxFauteuillectrique);
		
		JCheckBox chckbxBquilles = new JCheckBox("Béquilles");
		chckbxBquilles.setBounds(238, 104, 67, 23);
		add(chckbxBquilles);
		
		JCheckBox chckbxDyspraxie = new JCheckBox("Dyspraxie");
		chckbxDyspraxie.setBounds(307, 104, 73, 23);
		add(chckbxDyspraxie);
		
		JCheckBox chckbxEpilepsie = new JCheckBox("Epilepsie");
		chckbxEpilepsie.setBounds(382, 104, 67, 23);
		add(chckbxEpilepsie);
		
		JCheckBox chckbxSep = new JCheckBox("SEP");
		chckbxSep.setBounds(451, 104, 43, 23);
		add(chckbxSep);
		
		JCheckBox chckbxAutres = new JCheckBox("Autres (préciser)");
		chckbxAutres.setBounds(496, 104, 107, 23);
		add(chckbxAutres);
		
		textField_1 = new JTextField();
		textField_1.setBounds(621, 105, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxTroublesVisuels = new JCheckBox("Troubles visuels :");
		chckbxTroublesVisuels.setBounds(18, 142, 115, 23);
		add(chckbxTroublesVisuels);
		
		JCheckBox chckbxCcit = new JCheckBox("Cécité");
		chckbxCcit.setBounds(18, 180, 57, 23);
		add(chckbxCcit);
		
		JCheckBox chckbxAutresTroublesDes = new JCheckBox("Autres troubles des fonctions visuelles :");
		chckbxAutresTroublesDes.setBounds(77, 180, 217, 23);
		add(chckbxAutresTroublesDes);
		
		textField_2 = new JTextField();
		textField_2.setBounds(314, 181, 135, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Troubles auditifs :");
		chckbxNewCheckBox.setBounds(18, 217, 115, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox chckbxSurditSvreEt = new JCheckBox("Surdité sévère et profonde");
		chckbxSurditSvreEt.setBounds(18, 243, 155, 23);
		add(chckbxSurditSvreEt);
		
		JCheckBox chckbxAutresTroublesDes_1 = new JCheckBox("Autres troubles des fonctions auditives :");
		chckbxAutresTroublesDes_1.setBounds(175, 243, 224, 23);
		add(chckbxAutresTroublesDes_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(419, 244, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JCheckBox chckbxTroublesCognitifs = new JCheckBox("Troubles cognitifs :");
		chckbxTroublesCognitifs.setBounds(18, 283, 117, 23);
		add(chckbxTroublesCognitifs);
		
		textField_4 = new JTextField();
		textField_4.setBounds(248, 284, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxTsa = new JCheckBox("TSA :");
		chckbxTsa.setBounds(18, 313, 51, 23);
		add(chckbxTsa);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Autisme profond");
		rdbtnNewRadioButton.setBounds(18, 339, 109, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAutismeDeHaut = new JRadioButton("Autisme de haut niveau");
		rdbtnAutismeDeHaut.setBounds(129, 339, 146, 23);
		add(rdbtnAutismeDeHaut);
		
		JRadioButton rdbtnSyndrmeDasperger = new JRadioButton("Syndrôme d'Asperger");
		rdbtnSyndrmeDasperger.setBounds(277, 339, 131, 23);
		add(rdbtnSyndrmeDasperger);
		
		JCheckBox chckbxTroublesPsychiques = new JCheckBox("Troubles psychiques :");
		chckbxTroublesPsychiques.setBounds(18, 375, 131, 23);
		add(chckbxTroublesPsychiques);
		
		textField_5 = new JTextField();
		textField_5.setBounds(161, 376, 86, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JCheckBox chckbxTroublesDuLangage = new JCheckBox("Troubles du langage et de la parole :");
		chckbxTroublesDuLangage.setBounds(18, 413, 201, 23);
		add(chckbxTroublesDuLangage);
		
		textField_6 = new JTextField();
		textField_6.setBounds(277, 414, 86, 20);
		add(textField_6);
		textField_6.setColumns(10);
		
		JCheckBox chckbxTroublesViscraux = new JCheckBox("Troubles viscéraux :");
		chckbxTroublesViscraux.setBounds(16, 443, 123, 23);
		add(chckbxTroublesViscraux);
		
		JCheckBox chckbxMaladieCardiaque = new JCheckBox("Maladie cardiaque");
		chckbxMaladieCardiaque.setBounds(18, 469, 115, 23);
		add(chckbxMaladieCardiaque);
		
		JCheckBox chckbxMaladiePulmonaire = new JCheckBox("Maladie pulmonaire");
		chckbxMaladiePulmonaire.setBounds(129, 469, 118, 23);
		add(chckbxMaladiePulmonaire);
		
		JCheckBox chckbxMaladieDuSystme = new JCheckBox("Maladie du systè8me digestif");
		chckbxMaladieDuSystme.setBounds(248, 469, 160, 23);
		add(chckbxMaladieDuSystme);
		
		JCheckBox chckbxPathologieCancreuse = new JCheckBox("Pathologie cancéreuse");
		chckbxPathologieCancreuse.setBounds(408, 469, 135, 23);
		add(chckbxPathologieCancreuse);
		
		JCheckBox chckbxAutrePrciser = new JCheckBox("Autre (\u00E0 préciser)");
		chckbxAutrePrciser.setBounds(545, 469, 115, 23);
		add(chckbxAutrePrciser);
		
		textField_7 = new JTextField();
		textField_7.setBounds(666, 470, 86, 20);
		add(textField_7);
		textField_7.setColumns(10);
		
		JCheckBox chckbxAutresTroublesprciser = new JCheckBox("Autre(s) trouble(s) (préciser)");
		chckbxAutresTroublesprciser.setBounds(16, 497, 165, 23);
		add(chckbxAutresTroublesprciser);
		
		textField_8 = new JTextField();
		textField_8.setBounds(258, 498, 86, 20);
		add(textField_8);
		textField_8.setColumns(10);

	}
}
