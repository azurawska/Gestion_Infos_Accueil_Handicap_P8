package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.util.ArrayList;
import java.util.EventListener;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.toedter.calendar.JDateChooser;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import fenetre.composants.AidesHumainesCours;
import fenetre.composants.AidesTechniquesCours;
import fenetre.composants.AmenagementsFormation;
import fenetre.composants.Droit;
import fenetre.composants.DroitParticulier;
import fenetre.composants.Fait;
import fenetre.composants.FaitSpecifiqueHandicapMoteur;
import fenetre.composants.OuiNon;
import interfaces.GestionCasesCochesAmenagements;
import interfaces.GestionFichierCSV;
import interfaces.GroupementBoutons;

public class AmenagementsCours extends AbstractJPanel implements GestionFichierCSV, GroupementBoutons, GestionCasesCochesAmenagements {
	
	private class AmenagementsFormationListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnOui_2.isSelected()) {
				chckbxDroit_12.setVisible(true);
				chckbxFait_12.setVisible(true);
				lblDispenseDassiduit.setVisible(true);
				chckbxDroit_13.setVisible(true);
				chckbxFait_13.setVisible(true);
				lblAmnagementDeLa.setVisible(true);
				chckbxDroit_14.setVisible(true);
				chckbxFait_14.setVisible(true);
				lblAmnagementDesHoraires.setVisible(true);
				chckbxDroit_15.setVisible(true);
				chckbxFait_15.setVisible(true);
				lblDispenseDeStage.setVisible(true);
			}
			else {
				chckbxDroit_12.setVisible(false);
				chckbxDroit_12.setSelected(false);
				chckbxFait_12.setVisible(false);
				chckbxFait_12.setSelected(false);
				lblDispenseDassiduit.setVisible(false);
				chckbxDroit_13.setVisible(false);
				chckbxDroit_13.setSelected(false);
				chckbxFait_13.setVisible(false);
				chckbxFait_13.setSelected(false);
				lblAmnagementDeLa.setVisible(false);
				chckbxDroit_14.setVisible(false);
				chckbxDroit_14.setSelected(false);
				chckbxFait_14.setVisible(false);
				chckbxFait_14.setSelected(false);
				lblAmnagementDesHoraires.setVisible(false);
				chckbxDroit_15.setVisible(false);
				chckbxDroit_15.setSelected(false);
				chckbxFait_15.setVisible(false);
				chckbxFait_15.setSelected(false);
				lblDispenseDeStage.setVisible(false);
			}
		}
	}
	
	private class DroitListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(chckbxDroit_11.isSelected()) {
				textField_2.setVisible(true);
			}
			else {
				textField_2.setVisible(false);
			}
		}
	}

	private class AidesTechniquesListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnOui_1.isSelected()) {
				chckbxDroit_5.setVisible(true);
				chckbxFait_5.setVisible(true);
				lblCarteDaccessibilitAux.setVisible(true);
				chckbxDroit_6.setVisible(true);
				chckbxFait_6.setVisible(true);
				lblClsWcAccessibles.setVisible(true);
				chckbxDroit_7.setVisible(true);
				chckbxFait_7.setVisible(true);
				lblNumrisations.setVisible(true);
				chckbxDroit_8.setVisible(true);
				chckbxFait_8.setVisible(true);
				lblTranscriptionsBraille.setVisible(true);
				chckbxDroit_9.setVisible(true);
				chckbxFait_9.setVisible(true);
				lblAgrandissements.setVisible(true);
				chckbxDroit_10.setVisible(true);
				chckbxFait_10.setVisible(true);
				lblPrtDeDictaphone.setVisible(true);
				chckbxDroit_11.setVisible(true);
				chckbxFait_11.setVisible(true);
				lblAutres.setVisible(true);
			}
			else {
				chckbxDroit_5.setVisible(false);
				chckbxDroit_5.setSelected(false);
				chckbxFait_5.setVisible(false);
				chckbxFait_5.setSelected(false);
				lblCarteDaccessibilitAux.setVisible(false);
				chckbxDroit_6.setVisible(false);
				chckbxDroit_6.setSelected(false);
				chckbxFait_6.setVisible(false);
				chckbxFait_6.setSelected(false);
				lblClsWcAccessibles.setVisible(false);
				chckbxDroit_7.setVisible(false);
				chckbxDroit_7.setSelected(false);
				chckbxFait_7.setVisible(false);
				chckbxFait_7.setSelected(false);
				lblNumrisations.setVisible(false);
				chckbxDroit_8.setVisible(false);
				chckbxDroit_8.setSelected(false);
				chckbxFait_8.setVisible(false);
				chckbxFait_8.setSelected(false);
				lblTranscriptionsBraille.setVisible(false);
				chckbxDroit_9.setVisible(false);
				chckbxDroit_9.setSelected(false);
				chckbxFait_9.setVisible(false);
				chckbxFait_9.setSelected(false);
				lblAgrandissements.setVisible(false);
				chckbxDroit_10.setVisible(false);
				chckbxDroit_10.setSelected(false);
				chckbxFait_10.setVisible(false);
				chckbxFait_10.setSelected(false);
				lblPrtDeDictaphone.setVisible(false);
				chckbxDroit_11.setVisible(false);
				chckbxDroit_11.setSelected(false);
				chckbxFait_11.setVisible(false);
				chckbxFait_11.setSelected(false);
				lblAutres.setVisible(false);
			}
		}
	}

	private class FaitListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			gererCasesCochesAmenagements(chckbxDroit, chckbxFait);
			gererCasesCochesAmenagements(chckbxDroit_1, chckbxFait_1);
			gererCasesCochesAmenagements(chckbxDroit_2, chckbxFait_2);
			gererCasesCochesAmenagements(chckbxDroit_3, chckbxFait_3);
			gererCasesCochesAmenagements(chckbxDroit_4, chckbxFait_4);
			gererCasesCochesAmenagements(chckbxDroit_5, chckbxFait_5);
			gererCasesCochesAmenagements(chckbxDroit_6, chckbxFait_6);
			gererCasesCochesAmenagements(chckbxDroit_7, chckbxFait_7);
			gererCasesCochesAmenagements(chckbxDroit_8, chckbxFait_8);
			gererCasesCochesAmenagements(chckbxDroit_9, chckbxFait_9);
			gererCasesCochesAmenagements(chckbxDroit_10, chckbxFait_10);
			gererCasesCochesAmenagements(chckbxDroit_11, chckbxFait_11);
			gererCasesCochesAmenagements(chckbxDroit_12, chckbxFait_12);
			gererCasesCochesAmenagements(chckbxDroit_13, chckbxFait_13);
			gererCasesCochesAmenagements(chckbxDroit_14, chckbxFait_14);
			gererCasesCochesAmenagements(chckbxDroit_15, chckbxFait_15);
		}
	}

	private class AidesHumainesListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnOui.isSelected()) {
				chckbxDroit.setVisible(true);
				chckbxFait.setVisible(true);
				lblPriseDeNotes.setVisible(true);
				chckbxDroit_1.setVisible(true);
				chckbxFait_1.setVisible(true);
				lblTutoratDaccompagnement.setVisible(true);
				chckbxDroit_2.setVisible(true);
				chckbxFait_2.setVisible(true);
				lblInterprtationEnLsf.setVisible(true);
				chckbxDroit_3.setVisible(true);
				chckbxFait_3.setVisible(true);
				lblCodageEnLpc.setVisible(true);
				chckbxDroit_4.setVisible(true);
				chckbxFait_4.setVisible(true);
				lblLecturefrappeAuKilomtreaide.setVisible(true);
			}
			else {
				chckbxDroit.setVisible(false);
				chckbxDroit.setSelected(false);
				chckbxFait.setVisible(false);
				chckbxFait.setSelected(false);
				lblPriseDeNotes.setVisible(false);
				chckbxDroit_1.setVisible(false);
				chckbxDroit_1.setSelected(false);
				chckbxFait_1.setVisible(false);
				chckbxFait_1.setSelected(false);
				lblTutoratDaccompagnement.setVisible(false);
				chckbxDroit_2.setVisible(false);
				chckbxDroit_2.setSelected(false);
				chckbxFait_2.setVisible(false);
				chckbxFait_2.setSelected(false);
				lblInterprtationEnLsf.setVisible(false);
				chckbxDroit_3.setVisible(false);
				chckbxDroit_3.setSelected(false);
				chckbxFait_3.setVisible(false);
				chckbxFait_3.setSelected(false);
				lblCodageEnLpc.setVisible(false);
				chckbxDroit_4.setVisible(false);
				chckbxDroit_4.setSelected(false);
				chckbxFait_4.setVisible(false);
				chckbxFait_4.setSelected(false);
				lblLecturefrappeAuKilomtreaide.setVisible(false);
			}
		}
	}

	private JDateChooser textField;
	private JDateChooser textField_1;
	
	private JTextField textField_2;
	
	private JLabel lblAidesHumaines;
	private JLabel lblPriseDeNotes;
	private JLabel lblTutoratDaccompagnement;
	private JLabel lblInterprtationEnLsf;
	private JLabel lblCodageEnLpc;
	private JLabel lblLecturefrappeAuKilomtreaide;
	private JLabel lblAidesTechniques;
	private JLabel lblCarteDaccessibilitAux;
	private JLabel lblRemiseLe;
	private JLabel lblClsWcAccessibles;
	private JLabel lblRemiseLe_1;
	private JLabel lblNumrisations;
	private JLabel lblTranscriptionsBraille;
	private JLabel lblAgrandissements;
	private JLabel lblPrtDeDictaphone;
	private JLabel lblAutres;
	private JLabel lblAmnagementsDeLa;
	private JLabel lblDispenseDassiduit;
	private JLabel lblAmnagementDeLa;
	private JLabel lblAmnagementDesHoraires;
	private JLabel lblDispenseDeStage;
	
	private OuiNon rdbtnOui;
	private OuiNon rdbtnNon;
	private OuiNon rdbtnOui_1;
	private OuiNon rdbtnNon_1;
	private OuiNon rdbtnOui_2;
	private OuiNon rdbtnNon_2;
	
	private Droit chckbxDroit;
	private Droit chckbxDroit_1;
	private Droit chckbxDroit_2;
	private Droit chckbxDroit_3;
	private Droit chckbxDroit_4;
	private Droit chckbxDroit_5;
	private Droit chckbxDroit_6;
	private Droit chckbxDroit_7;
	private Droit chckbxDroit_8;
	private Droit chckbxDroit_9;
	private Droit chckbxDroit_10;
	private DroitParticulier chckbxDroit_11;
	private Droit chckbxDroit_12;
	private Droit chckbxDroit_13;
	private Droit chckbxDroit_14;
	private Droit chckbxDroit_15;
	
	private Fait chckbxFait;
	private Fait chckbxFait_1;
	private Fait chckbxFait_2;
	private Fait chckbxFait_3;
	private Fait chckbxFait_4;
	private FaitSpecifiqueHandicapMoteur chckbxFait_5;
	private FaitSpecifiqueHandicapMoteur chckbxFait_6;
	private Fait chckbxFait_7;
	private Fait chckbxFait_8;
	private Fait chckbxFait_9;
	private Fait chckbxFait_10;
	private Fait chckbxFait_11;
	private Fait chckbxFait_12;
	private Fait chckbxFait_13;
	private Fait chckbxFait_14;
	private Fait chckbxFait_15;
	
	private boolean nouveau;
	
	private String numEtudiant;
	
	private final LectureFichierCSV fichierAmenagementsCours = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/amenagements_cours.csv");

	/**
	 * Create the panel.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public AmenagementsCours() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		
		setLayout(null);
		
		lblAidesHumaines = new JLabel("Aides humaines");
		
		gestionChampsEtExceptions(lblAidesHumaines, 108, 6, 115, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		rdbtnOui = new OuiNon("Oui");
		
		gestionChampsEtExceptions(rdbtnOui, 74, 34, 54, 23, null, true, true, null, false, null, null, new AidesHumainesListener(), "", null, null);
		
		rdbtnNon = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon, 155, 34, 59, 23, null, true, true, null, false, null, null, new AidesHumainesListener(), "", null, null);
		
		AidesHumainesCours aidesHumainesCours = new AidesHumainesCours();
		regrouperBoutons(aidesHumainesCours);
		
		chckbxDroit = new Droit("Droit");
		
		chckbxFait = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit, 6, 69, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait);
		
		gestionChampsEtExceptions(chckbxFait, 74, 69, 64, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit);
		
		lblPriseDeNotes = new JLabel("Prise de notes");
		
		gestionChampsEtExceptions(lblPriseDeNotes, 175, 76, 98, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_1 = new Droit("Droit");
		
		chckbxFait_1 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_1, 6, 91, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_1);
		
		gestionChampsEtExceptions(chckbxFait_1, 74, 91, 64, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_1);
		
		lblTutoratDaccompagnement = new JLabel("Tutorat d'accompagnement (soutien pédagogique)");
		
		gestionChampsEtExceptions(lblTutoratDaccompagnement, 175, 95, 326, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_2 = new Droit("Droit");
		
		chckbxFait_2 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_2, 6, 113, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_2);
		
		gestionChampsEtExceptions(chckbxFait_2, 74, 113, 64, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_2);
		
		lblInterprtationEnLsf = new JLabel("Interprétation en LSF");
		
		gestionChampsEtExceptions(lblInterprtationEnLsf, 175, 117, 137, 16, null, false, true, null, false, null, null, null, null, null, null);
		
		chckbxDroit_3 = new Droit("Droit");
		
		chckbxFait_3 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_3, 6, 137, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_3);
		
		gestionChampsEtExceptions(chckbxFait_3, 74, 137, 59, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_3);
		
		lblCodageEnLpc = new JLabel("Codage en LPC");
		
		gestionChampsEtExceptions(lblCodageEnLpc, 175, 141, 98, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_4 = new Droit("Droit");
		
		chckbxFait_4 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_4, 6, 158, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_4);
		
		gestionChampsEtExceptions(chckbxFait_4, 74, 158, 59, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_4);
		
		lblLecturefrappeAuKilomtreaide = new JLabel("Lecture/Frappe au kilomètre/Aide à la recherche documentaire");
		
		gestionChampsEtExceptions(lblLecturefrappeAuKilomtreaide, 175, 162, 402, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		lblAidesTechniques = new JLabel("Aides techniques");
		
		gestionChampsEtExceptions(lblAidesTechniques, 142, 190, 115, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		rdbtnOui_1 = new OuiNon("Oui");
		rdbtnOui_1.setBounds(108, 206, 59, 23);
		add(rdbtnOui_1);
		
		gestionChampsEtExceptions(rdbtnOui_1, 108, 206, 59, 23, null, true, true, null, false, null, null, new AidesTechniquesListener(), "", null, null);
		
		rdbtnNon_1 = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon_1, 214, 206, 59, 23, null, true, true, null, false, null, null, new AidesTechniquesListener(), "", null, null);
		
		AidesTechniquesCours aidesTecheniquesCours = new AidesTechniquesCours();
		regrouperBoutons(aidesTecheniquesCours);
		
		chckbxDroit_5 = new Droit("Droit");
		
		chckbxFait_5 = new FaitSpecifiqueHandicapMoteur("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_5, 6, 229, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_5);
		
		gestionChampsEtExceptions(chckbxFait_5, 69, 229, 59, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_5);
		
		lblCarteDaccessibilitAux = new JLabel("Carte d'accessibilité aux locaux et ascenseurs");
		
		gestionChampsEtExceptions(lblCarteDaccessibilitAux, 140, 241, 300, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		lblRemiseLe = new JLabel("Remise le :");
		
		gestionChampsEtExceptions(lblRemiseLe, 453, 233, 75, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		textField = new JDateChooser();
		
		gestionChampsEtExceptions(textField, 529, 228, 130, 26, null, false, true, null, null, null, null, null, "", null, null);
		
		chckbxDroit_6 = new Droit("Droit");
		
		chckbxFait_6 = new FaitSpecifiqueHandicapMoteur("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_6, 6, 253, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_6);
		
		gestionChampsEtExceptions(chckbxFait_6, 69, 253, 59, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_6);
		
		lblClsWcAccessibles = new JLabel("Clés WC accessibles");
		
		gestionChampsEtExceptions(lblClsWcAccessibles, 142, 261, 137, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		lblRemiseLe_1 = new JLabel("Remise le :");
		
		gestionChampsEtExceptions(lblRemiseLe_1, 306, 261, 75, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		textField_1 = new JDateChooser();
		
		gestionChampsEtExceptions(textField_1, 393, 256, 130, 26, null, false, true, null, null, null, null, null, "", null, null);
		
		chckbxDroit_7 = new Droit("Droit");
		
		chckbxFait_7 = new Fait("Fait");
	
		gestionChampsEtExceptions(chckbxDroit_7, 6, 275, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_7);
		
		gestionChampsEtExceptions(chckbxFait_7, 69, 275, 64, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_7);
		
		lblNumrisations = new JLabel("Numérisations");
		
		gestionChampsEtExceptions(lblNumrisations, 142, 279, 98, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_8 = new Droit("Droit");
		
		chckbxFait_8 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_8, 6, 295, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_8);
		
		gestionChampsEtExceptions(chckbxFait_8, 69, 295, 64, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_8);
		
		lblTranscriptionsBraille = new JLabel("Transcriptions braille");
		
		gestionChampsEtExceptions(lblTranscriptionsBraille, 142, 299, 137, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_9 = new Droit("Droit");
		
		chckbxFait_9 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_9, 6, 310, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_9);
		
		gestionChampsEtExceptions(chckbxFait_9, 69, 310, 64, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_9);
		
		lblAgrandissements = new JLabel("Agrandissements");
		
		gestionChampsEtExceptions(lblAgrandissements, 142, 314, 115, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_10 = new Droit("Droit");
		
		chckbxFait_10 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_10, 6, 330, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_10);
		
		gestionChampsEtExceptions(chckbxFait_10, 69, 330, 59, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_10);
		
		lblPrtDeDictaphone = new JLabel("Prêt de dictaphone");
		
		gestionChampsEtExceptions(lblPrtDeDictaphone, 142, 334, 131, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_11 = new DroitParticulier("Droit");
		
		chckbxFait_11 = new Fait("Fait");
		
		textField_2 = new JTextField();
		
		gestionChampsEtExceptions(textField_2, 277, 344, 366, 26, Color.WHITE, false, true, false, null, null, null, null, "", null, null);
		
		gestionChampsEtExceptions(chckbxDroit_11, 6, 345, 69, 23, null, false, true, null, false, null, null, new DroitListener(), "", textField_2, chckbxFait_11);
		
		gestionChampsEtExceptions(chckbxFait_11, 69, 345, 64, 23, null, false, true, null, false, null, null, new FaitListener(), "", textField_2, chckbxDroit_11);
		
		lblAutres = new JLabel("Autres");
		
		gestionChampsEtExceptions(lblAutres, 142, 349, 61, 16, null, false, true, null, null, null, null, null, null, textField_2, null);
		
		lblAmnagementsDeLa = new JLabel("Aménagements de la formation");
		
		gestionChampsEtExceptions(lblAmnagementsDeLa, 68, 382, 205, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		rdbtnOui_2 = new OuiNon("Oui");
		
		gestionChampsEtExceptions(rdbtnOui_2, 58, 410, 54, 23, null, true, true, null, false, null, null, new AmenagementsFormationListener(), "", null, null);
		
		rdbtnNon_2 = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon_2, 181, 410, 59, 23, null, true, true, null, false, null, null, new AmenagementsFormationListener(), "", null, null);
		
		AmenagementsFormation amenagementsFormation = new AmenagementsFormation();
		regrouperBoutons(amenagementsFormation);
		
		chckbxDroit_12 = new Droit("Droit");
		
		chckbxFait_12 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_12, 38, 445, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_12);
		
		gestionChampsEtExceptions(chckbxFait_12, 108, 445, 59, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_12);
		
		lblDispenseDassiduit = new JLabel("Dispense d'assiduité");
		
		gestionChampsEtExceptions(lblDispenseDassiduit, 175, 449, 137, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_13 = new Droit("Droit");
		
		chckbxFait_13 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_13, 38, 469, 75, 23, null, false, true, null, false, null, null, null, "", null, chckbxDroit_13);
		
		gestionChampsEtExceptions(chckbxFait_13, 108, 469, 59, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_13);
		
		lblAmnagementDeLa = new JLabel("Aménagement de la durée de formation");
		
		gestionChampsEtExceptions(lblAmnagementDeLa, 175, 473, 261, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_14 = new Droit("Droit");
		
		chckbxFait_14 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_14, 39, 495, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_14);
		
		gestionChampsEtExceptions(chckbxFait_14, 108, 495, 59, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_14);
		
		lblAmnagementDesHoraires = new JLabel("Aménagement des horaires");
		
		gestionChampsEtExceptions(lblAmnagementDesHoraires, 175, 499, 178, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_15 = new Droit("Droit");
		
		chckbxFait_15 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_15, 39, 523, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_15);
		
		gestionChampsEtExceptions(chckbxFait_15, 108, 523, 59, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_15);
		
		lblDispenseDeStage = new JLabel("Dispense de stage");
		
		gestionChampsEtExceptions(lblDispenseDeStage, 175, 527, 122, 16, null, false, true, null, null, null, null, null, null, null, null);

	}

	public AmenagementsCours(String utilisateur) throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=false;
		this.numEtudiant=utilisateur;
		gererInfosFichierCSV(fichierAmenagementsCours);
	}

	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier)
			throws LongueurDifferenteListesException, NullArgumentException {
		
		ArrayList<String[]> etudiants = fichierAmenagementsCours.chargerFichier();
		String[] etudiant = fichierAmenagementsCours.retournerInfosEtudiant(etudiants, this.numEtudiant);
		
		setLayout(null);
		
		lblAidesHumaines = new JLabel("Aides humaines");
		
		gestionChampsEtExceptions(lblAidesHumaines, 108, 6, 115, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		rdbtnOui = new OuiNon("Oui");
		
		gestionChampsEtExceptions(rdbtnOui, 74, 34, 54, 23, null, true, true, null, false, null, null, new AidesHumainesListener(), etudiant[1], null, null);
		
		rdbtnNon = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon, 155, 34, 59, 23, null, true, true, null, false, null, null, new AidesHumainesListener(), etudiant[1], null, null);
		
		AidesHumainesCours aidesHumainesCours = new AidesHumainesCours();
		regrouperBoutons(aidesHumainesCours);
		
		chckbxDroit = new Droit("Droit");
		
		chckbxFait = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit, 6, 69, 64, 23, null, false, true, null, false, null, null, null, etudiant[2], null, chckbxFait);
		
		gestionChampsEtExceptions(chckbxFait, 74, 69, 64, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[2], null, chckbxDroit);
		
		lblPriseDeNotes = new JLabel("Prise de notes");
		
		gestionChampsEtExceptions(lblPriseDeNotes, 175, 76, 98, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_1 = new Droit("Droit");
		
		chckbxFait_1 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_1, 6, 91, 64, 23, null, false, true, null, false, null, null, null, etudiant[3], null, chckbxFait_1);
		
		gestionChampsEtExceptions(chckbxFait_1, 74, 91, 64, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[3], null, chckbxDroit_1);
		
		lblTutoratDaccompagnement = new JLabel("Tutorat d'accompagnement (soutien pédagogique)");
		
		gestionChampsEtExceptions(lblTutoratDaccompagnement, 175, 95, 326, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_2 = new Droit("Droit");
		
		chckbxFait_2 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_2, 6, 113, 64, 23, null, false, true, null, false, null, null, null, etudiant[4], null, chckbxFait_2);
		
		gestionChampsEtExceptions(chckbxFait_2, 74, 113, 64, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[4], null, chckbxDroit_2);
		
		lblInterprtationEnLsf = new JLabel("Interprétation en LSF");
		
		gestionChampsEtExceptions(lblInterprtationEnLsf, 175, 117, 137, 16, null, false, true, null, false, null, null, null, null, null, null);
		
		chckbxDroit_3 = new Droit("Droit");
		
		chckbxFait_3 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_3, 6, 137, 64, 23, null, false, true, null, false, null, null, null, etudiant[5], null, chckbxFait_3);
		
		gestionChampsEtExceptions(chckbxFait_3, 74, 137, 59, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[5], null, chckbxDroit_3);
		
		lblCodageEnLpc = new JLabel("Codage en LPC");
		
		gestionChampsEtExceptions(lblCodageEnLpc, 175, 141, 98, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_4 = new Droit("Droit");
		
		chckbxFait_4 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_4, 6, 158, 64, 23, null, false, true, null, false, null, null, null, etudiant[6], null, chckbxFait_4);
		
		gestionChampsEtExceptions(chckbxFait_4, 74, 158, 59, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[6], null, chckbxDroit_4);
		
		lblLecturefrappeAuKilomtreaide = new JLabel("Lecture/Frappe au kilomètre/Aide à la recherche documentaire");
		
		gestionChampsEtExceptions(lblLecturefrappeAuKilomtreaide, 175, 162, 402, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		lblAidesTechniques = new JLabel("Aides techniques");
		
		gestionChampsEtExceptions(lblAidesTechniques, 142, 190, 115, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		rdbtnOui_1 = new OuiNon("Oui");
		rdbtnOui_1.setBounds(108, 206, 59, 23);
		add(rdbtnOui_1);
		
		gestionChampsEtExceptions(rdbtnOui_1, 108, 206, 59, 23, null, true, true, null, false, null, null, new AidesTechniquesListener(), etudiant[7], null, null);
		
		rdbtnNon_1 = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon_1, 214, 206, 59, 23, null, true, true, null, false, null, null, new AidesTechniquesListener(), etudiant[7], null, null);
		
		AidesTechniquesCours aidesTecheniquesCours = new AidesTechniquesCours();
		regrouperBoutons(aidesTecheniquesCours);
		
		chckbxDroit_5 = new DroitParticulier("Droit");
		
		chckbxFait_5 = new FaitSpecifiqueHandicapMoteur("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_5, 6, 229, 64, 23, null, false, true, null, false, null, null, null, etudiant[8], null, chckbxFait_5);
		
		gestionChampsEtExceptions(chckbxFait_5, 69, 229, 59, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[8], null, chckbxDroit_5);
		
		lblCarteDaccessibilitAux = new JLabel("Carte d'accessibilité aux locaux et ascenseurs");
		
		gestionChampsEtExceptions(lblCarteDaccessibilitAux, 140, 241, 300, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		lblRemiseLe = new JLabel("Remise le :");
		
		gestionChampsEtExceptions(lblRemiseLe, 453, 233, 75, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		textField = new JDateChooser();
		
		gestionChampsEtExceptions(textField, 529, 228, 130, 26, null, false, true, null, null, null, null, null, etudiant[9], null, null);
		
		chckbxDroit_6 = new Droit("Droit");
		
		chckbxFait_6 = new FaitSpecifiqueHandicapMoteur("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_6, 6, 253, 64, 23, null, false, true, null, false, null, null, null, etudiant[10], null, chckbxFait_6);
		
		gestionChampsEtExceptions(chckbxFait_6, 69, 253, 59, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[10], null, chckbxDroit_6);
		
		lblClsWcAccessibles = new JLabel("Clés WC accessibles");
		
		gestionChampsEtExceptions(lblClsWcAccessibles, 142, 261, 137, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		lblRemiseLe_1 = new JLabel("Remise le :");
		
		gestionChampsEtExceptions(lblRemiseLe_1, 306, 261, 75, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		textField_1 = new JDateChooser();
		
		gestionChampsEtExceptions(textField_1, 393, 256, 130, 26, null, false, true, null, null, null, null, null, etudiant[11], null, null);
		
		chckbxDroit_7 = new Droit("Droit");
		
		chckbxFait_7 = new Fait("Fait");
	
		gestionChampsEtExceptions(chckbxDroit_7, 6, 275, 64, 23, null, false, true, null, false, null, null, null, etudiant[12], null, chckbxFait_7);
		
		gestionChampsEtExceptions(chckbxFait_7, 69, 275, 64, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[12], null, chckbxDroit_7);
		
		lblNumrisations = new JLabel("Numérisations");
		
		gestionChampsEtExceptions(lblNumrisations, 142, 279, 98, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_8 = new Droit("Droit");
		
		chckbxFait_8 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_8, 6, 295, 64, 23, null, false, true, null, false, null, null, null, etudiant[13], null, chckbxFait_8);
		
		gestionChampsEtExceptions(chckbxFait_8, 69, 295, 64, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[13], null, chckbxDroit_8);
		
		lblTranscriptionsBraille = new JLabel("Transcriptions braille");
		
		gestionChampsEtExceptions(lblTranscriptionsBraille, 142, 299, 137, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_9 = new Droit("Droit");
		
		chckbxFait_9 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_9, 6, 310, 64, 23, null, false, true, null, false, null, null, null, etudiant[14], null, chckbxFait_9);
		
		gestionChampsEtExceptions(chckbxFait_9, 69, 310, 64, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[14], null, chckbxDroit_9);
		
		lblAgrandissements = new JLabel("Agrandissements");
		
		gestionChampsEtExceptions(lblAgrandissements, 142, 314, 115, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_10 = new Droit("Droit");
		
		chckbxFait_10 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_10, 6, 330, 64, 23, null, false, true, null, false, null, null, null, etudiant[15], null, chckbxFait_10);
		
		gestionChampsEtExceptions(chckbxFait_10, 69, 330, 59, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[15], null, chckbxDroit_10);
		
		lblPrtDeDictaphone = new JLabel("Prêt de dictaphone");
		
		gestionChampsEtExceptions(lblPrtDeDictaphone, 142, 334, 131, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_11 = new DroitParticulier("Droit");
		
		chckbxFait_11 = new Fait("Fait");
		
		textField_2 = new JTextField();
		
		gestionChampsEtExceptions(textField_2, 277, 344, 366, 26, Color.WHITE, false, true, false, null, null, null, null, etudiant[17], null, null);
		
		gestionChampsEtExceptions(chckbxDroit_11, 6, 345, 69, 23, null, false, true, null, false, null, null, new DroitListener(), etudiant[16], textField_2, chckbxFait_11);
		
		gestionChampsEtExceptions(chckbxFait_11, 69, 345, 64, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[16], textField_2, chckbxDroit_11);
		
		lblAutres = new JLabel("Autres");
		
		gestionChampsEtExceptions(lblAutres, 142, 349, 61, 16, null, false, true, null, null, null, null, null, null, textField_2, null);
		
		lblAmnagementsDeLa = new JLabel("Aménagements de la formation");
		
		gestionChampsEtExceptions(lblAmnagementsDeLa, 68, 382, 205, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		rdbtnOui_2 = new OuiNon("Oui");
		
		gestionChampsEtExceptions(rdbtnOui_2, 58, 410, 54, 23, null, true, true, null, false, null, null, new AmenagementsFormationListener(), etudiant[18], null, null);
		
		rdbtnNon_2 = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon_2, 181, 410, 59, 23, null, true, true, null, false, null, null, new AmenagementsFormationListener(), etudiant[18], null, null);
		
		AmenagementsFormation amenagementsFormation = new AmenagementsFormation();
		regrouperBoutons(amenagementsFormation);
		
		chckbxDroit_12 = new Droit("Droit");
		
		chckbxFait_12 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_12, 38, 445, 64, 23, null, false, true, null, false, null, null, null, etudiant[119], null, chckbxFait_12);
		
		gestionChampsEtExceptions(chckbxFait_12, 108, 445, 59, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[19], null, chckbxDroit_12);
		
		lblDispenseDassiduit = new JLabel("Dispense d'assiduité");
		
		gestionChampsEtExceptions(lblDispenseDassiduit, 175, 449, 137, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_13 = new Droit("Droit");
		
		chckbxFait_13 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_13, 38, 469, 75, 23, null, false, true, null, false, null, null, null, etudiant[20], null, chckbxDroit_13);
		
		gestionChampsEtExceptions(chckbxFait_13, 108, 469, 59, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[20], null, chckbxDroit_13);
		
		lblAmnagementDeLa = new JLabel("Aménagement de la durée de formation");
		
		gestionChampsEtExceptions(lblAmnagementDeLa, 175, 473, 261, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_14 = new Droit("Droit");
		
		chckbxFait_14 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_14, 39, 495, 64, 23, null, false, true, null, false, null, null, null, etudiant[21], null, chckbxFait_14);
		
		gestionChampsEtExceptions(chckbxFait_14, 108, 495, 59, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[21], null, chckbxDroit_14);
		
		lblAmnagementDesHoraires = new JLabel("Aménagement des horaires");
		
		gestionChampsEtExceptions(lblAmnagementDesHoraires, 175, 499, 178, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_15 = new Droit("Droit");
		
		chckbxFait_15 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_15, 39, 523, 64, 23, null, false, true, null, false, null, null, null, etudiant[22], null, chckbxFait_15);
		
		gestionChampsEtExceptions(chckbxFait_15, 108, 523, 59, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[22], null, chckbxDroit_15);
		
		lblDispenseDeStage = new JLabel("Dispense de stage");
		
		gestionChampsEtExceptions(lblDispenseDeStage, 175, 527, 122, 16, null, false, true, null, null, null, null, null, null, null, null);
	}

	@Override
	public void regrouperBoutons(ButtonGroup boutons) {
		// TODO Auto-generated method stub
		if(boutons instanceof AidesHumainesCours) {
			boutons.add(rdbtnOui);
			boutons.add(rdbtnNon);
		}
		else if(boutons instanceof AidesTechniquesCours) {
			boutons.add(rdbtnOui_1);
			boutons.add(rdbtnNon_1);
		}
		else if(boutons instanceof AmenagementsFormation) {
			boutons.add(rdbtnOui_2);
			boutons.add(rdbtnNon_2);
		}
	}

	@Override
	public void gererCasesCochesAmenagements(Droit droit, Fait fait) {
		if(fait.isSelected()) {
			droit.setSelected(true);
			droit.setEnabled(false);
			if(fait instanceof FaitSpecifiqueHandicapMoteur) {
				if(fait.equals(chckbxFait_5)) {
					lblRemiseLe.setVisible(true);
					textField.setVisible(true);
				}
				else if(fait.equals(chckbxFait_6)) {
					lblRemiseLe_1.setVisible(true);
					textField_1.setVisible(true);
				}
			}
		}
		else {
			droit.setEnabled(true);
			if(fait instanceof FaitSpecifiqueHandicapMoteur) {
				if(fait.equals(chckbxFait_5)) {
					lblRemiseLe.setVisible(false);
					textField.setVisible(false);
				}
				else if(fait.equals(chckbxFait_6)) {
					lblRemiseLe_1.setVisible(false);
					textField_1.setVisible(false);
				}
			}
		}
	}
}