package fenetre.ecrans;

import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import data.LectureFichierCSV;
import data.LectureFichierTXT;
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
import interfaces.GestionFichierCSV;
import interfaces.GestionFichierTXT;
import interfaces.GroupementBoutons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

/**
 * Ecran répertoriant les différents types de handicap que peut avoir un étudiant.
 * @author alexis
 *
 */

public class Handicap extends AbstractJPanel implements GestionFichierCSV, GestionFichierTXT, GroupementBoutons {
	
	/**
	 * Classe utilisée lorsque la cases "Autres troubles" est cochée si le handicap n'est pas déjà répertorié.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant de préciser le trouble viscéraux s'il n'est pas répertorié.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant de faire apparaître tous les types de troubles viscéraux possibles afin de pouvoir les cocher.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant de préciser le type de trouble du langage et/ou de la parole.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant de préciser le type de handicap psychique.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant de faire apparaître les troubles autistiques afin de choisir duquel est atteint l'étudiant s'il en a un.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant de préciser le type de trouble cognitif.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant de préciser le handicap auditif s'il ne s'agit pas d'une surdité totale.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant d'afficher les troubles auditifs afin d'en sélectionner un.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant de préciser le handicap visuel s'il ne s'agit pas d'une cécité totale.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant d'afficher les troubles visuels afin d'en sélectionner un.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Permet de préciser la nature du handicap moteur si celui-ci n'est pas déjà répertorié.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant d'enlever la possibilité d'écrire un handicap temporaire dans un champ spécifique.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant d'afficher tous les troubles moteurs répertoriés pour en sélectionner un ou plusieurs.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant d'afficher un champ de saisie supplémentaire afin de préciser la nature du handicap.
	 * @author alexis
	 *
	 */
	
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

	/**
	 * Classe permettant d'empêcher la sélection de tout handicap si ce bouton est coché.
	 * @author alexis
	 *
	 */
	
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
	
	/**
	 * Indique si l'étudiant est nouveau ou pas
	 */

	private boolean nouveau;
	
	/**
	 * Le numéro d'étudiant
	 */
	
	private String numEtudiant;
	
	/**
	 *	Indique qu'il faut préciser le handicap si celui-ci est temporaire
	 */
	
	private JLabel lblPrcisez;
	
	/**
	 * Champ de saisie où renseigner le handicap s'il est temporaire
	 */
	
	private JTextField textField;
	
	/**
	 * Champ de saisie où indiquer le type de handicap moteur si celui-ci n'est pas répertorié
	 */
	
	private JTextField textField_1;
	
	/**
	 * Champ de saisie où indiquer le type de handicap visuel si celui-ci n'est pas répertorié
	 */
	
	private JTextField textField_2;
	
	/**
	 * Champ de saisie où indiquer le type de handicap auditif si celui-ci n'est pas répertorié
	 */
	
	private JTextField textField_3;
	
	/**
	 * Champ de saisie où indiquer le type de handicap cognitif
	 */
	
	private JTextField textField_4;
	
	/**
	 * Champ de saisie où indiquer le type de handicap psychique
	 */
	
	private JTextField textField_5;
	
	/**
	 * Champ de saisie où indiquer le type de trouble du langage et/ou de la parole
	 */
	
	private JTextField textField_6;
	
	/**
	 * Champ de saisie où indiquer le type de trouble viscéraul si celui-ci n'est pas répertorié
	 */
	
	private JTextField textField_7;
	
	/**
	 * Champ de saisie où indiquer le type de trouble si celui-ci n'est répertorié nulle part
	 */
	
	private JTextField textField_8;
	
	/**
	 * Bouton handicap non renseigné qui fait tout disparaître de l'écran sauf les trois boutons de la durée du handicap s'il est coché
	 */
	
	private DureeHandicap rdbtnNonRenseign;
	
	/**
	 * Bouton handicap temporaire qui fait apparaître textField s'il est coché
	 */
	
	private HandicapTemporaire rdbtnHandicapTemporaire;
	
