package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.Color;
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
import fenetre.composants.Fait;
import fenetre.composants.OuiNon;
import interfaces.GestionFichierCSV;
import interfaces.GroupementBoutons;

public class AmenagementsCours extends AbstractJPanel implements GestionFichierCSV, GroupementBoutons {
	
	private class AmenagementsFormationListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
		}
	}
	
	private class DroitListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
		}
	}

	private class AidesTechniquesListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
		}
	}

	private class FaitListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
		}
	}

	private class AidesHumainesListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
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
	private Droit chckbxDroit_11;
	private Droit chckbxDroit_12;
	private Droit chckbxDroit_13;
	private Droit chckbxDroit_14;
	private Droit chckbxDroit_15;
	
	private Fait chckbxFait;
	private Fait chckbxFait_1;
	private Fait chckbxFait_2;
	private Fait chckbxFait_3;
	private Fait chckbxFait_4;
	private Fait chckbxFait_5;
	private Fait chckbxFait_6;
	private Fait chckbxFait_7;
	private Fait chckbxFait_8;
	private Fait chckbxFait_9;
	private Fait chckbxFait_10;
	private Fait chckbxFait_11;
	private Fait chckbxFait_12;
	private Fait chckbxFait_13;
	private Fait chckbxFait_14;
	private Fait chckbxFait_15;

	/**
	 * Create the panel.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public AmenagementsCours() throws LongueurDifferenteListesException, NullArgumentException {
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
		
		gestionChampsEtExceptions(chckbxDroit, 6, 69, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait);
		
		gestionChampsEtExceptions(chckbxFait, 74, 69, 64, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit);
		
		lblPriseDeNotes = new JLabel("Prise de notes");
		
		gestionChampsEtExceptions(lblPriseDeNotes, 175, 76, 98, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_1 = new Droit("Droit");
		
		chckbxFait_1 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_1, 6, 91, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_1);
		
		gestionChampsEtExceptions(chckbxFait_1, 74, 91, 64, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_1);
		
		lblTutoratDaccompagnement = new JLabel("Tutorat d'accompagnement (soutien pédagogique)");
		
		gestionChampsEtExceptions(lblTutoratDaccompagnement, 175, 95, 326, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_2 = new Droit("Droit");
		
		chckbxFait_2 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_2, 6, 113, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_2);
		
		gestionChampsEtExceptions(chckbxFait_2, 74, 113, 64, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_2);
		
		lblInterprtationEnLsf = new JLabel("Interprétation en LSF");
		
		gestionChampsEtExceptions(lblInterprtationEnLsf, 175, 117, 137, 16, null, true, true, null, false, null, null, null, null, null, null);
		
		chckbxDroit_3 = new Droit("Droit");
		
		chckbxFait_3 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_3, 6, 137, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_3);
		
		gestionChampsEtExceptions(chckbxFait_3, 74, 137, 59, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_3);
		
		lblCodageEnLpc = new JLabel("Codage en LPC");
		
		gestionChampsEtExceptions(lblCodageEnLpc, 175, 141, 98, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_4 = new Droit("Droit");
		
		chckbxFait_4 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_4, 6, 158, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_4);
		
		gestionChampsEtExceptions(chckbxFait_4, 74, 158, 59, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_4);
		
		lblLecturefrappeAuKilomtreaide = new JLabel("Lecture/Frappe au kilomètre/Aide à la recherche documentaire");
		
		gestionChampsEtExceptions(lblLecturefrappeAuKilomtreaide, 175, 162, 402, 16, null, true, true, null, null, null, null, null, null, null, null);
		
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
		
		chckbxFait_5 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_5, 6, 229, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_5);
		
		gestionChampsEtExceptions(chckbxFait_5, 69, 229, 59, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_5);
		
		lblCarteDaccessibilitAux = new JLabel("Carte d'accessibilité aux locaux et ascenseurs");
		
		gestionChampsEtExceptions(lblCarteDaccessibilitAux, 140, 241, 300, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		lblRemiseLe = new JLabel("Remise le :");
		
		gestionChampsEtExceptions(lblRemiseLe, 453, 233, 75, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		textField = new JDateChooser();
		
		gestionChampsEtExceptions(textField, 529, 228, 130, 26, null, false, true, null, null, null, null, null, "", null, null);
		
		chckbxDroit_6 = new Droit("Droit");
		
		chckbxFait_6 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_6, 6, 253, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_6);
		
		gestionChampsEtExceptions(chckbxFait_6, 69, 253, 59, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_6);
		
		lblClsWcAccessibles = new JLabel("Clés WC accessibles");
		
		gestionChampsEtExceptions(lblClsWcAccessibles, 142, 261, 137, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		lblRemiseLe_1 = new JLabel("Remise le :");
		
		gestionChampsEtExceptions(lblRemiseLe_1, 306, 261, 75, 16, null, false, true, null, null, null, null, null, null, null, null);
		
		textField_1 = new JDateChooser();
		
		gestionChampsEtExceptions(textField_1, 393, 256, 130, 26, null, false, true, null, null, null, null, null, "", null, null);
		
		chckbxDroit_7 = new Droit("Droit");
		
		chckbxFait_7 = new Fait("Fait");
	
		gestionChampsEtExceptions(chckbxDroit_7, 6, 275, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_7);
		
		gestionChampsEtExceptions(chckbxFait_7, 69, 275, 64, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_7);
		
		lblNumrisations = new JLabel("Numérisations");
		
		gestionChampsEtExceptions(lblNumrisations, 142, 279, 98, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_8 = new Droit("Droit");
		
		chckbxFait_8 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_8, 6, 295, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_8);
		
		gestionChampsEtExceptions(chckbxFait_8, 69, 295, 64, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_8);
		
		lblTranscriptionsBraille = new JLabel("Transcriptions braille");
		
		gestionChampsEtExceptions(lblTranscriptionsBraille, 142, 299, 137, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_9 = new Droit("Droit");
		
		chckbxFait_9 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_9, 6, 310, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_9);
		
		gestionChampsEtExceptions(chckbxFait_9, 69, 310, 64, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_9);
		
		lblAgrandissements = new JLabel("Agrandissements");
		
		gestionChampsEtExceptions(lblAgrandissements, 142, 314, 115, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_10 = new Droit("Droit");
		
		chckbxFait_10 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_10, 6, 330, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_10);
		
		gestionChampsEtExceptions(chckbxFait_10, 69, 330, 59, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_10);
		
		lblPrtDeDictaphone = new JLabel("Prêt de dictaphone");
		
		gestionChampsEtExceptions(lblPrtDeDictaphone, 142, 334, 131, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_11 = new Droit("Droit");
		
		chckbxFait_11 = new Fait("Fait");
		
		textField_2 = new JTextField();
		
		gestionChampsEtExceptions(textField_2, 277, 344, 366, 26, Color.WHITE, true, true, false, null, null, null, null, "", null, null);
		
		gestionChampsEtExceptions(chckbxDroit_11, 6, 345, 69, 23, null, true, true, null, false, null, null, new DroitListener(), "", textField_2, chckbxFait_11);
		
		gestionChampsEtExceptions(chckbxFait_11, 69, 345, 64, 23, null, true, true, null, false, null, null, new FaitListener(), "", textField_2, chckbxDroit_11);
		
		lblAutres = new JLabel("Autres");
		
		gestionChampsEtExceptions(lblAutres, 142, 349, 61, 16, null, true, true, null, null, null, null, null, null, textField_2, null);
		
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
		
		gestionChampsEtExceptions(chckbxDroit_12, 38, 445, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_12);
		
		gestionChampsEtExceptions(chckbxFait_12, 108, 445, 59, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_12);
		
		lblDispenseDassiduit = new JLabel("Dispense d'assiduité");
		
		gestionChampsEtExceptions(lblDispenseDassiduit, 175, 449, 137, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_13 = new Droit("Droit");
		
		chckbxFait_13 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_13, 38, 469, 75, 23, null, true, true, null, false, null, null, null, "", null, chckbxDroit_13);
		
		gestionChampsEtExceptions(chckbxFait_13, 108, 469, 59, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_13);
		
		lblAmnagementDeLa = new JLabel("Aménagement de la durée de formation");
		
		gestionChampsEtExceptions(lblAmnagementDeLa, 175, 473, 261, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_14 = new Droit("Droit");
		
		chckbxFait_14 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_14, 39, 495, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_14);
		
		gestionChampsEtExceptions(chckbxFait_14, 108, 495, 59, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_14);
		
		lblAmnagementDesHoraires = new JLabel("Aménagement des horaires");
		
		gestionChampsEtExceptions(lblAmnagementDesHoraires, 175, 499, 178, 16, null, true, true, null, null, null, null, null, null, null, null);
		
		chckbxDroit_15 = new Droit("Droit");
		
		chckbxFait_15 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_15, 39, 523, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_15);
		
		gestionChampsEtExceptions(chckbxFait_15, 108, 523, 59, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_15);
		
		lblDispenseDeStage = new JLabel("Dispense de stage");
		
		gestionChampsEtExceptions(lblDispenseDeStage, 175, 527, 122, 16, null, true, true, null, null, null, null, null, null, null, null);

	}

	public AmenagementsCours(String utilisateur) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier)
			throws LongueurDifferenteListesException, NullArgumentException {
		// TODO Auto-generated method stub
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
}