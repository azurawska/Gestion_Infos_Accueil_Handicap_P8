package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import fenetre.composants.Audition;
import fenetre.composants.Autisme;
import fenetre.composants.DureeHandicap;
import fenetre.composants.FamilleHandicapNonDefinie;
import fenetre.composants.HandicapParticulier;
import fenetre.composants.HandicapTemporaire;
import fenetre.composants.HandicapAPreciser;
import fenetre.composants.RegroupementTypeHandicap;
import fenetre.composants.StatutHandicap;
import fenetre.composants.TypeHandicapSensoriel;
import fenetre.composants.Vision;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class Handicap extends AbstractJPanel {
	
	private class AutresTroublesListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxAutresTroublesprciser.isSelected()) {
				textField_8.setText("");
				textField_8.setVisible(true);
				troublesCoches.add(chckbxAutresTroublesprciser);
				plusieursTroublesCoches(troublesCoches);
			}
			else {
				textField_8.setVisible(false);
				troublesCoches.remove(chckbxAutresTroublesprciser);
				plusieursTroublesCoches(troublesCoches);
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
				troublesCoches.add(chckbxTroublesViscraux);
				plusieursTroublesCoches(troublesCoches);
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
				troublesCoches.remove(chckbxAutrePrciser);
				plusieursTroublesCoches(troublesCoches);
			}
		}
	}

	private class TroublesDuLangageEtDeLaParoleListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxTroublesDuLangage.isSelected()) {
				textField_6.setText("");
				textField_6.setVisible(true);
				troublesCoches.add(chckbxTroublesDuLangage);
				plusieursTroublesCoches(troublesCoches);
			}
			else {
				textField_6.setVisible(false);
				troublesCoches.remove(chckbxTroublesDuLangage);
				plusieursTroublesCoches(troublesCoches);
			}
		}
	}

	private class TroublesPsychiquesListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxTroublesPsychiques.isSelected()) {
				textField_5.setText("");
				textField_5.setVisible(true);
				troublesCoches.add(chckbxTroublesPsychiques);
				plusieursTroublesCoches(troublesCoches);
			}
			else {
				textField_5.setVisible(false);
				troublesCoches.remove(chckbxTroublesPsychiques);
				plusieursTroublesCoches(troublesCoches);
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
				troublesCoches.add(chckbxTsa);
				plusieursTroublesCoches(troublesCoches);
			}
			else {
				rdbtnNewRadioButton.setVisible(false);
				rdbtnAutismeDeHaut.setVisible(false);
				rdbtnSyndrmeDasperger.setVisible(false);
				autisme.clearSelection();
				troublesCoches.remove(chckbxTsa);
				plusieursTroublesCoches(troublesCoches);
			}
		}
	}

	private class TroublesCognitifsListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxTroublesCognitifs.isSelected()) {
				textField_4.setText("");
				textField_4.setVisible(true);
				troublesCoches.add(chckbxTroublesCognitifs);
				plusieursTroublesCoches(troublesCoches);
			}
			else {
				textField_4.setVisible(false);
				troublesCoches.remove(chckbxTroublesCognitifs);
				plusieursTroublesCoches(troublesCoches);
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
				troublesCoches.add(chckbxNewCheckBox);
				plusieursTroublesCoches(troublesCoches);
			}
			else {
				rdbtnSurditSvreEt.setVisible(false);
				rdbtnAutresTroublesDes_1.setVisible(false);
				audition.clearSelection();
				
				textField_3.setText("");
				textField_3.setVisible(false);
				troublesCoches.remove(chckbxNewCheckBox);
				plusieursTroublesCoches(troublesCoches);
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
				troublesCoches.add(chckbxTroublesVisuels);
				plusieursTroublesCoches(troublesCoches);
			}
			else {
				rdbtnCcit.setVisible(false);
				rdbtnAutresTroublesDes.setVisible(false);
				vision.clearSelection();
				
				textField_2.setText("");
				textField_2.setVisible(false);
				troublesCoches.remove(chckbxTroublesVisuels);
				plusieursTroublesCoches(troublesCoches);
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
				troublesCoches.add(chckbxTroublesMoteurs);
				plusieursTroublesCoches(troublesCoches);
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
				troublesCoches.remove(chckbxTroublesMoteurs);
				plusieursTroublesCoches(troublesCoches);
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
				chckbxTroublesMoteurs.setSelected(false);
				chckbxTroublesVisuels.setVisible(false);
				chckbxTroublesVisuels.setSelected(false);
				chckbxNewCheckBox.setVisible(false);
				chckbxNewCheckBox.setSelected(false);
				chckbxTroublesPsychiques.setVisible(false);
				chckbxTroublesPsychiques.setSelected(false);
				chckbxTsa.setVisible(false);
				chckbxTsa.setSelected(false);
				chckbxTroublesCognitifs.setVisible(false);
				chckbxTroublesCognitifs.setSelected(false);
				chckbxTroublesDuLangage.setVisible(false);
				chckbxTroublesDuLangage.setSelected(false);
				chckbxTroublesViscraux.setVisible(false);
				chckbxTroublesViscraux.setSelected(false);
				chckbxAutresTroublesprciser.setVisible(false);
				chckbxAutresTroublesprciser.setSelected(false);
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

	private boolean nouveau;
	
	private String numEtudiant;
	
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
	
	private DureeHandicap rdbtnNonRenseign;
	private HandicapTemporaire rdbtnHandicapTemporaire;
	private DureeHandicap rdbtnHandicapDfinitif;
	
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnAutismeDeHaut;
	private JRadioButton rdbtnSyndrmeDasperger;
	private JRadioButton rdbtnCcit;
	private JRadioButton rdbtnSurditSvreEt;
	
	private TypeHandicapSensoriel rdbtnAutresTroublesDes;
	private TypeHandicapSensoriel rdbtnAutresTroublesDes_1;
	
	private RegroupementTypeHandicap chckbxTroublesMoteurs;
	private RegroupementTypeHandicap chckbxTroublesVisuels;
	private HandicapParticulier chckbxFauteuilManuel;
	private HandicapParticulier chckbxFauteuillectrique;
	private HandicapParticulier chckbxBquilles;
	private HandicapParticulier chckbxSep;
	private HandicapParticulier chckbxDyspraxie;
	private HandicapParticulier chckbxEpilepsie;
	private HandicapAPreciser chckbxAutres;
	private FamilleHandicapNonDefinie chckbxTroublesPsychiques;
	private RegroupementTypeHandicap chckbxNewCheckBox;
	private FamilleHandicapNonDefinie chckbxTroublesCognitifs;
	private RegroupementTypeHandicap chckbxTsa;
	private FamilleHandicapNonDefinie chckbxTroublesDuLangage;
	private RegroupementTypeHandicap chckbxTroublesViscraux;
	private HandicapParticulier chckbxMaladieCardiaque;
	private HandicapParticulier chckbxMaladiePulmonaire;
	private HandicapParticulier chckbxMaladieDuSystme;
	private HandicapParticulier chckbxPathologieCancreuse;
	private HandicapAPreciser chckbxAutrePrciser;
	private FamilleHandicapNonDefinie chckbxAutresTroublesprciser;
	private JCheckBox chckbxPlusieursTroublesAssocis;
	
	private StatutHandicap handiParticulier;
	private Autisme autisme;
	private Vision vision;
	private Audition audition;
	
	private ArrayList<RegroupementTypeHandicap> troublesCoches;

	/**
	 * Create the panel.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public Handicap() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		this.troublesCoches=new ArrayList<RegroupementTypeHandicap>();
		
		setLayout(null);
		
		rdbtnNonRenseign = new DureeHandicap("Non renseigné");
		
		gestionChampsEtExceptions(rdbtnNonRenseign, 18, 7, 150, 23, null, true, true, null, false, null, null, new NonRenseigneListener(), "", null);
		
		rdbtnHandicapTemporaire = new HandicapTemporaire("Handicap temporaire");
		
		gestionChampsEtExceptions(rdbtnHandicapTemporaire, 18, 33, 175, 23, null, true, true, null, false, null, null, new HandicapTemporaireListener(), "", textField);
		
		rdbtnHandicapDfinitif = new DureeHandicap("Handicap définitif");
		
		gestionChampsEtExceptions(rdbtnHandicapDfinitif, 151, 7, 161, 23, null, true, true, null, false, null, null, new HandicapDefinitifListener(), "", null);
		
		handiParticulier = new StatutHandicap();
		regrouperBoutons(handiParticulier);
		
		lblPrcisez = new JLabel("Précisez :");
		
		gestionChampsEtExceptions(lblPrcisez, 226, 38, 71, 14, null, false, true, null, null, null, null, null, null, null);
		
		textField = new JTextField();
		
		gestionChampsEtExceptions(textField, 324, 35, 146, 20, Color.WHITE, false, true, true, null, null, null, null, "", null);
		
		chckbxTroublesMoteurs = new RegroupementTypeHandicap("Troubles moteurs :");
		
		gestionChampsEtExceptions(chckbxTroublesMoteurs, 18, 66, 204, 23, null, true, true, null, false, null, null, new TroublesMoteursListener(), "", null);
		
		chckbxFauteuilManuel = new HandicapParticulier("Fauteuil manuel");
		
		gestionChampsEtExceptions(chckbxFauteuilManuel, 94, 104, 150, 23, null, false, true, null, false, null, null, null, "", null);
		
		chckbxFauteuillectrique = new HandicapParticulier("Fauteuil électrique");
		
		gestionChampsEtExceptions(chckbxFauteuillectrique, 238, 104, 154, 23, null, false, true, null, false, null, null, null, "", null);
		
		chckbxBquilles = new HandicapParticulier("Béquilles");
		
		gestionChampsEtExceptions(chckbxBquilles, 389, 104, 96, 23, null, false, true, null, false, null, null, null, "", null);
		
		chckbxDyspraxie = new HandicapParticulier("Dyspraxie");
		
		gestionChampsEtExceptions(chckbxDyspraxie, 484, 104, 100, 23, null, false, true, null, false, null, null, null, "", null);
		
		chckbxEpilepsie = new HandicapParticulier("Epilepsie");
		
		gestionChampsEtExceptions(chckbxEpilepsie, 585, 104, 108, 23, null, false, true, null, false, null, null, null, "", null);
		
		chckbxSep = new HandicapParticulier("SEP");
		
		gestionChampsEtExceptions(chckbxSep, 693, 104, 57, 23, null, false, true, null, false, null, null, null, "", null);
		
		chckbxAutres = new HandicapAPreciser("Autres");
		
		textField_1 = new JTextField();
		
		gestionChampsEtExceptions(chckbxAutres, 762, 104, 96, 23, null, false, true, null, false, null, null, new AutreHandicapMoteurListener(), "", textField_1);
		
		gestionChampsEtExceptions(textField_1, 870, 106, 141, 20, Color.WHITE, false, true, true, null, null, null, null, "", null);
		
		chckbxTroublesVisuels = new RegroupementTypeHandicap("Troubles visuels :");
		
		gestionChampsEtExceptions(chckbxTroublesVisuels, 18, 142, 150, 23, null, true, true, null, false, null, null, new TroublesVisuelsListener(), "", null);
		
		textField_2 = new JTextField();
		
		gestionChampsEtExceptions(textField_2, 597, 182, 248, 20, Color.WHITE, false, true, true, null, null, null, null, "", null);
		
		chckbxNewCheckBox = new RegroupementTypeHandicap("Troubles auditifs :");
		
		gestionChampsEtExceptions(chckbxNewCheckBox, 18, 205, 150, 23, null, true, true, null, false, null, null, new TroublesAuditifsListener(), "", null);
		
		textField_3 = new JTextField();
		
		gestionChampsEtExceptions(textField_3, 648, 244, 261, 20, Color.WHITE, false, true, true, null, null, null, null, "", null);
		
		chckbxTroublesCognitifs = new FamilleHandicapNonDefinie("Troubles cognitifs :");
		
		gestionChampsEtExceptions(chckbxTroublesCognitifs, 18, 282, 175, 23, null, true, true, null, false, null, null, new TroublesCognitifsListener(), "", textField_4);
		
		textField_4 = new JTextField();
		
		gestionChampsEtExceptions(textField_4, 248, 284, 196, 20, Color.WHITE, false, true, true, null, null, null, null, "", null);
		
		chckbxTsa = new RegroupementTypeHandicap("TSA :");
		
		gestionChampsEtExceptions(chckbxTsa, 18, 313, 71, 23, null, true, true, null, false, null, null, new TsaListener(), "", null);
		
		rdbtnNewRadioButton = new JRadioButton("Autisme profond");
		
		gestionChampsEtExceptions(rdbtnNewRadioButton, 72, 339, 150, 23, null, false, true, null, false, null, null, null, "", null);
		
		rdbtnAutismeDeHaut = new JRadioButton("Autisme de haut niveau");
		
		gestionChampsEtExceptions(rdbtnAutismeDeHaut, 222, 339, 190, 23, null, false, true, null, false, null, null, null, "", null);
		
		rdbtnSyndrmeDasperger = new JRadioButton("Syndrôme d'Asperger");
		
		gestionChampsEtExceptions(rdbtnSyndrmeDasperger, 424, 339, 190, 23, null, false, true, null, false, null, null, null, "", null);
		
		autisme = new Autisme();
		regrouperBoutons(autisme);
		
		chckbxTroublesPsychiques = new FamilleHandicapNonDefinie("Troubles psychiques :");
		
		gestionChampsEtExceptions(chckbxTroublesPsychiques, 18, 375, 175, 23, null, true, true, null, false, null, null, new TroublesPsychiquesListener(), "", textField_5);
		
		textField_5 = new JTextField();
		
		gestionChampsEtExceptions(textField_5, 220, 376, 204, 20, Color.WHITE, false, true, true, null, null, null, null, "", null);
		
		chckbxTroublesDuLangage = new FamilleHandicapNonDefinie("Troubles du langage et de la parole :");
		
		textField_6 = new JTextField();
		
		gestionChampsEtExceptions(chckbxTroublesDuLangage, 18, 413, 279, 23, null, true, true, null, false, null, null, new TroublesDuLangageEtDeLaParoleListener(), "", textField_6);
		
		gestionChampsEtExceptions(textField_6, 324, 414, 204, 20, Color.WHITE, false, true, true, null, null, null, null, "", null);
		
		chckbxTroublesViscraux = new RegroupementTypeHandicap("Troubles viscéraux :");
		
		gestionChampsEtExceptions(chckbxTroublesViscraux, 16, 443, 190, 23, null, true, true, null, false, null, null, new TroublesViscerauxListener(), "", null);
		
		chckbxMaladieCardiaque = new HandicapParticulier("Maladie cardiaque");
		
		gestionChampsEtExceptions(chckbxMaladieCardiaque, 86, 469, 150, 23, null, false, true, null, false, null, null, null, "", null);
		
		chckbxMaladiePulmonaire = new HandicapParticulier("Maladie pulmonaire");
		
		gestionChampsEtExceptions(chckbxMaladiePulmonaire, 231, 469, 161, 23, null, false, true, null, false, null, null, null, "", null);
		
		chckbxMaladieDuSystme = new HandicapParticulier("Maladie du système digestif");
		
		gestionChampsEtExceptions(chckbxMaladieDuSystme, 389, 469, 225, 23, null, false, true, null, false, null, null, null, "", null);
		
		chckbxPathologieCancreuse = new HandicapParticulier("Pathologie cancéreuse");
		
		gestionChampsEtExceptions(chckbxPathologieCancreuse, 614, 469, 175, 23, null, false, true, null, false, null, null, null, "", null);
		
		chckbxAutrePrciser = new HandicapAPreciser("Autre");
		
		textField_7 = new JTextField();
		
		gestionChampsEtExceptions(chckbxAutrePrciser, 791, 469, 67, 23, null, false, true, null, false, null, null, new AutresTroublesViscerauxListener(), "", textField_7);
		
		gestionChampsEtExceptions(textField_7, 870, 471, 141, 20, Color.WHITE, false, true, true, null, null, null, null, "", null);
		
		chckbxAutresTroublesprciser = new FamilleHandicapNonDefinie("Autre(s) trouble(s) (préciser)");
		
		textField_8 = new JTextField();
		
		gestionChampsEtExceptions(chckbxAutresTroublesprciser, 16, 497, 220, 23, null, true, true, null, false, null, null, new AutresTroublesListener(), "", textField_8);
		
		gestionChampsEtExceptions(textField_8, 360, 499, 254, 20, Color.WHITE, false, true, true, null, null, null, null, "", null);
		
		rdbtnCcit = new JRadioButton("Cécité");
		
		gestionChampsEtExceptions(rdbtnCcit, 115, 177, 78, 23, null, false, true, null, false, null, null, null, "", null);
		
		rdbtnAutresTroublesDes = new TypeHandicapSensoriel("Autres troubles des fonctions visuelles");
		
		gestionChampsEtExceptions(rdbtnAutresTroublesDes, 224, 177, 293, 23, null, false, true, null, false, null, null, new AutresTroublesvisuelsListener(), "", textField_2);
		
		vision = new Vision();
		regrouperBoutons(vision);
		
		rdbtnSurditSvreEt = new JRadioButton("Surdité sévère et profonde");
		
		gestionChampsEtExceptions(rdbtnSurditSvreEt, 103, 242, 209, 23, null, false, true, null, false, null, null, null, "", null);
		
		rdbtnAutresTroublesDes_1 = new TypeHandicapSensoriel("Autres troubles des fonctions auditives");
		
		gestionChampsEtExceptions(rdbtnAutresTroublesDes_1, 309, 242, 293, 23, null, false, true, null, false, null, null, new AutresTroublesAuditifsListener(), "", textField_3);
		
		audition = new Audition();
		regrouperBoutons(audition);
		
		chckbxPlusieursTroublesAssocis = new JCheckBox("Plusieurs troubles associés");
		
		gestionChampsEtExceptions(chckbxPlusieursTroublesAssocis, 622, 497, 204, 23, null, true, false, null, false, null, null, null, "", null);
		
	}

	public Handicap(String numEtudiant) throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		this.troublesCoches=new ArrayList<RegroupementTypeHandicap>();
		
		LectureFichierCSV fichierHandicap = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/handicap.csv");
		
		ArrayList<String[]> etudiants = fichierHandicap.chargerFichier();
		
		String[] etudiant = fichierHandicap.retournerInfosEtudiant(etudiants, this.numEtudiant);
		
		setLayout(null);
		
		rdbtnNonRenseign = new DureeHandicap("Non renseigné");
		
		rdbtnHandicapTemporaire = new HandicapTemporaire("Handicap temporaire");
		
		rdbtnHandicapDfinitif = new DureeHandicap("Handicap définitif");
		
		handiParticulier = new StatutHandicap();
		regrouperBoutons(handiParticulier);
		
		lblPrcisez = new JLabel("Précisez :");
		
		textField = new JTextField();
		
		chckbxTroublesMoteurs = new RegroupementTypeHandicap("Troubles moteurs :");
		
		chckbxFauteuilManuel = new HandicapParticulier("Fauteuil manuel");
		
		chckbxFauteuillectrique = new HandicapParticulier("Fauteuil électrique");
		
		chckbxBquilles = new HandicapParticulier("Béquilles");
		
		chckbxDyspraxie = new HandicapParticulier("Dyspraxie");
		
		chckbxEpilepsie = new HandicapParticulier("Epilepsie");
		
		chckbxSep = new HandicapParticulier("SEP");
		
		chckbxAutres = new HandicapAPreciser("Autres");
		
		textField_1 = new JTextField();
		
		chckbxTroublesVisuels = new RegroupementTypeHandicap("Troubles visuels :");
		
		textField_2 = new JTextField();
		
		chckbxNewCheckBox = new RegroupementTypeHandicap("Troubles auditifs :");
		
		textField_3 = new JTextField();
		
		chckbxTroublesCognitifs = new FamilleHandicapNonDefinie("Troubles cognitifs :");
		
		textField_4 = new JTextField();
		
		chckbxTsa = new RegroupementTypeHandicap("TSA :");
		
		rdbtnNewRadioButton = new JRadioButton("Autisme profond");
		
		rdbtnAutismeDeHaut = new JRadioButton("Autisme de haut niveau");
		
		rdbtnSyndrmeDasperger = new JRadioButton("Syndrôme d'Asperger");
		
		autisme = new Autisme();
		regrouperBoutons(autisme);
		
		chckbxTroublesPsychiques = new FamilleHandicapNonDefinie("Troubles psychiques :");
		
		textField_5 = new JTextField();
		
		chckbxTroublesDuLangage = new FamilleHandicapNonDefinie("Troubles du langage et de la parole :");
		
		textField_6 = new JTextField();
		
		chckbxTroublesViscraux = new RegroupementTypeHandicap("Troubles viscéraux :");
		
		chckbxMaladieCardiaque = new HandicapParticulier("Maladie cardiaque");
		
		chckbxMaladiePulmonaire = new HandicapParticulier("Maladie pulmonaire");
		
		chckbxMaladieDuSystme = new HandicapParticulier("Maladie du système digestif");
		
		chckbxPathologieCancreuse = new HandicapParticulier("Pathologie cancéreuse");
		
		chckbxAutrePrciser = new HandicapAPreciser("Autre");
		
		textField_7 = new JTextField();
		
		chckbxAutresTroublesprciser = new FamilleHandicapNonDefinie("Autre(s) trouble(s) (préciser)");
		
		textField_8 = new JTextField();
		
		rdbtnCcit = new JRadioButton("Cécité");
		
		rdbtnAutresTroublesDes = new TypeHandicapSensoriel("Autres troubles des fonctions visuelles");
		
		vision = new Vision();
		regrouperBoutons(vision);
		
		rdbtnSurditSvreEt = new JRadioButton("Surdité sévère et profonde");
		
		rdbtnAutresTroublesDes_1 = new TypeHandicapSensoriel("Autres troubles des fonctions auditives");
		
		audition = new Audition();
		regrouperBoutons(audition);
		
		chckbxPlusieursTroublesAssocis = new JCheckBox("Plusieurs troubles associés");
		
		gestionChampsEtExceptions(lblPrcisez, 226, 38, 71, 14, null, false, true, null, null, null, null, null, null, null);
		
		gestionChampsEtExceptions(textField, 324, 35, 146, 20, Color.WHITE, false, true, true, null, null, null, null, "", null);
		
		gestionChampsEtExceptions(rdbtnNonRenseign, 18, 7, 150, 23, null, true, true, null, false, null, null, new NonRenseigneListener(), etudiant[3], null);
		
		gestionChampsEtExceptions(rdbtnHandicapTemporaire, 18, 33, 175, 23, null, true, true, null, false, null, null, new HandicapTemporaireListener(), etudiant[1], textField);
		
		gestionChampsEtExceptions(rdbtnHandicapDfinitif, 151, 7, 161, 23, null, true, true, null, false, null, null, new HandicapDefinitifListener(), etudiant[2], null);
		
		gestionChampsEtExceptions(chckbxFauteuilManuel, 94, 104, 150, 23, null, false, true, null, false, null, null, null, etudiant[5], null);
		
		gestionChampsEtExceptions(chckbxFauteuillectrique, 238, 104, 154, 23, null, false, true, null, false, null, null, null, etudiant[6], null);
		
		gestionChampsEtExceptions(chckbxBquilles, 389, 104, 96, 23, null, false, true, null, false, null, null, null, etudiant[7], null);
		
		gestionChampsEtExceptions(chckbxDyspraxie, 484, 104, 100, 23, null, false, true, null, false, null, null, null, etudiant[8], null);
		
		gestionChampsEtExceptions(chckbxEpilepsie, 585, 104, 108, 23, null, false, true, null, false, null, null, null, etudiant[9], null);
		
		gestionChampsEtExceptions(chckbxSep, 693, 104, 57, 23, null, false, true, null, false, null, null, null, etudiant[10], null);
		
		gestionChampsEtExceptions(chckbxAutres, 762, 104, 96, 23, null, false, true, null, false, null, null, new AutreHandicapMoteurListener(), etudiant[11], textField_1);
		
		gestionChampsEtExceptions(textField_1, 870, 106, 141, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[11], null);
		
		gestionChampsEtExceptions(chckbxTroublesMoteurs, 18, 66, 204, 23, null, true, true, null, false, null, null, new TroublesMoteursListener(), etudiant[4], null);
		
		gestionChampsEtExceptions(textField_2, 597, 182, 248, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[14], null);
		
		gestionChampsEtExceptions(rdbtnCcit, 115, 177, 78, 23, null, false, true, null, false, null, null, null, etudiant[13], null);
		
		gestionChampsEtExceptions(rdbtnAutresTroublesDes, 224, 177, 293, 23, null, false, true, null, false, null, null, new AutresTroublesvisuelsListener(), etudiant[14], textField_2);
		
		gestionChampsEtExceptions(chckbxTroublesVisuels, 18, 142, 150, 23, null, true, true, null, false, null, null, new TroublesVisuelsListener(), etudiant[12], null);

		gestionChampsEtExceptions(textField_3, 648, 244, 261, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[17], null);
		
		gestionChampsEtExceptions(rdbtnSurditSvreEt, 103, 242, 209, 23, null, false, true, null, false, null, null, null, etudiant[16], null);
		
		gestionChampsEtExceptions(rdbtnAutresTroublesDes_1, 309, 242, 293, 23, null, false, true, null, false, null, null, new AutresTroublesAuditifsListener(), etudiant[17], textField_3);
		
		gestionChampsEtExceptions(chckbxNewCheckBox, 18, 205, 150, 23, null, true, true, null, false, null, null, new TroublesAuditifsListener(), etudiant[15], null);
		
		gestionChampsEtExceptions(textField_4, 248, 284, 196, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[18], null);
		
		gestionChampsEtExceptions(chckbxTroublesCognitifs, 18, 282, 175, 23, null, true, true, null, false, null, null, new TroublesCognitifsListener(), etudiant[18], textField_4);
		
		gestionChampsEtExceptions(rdbtnNewRadioButton, 72, 339, 150, 23, null, false, true, null, false, null, null, null, etudiant[20], null);
		
		gestionChampsEtExceptions(rdbtnAutismeDeHaut, 222, 339, 190, 23, null, false, true, null, false, null, null, null, etudiant[21], null);
		
		gestionChampsEtExceptions(rdbtnSyndrmeDasperger, 424, 339, 190, 23, null, false, true, null, false, null, null, null, etudiant[22], null);
		
		gestionChampsEtExceptions(chckbxTsa, 18, 313, 71, 23, null, true, true, null, false, null, null, new TsaListener(), etudiant[19], null);
		
		gestionChampsEtExceptions(textField_5, 220, 376, 204, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[23], null);
		
		gestionChampsEtExceptions(chckbxTroublesPsychiques, 18, 375, 175, 23, null, true, true, null, false, null, null, new TroublesPsychiquesListener(), etudiant[23], textField_5);
				
		gestionChampsEtExceptions(textField_6, 324, 414, 204, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[24], null);
		
		gestionChampsEtExceptions(chckbxTroublesDuLangage, 18, 413, 279, 23, null, true, true, null, false, null, null, new TroublesDuLangageEtDeLaParoleListener(), etudiant[24], textField_6);
		
		gestionChampsEtExceptions(chckbxMaladieCardiaque, 86, 469, 150, 23, null, false, true, null, false, null, null, null, etudiant[26], null);
		
		gestionChampsEtExceptions(chckbxMaladiePulmonaire, 231, 469, 161, 23, null, false, true, null, false, null, null, null, etudiant[27], null);
		
		gestionChampsEtExceptions(chckbxMaladieDuSystme, 389, 469, 225, 23, null, false, true, null, false, null, null, null, etudiant[28], null);
		
		gestionChampsEtExceptions(chckbxPathologieCancreuse, 614, 469, 175, 23, null, false, true, null, false, null, null, null, etudiant[29], null);
		
		gestionChampsEtExceptions(textField_7, 870, 471, 141, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[30], null);
		
		gestionChampsEtExceptions(chckbxAutrePrciser, 791, 469, 67, 23, null, false, true, null, false, null, null, new AutresTroublesViscerauxListener(), etudiant[30], textField_7);
			
		gestionChampsEtExceptions(chckbxTroublesViscraux, 16, 443, 190, 23, null, true, true, null, false, null, null, new TroublesViscerauxListener(), etudiant[25], null);
		
		gestionChampsEtExceptions(textField_8, 360, 499, 254, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[31], null);
		
		gestionChampsEtExceptions(chckbxAutresTroublesprciser, 16, 497, 220, 23, null, true, true, null, false, null, null, new AutresTroublesListener(), etudiant[31], textField_8);
	}
	
	private void plusieursTroublesCoches(ArrayList<RegroupementTypeHandicap> troublesCoches) {
		if(troublesCoches.size()>1) {
			chckbxPlusieursTroublesAssocis.setSelected(true);
		}
		else {
			chckbxPlusieursTroublesAssocis.setSelected(false);
		}
	}
	
	private void regrouperBoutons(ButtonGroup buttons) {
		if(buttons instanceof StatutHandicap) {
			buttons.add(rdbtnNonRenseign);
			buttons.add(rdbtnHandicapTemporaire);
			buttons.add(rdbtnHandicapDfinitif);
		}
		else if(buttons instanceof Vision) {
			buttons.add(rdbtnCcit);
			buttons.add(rdbtnAutresTroublesDes);
		}
		else if(buttons instanceof Audition) {
			buttons.add(rdbtnSurditSvreEt);
			buttons.add(rdbtnAutresTroublesDes_1);
		}
		else if(buttons instanceof Autisme) {
			buttons.add(rdbtnNewRadioButton);
			buttons.add(rdbtnAutismeDeHaut);
			buttons.add(rdbtnSyndrmeDasperger);
		}
	}
}