package fenetre;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class Handicap extends JPanel {
	
	private class AutresTroublesListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxAutresTroublesprciser.isSelected()) {
				textField_8.setText("");
				textField_8.setVisible(true);
			}
			else {
				textField_8.setVisible(false);
			}
		}
	}

	private class AutresTroublesViscerauxListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxAutrePrciser.isSelected()) {
				textField_7.setText("");
				textField_7.setVisible(true);
			}
			else {
				textField_7.setVisible(false);
			}
		}
	}

	private class TroublesViscerauxListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxTroublesViscraux.isSelected()) {
				chckbxMaladieCardiaque.setVisible(true);
				chckbxMaladiePulmonaire.setVisible(true);
				chckbxMaladieDuSystme.setVisible(true);
				chckbxPathologieCancreuse.setVisible(true);
				chckbxAutrePrciser.setVisible(true);
			}
			else {
				chckbxMaladieCardiaque.setVisible(false);
				if(chckbxMaladieCardiaque.isSelected()) {
					chckbxMaladieCardiaque.setSelected(false);
				}
				chckbxMaladiePulmonaire.setVisible(false);
				if(chckbxMaladiePulmonaire.isSelected()) {
					chckbxMaladiePulmonaire.setSelected(false);
				}
				chckbxMaladieDuSystme.setVisible(false);
				if(chckbxMaladieDuSystme.isSelected()) {
					chckbxMaladieDuSystme.setSelected(false);
				}
				chckbxPathologieCancreuse.setVisible(false);
				if(chckbxPathologieCancreuse.isSelected()) {
					chckbxPathologieCancreuse.setSelected(false);
				}
				chckbxAutrePrciser.setVisible(false);
				textField_7.setText("");
				textField_7.setVisible(false);
			}
		}
	}

	private class TroublesDuLangageEtDeLaParoleListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxTroublesDuLangage.isSelected()) {
				textField_6.setText("");
				textField_6.setVisible(true);
			}
			else {
				textField_6.setVisible(false);
			}
		}
	}

	private class TroublesPsychiquesListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxTroublesPsychiques.isSelected()) {
				textField_5.setText("");
				textField_5.setVisible(true);
			}
			else {
				textField_5.setVisible(false);
			}
		}
	}

	private class TsaListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxTsa.isSelected()) {
				rdbtnNewRadioButton.setVisible(true);
				rdbtnAutismeDeHaut.setVisible(true);
				rdbtnSyndrmeDasperger.setVisible(true);
			}
			else {
				rdbtnNewRadioButton.setVisible(false);
				rdbtnAutismeDeHaut.setVisible(false);
				rdbtnSyndrmeDasperger.setVisible(false);
				autisme.clearSelection();
				
			}
		}
	}

	private class TroublesCognitifsListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxTroublesCognitifs.isSelected()) {
				textField_4.setText("");
				textField_4.setVisible(true);
			}
			else {
				textField_4.setVisible(false);
			}
		}
	}

	private class AutresTroublesAuditifsListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnAutresTroublesDes_1.isSelected()) {
				textField_3.setText("");
				textField_3.setVisible(true);
			}
			else {
				textField_3.setVisible(false);
			}
		}
	}

	private class TroublesAuditifsListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxNewCheckBox.isSelected()) {
				rdbtnSurditSvreEt.setVisible(true);
				rdbtnAutresTroublesDes_1.setVisible(true);
			}
			else {
				rdbtnSurditSvreEt.setVisible(false);
				rdbtnAutresTroublesDes_1.setVisible(false);
				audition.clearSelection();
				
				textField_3.setText("");
				textField_3.setVisible(false);
			}
		}
	}

	private class AutresTroublesvisuelsListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnAutresTroublesDes.isSelected()) {
				textField_2.setText("");
				textField_2.setVisible(true);
			}
			else {
				textField_2.setVisible(false);
			}
		}
	}

	private class TroublesVisuelsListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxTroublesVisuels.isSelected()) {
				rdbtnCcit.setVisible(true);
				rdbtnAutresTroublesDes.setVisible(true);
			}
			else {
				rdbtnCcit.setVisible(false);
				rdbtnAutresTroublesDes.setVisible(false);
				vision.clearSelection();
				
				textField_2.setText("");
				textField_2.setVisible(false);
			}
		}
	}

	private class AutreHandicapMoteurListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxAutres.isSelected()) {
				textField_1.setText("");
				textField_1.setVisible(true);
			}
			else {
				textField_1.setVisible(false);
			}
		}
	}

	private class HandicapDefinitifListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnHandicapDfinitif.isSelected()) {
				lblPrcisez.setVisible(false);
				textField.setVisible(false);
				textField.setText("");
			}
		}

	}

	private class TroublesMoteursListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxTroublesMoteurs.isSelected()) {
				chckbxFauteuilManuel.setVisible(true);
				chckbxFauteuillectrique.setVisible(true);
				chckbxBquilles.setVisible(true);
				chckbxDyspraxie.setVisible(true);
				chckbxEpilepsie.setVisible(true);
				chckbxSep.setVisible(true);
				chckbxAutres.setVisible(true);
			}
			else {
				chckbxFauteuilManuel.setVisible(false);
				if(chckbxFauteuilManuel.isSelected()) {
					chckbxFauteuilManuel.setSelected(false);
				}
				chckbxFauteuillectrique.setVisible(false);
				if(chckbxFauteuillectrique.isSelected()) {
					chckbxFauteuillectrique.setSelected(false);
				}
				chckbxBquilles.setVisible(false);
				if(chckbxBquilles.isSelected()) {
					chckbxBquilles.setSelected(false);
				}
				chckbxDyspraxie.setVisible(false);
				if(chckbxDyspraxie.isSelected()) {
					chckbxDyspraxie.setSelected(false);
				}
				chckbxEpilepsie.setVisible(false);
				if(chckbxEpilepsie.isSelected()) {
					chckbxEpilepsie.setSelected(false);
				}
				chckbxSep.setVisible(false);
				if(chckbxSep.isSelected()) {
					chckbxSep.setSelected(false);
				}
				chckbxAutres.setVisible(false);
				if(chckbxAutres.isSelected()) {
					chckbxAutres.setSelected(false);
				}
				textField_1.setText("");
				textField_1.setVisible(false);
			}
		}

	}

	private class HandicapTemporaireListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnHandicapTemporaire.isSelected()) {
				lblPrcisez.setVisible(true);
				textField.setVisible(true);
			}
			else {
				lblPrcisez.setVisible(false);
				textField.setVisible(false);
				textField.setText("");
			}
		}
	}

	private class NonRenseigneListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnNonRenseign.isSelected()) {
				lblPrcisez.setVisible(false);
				chckbxTroublesMoteurs.setVisible(false);
				chckbxTroublesVisuels.setVisible(false);
				chckbxNewCheckBox.setVisible(false);
				chckbxTroublesPsychiques.setVisible(false);
				chckbxTsa.setVisible(false);
				chckbxTroublesCognitifs.setVisible(false);
				chckbxTroublesDuLangage.setVisible(false);
				chckbxTroublesViscraux.setVisible(false);
				chckbxAutresTroublesprciser.setVisible(false);
			}
			else {
				chckbxTroublesMoteurs.setVisible(true);
				chckbxTroublesVisuels.setVisible(true);
				chckbxNewCheckBox.setVisible(true);
				chckbxTroublesPsychiques.setVisible(true);
				chckbxTsa.setVisible(true);
				chckbxTroublesCognitifs.setVisible(true);
				chckbxTroublesDuLangage.setVisible(true);
				chckbxTroublesViscraux.setVisible(true);
				chckbxAutresTroublesprciser.setVisible(true);
			}
		}
	}

	private JLabel lblPrcisez;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	
	private JRadioButton rdbtnNonRenseign;
	private JRadioButton rdbtnHandicapTemporaire;
	private JRadioButton rdbtnHandicapDfinitif;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnAutismeDeHaut;
	private JRadioButton rdbtnSyndrmeDasperger;
	private JRadioButton rdbtnCcit;
	private JRadioButton rdbtnSurditSvreEt;
	private JRadioButton rdbtnAutresTroublesDes;
	private JRadioButton rdbtnAutresTroublesDes_1;
	
	private JCheckBox chckbxTroublesMoteurs;
	private JCheckBox chckbxTroublesVisuels;
	private JCheckBox chckbxFauteuilManuel;
	private JCheckBox chckbxFauteuillectrique;
	private JCheckBox chckbxBquilles;
	private JCheckBox chckbxSep;
	private JCheckBox chckbxDyspraxie;
	private JCheckBox chckbxEpilepsie;
	private JCheckBox chckbxAutres;
	private JCheckBox chckbxTroublesPsychiques;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxTroublesCognitifs;
	private JCheckBox chckbxTsa;
	private JCheckBox chckbxTroublesDuLangage;
	private JCheckBox chckbxTroublesViscraux;
	private JCheckBox chckbxMaladieCardiaque;
	private JCheckBox chckbxMaladiePulmonaire;
	private JCheckBox chckbxMaladieDuSystme;
	private JCheckBox chckbxPathologieCancreuse;
	private JCheckBox chckbxAutrePrciser;
	private JCheckBox chckbxAutresTroublesprciser;
	
	private ButtonGroup handiParticulier;
	private ButtonGroup autisme;
	private ButtonGroup vision;
	private ButtonGroup audition;

	/**
	 * Create the panel.
	 */
	public Handicap() {
		setLayout(null);
		
		rdbtnNonRenseign = new JRadioButton("Non renseigné");
		rdbtnNonRenseign.setBounds(18, 7, 150, 23);
		add(rdbtnNonRenseign);
		rdbtnNonRenseign.addChangeListener(new NonRenseigneListener());
		
		rdbtnHandicapTemporaire = new JRadioButton("Handicap temporaire");
		rdbtnHandicapTemporaire.setBounds(18, 33, 175, 23);
		add(rdbtnHandicapTemporaire);
		rdbtnHandicapTemporaire.addChangeListener(new HandicapTemporaireListener());
		
		rdbtnHandicapDfinitif = new JRadioButton("Handicap définitif");
		rdbtnHandicapDfinitif.setBounds(151, 7, 161, 23);
		add(rdbtnHandicapDfinitif);
		rdbtnHandicapDfinitif.addChangeListener(new HandicapDefinitifListener());
		
		handiParticulier = new ButtonGroup();
		handiParticulier.add(rdbtnNonRenseign);
		handiParticulier.add(rdbtnHandicapTemporaire);
		handiParticulier.add(rdbtnHandicapDfinitif);
		
		lblPrcisez = new JLabel("Précisez :");
		lblPrcisez.setBounds(226, 38, 71, 14);
		add(lblPrcisez);
		lblPrcisez.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(324, 35, 146, 20);
		add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		chckbxTroublesMoteurs = new JCheckBox("Troubles moteurs :");
		chckbxTroublesMoteurs.setBounds(18, 66, 204, 23);
		add(chckbxTroublesMoteurs);
		chckbxTroublesMoteurs.addChangeListener(new TroublesMoteursListener());
		
		chckbxFauteuilManuel = new JCheckBox("Fauteuil manuel");
		chckbxFauteuilManuel.setBounds(94, 104, 150, 23);
		add(chckbxFauteuilManuel);
		chckbxFauteuilManuel.setVisible(false);
		
		chckbxFauteuillectrique = new JCheckBox("Fauteuil électrique");
		chckbxFauteuillectrique.setBounds(238, 104, 154, 23);
		add(chckbxFauteuillectrique);
		chckbxFauteuillectrique.setVisible(false);
		
		chckbxBquilles = new JCheckBox("Béquilles");
		chckbxBquilles.setBounds(389, 104, 96, 23);
		add(chckbxBquilles);
		chckbxBquilles.setVisible(false);
		
		chckbxDyspraxie = new JCheckBox("Dyspraxie");
		chckbxDyspraxie.setBounds(484, 104, 100, 23);
		add(chckbxDyspraxie);
		chckbxDyspraxie.setVisible(false);
		
		chckbxEpilepsie = new JCheckBox("Epilepsie");
		chckbxEpilepsie.setBounds(585, 104, 108, 23);
		add(chckbxEpilepsie);
		chckbxEpilepsie.setVisible(false);
		
		chckbxSep = new JCheckBox("SEP");
		chckbxSep.setBounds(693, 104, 57, 23);
		add(chckbxSep);
		chckbxSep.setVisible(false);
		
		chckbxAutres = new JCheckBox("Autres");
		chckbxAutres.setBounds(762, 104, 96, 23);
		add(chckbxAutres);
		chckbxAutres.setVisible(false);
		chckbxAutres.addChangeListener(new AutreHandicapMoteurListener());
		
		textField_1 = new JTextField();
		textField_1.setBounds(870, 106, 141, 20);
		add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		chckbxTroublesVisuels = new JCheckBox("Troubles visuels :");
		chckbxTroublesVisuels.setBounds(18, 142, 150, 23);
		add(chckbxTroublesVisuels);
		chckbxTroublesVisuels.addChangeListener(new TroublesVisuelsListener());
		
		textField_2 = new JTextField();
		textField_2.setBounds(597, 182, 248, 20);
		add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);
		
		chckbxNewCheckBox = new JCheckBox("Troubles auditifs :");
		chckbxNewCheckBox.setBounds(18, 205, 150, 23);
		add(chckbxNewCheckBox);
		chckbxNewCheckBox.addChangeListener(new TroublesAuditifsListener());
		
		textField_3 = new JTextField();
		textField_3.setBounds(648, 244, 261, 20);
		add(textField_3);
		textField_3.setColumns(10);
		textField_3.setVisible(false);
		
		chckbxTroublesCognitifs = new JCheckBox("Troubles cognitifs :");
		chckbxTroublesCognitifs.setBounds(18, 282, 175, 23);
		add(chckbxTroublesCognitifs);
		chckbxTroublesCognitifs.addChangeListener(new TroublesCognitifsListener());
		
		textField_4 = new JTextField();
		textField_4.setBounds(248, 284, 196, 20);
		add(textField_4);
		textField_4.setColumns(10);
		textField_4.setVisible(false);
		
		chckbxTsa = new JCheckBox("TSA :");
		chckbxTsa.setBounds(18, 313, 71, 23);
		add(chckbxTsa);
		chckbxTsa.addChangeListener(new TsaListener());
		
		rdbtnNewRadioButton = new JRadioButton("Autisme profond");
		rdbtnNewRadioButton.setBounds(72, 339, 150, 23);
		add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setVisible(false);
		
		rdbtnAutismeDeHaut = new JRadioButton("Autisme de haut niveau");
		rdbtnAutismeDeHaut.setBounds(222, 339, 190, 23);
		add(rdbtnAutismeDeHaut);
		rdbtnAutismeDeHaut.setVisible(false);
		
		rdbtnSyndrmeDasperger = new JRadioButton("Syndrôme d'Asperger");
		rdbtnSyndrmeDasperger.setBounds(424, 339, 190, 23);
		add(rdbtnSyndrmeDasperger);
		rdbtnSyndrmeDasperger.setVisible(false);
		
		autisme = new ButtonGroup();
		autisme.add(rdbtnNewRadioButton);
		autisme.add(rdbtnAutismeDeHaut);
		autisme.add(rdbtnSyndrmeDasperger);
		
		chckbxTroublesPsychiques = new JCheckBox("Troubles psychiques :");
		chckbxTroublesPsychiques.setBounds(18, 375, 175, 23);
		add(chckbxTroublesPsychiques);
		chckbxTroublesPsychiques.addChangeListener(new TroublesPsychiquesListener());
		
		textField_5 = new JTextField();
		textField_5.setBounds(220, 376, 204, 20);
		add(textField_5);
		textField_5.setColumns(10);
		textField_5.setVisible(false);
		
		chckbxTroublesDuLangage = new JCheckBox("Troubles du langage et de la parole :");
		chckbxTroublesDuLangage.setBounds(18, 413, 279, 23);
		add(chckbxTroublesDuLangage);
		chckbxTroublesDuLangage.addChangeListener(new TroublesDuLangageEtDeLaParoleListener());
		
		textField_6 = new JTextField();
		textField_6.setBounds(324, 414, 204, 20);
		add(textField_6);
		textField_6.setColumns(10);
		textField_6.setVisible(false);
		
		chckbxTroublesViscraux = new JCheckBox("Troubles viscéraux :");
		chckbxTroublesViscraux.setBounds(16, 443, 190, 23);
		add(chckbxTroublesViscraux);
		chckbxTroublesViscraux.addChangeListener(new TroublesViscerauxListener());
		
		chckbxMaladieCardiaque = new JCheckBox("Maladie cardiaque");
		chckbxMaladieCardiaque.setBounds(86, 469, 150, 23);
		add(chckbxMaladieCardiaque);
		chckbxMaladieCardiaque.setVisible(false);
		
		chckbxMaladiePulmonaire = new JCheckBox("Maladie pulmonaire");
		chckbxMaladiePulmonaire.setBounds(231, 469, 161, 23);
		add(chckbxMaladiePulmonaire);
		chckbxMaladiePulmonaire.setVisible(false);
		
		chckbxMaladieDuSystme = new JCheckBox("Maladie du système digestif");
		chckbxMaladieDuSystme.setBounds(389, 469, 225, 23);
		add(chckbxMaladieDuSystme);
		chckbxMaladieDuSystme.setVisible(false);
		
		chckbxPathologieCancreuse = new JCheckBox("Pathologie cancéreuse");
		chckbxPathologieCancreuse.setBounds(614, 469, 175, 23);
		add(chckbxPathologieCancreuse);
		chckbxPathologieCancreuse.setVisible(false);
		
		chckbxAutrePrciser = new JCheckBox("Autre");
		chckbxAutrePrciser.setBounds(791, 469, 67, 23);
		add(chckbxAutrePrciser);
		chckbxAutrePrciser.setVisible(false);
		chckbxAutrePrciser.addChangeListener(new AutresTroublesViscerauxListener());
		
		textField_7 = new JTextField();
		textField_7.setBounds(870, 471, 141, 20);
		add(textField_7);
		textField_7.setColumns(10);
		textField_7.setVisible(false);
		
		chckbxAutresTroublesprciser = new JCheckBox("Autre(s) trouble(s) (préciser)");
		chckbxAutresTroublesprciser.setBounds(16, 497, 220, 23);
		add(chckbxAutresTroublesprciser);
		chckbxAutresTroublesprciser.addChangeListener(new AutresTroublesListener());
		
		textField_8 = new JTextField();
		textField_8.setBounds(360, 499, 254, 20);
		add(textField_8);
		textField_8.setColumns(10);
		textField_8.setVisible(false);
		
		rdbtnCcit = new JRadioButton("Cécité");
		rdbtnCcit.setBounds(115, 177, 78, 23);
		add(rdbtnCcit);
		rdbtnCcit.setVisible(false);
		
		rdbtnAutresTroublesDes = new JRadioButton("Autres troubles des fonctions visuelles");
		rdbtnAutresTroublesDes.setBounds(224, 177, 293, 23);
		add(rdbtnAutresTroublesDes);
		rdbtnAutresTroublesDes.setVisible(false);
		rdbtnAutresTroublesDes.addChangeListener(new AutresTroublesvisuelsListener());
		
		vision = new ButtonGroup();
		vision.add(rdbtnCcit);
		vision.add(rdbtnAutresTroublesDes);
		
		rdbtnSurditSvreEt = new JRadioButton("Surdité sévère et profonde");
		rdbtnSurditSvreEt.setBounds(103, 242, 209, 23);
		add(rdbtnSurditSvreEt);
		rdbtnSurditSvreEt.setVisible(false);
		
		rdbtnAutresTroublesDes_1 = new JRadioButton("Autres troubles des fonctions auditives");
		rdbtnAutresTroublesDes_1.setBounds(309, 242, 293, 23);
		add(rdbtnAutresTroublesDes_1);
		rdbtnAutresTroublesDes_1.setVisible(false);
		rdbtnAutresTroublesDes_1.addChangeListener(new AutresTroublesAuditifsListener());
		
		audition = new ButtonGroup();
		audition.add(rdbtnSurditSvreEt);
		audition.add(rdbtnAutresTroublesDes_1);
	}

	public Handicap(String numEtudiant) {
		// TODO Auto-generated constructor stub
	}
}