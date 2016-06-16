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
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public Amenagements() {
		setLayout(null);
		
		JLabel lblDateDeLa = new JLabel("Date de la visite \u00E0 la M\u00E9decine Pr\u00E9ventive");
		lblDateDeLa.setBounds(21, 22, 207, 14);
		add(lblDateDeLa);
		
		textField = new JTextField();
		textField.setBounds(278, 16, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNomDuMdecin = new JLabel("Nom du m\u00E9decin");
		lblNomDuMdecin.setBounds(21, 47, 86, 14);
		add(lblNomDuMdecin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(278, 47, 114, 20);
		add(comboBox);
		
		JLabel lblAmnagementDesCours = new JLabel("Am\u00E9nagements des cours :");
		lblAmnagementDesCours.setBounds(10, 84, 131, 14);
		add(lblAmnagementDesCours);
		
		JRadioButton rdbtnOui = new JRadioButton("Oui");
		rdbtnOui.setBounds(233, 80, 41, 23);
		add(rdbtnOui);
		
		JRadioButton rdbtnNom = new JRadioButton("Non");
		rdbtnNom.setBounds(278, 80, 47, 23);
		add(rdbtnNom);
		
		JLabel lblAidesHumaines = new JLabel("Aides humaines :");
		lblAidesHumaines.setBounds(30, 116, 86, 14);
		add(lblAidesHumaines);
		
		JRadioButton rdbtnOui_1 = new JRadioButton("Oui");
		rdbtnOui_1.setBounds(233, 112, 47, 23);
		add(rdbtnOui_1);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setBounds(278, 112, 52, 23);
		add(rdbtnNon);
		
		JCheckBox chckbxPriseDeNotes = new JCheckBox("Prise de notes");
		chckbxPriseDeNotes.setBounds(29, 137, 97, 23);
		add(chckbxPriseDeNotes);
		
		JCheckBox chckbxTutoratDaccompagnement = new JCheckBox("Tutorat d'accompagnement");
		chckbxTutoratDaccompagnement.setBounds(29, 167, 157, 23);
		add(chckbxTutoratDaccompagnement);
		
		JCheckBox chckbxInterprtationEnLsf = new JCheckBox("Interpr\u00E9tation en LSF");
		chckbxInterprtationEnLsf.setBounds(30, 197, 131, 23);
		add(chckbxInterprtationEnLsf);
		
		JCheckBox chckbxCodageEnLpc = new JCheckBox("Codage en LPC");
		chckbxCodageEnLpc.setBounds(30, 223, 104, 23);
		add(chckbxCodageEnLpc);
		
		JCheckBox chckbxLecturefrappeAuKilomtreaide = new JCheckBox("Lecture/Frappe au kilom\u00E8tre/Aide \u00E0 la recherche documentaire");
		chckbxLecturefrappeAuKilomtreaide.setBounds(30, 250, 325, 23);
		add(chckbxLecturefrappeAuKilomtreaide);
		
		JLabel lblAidesTechniques = new JLabel("Aides techniques :");
		lblAidesTechniques.setBounds(29, 294, 97, 14);
		add(lblAidesTechniques);
		
		JRadioButton rdbtnOui_2 = new JRadioButton("Oui");
		rdbtnOui_2.setBounds(216, 290, 41, 23);
		add(rdbtnOui_2);
		
		JRadioButton rdbtnNon_1 = new JRadioButton("Non");
		rdbtnNon_1.setBounds(259, 290, 47, 23);
		add(rdbtnNon_1);
		
		JCheckBox chckbxCarteDaccessibilitAux = new JCheckBox("Carte d'accessibilit\u00E9 aux locaux et ascenseurs :");
		chckbxCarteDaccessibilitAux.setBounds(30, 317, 251, 23);
		add(chckbxCarteDaccessibilitAux);
		
		JLabel lblRemiseLe = new JLabel("Remise le :");
		lblRemiseLe.setBounds(300, 321, 59, 14);
		add(lblRemiseLe);
		
		textField_1 = new JTextField();
		textField_1.setBounds(380, 318, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxClsWcAccessibles = new JCheckBox("Cl\u00E9s WC accessibles :");
		chckbxClsWcAccessibles.setBounds(30, 343, 131, 23);
		add(chckbxClsWcAccessibles);
		
		JLabel lblRemiseLe_1 = new JLabel("Remise le :");
		lblRemiseLe_1.setBounds(300, 346, 59, 14);
		add(lblRemiseLe_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(380, 344, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNumrisation = new JCheckBox("Num\u00E9risation");
		chckbxNumrisation.setBounds(30, 368, 87, 23);
		add(chckbxNumrisation);
		
		JCheckBox chckbxTranscriptionsBraille = new JCheckBox("Transcriptions braille");
		chckbxTranscriptionsBraille.setBounds(119, 369, 123, 23);
		add(chckbxTranscriptionsBraille);
		
		JCheckBox chckbxAgrandissements = new JCheckBox("Agrandissements");
		chckbxAgrandissements.setBounds(243, 368, 112, 23);
		add(chckbxAgrandissements);
		
		JCheckBox chckbxPretDeDictaphone = new JCheckBox("Pr\u00EAt de dictaphone");
		chckbxPretDeDictaphone.setBounds(357, 367, 123, 23);
		add(chckbxPretDeDictaphone);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Autres (\u00E0 pr\u00E9ciser) :");
		chckbxNewCheckBox.setBounds(482, 368, 123, 23);
		add(chckbxNewCheckBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(611, 369, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAmnagementsDesExamens = new JLabel("Am\u00E9nagements des examens :");
		lblAmnagementsDesExamens.setBounds(21, 410, 149, 14);
		add(lblAmnagementsDesExamens);
		
		JRadioButton rdbtnOui_3 = new JRadioButton("Oui");
		rdbtnOui_3.setBounds(300, 406, 41, 23);
		add(rdbtnOui_3);
		
		JRadioButton rdbtnNon_2 = new JRadioButton("Non");
		rdbtnNon_2.setBounds(343, 406, 47, 23);
		add(rdbtnNon_2);
		
		JLabel lblAidesHumaines_1 = new JLabel("Aides humaines :");
		lblAidesHumaines_1.setBounds(21, 435, 86, 14);
		add(lblAidesHumaines_1);
		
		JRadioButton rdbtnOui_4 = new JRadioButton("Oui");
		rdbtnOui_4.setBounds(300, 432, 41, 23);
		add(rdbtnOui_4);
		
		JRadioButton rdbtnNon_3 = new JRadioButton("Non");
		rdbtnNon_3.setBounds(343, 432, 47, 23);
		add(rdbtnNon_3);
		
		JCheckBox chckbxSecrtaire = new JCheckBox("Secr\u00E9taire");
		chckbxSecrtaire.setBounds(21, 456, 75, 23);
		add(chckbxSecrtaire);
		
		JCheckBox chckbxSurveillant = new JCheckBox("Surveillant");
		chckbxSurveillant.setBounds(98, 456, 75, 23);
		add(chckbxSurveillant);
		
		JCheckBox chckbxInterprteLsf = new JCheckBox("Interpr\u00EAte LSF");
		chckbxInterprteLsf.setBounds(175, 456, 97, 23);
		add(chckbxInterprteLsf);
		
		JCheckBox chckbxCodeurEnLpc = new JCheckBox("Codeur en LPC");
		chckbxCodeurEnLpc.setBounds(267, 458, 97, 23);
		add(chckbxCodeurEnLpc);
		
		JLabel lblAidesTechniques_1 = new JLabel("Aides techniques :");
		lblAidesTechniques_1.setBounds(30, 486, 97, 14);
		add(lblAidesTechniques_1);
		
		JRadioButton rdbtnOui_5 = new JRadioButton("Oui");
		rdbtnOui_5.setBounds(283, 482, 41, 23);
		add(rdbtnOui_5);
		
		JRadioButton rdbtnNon_4 = new JRadioButton("Non");
		rdbtnNon_4.setBounds(326, 482, 47, 23);
		add(rdbtnNon_4);
		
		JCheckBox chckbxTranscriptionBrailleDu = new JCheckBox("Transcription braille du sujet d'examen");
		chckbxTranscriptionBrailleDu.setBounds(21, 509, 209, 23);
		add(chckbxTranscriptionBrailleDu);
		
		JCheckBox chckbxAgrandissementDuSujet = new JCheckBox("Agrandissement du sujet (format papier ou USB)");
		chckbxAgrandissementDuSujet.setBounds(228, 509, 264, 23);
		add(chckbxAgrandissementDuSujet);
		
		JCheckBox chckbxUtilisationDeMatriel = new JCheckBox("Utilisation de mat\u00E9riel personnel");
		chckbxUtilisationDeMatriel.setBounds(497, 509, 177, 23);
		add(chckbxUtilisationDeMatriel);
		
		JList list = new JList();
		list.setBounds(720, 531, 1, 1);
		add(list);
		
		JCheckBox chckbxUtilisationDeMatriel_1 = new JCheckBox("Utilisation de mat\u00E9riel mis \u00E0 disposition par le service");
		chckbxUtilisationDeMatriel_1.setBounds(21, 543, 275, 23);
		add(chckbxUtilisationDeMatriel_1);
		
		JList list_1 = new JList();
		list_1.setBounds(357, 565, 1, 1);
		add(list_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Autre :");
		chckbxNewCheckBox_1.setBounds(21, 580, 59, 23);
		add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxTempsMajorPour = new JCheckBox("Temps major\u00E9 pour \u00E9preuves \u00E9crites");
		chckbxTempsMajorPour.setBounds(21, 606, 201, 23);
		add(chckbxTempsMajorPour);
		
		JCheckBox chckbxTempsMajorPour_1 = new JCheckBox("Temps major\u00E9 pour pr\u00E9paration d'\u00E9preuves orales");
		chckbxTempsMajorPour_1.setBounds(216, 606, 264, 23);
		add(chckbxTempsMajorPour_1);
		
		JCheckBox chckbxTempsMajorPour_2 = new JCheckBox("Temps major\u00E9 pour les \u00E9preuves pratiques");
		chckbxTempsMajorPour_2.setBounds(482, 606, 229, 23);
		add(chckbxTempsMajorPour_2);
		
		JCheckBox chckbxSalleParticulire = new JCheckBox("Salle particuli\u00E8re");
		chckbxSalleParticulire.setBounds(21, 632, 104, 23);
		add(chckbxSalleParticulire);
		
		JCheckBox chckbxTempsDePause = new JCheckBox("Temps de pause");
		chckbxTempsDePause.setBounds(119, 632, 104, 23);
		add(chckbxTempsDePause);
		
		JCheckBox chckbxSortieDeLa = new JCheckBox("Sortie de la salle pendant l'examen");
		chckbxSortieDeLa.setBounds(228, 632, 191, 23);
		add(chckbxSortieDeLa);
		
		JLabel lblAmnagementsDeLa = new JLabel("Am\u00E9nagements de la formation :");
		lblAmnagementsDeLa.setBounds(21, 661, 163, 14);
		add(lblAmnagementsDeLa);
		
		JRadioButton rdbtnOui_6 = new JRadioButton("Oui");
		rdbtnOui_6.setBounds(367, 658, 41, 23);
		add(rdbtnOui_6);
		
		JRadioButton rdbtnNon_5 = new JRadioButton("Non");
		rdbtnNon_5.setBounds(410, 658, 47, 23);
		add(rdbtnNon_5);
		
		JCheckBox chckbxDispenseDassiduit = new JCheckBox("Dispense d'assiduit\u00E9");
		chckbxDispenseDassiduit.setBounds(21, 679, 123, 23);
		add(chckbxDispenseDassiduit);
		
		JCheckBox chckbxAmnagementDeLa = new JCheckBox("Am\u00E9nagement de la dur\u00E9e de formation");
		chckbxAmnagementDeLa.setBounds(146, 679, 220, 23);
		add(chckbxAmnagementDeLa);
		
		JCheckBox chckbxAmnagementDesHoraires = new JCheckBox("Am\u00E9nagement des horaires");
		chckbxAmnagementDesHoraires.setBounds(365, 679, 163, 23);
		add(chckbxAmnagementDesHoraires);
		
		JCheckBox chckbxDispenseDeStage = new JCheckBox("Dispense de stage");
		chckbxDispenseDeStage.setBounds(530, 679, 114, 23);
		add(chckbxDispenseDeStage);

	}
}