	/**
	 * Bouton handicap définitif
	 */
	
	private DureeHandicap rdbtnHandicapDfinitif;
	
	/**
	 * Bouton autisme profond
	 */
	
	private JRadioButton rdbtnNewRadioButton;
	
	/**
	 * Bouton autisme de haut niveau
	 */
	
	private JRadioButton rdbtnAutismeDeHaut;
	
	/**
	 * Bouton syndrome d'Asperger
	 */
	
	private JRadioButton rdbtnSyndrmeDasperger;
	
	/**
	 * Bouton cécité
	 */
	
	private JRadioButton rdbtnCcit;
	
	/**
	 * Bouton surdité sévère et profonde
	 */
	
	private JRadioButton rdbtnSurditSvreEt;
	
	/**
	 * Bouton autres troubles des fonctions visuelles
	 */
	
	private TypeHandicapSensoriel rdbtnAutresTroublesDes;
	
	/**
	 * Buton autres troubles des fonctions auditives
	 */
	
	private TypeHandicapSensoriel rdbtnAutresTroublesDes_1;
	
	/**
	 * Troubles moteurs
	 */
	
	private RegroupementTypeHandicap chckbxTroublesMoteurs;
	
	/**
	 * Troubles visuels
	 */
	
	private RegroupementTypeHandicap chckbxTroublesVisuels;
	
	/**
	 * Fauteuil manuel
	 */
	
	private HandicapParticulier chckbxFauteuilManuel;
	
	/**
	 * Fauteuil électrique
	 */
	
	private HandicapParticulier chckbxFauteuillectrique;
	
	/**
	 * Béquilles
	 */
	
	private HandicapParticulier chckbxBquilles;
	
	/**
	 * SEP
	 */
	
	private HandicapParticulier chckbxSep;
	
	/**
	 * Dyspraxie
	 */
	
	private HandicapParticulier chckbxDyspraxie;
	
	/**
	 * Epilepsie
	 */
	
	private HandicapParticulier chckbxEpilepsie;
	
	/**
	 * Autres
	 */
	
	private HandicapAPreciser chckbxAutres;
	
	/**
	 * Troubles psychiques
	 */
	
	private FamilleHandicapNonDefinie chckbxTroublesPsychiques;
	
	/**
	 * Troubles du langage et de la parole
	 */
	
	private RegroupementTypeHandicap chckbxNewCheckBox;
	
	/**
	 * Troubles auditifs
	 */
	
	private FamilleHandicapNonDefinie chckbxTroublesCognitifs;
	
	/**
	 * TSA
	 */
	
	private RegroupementTypeHandicap chckbxTsa;
	
	/**
	 * Troubles du langage et de la parole
	 */
	
	private FamilleHandicapNonDefinie chckbxTroublesDuLangage;
	
	/**
	 * Troubles viscéraux
	 */
	
	private RegroupementTypeHandicap chckbxTroublesViscraux;
	
	/**
	 *	Maladie cardiaque
	 */
	
	private HandicapParticulier chckbxMaladieCardiaque;
	
	/**
	 * Maladie pulmonaire
	 */
	
	private HandicapParticulier chckbxMaladiePulmonaire;
	
	/**
	 * Maladie du système digestif
	 */
	
	private HandicapParticulier chckbxMaladieDuSystme;
	
	/**
	 * Pathologie cancéreuse
	 */
	
	private HandicapParticulier chckbxPathologieCancreuse;
	
	/**
	 * Autre trouble viscéral
	 */
	
	private HandicapAPreciser chckbxAutrePrciser;
	
	/**
	 * Autre trouble
	 */
	
	private FamilleHandicapNonDefinie chckbxAutresTroublesprciser;
	
	/**
	 * Case qui se coche par programmation en fonction du nombre de types de troubles cochés
	 */
	
	private JCheckBox chckbxPlusieursTroublesAssocis;
	
	/**
	 * Permet de regrouper les boutons relatifs à la durée du handicap.
	 */
	
	private StatutHandicap handiParticulier;
	
