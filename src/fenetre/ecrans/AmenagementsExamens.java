package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import data.LectureFichierCSV;
import data.LectureFichierTXT;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import fenetre.composants.AidesHumainesExamens;
import fenetre.composants.AidesTechniquesExamens;
import fenetre.composants.Droit;
import fenetre.composants.Fait;
import fenetre.composants.OuiNon;
import interfaces.GestionCasesCochesAmenagements;
import interfaces.GestionFichierCSV;
import interfaces.GestionFichierTXT;
import interfaces.GroupementBoutons;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class AmenagementsExamens extends AbstractJPanel implements GestionFichierCSV, GestionFichierTXT, GroupementBoutons, GestionCasesCochesAmenagements {

	private class ClicItemList implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			list.setSelectedIndex(UNDEFINED_CONDITION);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class SelectionMaterielPersonnel implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			ListSelectionModel lsm = (ListSelectionModel) e.getSource();	
		}
	}
	
	private class SelectionMaterielService implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			ListSelectionModel lsm = (ListSelectionModel) e.getSource();	
		}
	}
	
	private class AidesHumainesExamensListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnOui.isSelected()) {
				chckbxDroit.setVisible(true);
				chckbxFait.setVisible(true);
				lblSecrtaire.setVisible(true);
				chckbxDroit_1.setVisible(true);
				chckbxFait_1.setVisible(true);
				lblSurveillant.setVisible(true);
				chckbxDroit_2.setVisible(true);
				chckbxFait_2.setVisible(true);
				lblInterprteLsf.setVisible(true);
				chckbxDroit_3.setVisible(true);
				chckbxFait_3.setVisible(true);
				lblCodeurEnLpc.setVisible(true);
			}
			else {
				chckbxDroit.setVisible(false);
				chckbxDroit.setSelected(false);
				chckbxFait.setVisible(false);
				chckbxFait.setSelected(false);
				lblSecrtaire.setVisible(false);
				chckbxDroit_1.setVisible(false);
				chckbxDroit_1.setSelected(false);
				chckbxFait_1.setVisible(false);
				chckbxFait_1.setSelected(false);
				lblSurveillant.setVisible(false);
				chckbxDroit_2.setVisible(false);
				chckbxDroit_2.setSelected(false);
				chckbxFait_2.setVisible(false);
				chckbxFait_2.setSelected(false);
				lblInterprteLsf.setVisible(false);
				chckbxDroit_3.setVisible(false);
				chckbxDroit_3.setSelected(false);
				chckbxFait_3.setVisible(false);
				chckbxFait_3.setSelected(false);
				lblCodeurEnLpc.setVisible(false);
			}
		}
	}
	
	private class AidesTechniquesExamensListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnOui_1.isSelected()) {
				chckbxDroit_4.setVisible(true);
				chckbxFait_4.setVisible(true);
				lblTranscriptionBrailleDu.setVisible(true);
				chckbxDroit_5.setVisible(true);
				chckbxFait_5.setVisible(true);
				lblAgrandissementDuSujet.setVisible(true);
				chckbxDroit_6.setVisible(true);
				chckbxFait_6.setVisible(true);
				lblUtilisationDeMatriel.setVisible(true);
				chckbxDroit_7.setVisible(true);
				chckbxFait_7.setVisible(true);
				lblUtilisationDeMatriel_1.setVisible(true);
			}
			else {
				chckbxDroit_4.setVisible(false);
				chckbxDroit_4.setSelected(false);
				chckbxFait_4.setVisible(false);
				chckbxFait_4.setSelected(false);
				lblTranscriptionBrailleDu.setVisible(false);
				chckbxDroit_5.setVisible(false);
				chckbxDroit_5.setSelected(false);
				chckbxFait_5.setVisible(false);
				chckbxFait_5.setSelected(false);
				lblAgrandissementDuSujet.setVisible(false);
				chckbxDroit_6.setVisible(false);
				chckbxDroit_6.setSelected(false);
				chckbxFait_6.setVisible(false);
				chckbxFait_6.setSelected(false);
				lblUtilisationDeMatriel.setVisible(false);
				chckbxDroit_7.setVisible(false);
				chckbxDroit_7.setSelected(false);
				chckbxFait_7.setVisible(false);
				chckbxFait_7.setSelected(false);
				lblUtilisationDeMatriel_1.setVisible(false);
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
		}
	}
	
	private JLabel lblAidesHumaines;
	private JLabel lblSecrtaire;
	private JLabel lblSurveillant;
	private JLabel lblInterprteLsf;
	private JLabel lblCodeurEnLpc;
	private JLabel lblAidesTechniques;
	private JLabel lblTranscriptionBrailleDu;
	private JLabel lblAgrandissementDuSujet;
	private JLabel lblUtilisationDeMatriel;
	private JLabel lblUtilisationDeMatriel_1;
	private JLabel lblAutre;
	private JLabel lblTempsMajorPour;
	private JLabel lblTempsMajorPour_1;
	private JLabel lblTempsMajorPour_2;
	private JLabel lblSalleParticulire;
	private JLabel lblTempsDePause;
	private JLabel lblPossibilitDeSortir;
	
	private OuiNon rdbtnOui;
	private OuiNon rdbtnNon;
	private OuiNon rdbtnOui_1;
	private OuiNon rdbtnNon_1;
	
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
	
	private JList<String> list;
	private JList<String> list_1;
	
	private JScrollPane pane;
	private JScrollPane pane2;
	
	private boolean nouveau;
	
	private String numEtudiant;
	
	private final LectureFichierCSV fichierAmenagementsExamens = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/amenagements_examens.csv");
	
	private final LectureFichierTXT fichierMaterielPersonnel = new LectureFichierTXT("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/txt/materiel_personnel.txt");
	private final LectureFichierTXT fichierMaterielService = new LectureFichierTXT("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/txt/materiel_service.txt");
	
	/**
	 * Create the panel.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public AmenagementsExamens() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		
		setLayout(null);
		
		lblAidesHumaines = new JLabel("Aides humaines");
		
		gestionChampsEtExceptions(lblAidesHumaines, 98, 6, 111, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		rdbtnOui = new OuiNon("Oui");
		
		gestionChampsEtExceptions(rdbtnOui, 42, 22, 54, 23, null, true, true, null, false, null, null, new AidesHumainesExamensListener(), "", null, null, null);
		
		rdbtnNon = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon, 167, 22, 58, 23, null, true, true, null, false, null, null, new AidesHumainesExamensListener(), "", null, null, null);
		
		AidesHumainesExamens aidesHumainesExamens = new AidesHumainesExamens();
		regrouperBoutons(aidesHumainesExamens);
		
		chckbxDroit = new Droit("Droit");
		
		chckbxFait = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit, 6, 57, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait, null);
		
		gestionChampsEtExceptions(chckbxFait, 69, 57, 58, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit, null);
		
		lblSecrtaire = new JLabel("Secrétaire");
		
		gestionChampsEtExceptions(lblSecrtaire, 139, 61, 64, 16, null, false, true, null, null, null, null, null, null, null, null, null);
		
		chckbxDroit_1 = new Droit("Droit");
		
		chckbxFait_1 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_1, 6, 80, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_1, null);
		
		gestionChampsEtExceptions(chckbxFait_1, 69, 80, 58, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_1, null);
		
		lblSurveillant = new JLabel("Surveillant");
		
		gestionChampsEtExceptions(lblSurveillant, 139, 84, 77, 16, null, false, true, null, null, null, null, null, null, null, null, null);
		
		chckbxDroit_2 = new Droit("Droit");
		
		chckbxFait_2 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_2, 6, 101, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_2, null);
		
		gestionChampsEtExceptions(chckbxFait_2, 69, 101, 58, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_2, null);
		
		lblInterprteLsf = new JLabel("Interprète LSF");
		
		gestionChampsEtExceptions(lblInterprteLsf, 139, 105, 97, 16, null, false, true, null, null, null, null, null, null, null, null, null);
		
		chckbxDroit_3 = new Droit("Droit");
		
		chckbxFait_3 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_3, 6, 125, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_3, null);
		
		gestionChampsEtExceptions(chckbxFait_3, 69, 125, 64, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_3, null);
		
		lblCodeurEnLpc = new JLabel("Codeur en LPC");
		
		gestionChampsEtExceptions(lblCodeurEnLpc, 139, 129, 104, 16, null, false, true, null, null, null, null, null, null, null, null, null);
		
		lblAidesTechniques = new JLabel("Aides techniques");
		
		gestionChampsEtExceptions(lblAidesTechniques, 116, 160, 120, 16, null, true, true, null, false, null, null, null, null, null, null, null);
		
		rdbtnOui_1 = new OuiNon("Oui");
		
		gestionChampsEtExceptions(rdbtnOui_1, 84, 175, 54, 23, null, true, true, null, false, null, null, new AidesTechniquesExamensListener(), "", null, null, null);
		
		rdbtnNon_1 = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon_1, 189, 175, 58, 23, null, true, true, null, false, null, null, new AidesTechniquesExamensListener(), "", null, null, null);
		
		AidesTechniquesExamens aidesTechniquesExamens = new AidesTechniquesExamens();
		regrouperBoutons(aidesTechniquesExamens);
		
		chckbxDroit_4 = new Droit("Droit");
		
		chckbxFait_4 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_4, 6, 205, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_4, null);
		
		gestionChampsEtExceptions(chckbxFait_4, 69, 205, 58, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_4, null);
		
		lblTranscriptionBrailleDu = new JLabel("Transcription braille du sujet d'examen");
		
		gestionChampsEtExceptions(lblTranscriptionBrailleDu, 139, 209, 251, 16, null, false, true, null, null, null, null, null, null, null, null, null);
		
		chckbxDroit_5 = new Droit("Droit");
		
		chckbxFait_5 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_5, 6, 226, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_5, null);
		
		gestionChampsEtExceptions(chckbxFait_5, 69, 226, 58, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_5, null);
		
		lblAgrandissementDuSujet = new JLabel("Agrandissement du sujet (format papier ou support USB)");
		
		gestionChampsEtExceptions(lblAgrandissementDuSujet, 139, 230, 361, 16, null, false, true, null, false, null, null, null, null, null, null, null);
		
		chckbxDroit_6 = new Droit("Droit");
		
		chckbxFait_6 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_6, 6, 246, 64, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_6, null);
		
		gestionChampsEtExceptions(chckbxFait_6, 69, 246, 58, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_6, null);
		
		lblUtilisationDeMatriel = new JLabel("Utilisation de matériel personnel");
		
		gestionChampsEtExceptions(lblUtilisationDeMatriel, 139, 250, 218, 16, null, false, true, null, false, null, null, null, null, null, null, null);
		
		pane = new JScrollPane();
		
		gestionChampsEtExceptions(pane, 379, 246, 218, 50, null, false, true, null, null, null, null, null, null, null, null, null);
		
		list = new JList<String>();
		
		gestionChampsEtExceptions(list, 379, 246, 218, 50, null, false, true, null, null, null, null, new ClicItemList(), "", null, null, pane);
		
		gererInfosFichierTXT(fichierMaterielPersonnel);
		
		list.setSelectedIndex(0);
		
		chckbxDroit_7 = new Droit("Droit");
		
		chckbxFait_7 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_7, 6, 271, 69, 23, null, false, true, null, false, null, null, null, "", null, chckbxFait_7, null);
		
		gestionChampsEtExceptions(chckbxFait_7, 69, 271, 58, 23, null, false, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_7, null);
		
		lblUtilisationDeMatriel_1 = new JLabel("Utilisation de matériel mis à disposition par le service");
		
		gestionChampsEtExceptions(lblUtilisationDeMatriel_1, 139, 275, 344, 16, null, false, true, null, null, null, null, null, null, null, null, null);
		
		pane2 = new JScrollPane();
		
		gestionChampsEtExceptions(pane2, 528, 271, 214, 50, null, false, true, null, null, null, null, null, null, null, null, null);
		
		list_1 = new JList<String>();
		
		list_1.setSelectedIndex(0);
		
		gestionChampsEtExceptions(list_1, 528, 271, 214, 50, null, false, true, null, false, null, null, new ClicItemList(), "", null, null, pane2);
		
		gererInfosFichierTXT(fichierMaterielService);
		
		lblAutre = new JLabel("Autre :");
		
		gestionChampsEtExceptions(lblAutre, 149, 303, 48, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		chckbxDroit_8 = new Droit("Droit");
		
		chckbxFait_8 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_8, 6, 328, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_8, null);
		
		gestionChampsEtExceptions(chckbxFait_8, 69, 328, 58, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_8, null);
		
		lblTempsMajorPour = new JLabel("Temps majoré pour les épreuves écrites");
		
		gestionChampsEtExceptions(lblTempsMajorPour, 139, 332, 256, 16, null, true, true, null, false, null, null, null, null, null, null, null);
		
		chckbxDroit_9 = new Droit("Droit");
		
		chckbxFait_9 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_9, 5, 349, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_9, null);
		
		gestionChampsEtExceptions(chckbxFait_9, 69, 349, 58, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_9, null);
		
		lblTempsMajorPour_1 = new JLabel("Temps majoré pour les préparations d'épreuves orales");
		
		gestionChampsEtExceptions(lblTempsMajorPour_1, 139, 353, 344, 16, null, true, true, null, false, null, null, null, "", null, null, null);
		
		chckbxDroit_10 = new Droit("Droit");
		
		chckbxFait_10 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_10, 6, 373, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_10, null);
		
		gestionChampsEtExceptions(chckbxFait_10, 69, 373, 58, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_10, null);
		
		lblTempsMajorPour_2 = new JLabel("Temps majoré pour les épreuves pratiques (devoirs maison, dossiers, exposés...)");
		
		gestionChampsEtExceptions(lblTempsMajorPour_2, 139, 381, 513, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		chckbxDroit_11 = new Droit("Droit");
		
		chckbxFait_11 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_11, 6, 401, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_11, null);
		
		gestionChampsEtExceptions(chckbxFait_11, 69, 401, 58, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_11, null);
		
		lblSalleParticulire = new JLabel("Salle particulière");
		
		gestionChampsEtExceptions(lblSalleParticulire, 139, 405, 108, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		chckbxDroit_12 = new Droit("Droit");
		
		chckbxFait_12 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_12, 5, 423, 69, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_12, null);
		
		gestionChampsEtExceptions(chckbxFait_12, 69, 423, 58, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_12, null);
		
		lblTempsDePause = new JLabel("Temps de pause");
		
		gestionChampsEtExceptions(lblTempsDePause, 139, 427, 111, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		chckbxDroit_13 = new Droit("Droit");
		
		chckbxFait_13 = new Fait("Fait");
		
		gestionChampsEtExceptions(chckbxDroit_13, 5, 447, 64, 23, null, true, true, null, false, null, null, null, "", null, chckbxFait_13, null);
		
		gestionChampsEtExceptions(chckbxFait_13, 69, 447, 58, 23, null, true, true, null, false, null, null, new FaitListener(), "", null, chckbxDroit_13, null);
		
		lblPossibilitDeSortir = new JLabel("Possibilité de sortir de la salle pendant l'examen");
		
		gestionChampsEtExceptions(lblPossibilitDeSortir, 139, 451, 310, 16, null, true, true, null, null, null, null, null, null, null, null, null);
	}

	public AmenagementsExamens(String utilisateur) throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=false;
		this.numEtudiant=utilisateur;
		gererInfosFichierCSV(fichierAmenagementsExamens);
	}

	@Override
	public void gererInfosFichierTXT(LectureFichierTXT lectureFichier) {
		
		ArrayList<String> materiel = lectureFichier.chargerFichier();
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		
		for(int i=0;i<materiel.size();i++) {
			listModel.addElement(materiel.get(i));
		}
		if(lectureFichier.equals(fichierMaterielPersonnel)) {
			list.setModel(listModel);
		}
		else if(lectureFichier.equals(fichierMaterielService)) {
			list_1.setModel(listModel);
		}
	}
	
	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier)
			throws LongueurDifferenteListesException, NullArgumentException {
			
			ArrayList<String[]> etudiants = fichierAmenagementsExamens.chargerFichier();
			String[] etudiant = fichierAmenagementsExamens.retournerInfosEtudiant(etudiants, this.numEtudiant);
			
			setLayout(null);
			
			lblAidesHumaines = new JLabel("Aides humaines");
			
			rdbtnOui = new OuiNon("Oui");
			
			rdbtnNon = new OuiNon("Non");
			
			AidesHumainesExamens aidesHumainesExamens = new AidesHumainesExamens();
			regrouperBoutons(aidesHumainesExamens);
			
			chckbxDroit = new Droit("Droit");
			
			chckbxFait = new Fait("Fait");
			
			lblSecrtaire = new JLabel("Secrétaire");
			
			chckbxDroit_1 = new Droit("Droit");
			
			chckbxFait_1 = new Fait("Fait");
			
			lblSurveillant = new JLabel("Surveillant");
			
			chckbxDroit_2 = new Droit("Droit");
			
			chckbxFait_2 = new Fait("Fait");
			
			lblInterprteLsf = new JLabel("Interprète LSF");
			
			chckbxDroit_3 = new Droit("Droit");
			
			chckbxFait_3 = new Fait("Fait");
			
			lblCodeurEnLpc = new JLabel("Codeur en LPC");
			
			lblAidesTechniques = new JLabel("Aides techniques");
			
			rdbtnOui_1 = new OuiNon("Oui");
			
			rdbtnNon_1 = new OuiNon("Non");
			
			AidesTechniquesExamens aidesTechniquesExamens = new AidesTechniquesExamens();
			regrouperBoutons(aidesTechniquesExamens);
			
			chckbxDroit_4 = new Droit("Droit");
			
			chckbxFait_4 = new Fait("Fait");
			
			lblTranscriptionBrailleDu = new JLabel("Transcription braille du sujet d'examen");
			
			chckbxDroit_5 = new Droit("Droit");
			
			chckbxFait_5 = new Fait("Fait");
			
			lblAgrandissementDuSujet = new JLabel("Agrandissement du sujet (format papier ou support USB)");
			
			chckbxDroit_6 = new Droit("Droit");
			
			chckbxFait_6 = new Fait("Fait");
			
			lblUtilisationDeMatriel = new JLabel("Utilisation de matériel personnel");
			
			pane = new JScrollPane();
			
			list = new JList<String>();
			
			chckbxDroit_7 = new Droit("Droit");
			
			chckbxFait_7 = new Fait("Fait");
			
			lblUtilisationDeMatriel_1 = new JLabel("Utilisation de matériel mis à disposition par le service");
			
			pane2 = new JScrollPane();
			
			list_1 = new JList<String>();
			
			lblAutre = new JLabel("Autre :");
			
			chckbxDroit_8 = new Droit("Droit");
			
			chckbxFait_8 = new Fait("Fait");
			
			lblTempsMajorPour = new JLabel("Temps majoré pour les épreuves écrites");
			
			chckbxDroit_9 = new Droit("Droit");
			
			chckbxFait_9 = new Fait("Fait");
			
			lblTempsMajorPour_1 = new JLabel("Temps majoré pour les préparations d'épreuves orales");
			
			chckbxDroit_10 = new Droit("Droit");
			
			chckbxFait_10 = new Fait("Fait");
			
			lblTempsMajorPour_2 = new JLabel("Temps majoré pour les épreuves pratiques (devoirs maison, dossiers, exposés...)");
			
			chckbxDroit_11 = new Droit("Droit");
			
			chckbxFait_11 = new Fait("Fait");
			
			lblSalleParticulire = new JLabel("Salle particulière");
			
			chckbxDroit_12 = new Droit("Droit");
			
			chckbxFait_12 = new Fait("Fait");
			
			lblTempsDePause = new JLabel("Temps de pause");
			
			chckbxDroit_13 = new Droit("Droit");
			
			chckbxFait_13 = new Fait("Fait");
			
			lblPossibilitDeSortir = new JLabel("Possibilité de sortir de la salle pendant l'examen");
			
			gestionChampsEtExceptions(chckbxDroit, 6, 57, 64, 23, null, false, true, null, false, null, null, null, etudiant[2], null, chckbxFait, null);
			
			gestionChampsEtExceptions(chckbxFait, 69, 57, 58, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[2], null, chckbxDroit, null);
			
			gestionChampsEtExceptions(lblSecrtaire, 139, 61, 64, 16, null, false, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_1, 6, 80, 64, 23, null, false, true, null, false, null, null, null, etudiant[3], null, chckbxFait_1, null);
			
			gestionChampsEtExceptions(chckbxFait_1, 69, 80, 58, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[3], null, chckbxDroit_1, null);
			
			gestionChampsEtExceptions(lblSurveillant, 139, 84, 77, 16, null, false, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_2, 6, 101, 64, 23, null, false, true, null, false, null, null, null, etudiant[4], null, chckbxFait_2, null);
			
			gestionChampsEtExceptions(chckbxFait_2, 69, 101, 58, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[4], null, chckbxDroit_2, null);
			
			gestionChampsEtExceptions(lblInterprteLsf, 139, 105, 97, 16, null, false, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_3, 6, 125, 64, 23, null, false, true, null, false, null, null, null, etudiant[5], null, chckbxFait_3, null);
			
			gestionChampsEtExceptions(chckbxFait_3, 69, 125, 64, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[5], null, chckbxDroit_3, null);
			
			gestionChampsEtExceptions(lblCodeurEnLpc, 139, 129, 104, 16, null, false, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(lblAidesHumaines, 98, 6, 111, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(rdbtnOui, 42, 22, 54, 23, null, true, true, null, false, null, null, new AidesHumainesExamensListener(), etudiant[1], null, null, null);
			
			gestionChampsEtExceptions(rdbtnNon, 167, 22, 58, 23, null, true, true, null, false, null, null, new AidesHumainesExamensListener(), etudiant[1], null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_4, 6, 205, 64, 23, null, false, true, null, false, null, null, null, etudiant[7], null, chckbxFait_4, null);
			
			gestionChampsEtExceptions(chckbxFait_4, 69, 205, 58, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[7], null, chckbxDroit_4, null);
			
			gestionChampsEtExceptions(lblTranscriptionBrailleDu, 139, 209, 251, 16, null, false, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_5, 6, 226, 64, 23, null, false, true, null, false, null, null, null, etudiant[8], null, chckbxFait_5, null);
			
			gestionChampsEtExceptions(chckbxFait_5, 69, 226, 58, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[8], null, chckbxDroit_5, null);
			
			gestionChampsEtExceptions(lblAgrandissementDuSujet, 139, 230, 361, 16, null, false, true, null, false, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_6, 6, 246, 64, 23, null, false, true, null, false, null, null, null, etudiant[9], null, chckbxFait_6, null);
			
			gestionChampsEtExceptions(chckbxFait_6, 69, 246, 58, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[9], null, chckbxDroit_6, null);
			
			gestionChampsEtExceptions(lblUtilisationDeMatriel, 139, 250, 218, 16, null, false, true, null, false, null, null, null, null, null, null, null);
			
			pane = new JScrollPane();
			
			gestionChampsEtExceptions(pane, 379, 246, 218, 50, null, false, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(list, 379, 246, 218, 50, null, false, true, null, null, null, null, null, etudiant[10], null, chckbxFait_6, pane);
			
			gererInfosFichierTXT(fichierMaterielPersonnel);
			
			gestionChampsEtExceptions(chckbxDroit_7, 6, 271, 69, 23, null, false, true, null, false, null, null, null, etudiant[10], null, chckbxFait_7, null);
			
			gestionChampsEtExceptions(chckbxFait_7, 69, 271, 58, 23, null, false, true, null, false, null, null, new FaitListener(), etudiant[10], null, chckbxDroit_7, null);
			
			gestionChampsEtExceptions(lblUtilisationDeMatriel_1, 139, 275, 344, 16, null, false, true, null, null, null, null, null, null, null, null, null);
			
			pane2 = new JScrollPane();
			
			gestionChampsEtExceptions(pane2, 528, 271, 214, 50, null, false, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(list_1, 528, 271, 214, 50, null, false, true, null, false, null, null, null, etudiant[11], null, chckbxFait_7, pane2);
			
			gererInfosFichierTXT(fichierMaterielService);
			
			gestionChampsEtExceptions(rdbtnOui_1, 84, 175, 54, 23, null, true, true, null, false, null, null, new AidesTechniquesExamensListener(), etudiant[6], null, null, null);
			
			gestionChampsEtExceptions(rdbtnNon_1, 189, 175, 58, 23, null, true, true, null, false, null, null, new AidesTechniquesExamensListener(), etudiant[6], null, null, null);
			
			gestionChampsEtExceptions(lblAidesTechniques, 116, 160, 120, 16, null, true, true, null, false, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(lblAutre, 149, 303, 48, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_8, 6, 328, 64, 23, null, true, true, null, false, null, null, null, etudiant[12], null, chckbxFait_8, null);
			
			gestionChampsEtExceptions(chckbxFait_8, 69, 328, 58, 23, null, true, true, null, false, null, null, new FaitListener(), etudiant[12], null, chckbxDroit_8, null);
			
			gestionChampsEtExceptions(lblTempsMajorPour, 139, 332, 256, 16, null, true, true, null, false, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_9, 5, 349, 64, 23, null, true, true, null, false, null, null, null, etudiant[13], null, chckbxFait_9, null);
			
			gestionChampsEtExceptions(chckbxFait_9, 69, 349, 58, 23, null, true, true, null, false, null, null, new FaitListener(), etudiant[13], null, chckbxDroit_9, null);
			
			gestionChampsEtExceptions(lblTempsMajorPour_1, 139, 353, 344, 16, null, true, true, null, false, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_10, 6, 373, 64, 23, null, true, true, null, false, null, null, null, etudiant[14], null, chckbxFait_10, null);
			
			gestionChampsEtExceptions(chckbxFait_10, 69, 373, 58, 23, null, true, true, null, false, null, null, new FaitListener(), etudiant[14], null, chckbxDroit_10, null);
			
			gestionChampsEtExceptions(lblTempsMajorPour_2, 139, 381, 513, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_11, 6, 401, 64, 23, null, true, true, null, false, null, null, null, etudiant[15], null, chckbxFait_11, null);
			
			gestionChampsEtExceptions(chckbxFait_11, 69, 401, 58, 23, null, true, true, null, false, null, null, new FaitListener(), etudiant[15], null, chckbxDroit_11, null);
			
			gestionChampsEtExceptions(lblSalleParticulire, 139, 405, 108, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_12, 5, 423, 69, 23, null, true, true, null, false, null, null, null, etudiant[16], null, chckbxFait_12, null);
			
			gestionChampsEtExceptions(chckbxFait_12, 69, 423, 58, 23, null, true, true, null, false, null, null, new FaitListener(), etudiant[6], null, chckbxDroit_12, null);
			
			gestionChampsEtExceptions(lblTempsDePause, 139, 427, 111, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(chckbxDroit_13, 5, 447, 64, 23, null, true, true, null, false, null, null, null, etudiant[17], null, chckbxFait_13, null);
			
			gestionChampsEtExceptions(chckbxFait_13, 69, 447, 58, 23, null, true, true, null, false, null, null, new FaitListener(), etudiant[17], null, chckbxDroit_13, null);
			
			gestionChampsEtExceptions(lblPossibilitDeSortir, 139, 451, 310, 16, null, true, true, null, null, null, null, null, null, null, null, null);
	}

	@Override
	public void regrouperBoutons(ButtonGroup boutons) {
		if(boutons instanceof AidesHumainesExamens) {
			boutons.add(rdbtnOui);
			boutons.add(rdbtnNon);
		}
		else if(boutons instanceof AidesTechniquesExamens) {
			boutons.add(rdbtnOui_1);
			boutons.add(rdbtnNon_1);
		}
	}

	@Override
	public void gererCasesCochesAmenagements(Droit droit, Fait fait) {
		if(fait.isSelected()) {
			droit.setSelected(true);
			droit.setEnabled(false);
			if(fait.equals(chckbxFait_6)) {
				pane.setVisible(true);
			}
			else if(fait.equals(chckbxFait_7)) {
				pane2.setVisible(true);
			}
		}
		else {
			droit.setEnabled(true);
			if(fait.equals(chckbxFait_6)) {
				pane.setVisible(false);
			}
			else if(fait.equals(chckbxFait_7)) {
				pane2.setVisible(false);
			}
		}
	}
}