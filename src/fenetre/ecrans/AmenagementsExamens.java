package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import data.LectureFichierCSV;
import data.LectureFichierTXT;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import fenetre.composants.Droit;
import fenetre.composants.Fait;
import interfaces.GestionCasesCochesAmenagements;
import interfaces.GestionFichierCSV;
import interfaces.GestionFichierTXT;
import interfaces.GroupementBoutons;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class AmenagementsExamens extends AbstractJPanel implements GestionFichierCSV, GestionFichierTXT, GroupementBoutons, GestionCasesCochesAmenagements {

	/**
	 * Create the panel.
	 */
	public AmenagementsExamens() {
		setLayout(null);
		
		JLabel lblAidesHumaines = new JLabel("Aides humaines");
		lblAidesHumaines.setBounds(98, 6, 111, 16);
		add(lblAidesHumaines);
		
		JRadioButton rdbtnOui = new JRadioButton("Oui");
		rdbtnOui.setBounds(42, 22, 54, 23);
		add(rdbtnOui);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setBounds(167, 22, 58, 23);
		add(rdbtnNon);
		
		JCheckBox chckbxDroit = new JCheckBox("Droit");
		chckbxDroit.setBounds(6, 57, 64, 23);
		add(chckbxDroit);
		
		JCheckBox chckbxFait = new JCheckBox("Fait");
		chckbxFait.setBounds(69, 57, 58, 23);
		add(chckbxFait);
		
		JLabel lblSecrtaire = new JLabel("Secrétaire");
		lblSecrtaire.setBounds(139, 61, 64, 16);
		add(lblSecrtaire);
		
		JCheckBox chckbxDroit_1 = new JCheckBox("Droit");
		chckbxDroit_1.setBounds(6, 80, 64, 23);
		add(chckbxDroit_1);
		
		JCheckBox chckbxFait_1 = new JCheckBox("Fait");
		chckbxFait_1.setBounds(69, 80, 58, 23);
		add(chckbxFait_1);
		
		JLabel lblSurveillant = new JLabel("Surveillant");
		lblSurveillant.setBounds(139, 84, 77, 16);
		add(lblSurveillant);
		
		JCheckBox chckbxDroit_2 = new JCheckBox("Droit");
		chckbxDroit_2.setBounds(6, 101, 64, 23);
		add(chckbxDroit_2);
		
		JCheckBox chckbxFait_2 = new JCheckBox("Fait");
		chckbxFait_2.setBounds(69, 101, 58, 23);
		add(chckbxFait_2);
		
		JLabel lblInterprteLsf = new JLabel("Interprète LSF");
		lblInterprteLsf.setBounds(139, 105, 97, 16);
		add(lblInterprteLsf);
		
		JCheckBox chckbxDroit_3 = new JCheckBox("Droit");
		chckbxDroit_3.setBounds(6, 125, 64, 23);
		add(chckbxDroit_3);
		
		JCheckBox chckbxFait_3 = new JCheckBox("Fait");
		chckbxFait_3.setBounds(69, 125, 64, 23);
		add(chckbxFait_3);
		
		JLabel lblCodeurEnLpc = new JLabel("Codeur en LPC");
		lblCodeurEnLpc.setBounds(139, 129, 104, 16);
		add(lblCodeurEnLpc);
		
		JLabel lblAidesTechniques = new JLabel("Aides techniques");
		lblAidesTechniques.setBounds(116, 160, 120, 16);
		add(lblAidesTechniques);
		
		JRadioButton rdbtnOui_1 = new JRadioButton("Oui");
		rdbtnOui_1.setBounds(84, 175, 54, 23);
		add(rdbtnOui_1);
		
		JRadioButton rdbtnNon_1 = new JRadioButton("Non");
		rdbtnNon_1.setBounds(189, 175, 58, 23);
		add(rdbtnNon_1);
		
		JCheckBox chckbxDroit_4 = new JCheckBox("Droit");
		chckbxDroit_4.setBounds(6, 205, 64, 23);
		add(chckbxDroit_4);
		
		JCheckBox chckbxFait_4 = new JCheckBox("Fait");
		chckbxFait_4.setBounds(69, 205, 58, 23);
		add(chckbxFait_4);
		
		JLabel lblTranscriptionBrailleDu = new JLabel("Transcription braille du sujet d'examen");
		lblTranscriptionBrailleDu.setBounds(139, 209, 251, 16);
		add(lblTranscriptionBrailleDu);
		
		JCheckBox chckbxDroit_5 = new JCheckBox("Droit");
		chckbxDroit_5.setBounds(6, 226, 64, 23);
		add(chckbxDroit_5);
		
		JCheckBox chckbxFait_5 = new JCheckBox("Fait");
		chckbxFait_5.setBounds(69, 226, 58, 23);
		add(chckbxFait_5);
		
		JLabel lblAgrandissementDuSujet = new JLabel("Agrandissement du sujet (format papier ou support USB)");
		lblAgrandissementDuSujet.setBounds(139, 230, 361, 16);
		add(lblAgrandissementDuSujet);
		
		JCheckBox chckbxDroit_6 = new JCheckBox("Droit");
		chckbxDroit_6.setBounds(6, 246, 64, 23);
		add(chckbxDroit_6);
		
		JCheckBox chckbxFait_6 = new JCheckBox("Fait");
		chckbxFait_6.setBounds(69, 246, 58, 23);
		add(chckbxFait_6);
		
		JLabel lblUtilisationDeMatriel = new JLabel("Utilisation de matériel personnel");
		lblUtilisationDeMatriel.setBounds(139, 250, 218, 16);
		add(lblUtilisationDeMatriel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(379, 246, 218, 27);
		add(comboBox);
		
		JCheckBox chckbxDroit_7 = new JCheckBox("Droit");
		chckbxDroit_7.setBounds(6, 271, 69, 23);
		add(chckbxDroit_7);
		
		JCheckBox chckbxFait_7 = new JCheckBox("Fait");
		chckbxFait_7.setBounds(69, 271, 58, 23);
		add(chckbxFait_7);
		
		JLabel lblUtilisationDeMatriel_1 = new JLabel("Utilisation de matériel mis à disposition par le service");
		lblUtilisationDeMatriel_1.setBounds(139, 275, 344, 16);
		add(lblUtilisationDeMatriel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(528, 271, 214, 27);
		add(comboBox_1);
		
		JLabel lblAutre = new JLabel("Autre :");
		lblAutre.setBounds(149, 303, 48, 16);
		add(lblAutre);
		
		JCheckBox chckbxDroit_8 = new JCheckBox("Droit");
		chckbxDroit_8.setBounds(6, 328, 64, 23);
		add(chckbxDroit_8);
		
		JCheckBox chckbxFait_8 = new JCheckBox("Fait");
		chckbxFait_8.setBounds(69, 328, 58, 23);
		add(chckbxFait_8);
		
		JLabel lblTempsMajorPour = new JLabel("Temps majoré pour les épreuves écrites");
		lblTempsMajorPour.setBounds(139, 332, 256, 16);
		add(lblTempsMajorPour);
		
		JCheckBox chckbxDroit_9 = new JCheckBox("Droit");
		chckbxDroit_9.setBounds(5, 349, 64, 23);
		add(chckbxDroit_9);
		
		JCheckBox chckbxFait_9 = new JCheckBox("Fait");
		chckbxFait_9.setBounds(69, 349, 58, 23);
		add(chckbxFait_9);
		
		JLabel lblTempsMajorPour_1 = new JLabel("Temps majoré pour les préparations d'épreuves orales");
		lblTempsMajorPour_1.setBounds(139, 353, 344, 16);
		add(lblTempsMajorPour_1);
		
		JCheckBox chckbxDroit_10 = new JCheckBox("Droit");
		chckbxDroit_10.setBounds(6, 373, 64, 23);
		add(chckbxDroit_10);
		
		JCheckBox chckbxFait_10 = new JCheckBox("Fait");
		chckbxFait_10.setBounds(69, 373, 58, 23);
		add(chckbxFait_10);
		
		JLabel lblTempsMajorPour_2 = new JLabel("Temps majoré pour les épreuves pratiques (devoirs maison, dossiers, exposés...)");
		lblTempsMajorPour_2.setBounds(139, 381, 513, 16);
		add(lblTempsMajorPour_2);
		
		JCheckBox chckbxDroit_11 = new JCheckBox("Droit");
		chckbxDroit_11.setBounds(6, 401, 64, 23);
		add(chckbxDroit_11);
		
		JCheckBox chckbxFait_11 = new JCheckBox("Fait");
		chckbxFait_11.setBounds(69, 401, 58, 23);
		add(chckbxFait_11);
		
		JLabel lblSalleParticulire = new JLabel("Salle particulière");
		lblSalleParticulire.setBounds(139, 405, 108, 16);
		add(lblSalleParticulire);
		
		JCheckBox chckbxDroit_12 = new JCheckBox("Droit");
		chckbxDroit_12.setBounds(5, 423, 69, 23);
		add(chckbxDroit_12);
		
		JCheckBox chckbxFait_12 = new JCheckBox("Fait");
		chckbxFait_12.setBounds(69, 423, 58, 23);
		add(chckbxFait_12);
		
		JLabel lblTempsDePause = new JLabel("Temps de pause");
		lblTempsDePause.setBounds(139, 427, 111, 16);
		add(lblTempsDePause);
		
		JCheckBox chckbxDroit_13 = new JCheckBox("Droit");
		chckbxDroit_13.setBounds(5, 447, 64, 23);
		add(chckbxDroit_13);
		
		JCheckBox chckbxFait_13 = new JCheckBox("Fait");
		chckbxFait_13.setBounds(69, 447, 58, 23);
		add(chckbxFait_13);
		
		JLabel lblPossibilitDeSortir = new JLabel("Possibilité de sortir de la salle pendant l'examen");
		lblPossibilitDeSortir.setBounds(139, 451, 310, 16);
		add(lblPossibilitDeSortir);

	}

	public AmenagementsExamens(String utilisateur) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gererInfosFichierTXT(LectureFichierTXT lectureFichier) {
		// TODO Auto-generated method stub
	}

	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier)
			throws LongueurDifferenteListesException, NullArgumentException {
		// TODO Auto-generated method stub
	}

	@Override
	public void regrouperBoutons(ButtonGroup boutons) {
		// TODO Auto-generated method stub
	}

	@Override
	public void gererCasesCochesAmenagements(Droit droit, Fait fait) {
		// TODO Auto-generated method stub
		
	}
}