	/**
	 * Groupe de boutons concernant les troubles autistiques (TSA)
	 */
	
	private Autisme autisme;
	
	/**
	 * Groupe de boutons concernant les pathologies visuelles
	 */
	
	private Vision vision;
	
	/**
	 * Groupe de boutons concernant les pathologies auditives
	 */
	
	private Audition audition;
	
	/**
	 * Liste des types de handicap cochés pour savoir si l'étudiant a plusieurs troubles au pas
	 */
	
	private ArrayList<RegroupementTypeHandicap> troublesCoches;
	
	/**
	 * Variable permettant de travailler avec le fichier contenant toutes les informations relatives au handicap de chacun des étudiants
	 */
	
	private final LectureFichierCSV fichierHandicap = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/handicap.csv");

	/**
	 * Create the panel for a new student.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public Handicap() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		this.troublesCoches=new ArrayList<RegroupementTypeHandicap>();
		
		setLayout(null);
		
		//Tentatives non fructueuses pour mettre les bares de défilement dans un JPanel :
		
		//JScrollPane scrollPane = new JScrollPane(this, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//scrollPane.setBounds(this.getBounds());
		//scrollPane.setPreferredSize(new Dimension(150, 250));
		
		//setLayout(new BorderLayout());
		//add(new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), BorderLayout.CENTER);
		
		rdbtnNonRenseign = new DureeHandicap("Non renseigné");
		
		gestionChampsEtExceptions(rdbtnNonRenseign, 18, 7, 150, 23, null, true, true, null, false, null, null, new NonRenseigneListener(), "", null, null, null);
		
		rdbtnHandicapTemporaire = new HandicapTemporaire("Handicap temporaire");
		
		gestionChampsEtExceptions(rdbtnHandicapTemporaire, 18, 33, 175, 23, null, true, true, null, false, null, null, new HandicapTemporaireListener(), "", textField, null, null);
		
		rdbtnHandicapDfinitif = new DureeHandicap("Handicap définitif");
		
		gestionChampsEtExceptions(rdbtnHandicapDfinitif, 151, 7, 161, 23, null, true, true, null, false, null, null, new HandicapDefinitifListener(), "", null, null, null);
		
		handiParticulier = new StatutHandicap();
		regrouperBoutons(handiParticulier);
		
		lblPrcisez = new JLabel("Précisez :");
		
		gestionChampsEtExceptions(lblPrcisez, 226, 38, 71, 14, null, false, true, null, null, null, null, null, null, null, null, null);
		
		textField = new JTextField();
		
		gestionChampsEtExceptions(textField, 324, 35, 146, 20, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		chckbxTroublesMoteurs = new RegroupementTypeHandicap("Troubles moteurs :");
		
		gestionChampsEtExceptions(chckbxTroublesMoteurs, 18, 66, 204, 23, null, true, true, null, false, null, null, new TroublesMoteursListener(), "", null, null, null);
		
		chckbxFauteuilManuel = new HandicapParticulier("Fauteuil manuel");
		
		gestionChampsEtExceptions(chckbxFauteuilManuel, 94, 104, 150, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		chckbxFauteuillectrique = new HandicapParticulier("Fauteuil électrique");
		
		gestionChampsEtExceptions(chckbxFauteuillectrique, 238, 104, 154, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		chckbxBquilles = new HandicapParticulier("Béquilles");
		
		gestionChampsEtExceptions(chckbxBquilles, 389, 104, 96, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		chckbxDyspraxie = new HandicapParticulier("Dyspraxie");
		
		gestionChampsEtExceptions(chckbxDyspraxie, 484, 104, 100, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		chckbxEpilepsie = new HandicapParticulier("Epilepsie");
		
		gestionChampsEtExceptions(chckbxEpilepsie, 585, 104, 108, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		chckbxSep = new HandicapParticulier("SEP");
		
		gestionChampsEtExceptions(chckbxSep, 693, 104, 57, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		chckbxAutres = new HandicapAPreciser("Autres");
		
		textField_1 = new JTextField();
		
		gestionChampsEtExceptions(chckbxAutres, 762, 104, 96, 23, null, false, true, null, false, null, null, new AutreHandicapMoteurListener(), "", textField_1, null, null);
		
		gestionChampsEtExceptions(textField_1, 870, 106, 141, 20, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		chckbxTroublesVisuels = new RegroupementTypeHandicap("Troubles visuels :");
		
		gestionChampsEtExceptions(chckbxTroublesVisuels, 18, 142, 150, 23, null, true, true, null, false, null, null, new TroublesVisuelsListener(), "", null, null, null);
		
		textField_2 = new JTextField();
		
		gestionChampsEtExceptions(textField_2, 597, 182, 248, 20, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		chckbxNewCheckBox = new RegroupementTypeHandicap("Troubles auditifs :");
		
		gestionChampsEtExceptions(chckbxNewCheckBox, 18, 205, 150, 23, null, true, true, null, false, null, null, new TroublesAuditifsListener(), "", null, null, null);
		
		textField_3 = new JTextField();
		
		gestionChampsEtExceptions(textField_3, 648, 244, 261, 20, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		chckbxTroublesCognitifs = new FamilleHandicapNonDefinie("Troubles cognitifs :");
		
		gestionChampsEtExceptions(chckbxTroublesCognitifs, 18, 282, 175, 23, null, true, true, null, false, null, null, new TroublesCognitifsListener(), "", textField_4, null, null);
		
		textField_4 = new JTextField();
		
		gestionChampsEtExceptions(textField_4, 248, 284, 196, 20, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		chckbxTsa = new RegroupementTypeHandicap("TSA :");
		
		gestionChampsEtExceptions(chckbxTsa, 18, 313, 71, 23, null, true, true, null, false, null, null, new TsaListener(), "", null, null, null);
		
		rdbtnNewRadioButton = new JRadioButton("Autisme profond");
		
		gestionChampsEtExceptions(rdbtnNewRadioButton, 72, 339, 150, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		rdbtnAutismeDeHaut = new JRadioButton("Autisme de haut niveau");
		
		gestionChampsEtExceptions(rdbtnAutismeDeHaut, 222, 339, 190, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		rdbtnSyndrmeDasperger = new JRadioButton("Syndrôme d'Asperger");
		
		gestionChampsEtExceptions(rdbtnSyndrmeDasperger, 424, 339, 190, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		autisme = new Autisme();
		regrouperBoutons(autisme);
		
		chckbxTroublesPsychiques = new FamilleHandicapNonDefinie("Troubles psychiques :");
		
		gestionChampsEtExceptions(chckbxTroublesPsychiques, 18, 375, 175, 23, null, true, true, null, false, null, null, new TroublesPsychiquesListener(), "", textField_5, null, null);
		
		textField_5 = new JTextField();
		
		gestionChampsEtExceptions(textField_5, 220, 376, 204, 20, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		chckbxTroublesDuLangage = new FamilleHandicapNonDefinie("Troubles du langage et de la parole :");
		
		textField_6 = new JTextField();
		
		gestionChampsEtExceptions(chckbxTroublesDuLangage, 18, 413, 279, 23, null, true, true, null, false, null, null, new TroublesDuLangageEtDeLaParoleListener(), "", textField_6, null, null);
		
		gestionChampsEtExceptions(textField_6, 324, 414, 204, 20, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		chckbxTroublesViscraux = new RegroupementTypeHandicap("Troubles viscéraux :");
		
		gestionChampsEtExceptions(chckbxTroublesViscraux, 16, 443, 190, 23, null, true, true, null, false, null, null, new TroublesViscerauxListener(), "", null, null, null);
		
		chckbxMaladieCardiaque = new HandicapParticulier("Maladie cardiaque");
		
		gestionChampsEtExceptions(chckbxMaladieCardiaque, 86, 469, 150, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		chckbxMaladiePulmonaire = new HandicapParticulier("Maladie pulmonaire");
		
		gestionChampsEtExceptions(chckbxMaladiePulmonaire, 231, 469, 161, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		chckbxMaladieDuSystme = new HandicapParticulier("Maladie du système digestif");
		
		gestionChampsEtExceptions(chckbxMaladieDuSystme, 389, 469, 225, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		chckbxPathologieCancreuse = new HandicapParticulier("Pathologie cancéreuse");
		
		gestionChampsEtExceptions(chckbxPathologieCancreuse, 614, 469, 175, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		chckbxAutrePrciser = new HandicapAPreciser("Autre");
		
		textField_7 = new JTextField();
		
		gestionChampsEtExceptions(chckbxAutrePrciser, 791, 469, 67, 23, null, false, true, null, false, null, null, new AutresTroublesViscerauxListener(), "", textField_7, null, null);
		
		gestionChampsEtExceptions(textField_7, 870, 471, 141, 20, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		chckbxAutresTroublesprciser = new FamilleHandicapNonDefinie("Autre(s) trouble(s) (préciser)");
		
		textField_8 = new JTextField();
		
		gestionChampsEtExceptions(chckbxAutresTroublesprciser, 16, 497, 220, 23, null, true, true, null, false, null, null, new AutresTroublesListener(), "", textField_8, null, null);
		
		gestionChampsEtExceptions(textField_8, 360, 499, 254, 20, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		rdbtnCcit = new JRadioButton("Cécité");
		
		gestionChampsEtExceptions(rdbtnCcit, 115, 177, 78, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		rdbtnAutresTroublesDes = new TypeHandicapSensoriel("Autres troubles des fonctions visuelles");
		
		gestionChampsEtExceptions(rdbtnAutresTroublesDes, 224, 177, 293, 23, null, false, true, null, false, null, null, new AutresTroublesvisuelsListener(), "", textField_2, null, null);
		
		vision = new Vision();
		regrouperBoutons(vision);
		
		rdbtnSurditSvreEt = new JRadioButton("Surdité sévère et profonde");
		
		gestionChampsEtExceptions(rdbtnSurditSvreEt, 103, 242, 209, 23, null, false, true, null, false, null, null, null, "", null, null, null);
		
		rdbtnAutresTroublesDes_1 = new TypeHandicapSensoriel("Autres troubles des fonctions auditives");
		
		gestionChampsEtExceptions(rdbtnAutresTroublesDes_1, 309, 242, 293, 23, null, false, true, null, false, null, null, new AutresTroublesAuditifsListener(), "", textField_3, null, null);
		
		audition = new Audition();
		regrouperBoutons(audition);
		
		chckbxPlusieursTroublesAssocis = new JCheckBox("Plusieurs troubles associés");
		
		gestionChampsEtExceptions(chckbxPlusieursTroublesAssocis, 622, 497, 204, 23, null, true, false, null, false, null, null, null, "", null, null, null);
		
	}

	/**
	 * Crée le panel en collectant les informations de l'étudiant à partir de son numéro lorsque celui-ci est répertorié
	 * @param numEtudiant
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
	public Handicap(String numEtudiant) throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		this.troublesCoches=new ArrayList<RegroupementTypeHandicap>();
		gererInfosFichierCSV(fichierHandicap);
		
	}
	
	/**
	 * Méthode permettant de cocher la cases indiquant si un étudiant a plusieurs troubles. Cette case n'est cochable que par cette méthode et non de manière manuelle.
	 * @param troublesCoches
	 */
	
