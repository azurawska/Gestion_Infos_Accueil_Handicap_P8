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
		
		JLabel lblDateDeLa = new JLabel("Date de la visite à la Médecine Préventive");
		lblDateDeLa.setBounds(21, 22, 251, 14);
		add(lblDateDeLa);
		
		textField = new JTextField();
		textField.setBounds(333, 19, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNomDuMdecin = new JLabel("Nom du médecin");
		lblNomDuMdecin.setBounds(21, 47, 140, 14);
		add(lblNomDuMdecin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(278, 47, 114, 20);
		add(comboBox);
		
		JLabel lblAmnagementDesCours = new JLabel("Aménagements des cours :");
		lblAmnagementDesCours.setBounds(10, 84, 160, 14);
		add(lblAmnagementDesCours);
		
		JRadioButton rdbtnOui = new JRadioButton("Oui");
		rdbtnOui.setBounds(233, 80, 47, 23);
		add(rdbtnOui);
		
		JRadioButton rdbtnNom = new JRadioButton("Non");
		rdbtnNom.setBounds(288, 80, 47, 23);
		add(rdbtnNom);
		
		JLabel lblAidesHumaines = new JLabel("Aides humaines :");
		lblAidesHumaines.setBounds(30, 116, 114, 14);
		add(lblAidesHumaines);
		
		JRadioButton rdbtnOui_1 = new JRadioButton("Oui");
		rdbtnOui_1.setBounds(233, 112, 47, 23);
		add(rdbtnOui_1);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setBounds(278, 112, 52, 23);
		add(rdbtnNon);
		
		JCheckBox chckbxPriseDeNotes = new JCheckBox("Prise de notes");
		chckbxPriseDeNotes.setBounds(-1, 137, 114, 23);
		add(chckbxPriseDeNotes);
		
		JCheckBox chckbxTutoratDaccompagnement = new JCheckBox("Tutorat d'accompagnement");
		chckbxTutoratDaccompagnement.setBounds(128, 137, 197, 23);
		add(chckbxTutoratDaccompagnement);
		
		JCheckBox chckbxInterprtationEnLsf = new JCheckBox("Interprétation en LSF");
		chckbxInterprtationEnLsf.setBounds(326, 138, 166, 23);
		add(chckbxInterprtationEnLsf);
		
		JCheckBox chckbxCodageEnLpc = new JCheckBox("Codage en LPC");
		chckbxCodageEnLpc.setBounds(486, 137, 119, 23);
		add(chckbxCodageEnLpc);
		
		JCheckBox chckbxLecturefrappeAuKilomtreaide = new JCheckBox("Lecture/Frappe au kilomètre/Aide à la recherche documentaire");
		chckbxLecturefrappeAuKilomtreaide.setBounds(595, 137, 386, 23);
		add(chckbxLecturefrappeAuKilomtreaide);
		
		JLabel lblAidesTechniques = new JLabel("Aides techniques :");
		lblAidesTechniques.setBounds(10, 185, 117, 14);
		add(lblAidesTechniques);
		
		JRadioButton rdbtnOui_2 = new JRadioButton("Oui");
		rdbtnOui_2.setBounds(175, 181, 47, 23);
		add(rdbtnOui_2);
		
		JRadioButton rdbtnNon_1 = new JRadioButton("Non");
		rdbtnNon_1.setBounds(233, 181, 47, 23);
		add(rdbtnNon_1);
		
		JCheckBox chckbxCarteDaccessibilitAux = new JCheckBox("Carte d'accessibilité aux locaux et ascenseurs :");
		chckbxCarteDaccessibilitAux.setBounds(10, 206, 284, 23);
		add(chckbxCarteDaccessibilitAux);
		
		JLabel lblRemiseLe = new JLabel("Remise le :");
		lblRemiseLe.setBounds(305, 210, 75, 14);
		add(lblRemiseLe);
		
		textField_1 = new JTextField();
		textField_1.setBounds(422, 207, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxClsWcAccessibles = new JCheckBox("Clés WC accessibles :");
		chckbxClsWcAccessibles.setBounds(10, 232, 131, 23);
		add(chckbxClsWcAccessibles);
		
		JLabel lblRemiseLe_1 = new JLabel("Remise le :");
		lblRemiseLe_1.setBounds(305, 241, 87, 14);
		add(lblRemiseLe_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(422, 233, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNumrisation = new JCheckBox("Numérisation");
		chckbxNumrisation.setBounds(9, 262, 104, 23);
		add(chckbxNumrisation);
		
		JCheckBox chckbxTranscriptionsBraille = new JCheckBox("Transcriptions braille");
		chckbxTranscriptionsBraille.setBounds(112, 262, 155, 23);
		add(chckbxTranscriptionsBraille);
		
		JCheckBox chckbxAgrandissements = new JCheckBox("Agrandissements");
		chckbxAgrandissements.setBounds(269, 262, 139, 23);
		add(chckbxAgrandissements);
		
		JCheckBox chckbxPretDeDictaphone = new JCheckBox("Prêt de dictaphone");
		chckbxPretDeDictaphone.setBounds(397, 262, 159, 23);
		add(chckbxPretDeDictaphone);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Autres");
		chckbxNewCheckBox.setBounds(558, 262, 86, 23);
		add(chckbxNewCheckBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(676, 263, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAmnagementsDesExamens = new JLabel("Aménagements des examens :");
		lblAmnagementsDesExamens.setBounds(12, 307, 172, 14);
		add(lblAmnagementsDesExamens);
		
		JRadioButton rdbtnOui_3 = new JRadioButton("Oui");
		rdbtnOui_3.setBounds(288, 303, 47, 23);
		add(rdbtnOui_3);
		
		JRadioButton rdbtnNon_2 = new JRadioButton("Non");
		rdbtnNon_2.setBounds(367, 303, 47, 23);
		add(rdbtnNon_2);
		
		JLabel lblAidesHumaines_1 = new JLabel("Aides humaines :");
		lblAidesHumaines_1.setBounds(22, 332, 91, 14);
		add(lblAidesHumaines_1);
		
		JRadioButton rdbtnOui_4 = new JRadioButton("Oui");
		rdbtnOui_4.setBounds(288, 332, 47, 23);
		add(rdbtnOui_4);
		
		JRadioButton rdbtnNon_3 = new JRadioButton("Non");
		rdbtnNon_3.setBounds(367, 332, 47, 23);
		add(rdbtnNon_3);
		
		JCheckBox chckbxSecrtaire = new JCheckBox("Secrétaire");
		chckbxSecrtaire.setBounds(21, 353, 92, 23);
		add(chckbxSecrtaire);
		
		JCheckBox chckbxSurveillant = new JCheckBox("Surveillant");
		chckbxSurveillant.setBounds(117, 353, 113, 23);
		add(chckbxSurveillant);
		
		JCheckBox chckbxInterprteLsf = new JCheckBox("Interprête LSF");
		chckbxInterprteLsf.setBounds(228, 353, 137, 23);
		add(chckbxInterprteLsf);
		
		JCheckBox chckbxCodeurEnLpc = new JCheckBox("Codeur en LPC");
		chckbxCodeurEnLpc.setBounds(367, 358, 131, 23);
		add(chckbxCodeurEnLpc);
		
		JLabel lblAidesTechniques_1 = new JLabel("Aides techniques :");
		lblAidesTechniques_1.setBounds(16, 383, 128, 14);
		add(lblAidesTechniques_1);
		
		JRadioButton rdbtnOui_5 = new JRadioButton("Oui");
		rdbtnOui_5.setBounds(289, 379, 46, 23);
		add(rdbtnOui_5);
		
		JRadioButton rdbtnNon_4 = new JRadioButton("Non");
		rdbtnNon_4.setBounds(367, 379, 47, 23);
		add(rdbtnNon_4);
		
		JCheckBox chckbxTranscriptionBrailleDu = new JCheckBox("Transcription braille du sujet d'examen");
		chckbxTranscriptionBrailleDu.setBounds(21, 405, 251, 23);
		add(chckbxTranscriptionBrailleDu);
		
		JCheckBox chckbxAgrandissementDuSujet = new JCheckBox("Agrandissement du sujet");
		chckbxAgrandissementDuSujet.setBounds(266, 405, 176, 23);
		add(chckbxAgrandissementDuSujet);
		
		JCheckBox chckbxUtilisationDeMatriel = new JCheckBox("Utilisation de matériel personnel");
		chckbxUtilisationDeMatriel.setBounds(444, 405, 215, 23);
		add(chckbxUtilisationDeMatriel);
		
		JList list = new JList();
		list.setBounds(720, 531, 1, 1);
		add(list);
		
		JCheckBox chckbxUtilisationDeMatriel_1 = new JCheckBox("Utilisation de matériel du service");
		chckbxUtilisationDeMatriel_1.setBounds(661, 405, 229, 23);
		add(chckbxUtilisationDeMatriel_1);
		
		JList list_1 = new JList();
		list_1.setBounds(357, 565, 1, 1);
		add(list_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Autre :");
		chckbxNewCheckBox_1.setBounds(21, 450, 92, 23);
		add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxTempsMajorPour = new JCheckBox("Temps majoré pour les épreuves écrites");
		chckbxTempsMajorPour.setBounds(21, 491, 251, 23);
		add(chckbxTempsMajorPour);
		
		JCheckBox chckbxTempsMajorPour_1 = new JCheckBox("Temps majoré pour les préparation d'épreuves orales");
		chckbxTempsMajorPour_1.setBounds(252, 491, 312, 23);
		add(chckbxTempsMajorPour_1);
		
		JCheckBox chckbxTempsMajorPour_2 = new JCheckBox("Temps majoré pour les épreuves pratiques");
		chckbxTempsMajorPour_2.setBounds(578, 491, 284, 23);
		add(chckbxTempsMajorPour_2);
		
		JCheckBox chckbxSalleParticulire = new JCheckBox("Salle particulière");
		chckbxSalleParticulire.setBounds(21, 528, 140, 23);
		add(chckbxSalleParticulire);
		
		JCheckBox chckbxTempsDePause = new JCheckBox("Temps de pause");
		chckbxTempsDePause.setBounds(233, 528, 132, 23);
		add(chckbxTempsDePause);
		
		JCheckBox chckbxSortieDeLa = new JCheckBox("Sortie de la salle pendant l'examen");
		chckbxSortieDeLa.setBounds(499, 531, 229, 23);
		add(chckbxSortieDeLa);
		
		JLabel lblAmnagementsDeLa = new JLabel("Aménagements de la formation :");
		lblAmnagementsDeLa.setBounds(21, 565, 190, 14);
		add(lblAmnagementsDeLa);
		
		JRadioButton rdbtnOui_6 = new JRadioButton("Oui");
		rdbtnOui_6.setBounds(367, 565, 47, 23);
		add(rdbtnOui_6);
		
		JRadioButton rdbtnNon_5 = new JRadioButton("Non");
		rdbtnNon_5.setBounds(422, 565, 47, 23);
		add(rdbtnNon_5);
		
		JCheckBox chckbxDispenseDassiduit = new JCheckBox("Dispense d'assiduité");
		chckbxDispenseDassiduit.setBounds(21, 591, 160, 23);
		add(chckbxDispenseDassiduit);
		
		JCheckBox chckbxAmnagementDeLa = new JCheckBox("Aménagement de la durée de formation");
		chckbxAmnagementDeLa.setBounds(175, 591, 260, 23);
		add(chckbxAmnagementDeLa);
		
		JCheckBox chckbxAmnagementDesHoraires = new JCheckBox("Aménagement des horaires");
		chckbxAmnagementDesHoraires.setBounds(436, 591, 208, 23);
		add(chckbxAmnagementDesHoraires);
		
		JCheckBox chckbxDispenseDeStage = new JCheckBox("Dispense de stage");
		chckbxDispenseDeStage.setBounds(632, 591, 140, 23);
		add(chckbxDispenseDeStage);

	}
}
