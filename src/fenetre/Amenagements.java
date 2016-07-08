package fenetre;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class Amenagements extends JPanel {
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Amenagements() {
		setLayout(null);
		
		JLabel lblDateDeLa = new JLabel("Date de la visite à la Médecine Préventive");
		lblDateDeLa.setBounds(21, 6, 273, 14);
		add(lblDateDeLa);
		
		textField = new JTextField();
		textField.setBounds(332, 3, 102, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNomDuMdecin = new JLabel("Nom du médecin");
		lblNomDuMdecin.setBounds(24, 22, 140, 14);
		add(lblNomDuMdecin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(148, 20, 186, 20);
		add(comboBox);
		
		JCheckBox chckbxDroit = new JCheckBox("Droit");
		chckbxDroit.setBounds(21, 32, 71, 23);
		add(chckbxDroit);
		
		JCheckBox chckbxFait = new JCheckBox("Fait");
		chckbxFait.setBounds(104, 32, 60, 23);
		add(chckbxFait);
		
		JLabel lblPriseDeNotes = new JLabel("Prise de notes");
		lblPriseDeNotes.setBounds(176, 36, 97, 16);
		add(lblPriseDeNotes);
		
		JCheckBox chckbxDroit_1 = new JCheckBox("Droit");
		chckbxDroit_1.setBounds(21, 48, 71, 23);
		add(chckbxDroit_1);
		
		JCheckBox chckbxFait_1 = new JCheckBox("Fait");
		chckbxFait_1.setBounds(104, 48, 60, 23);
		add(chckbxFait_1);
		
		JLabel lblTutoratDaccompagnementsoutien = new JLabel("Tutorat d'accompagnement (soutien pédagogique)");
		lblTutoratDaccompagnementsoutien.setBounds(160, 52, 324, 16);
		add(lblTutoratDaccompagnementsoutien);
		
		JCheckBox chckbxDroit_2 = new JCheckBox("Droit");
		chckbxDroit_2.setBounds(21, 67, 71, 23);
		add(chckbxDroit_2);
		
		JCheckBox chckbxFait_2 = new JCheckBox("Fait");
		chckbxFait_2.setBounds(104, 67, 60, 23);
		add(chckbxFait_2);
		
		JLabel lblInterprtationEnLsf = new JLabel("Interprétation en LSF");
		lblInterprtationEnLsf.setBounds(160, 71, 140, 16);
		add(lblInterprtationEnLsf);
		
		JCheckBox chckbxDroit_3 = new JCheckBox("Droit");
		chckbxDroit_3.setBounds(21, 83, 71, 23);
		add(chckbxDroit_3);
		
		JCheckBox chckbxFait_3 = new JCheckBox("Fait");
		chckbxFait_3.setBounds(104, 83, 60, 23);
		add(chckbxFait_3);
		
		JLabel lblCodageEnLpc = new JLabel("Codage en LPC");
		lblCodageEnLpc.setBounds(160, 87, 102, 16);
		add(lblCodageEnLpc);
		
		JCheckBox chckbxDroit_4 = new JCheckBox("Droit");
		chckbxDroit_4.setBounds(21, 102, 71, 23);
		add(chckbxDroit_4);
		
		JCheckBox chckbxFait_4 = new JCheckBox("Fait");
		chckbxFait_4.setBounds(104, 102, 60, 23);
		add(chckbxFait_4);
		
		JLabel lblLecturefrappeAuKilomtreaide = new JLabel("Lecture/Frappe au kilomètre/Aide à la recherche documentaire");
		lblLecturefrappeAuKilomtreaide.setBounds(160, 106, 405, 16);
		add(lblLecturefrappeAuKilomtreaide);
		
		JLabel lblAidesHumaines = new JLabel("Aides humaines");
		lblAidesHumaines.setBounds(592, 52, 114, 16);
		add(lblAidesHumaines);
		
		JRadioButton rdbtnOui = new JRadioButton("Oui");
		rdbtnOui.setBounds(592, 77, 60, 23);
		add(rdbtnOui);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setBounds(639, 77, 67, 23);
		add(rdbtnNon);
		
		JLabel lblAmnagementDesCours = new JLabel("Aménagements des cours");
		lblAmnagementDesCours.setBounds(718, 52, 167, 16);
		add(lblAmnagementDesCours);
		
		JRadioButton rdbtnOui_1 = new JRadioButton("Oui");
		rdbtnOui_1.setBounds(718, 80, 60, 23);
		add(rdbtnOui_1);
		
		JRadioButton rdbtnNon_1 = new JRadioButton("Non");
		rdbtnNon_1.setBounds(778, 80, 71, 23);
		add(rdbtnNon_1);
		
		JCheckBox chckbxDroit_5 = new JCheckBox("Droit");
		chckbxDroit_5.setBounds(21, 118, 67, 23);
		add(chckbxDroit_5);
		
		JCheckBox chckbxFait_5 = new JCheckBox("Fait");
		chckbxFait_5.setBounds(104, 118, 60, 23);
		add(chckbxFait_5);
		
		JCheckBox chckbxDroit_6 = new JCheckBox("Droit");
		chckbxDroit_6.setBounds(21, 137, 68, 23);
		add(chckbxDroit_6);
		
		JCheckBox chckbxFait_6 = new JCheckBox("Fait");
		chckbxFait_6.setBounds(104, 137, 60, 23);
		add(chckbxFait_6);
		
		JCheckBox chckbxDroit_7 = new JCheckBox("Droit");
		chckbxDroit_7.setBounds(21, 153, 67, 23);
		add(chckbxDroit_7);
		
		JCheckBox chckbxFait_7 = new JCheckBox("Fait");
		chckbxFait_7.setBounds(104, 153, 60, 23);
		add(chckbxFait_7);
		
		JCheckBox chckbxDroit_8 = new JCheckBox("Droit");
		chckbxDroit_8.setBounds(21, 172, 71, 23);
		add(chckbxDroit_8);
		
		JCheckBox chckbxFait_8 = new JCheckBox("Fait");
		chckbxFait_8.setBounds(104, 172, 60, 23);
		add(chckbxFait_8);
		
		JCheckBox chckbxDroit_9 = new JCheckBox("Droit");
		chckbxDroit_9.setBounds(21, 188, 67, 23);
		add(chckbxDroit_9);
		
		JCheckBox chckbxFait_9 = new JCheckBox("Fait");
		chckbxFait_9.setBounds(104, 188, 60, 23);
		add(chckbxFait_9);
		
		JCheckBox chckbxDroit_10 = new JCheckBox("Droit");
		chckbxDroit_10.setBounds(21, 207, 68, 23);
		add(chckbxDroit_10);
		
		JCheckBox chckbxFait_10 = new JCheckBox("Fait");
		chckbxFait_10.setBounds(104, 207, 60, 23);
		add(chckbxFait_10);
		
		JCheckBox chckbxDroit_11 = new JCheckBox("Droit");
		chckbxDroit_11.setBounds(21, 223, 71, 23);
		add(chckbxDroit_11);
		
		JCheckBox chckbxFait_11 = new JCheckBox("Fait");
		chckbxFait_11.setBounds(104, 223, 60, 23);
		add(chckbxFait_11);
		
		JLabel lblCarteDaccessibilitAux = new JLabel("Carte d'accessibilité aux locaux et ascenseurs");
		lblCarteDaccessibilitAux.setBounds(160, 122, 298, 16);
		add(lblCarteDaccessibilitAux);
		
		JLabel lblRemiseLe = new JLabel("Remise le :");
		lblRemiseLe.setBounds(486, 122, 77, 16);
		add(lblRemiseLe);
		
		textField_1 = new JTextField();
		textField_1.setBounds(562, 112, 130, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblClsWcAccessibles = new JLabel("Clés WC accessibles");
		lblClsWcAccessibles.setBounds(160, 141, 130, 16);
		add(lblClsWcAccessibles);
		
		JLabel lblRemiseLe_1 = new JLabel("Remise le :");
		lblRemiseLe_1.setBounds(302, 141, 71, 16);
		add(lblRemiseLe_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(385, 134, 130, 26);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNumrisations = new JLabel("Numérisations");
		lblNumrisations.setBounds(160, 157, 103, 16);
		add(lblNumrisations);
		
		JLabel lblTranscriptionsBraille = new JLabel("Transcriptions braille");
		lblTranscriptionsBraille.setBounds(160, 176, 143, 16);
		add(lblTranscriptionsBraille);
		
		JLabel lblAgrandissements = new JLabel("Agrandissements");
		lblAgrandissements.setBounds(159, 192, 114, 16);
		add(lblAgrandissements);
		
		JLabel lblPrtDeDictaphone = new JLabel("Prêt de dictaphone");
		lblPrtDeDictaphone.setBounds(160, 211, 120, 16);
		add(lblPrtDeDictaphone);
		
		JLabel lblAutres = new JLabel("Autres :");
		lblAutres.setBounds(160, 227, 61, 16);
		add(lblAutres);
		
		textField_4 = new JTextField();
		textField_4.setBounds(221, 222, 196, 26);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAidesTechniques = new JLabel("Aides techniques");
		lblAidesTechniques.setBounds(718, 106, 114, 16);
		add(lblAidesTechniques);
		
		JRadioButton rdbtnOui_2 = new JRadioButton("Oui");
		rdbtnOui_2.setBounds(704, 118, 54, 23);
		add(rdbtnOui_2);
		
		JRadioButton rdbtnNon_2 = new JRadioButton("Non");
		rdbtnNon_2.setBounds(772, 118, 60, 23);
		add(rdbtnNon_2);
		
		JCheckBox chckbxDroit_12 = new JCheckBox("Droit");
		chckbxDroit_12.setBounds(21, 242, 71, 23);
		add(chckbxDroit_12);
		
		JCheckBox chckbxFait_12 = new JCheckBox("Fait");
		chckbxFait_12.setBounds(104, 242, 60, 23);
		add(chckbxFait_12);
		
		JCheckBox chckbxDroit_13 = new JCheckBox("Droit");
		chckbxDroit_13.setBounds(21, 258, 71, 23);
		add(chckbxDroit_13);
		
		JCheckBox chckbxFait_13 = new JCheckBox("Fait");
		chckbxFait_13.setBounds(104, 258, 60, 23);
		add(chckbxFait_13);
		
		JCheckBox chckbxDroit_14 = new JCheckBox("Droit");
		chckbxDroit_14.setBounds(21, 277, 71, 23);
		add(chckbxDroit_14);
		
		JCheckBox chckbxFait_14 = new JCheckBox("Fait");
		chckbxFait_14.setBounds(104, 277, 60, 23);
		add(chckbxFait_14);
		
		JCheckBox chckbxDroit_15 = new JCheckBox("Droit");
		chckbxDroit_15.setBounds(21, 293, 67, 23);
		add(chckbxDroit_15);
		
		JCheckBox chckbxFait_15 = new JCheckBox("Fait");
		chckbxFait_15.setBounds(104, 293, 60, 23);
		add(chckbxFait_15);
		
		JLabel lblSecrtaire = new JLabel("Secrétaire");
		lblSecrtaire.setBounds(160, 246, 71, 16);
		add(lblSecrtaire);
		
		JLabel lblSurveillant = new JLabel("Surveillant");
		lblSurveillant.setBounds(160, 260, 76, 16);
		add(lblSurveillant);
		
		JLabel lblInterprteLsf = new JLabel("Interprète LSF");
		lblInterprteLsf.setBounds(160, 281, 95, 16);
		add(lblInterprteLsf);
		
		JLabel lblCodeurLpc = new JLabel("Codeur LPC");
		lblCodeurLpc.setBounds(160, 297, 77, 16);
		add(lblCodeurLpc);
		
		JLabel lblAidesHumaines_1 = new JLabel("Aides humaines");
		lblAidesHumaines_1.setBounds(424, 246, 114, 16);
		add(lblAidesHumaines_1);
		
		JRadioButton rdbtnOui_3 = new JRadioButton("Oui");
		rdbtnOui_3.setBounds(411, 260, 60, 23);
		add(rdbtnOui_3);
		
		JRadioButton rdbtnNon_3 = new JRadioButton("Non");
		rdbtnNon_3.setBounds(466, 260, 60, 23);
		add(rdbtnNon_3);
		
		JLabel lblAmnagementsDesExamens = new JLabel("Aménagements des examens");
		lblAmnagementsDesExamens.setBounds(572, 246, 186, 16);
		add(lblAmnagementsDesExamens);
		
		JRadioButton rdbtnOui_4 = new JRadioButton("Oui");
		rdbtnOui_4.setBounds(562, 260, 54, 23);
		add(rdbtnOui_4);
		
		JRadioButton rdbtnNon_4 = new JRadioButton("Non");
		rdbtnNon_4.setBounds(616, 260, 60, 23);
		add(rdbtnNon_4);
		
		JCheckBox chckbxDroit_16 = new JCheckBox("Droit");
		chckbxDroit_16.setBounds(21, 312, 71, 23);
		add(chckbxDroit_16);
		
		JCheckBox chckbxFait_16 = new JCheckBox("Fait");
		chckbxFait_16.setBounds(104, 312, 60, 23);
		add(chckbxFait_16);
		
		JLabel lblTranscriptionBrailleDu = new JLabel("Transcription braille du sujet d'examen");
		lblTranscriptionBrailleDu.setBounds(160, 316, 253, 16);
		add(lblTranscriptionBrailleDu);
		
		JLabel lblAidesTechniques_1 = new JLabel("Aides techniques");
		lblAidesTechniques_1.setBounds(428, 297, 118, 16);
		add(lblAidesTechniques_1);
		
		JRadioButton rdbtnOui_5 = new JRadioButton("Oui");
		rdbtnOui_5.setBounds(424, 312, 60, 23);
		add(rdbtnOui_5);
		
		JRadioButton rdbtnNon_5 = new JRadioButton("Non");
		rdbtnNon_5.setBounds(478, 312, 60, 23);
		add(rdbtnNon_5);
		
		JCheckBox chckbxDroit_17 = new JCheckBox("Droit");
		chckbxDroit_17.setBounds(21, 328, 71, 23);
		add(chckbxDroit_17);
		
		JCheckBox chckbxFait_17 = new JCheckBox("Fait");
		chckbxFait_17.setBounds(104, 328, 60, 23);
		add(chckbxFait_17);
		
		JLabel lblAggrandissementDuSujet = new JLabel("Agrandissement du sujet (format papier ou support USB)");
		lblAggrandissementDuSujet.setBounds(160, 332, 374, 16);
		add(lblAggrandissementDuSujet);
		
		JCheckBox chckbxDroit_18 = new JCheckBox("Droit");
		chckbxDroit_18.setBounds(21, 347, 71, 23);
		add(chckbxDroit_18);
		
		JCheckBox chckbxFait_18 = new JCheckBox("Fait");
		chckbxFait_18.setBounds(104, 347, 60, 23);
		add(chckbxFait_18);
		
		JLabel lblUtilisationDeMatriel = new JLabel("Utilisation de matériel personnel");
		lblUtilisationDeMatriel.setBounds(160, 351, 226, 16);
		add(lblUtilisationDeMatriel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(423, 347, 157, 27);
		add(comboBox_1);
		
		JCheckBox chckbxDroit_19 = new JCheckBox("Droit");
		chckbxDroit_19.setBounds(21, 363, 71, 23);
		add(chckbxDroit_19);
		
		JCheckBox chckbxFait_19 = new JCheckBox("Fait");
		chckbxFait_19.setBounds(104, 363, 60, 23);
		add(chckbxFait_19);
		
		JLabel lblUtilisationDeMatriel_1 = new JLabel("Utilisation de matériel mis à disposition par le service");
		lblUtilisationDeMatriel_1.setBounds(160, 367, 343, 16);
		add(lblUtilisationDeMatriel_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(584, 363, 174, 27);
		add(comboBox_2);
		
		JCheckBox chckbxDroit_20 = new JCheckBox("Droit");
		chckbxDroit_20.setBounds(21, 382, 71, 23);
		add(chckbxDroit_20);
		
		JCheckBox chckbxFait_20 = new JCheckBox("Fait");
		chckbxFait_20.setBounds(104, 382, 60, 23);
		add(chckbxFait_20);
		
		JLabel lblTempsMajorPour = new JLabel("Temps majoré pour épreuves écrites");
		lblTempsMajorPour.setBounds(160, 386, 241, 16);
		add(lblTempsMajorPour);
		
		JLabel lblAutre = new JLabel("Autre :");
		lblAutre.setBounds(758, 386, 48, 16);
		add(lblAutre);
		
		JRadioButton rdbtnOui_6 = new JRadioButton("Oui");
		rdbtnOui_6.setBounds(718, 402, 60, 23);
		add(rdbtnOui_6);
		
		JRadioButton rdbtnNon_6 = new JRadioButton("Non");
		rdbtnNon_6.setBounds(772, 402, 60, 23);
		add(rdbtnNon_6);
		
		JCheckBox chckbxDroit_21 = new JCheckBox("Droit");
		chckbxDroit_21.setBounds(21, 398, 71, 23);
		add(chckbxDroit_21);
		
		JCheckBox chckbxFait_21 = new JCheckBox("Fait");
		chckbxFait_21.setBounds(104, 398, 60, 23);
		add(chckbxFait_21);
		
		JLabel lblTempsMajorPour_1 = new JLabel("Temps majoré pour préparations épreuves orales");
		lblTempsMajorPour_1.setBounds(160, 406, 320, 16);
		add(lblTempsMajorPour_1);
		
		JCheckBox chckbxDroit_22 = new JCheckBox("Droit");
		chckbxDroit_22.setBounds(21, 417, 67, 23);
		add(chckbxDroit_22);
		
		JCheckBox chckbxFait_22 = new JCheckBox("Fait");
		chckbxFait_22.setBounds(104, 417, 60, 23);
		add(chckbxFait_22);
		
		JLabel lblTempsMajorPour_2 = new JLabel("Temps majoré pour épreuves pratiques");
		lblTempsMajorPour_2.setBounds(160, 421, 253, 16);
		add(lblTempsMajorPour_2);
		
		JCheckBox chckbxDroit_23 = new JCheckBox("Droit");
		chckbxDroit_23.setBounds(21, 433, 71, 23);
		add(chckbxDroit_23);
		
		JCheckBox chckbxFait_23 = new JCheckBox("Fait");
		chckbxFait_23.setBounds(104, 433, 60, 23);
		add(chckbxFait_23);
		
		JLabel lblSalleParticulire = new JLabel("Salle particulière");
		lblSalleParticulire.setBounds(159, 437, 114, 16);
		add(lblSalleParticulire);
		
		JCheckBox chckbxDroit_24 = new JCheckBox("Droit");
		chckbxDroit_24.setBounds(21, 452, 71, 23);
		add(chckbxDroit_24);
		
		JCheckBox chckbxFait_24 = new JCheckBox("Fait");
		chckbxFait_24.setBounds(104, 452, 60, 23);
		add(chckbxFait_24);
		
		JLabel lblTempsDePause = new JLabel("Temps de pause");
		lblTempsDePause.setBounds(164, 456, 109, 16);
		add(lblTempsDePause);
		
		JCheckBox chckbxDroit_25 = new JCheckBox("Droit");
		chckbxDroit_25.setBounds(21, 469, 71, 23);
		add(chckbxDroit_25);
		
		JCheckBox chckbxFait_25 = new JCheckBox("Fait");
		chckbxFait_25.setBounds(103, 469, 60, 23);
		add(chckbxFait_25);
		
		JLabel lblPossibilitDeSortir = new JLabel("Possibilité de sortir de la salle pendant l'examen");
		lblPossibilitDeSortir.setBounds(160, 473, 311, 16);
		add(lblPossibilitDeSortir);
		
		JCheckBox chckbxDroit_26 = new JCheckBox("Droit");
		chckbxDroit_26.setBounds(21, 488, 71, 23);
		add(chckbxDroit_26);
		
		JCheckBox chckbxFait_26 = new JCheckBox("Fait");
		chckbxFait_26.setBounds(104, 487, 60, 23);
		add(chckbxFait_26);
		
		JLabel lblDispenseDassiduit = new JLabel("Dispense d'assiduité");
		lblDispenseDassiduit.setBounds(160, 492, 134, 16);
		add(lblDispenseDassiduit);
		
		JCheckBox chckbxDroit_27 = new JCheckBox("Droit");
		chckbxDroit_27.setBounds(21, 504, 71, 23);
		add(chckbxDroit_27);
		
		JCheckBox chckbxFait_27 = new JCheckBox("Fait");
		chckbxFait_27.setBounds(104, 504, 60, 23);
		add(chckbxFait_27);
		
		JLabel lblAmnagementDeLa = new JLabel("Aménagement de la durée de formation");
		lblAmnagementDeLa.setBounds(160, 508, 257, 16);
		add(lblAmnagementDeLa);
		
		JCheckBox chckbxDroit_28 = new JCheckBox("Droit");
		chckbxDroit_28.setBounds(21, 524, 67, 23);
		add(chckbxDroit_28);
		
		JCheckBox chckbxFait_28 = new JCheckBox("Fait");
		chckbxFait_28.setBounds(104, 522, 60, 23);
		add(chckbxFait_28);
		
		JLabel lblAmnagementDesHoraires = new JLabel("Aménagement des horaires");
		lblAmnagementDesHoraires.setBounds(160, 528, 186, 16);
		add(lblAmnagementDesHoraires);
		
		JCheckBox chckbxDroit_29 = new JCheckBox("Droit");
		chckbxDroit_29.setBounds(343, 524, 74, 23);
		add(chckbxDroit_29);
		
		JCheckBox chckbxFait_29 = new JCheckBox("Fait");
		chckbxFait_29.setBounds(410, 524, 60, 23);
		add(chckbxFait_29);
		
		JLabel lblDispenseDeStage = new JLabel("Dispense de stage");
		lblDispenseDeStage.setBounds(466, 528, 120, 16);
		add(lblDispenseDeStage);
		
		JLabel lblAmnagementsDeLa = new JLabel("Aménagements de la formation");
		lblAmnagementsDeLa.setBounds(477, 476, 199, 16);
		add(lblAmnagementsDeLa);
		
		JRadioButton rdbtnOui_7 = new JRadioButton("Oui");
		rdbtnOui_7.setBounds(466, 488, 60, 23);
		add(rdbtnOui_7);
		
		JRadioButton rdbtnNon_7 = new JRadioButton("Non");
		rdbtnNon_7.setBounds(520, 488, 60, 23);
		add(rdbtnNon_7);
	}
}