	private void plusieursTroublesCoches(ArrayList<RegroupementTypeHandicap> troublesCoches) {
		if(troublesCoches.size()>1) {
			chckbxPlusieursTroublesAssocis.setSelected(true);
		}
		else {
			chckbxPlusieursTroublesAssocis.setSelected(false);
		}
	}

	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier)
			throws LongueurDifferenteListesException, NullArgumentException {
			
		ArrayList<String[]> etudiants = fichier.chargerFichier();
		
		String[] etudiant = fichier.retournerInfosEtudiant(etudiants, this.numEtudiant);
		
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
		
		gestionChampsEtExceptions(lblPrcisez, 226, 38, 71, 14, null, false, true, null, null, null, null, null, null, null, null, null);
		
		gestionChampsEtExceptions(textField, 324, 35, 146, 20, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		gestionChampsEtExceptions(rdbtnNonRenseign, 18, 7, 150, 23, null, true, true, null, false, null, null, new NonRenseigneListener(), etudiant[3], null, null, null);
		
		gestionChampsEtExceptions(rdbtnHandicapTemporaire, 18, 33, 175, 23, null, true, true, null, false, null, null, new HandicapTemporaireListener(), etudiant[1], textField, null, null);
		
		gestionChampsEtExceptions(rdbtnHandicapDfinitif, 151, 7, 161, 23, null, true, true, null, false, null, null, new HandicapDefinitifListener(), etudiant[2], null, null, null);
		
		gestionChampsEtExceptions(chckbxFauteuilManuel, 94, 104, 150, 23, null, false, true, null, false, null, null, null, etudiant[5], null, null, null);
		
		gestionChampsEtExceptions(chckbxFauteuillectrique, 238, 104, 154, 23, null, false, true, null, false, null, null, null, etudiant[6], null, null, null);
		
		gestionChampsEtExceptions(chckbxBquilles, 389, 104, 96, 23, null, false, true, null, false, null, null, null, etudiant[7], null, null, null);
		
		gestionChampsEtExceptions(chckbxDyspraxie, 484, 104, 100, 23, null, false, true, null, false, null, null, null, etudiant[8], null, null, null);
		
		gestionChampsEtExceptions(chckbxEpilepsie, 585, 104, 108, 23, null, false, true, null, false, null, null, null, etudiant[9], null, null, null);
		
		gestionChampsEtExceptions(chckbxSep, 693, 104, 57, 23, null, false, true, null, false, null, null, null, etudiant[10], null, null, null);
		
		gestionChampsEtExceptions(chckbxAutres, 762, 104, 96, 23, null, false, true, null, false, null, null, new AutreHandicapMoteurListener(), etudiant[11], textField_1, null, null);
		
		gestionChampsEtExceptions(textField_1, 870, 106, 141, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[11], null, null, null);
		
		gestionChampsEtExceptions(chckbxTroublesMoteurs, 18, 66, 204, 23, null, true, true, null, false, null, null, new TroublesMoteursListener(), etudiant[4], null, null, null);
		
		gestionChampsEtExceptions(textField_2, 597, 182, 248, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[14], null, null, null);
		
		gestionChampsEtExceptions(rdbtnCcit, 115, 177, 78, 23, null, false, true, null, false, null, null, null, etudiant[13], null, null, null);
		
		gestionChampsEtExceptions(rdbtnAutresTroublesDes, 224, 177, 293, 23, null, false, true, null, false, null, null, new AutresTroublesvisuelsListener(), etudiant[14], textField_2, null, null);
		
		gestionChampsEtExceptions(chckbxTroublesVisuels, 18, 142, 150, 23, null, true, true, null, false, null, null, new TroublesVisuelsListener(), etudiant[12], null, null, null);

		gestionChampsEtExceptions(textField_3, 648, 244, 261, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[17], null, null, null);
		
		gestionChampsEtExceptions(rdbtnSurditSvreEt, 103, 242, 209, 23, null, false, true, null, false, null, null, null, etudiant[16], null, null, null);
		
		gestionChampsEtExceptions(rdbtnAutresTroublesDes_1, 309, 242, 293, 23, null, false, true, null, false, null, null, new AutresTroublesAuditifsListener(), etudiant[17], textField_3, null, null);
		
		gestionChampsEtExceptions(chckbxNewCheckBox, 18, 205, 150, 23, null, true, true, null, false, null, null, new TroublesAuditifsListener(), etudiant[15], null, null, null);
		
		gestionChampsEtExceptions(textField_4, 248, 284, 196, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[18], null, null, null);
		
		gestionChampsEtExceptions(chckbxTroublesCognitifs, 18, 282, 175, 23, null, true, true, null, false, null, null, new TroublesCognitifsListener(), etudiant[18], textField_4, null, null);
		
		gestionChampsEtExceptions(rdbtnNewRadioButton, 72, 339, 150, 23, null, false, true, null, false, null, null, null, etudiant[20], null, null, null);
		
		gestionChampsEtExceptions(rdbtnAutismeDeHaut, 222, 339, 190, 23, null, false, true, null, false, null, null, null, etudiant[21], null, null, null);
		
		gestionChampsEtExceptions(rdbtnSyndrmeDasperger, 424, 339, 190, 23, null, false, true, null, false, null, null, null, etudiant[22], null, null, null);
		
		gestionChampsEtExceptions(chckbxTsa, 18, 313, 71, 23, null, true, true, null, false, null, null, new TsaListener(), etudiant[19], null, null, null);
		
		gestionChampsEtExceptions(textField_5, 220, 376, 204, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[23], null, null, null);
		
		gestionChampsEtExceptions(chckbxTroublesPsychiques, 18, 375, 175, 23, null, true, true, null, false, null, null, new TroublesPsychiquesListener(), etudiant[23], textField_5, null, null);
				
		gestionChampsEtExceptions(textField_6, 324, 414, 204, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[24], null, null, null);
		
		gestionChampsEtExceptions(chckbxTroublesDuLangage, 18, 413, 279, 23, null, true, true, null, false, null, null, new TroublesDuLangageEtDeLaParoleListener(), etudiant[24], textField_6, null, null);
		
		gestionChampsEtExceptions(chckbxMaladieCardiaque, 86, 469, 150, 23, null, false, true, null, false, null, null, null, etudiant[26], null, null, null);
		
		gestionChampsEtExceptions(chckbxMaladiePulmonaire, 231, 469, 161, 23, null, false, true, null, false, null, null, null, etudiant[27], null, null, null);
		
		gestionChampsEtExceptions(chckbxMaladieDuSystme, 389, 469, 225, 23, null, false, true, null, false, null, null, null, etudiant[28], null, null, null);
		
		gestionChampsEtExceptions(chckbxPathologieCancreuse, 614, 469, 175, 23, null, false, true, null, false, null, null, null, etudiant[29], null, null, null);
		
		gestionChampsEtExceptions(textField_7, 870, 471, 141, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[30], null, null, null);
		
		gestionChampsEtExceptions(chckbxAutrePrciser, 791, 469, 67, 23, null, false, true, null, false, null, null, new AutresTroublesViscerauxListener(), etudiant[30], textField_7, null, null);
			
		gestionChampsEtExceptions(chckbxTroublesViscraux, 16, 443, 190, 23, null, true, true, null, false, null, null, new TroublesViscerauxListener(), etudiant[25], null, null, null);
		
		gestionChampsEtExceptions(textField_8, 360, 499, 254, 20, Color.WHITE, false, true, true, null, null, null, null, etudiant[31], null, null, null);
		
		gestionChampsEtExceptions(chckbxAutresTroublesprciser, 16, 497, 220, 23, null, true, true, null, false, null, null, new AutresTroublesListener(), etudiant[31], textField_8, null, null);
		
	}

	@Override
	public void gererInfosFichierTXT(LectureFichierTXT lectureFichier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void regrouperBoutons(ButtonGroup boutons) {
		if(boutons instanceof StatutHandicap) {
			boutons.add(rdbtnNonRenseign);
			boutons.add(rdbtnHandicapTemporaire);
			boutons.add(rdbtnHandicapDfinitif);
		}
		else if(boutons instanceof Vision) {
			boutons.add(rdbtnCcit);
			boutons.add(rdbtnAutresTroublesDes);
		}
		else if(boutons instanceof Audition) {
			boutons.add(rdbtnSurditSvreEt);
			boutons.add(rdbtnAutresTroublesDes_1);
		}
		else if(boutons instanceof Autisme) {
			boutons.add(rdbtnNewRadioButton);
			boutons.add(rdbtnAutismeDeHaut);
			boutons.add(rdbtnSyndrmeDasperger);
		}
	}
}