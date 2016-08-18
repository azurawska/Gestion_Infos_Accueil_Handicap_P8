package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

import fenetre.composants.AbstractJPanel;

public class AmenagementsCours extends AbstractJPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public AmenagementsCours() {
		setLayout(null);
		
		JLabel lblAidesHumaines = new JLabel("Aides humaines");
		lblAidesHumaines.setBounds(108, 6, 115, 16);
		add(lblAidesHumaines);
		
		JRadioButton rdbtnOui = new JRadioButton("Oui");
		rdbtnOui.setBounds(74, 34, 54, 23);
		add(rdbtnOui);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setBounds(155, 34, 59, 23);
		add(rdbtnNon);
		
		JCheckBox chckbxDroit = new JCheckBox("Droit");
		chckbxDroit.setBounds(6, 69, 64, 23);
		add(chckbxDroit);
		
		JCheckBox chckbxFait = new JCheckBox("Fait");
		chckbxFait.setBounds(74, 69, 64, 23);
		add(chckbxFait);
		
		JLabel lblPriseDeNotes = new JLabel("Prise de notes");
		lblPriseDeNotes.setBounds(175, 76, 98, 16);
		add(lblPriseDeNotes);
		
		JCheckBox chckbxDroit_1 = new JCheckBox("Droit");
		chckbxDroit_1.setBounds(6, 91, 64, 23);
		add(chckbxDroit_1);
		
		JCheckBox chckbxFait_1 = new JCheckBox("Fait");
		chckbxFait_1.setBounds(74, 91, 64, 23);
		add(chckbxFait_1);
		
		JLabel lblTutoratDaccompagnement = new JLabel("Tutorat d'accompagnement (soutien pédagogique)");
		lblTutoratDaccompagnement.setBounds(175, 95, 326, 16);
		add(lblTutoratDaccompagnement);
		
		JCheckBox chckbxDroit_2 = new JCheckBox("Droit");
		chckbxDroit_2.setBounds(6, 113, 64, 23);
		add(chckbxDroit_2);
		
		JCheckBox chckbxFait_2 = new JCheckBox("Fait");
		chckbxFait_2.setBounds(74, 113, 64, 23);
		add(chckbxFait_2);
		
		JLabel lblInterprtationEnLsf = new JLabel("Interprétation en LSF");
		lblInterprtationEnLsf.setBounds(175, 117, 137, 16);
		add(lblInterprtationEnLsf);
		
		JCheckBox chckbxDroit_3 = new JCheckBox("Droit");
		chckbxDroit_3.setBounds(6, 137, 64, 23);
		add(chckbxDroit_3);
		
		JCheckBox chckbxFait_3 = new JCheckBox("Fait");
		chckbxFait_3.setBounds(74, 137, 59, 23);
		add(chckbxFait_3);
		
		JLabel lblCodageEnLpc = new JLabel("Codage en LPC");
		lblCodageEnLpc.setBounds(175, 141, 98, 16);
		add(lblCodageEnLpc);
		
		JCheckBox chckbxDroit_4 = new JCheckBox("Droit");
		chckbxDroit_4.setBounds(6, 158, 64, 23);
		add(chckbxDroit_4);
		
		JCheckBox chckbxFait_4 = new JCheckBox("Fait");
		chckbxFait_4.setBounds(74, 158, 59, 23);
		add(chckbxFait_4);
		
		JLabel lblLecturefrappeAuKilomtreaide = new JLabel("Lecture/Frappe au kilomètre/Aide à la recherche documentaire");
		lblLecturefrappeAuKilomtreaide.setBounds(175, 162, 402, 16);
		add(lblLecturefrappeAuKilomtreaide);
		
		JLabel lblAidesTechniques = new JLabel("Aides techniques");
		lblAidesTechniques.setBounds(142, 190, 115, 16);
		add(lblAidesTechniques);
		
		JRadioButton rdbtnOui_1 = new JRadioButton("Oui");
		rdbtnOui_1.setBounds(108, 206, 59, 23);
		add(rdbtnOui_1);
		
		JRadioButton rdbtnNon_1 = new JRadioButton("Non");
		rdbtnNon_1.setBounds(214, 206, 59, 23);
		add(rdbtnNon_1);
		
		JCheckBox chckbxDroit_5 = new JCheckBox("Droit");
		chckbxDroit_5.setBounds(6, 229, 64, 23);
		add(chckbxDroit_5);
		
		JCheckBox chckbxFait_5 = new JCheckBox("Fait");
		chckbxFait_5.setBounds(69, 229, 59, 23);
		add(chckbxFait_5);
		
		JLabel lblCarteDaccessibilitAux = new JLabel("Carte d'accessibilité aux locaux et ascenseurs");
		lblCarteDaccessibilitAux.setBounds(140, 241, 300, 16);
		add(lblCarteDaccessibilitAux);
		
		JLabel lblRemiseLe = new JLabel("Remise le :");
		lblRemiseLe.setBounds(453, 233, 75, 16);
		add(lblRemiseLe);
		
		textField = new JTextField();
		textField.setBounds(529, 228, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxDroit_6 = new JCheckBox("Droit");
		chckbxDroit_6.setBounds(6, 253, 64, 23);
		add(chckbxDroit_6);
		
		JCheckBox chckbxFait_6 = new JCheckBox("Fait");
		chckbxFait_6.setBounds(69, 253, 59, 23);
		add(chckbxFait_6);
		
		JLabel lblClsWcAccessibles = new JLabel("Clés WC accessibles");
		lblClsWcAccessibles.setBounds(142, 261, 137, 16);
		add(lblClsWcAccessibles);
		
		JLabel lblRemiseLe_1 = new JLabel("Remise le :");
		lblRemiseLe_1.setBounds(306, 261, 75, 16);
		add(lblRemiseLe_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(393, 256, 130, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNumrisations = new JCheckBox("Droit");
		chckbxNumrisations.setBounds(6, 275, 64, 23);
		add(chckbxNumrisations);
		
		JCheckBox chckbxFait_7 = new JCheckBox("Fait");
		chckbxFait_7.setBounds(69, 275, 64, 23);
		add(chckbxFait_7);
		
		JLabel lblNumrisations = new JLabel("Numérisations");
		lblNumrisations.setBounds(142, 279, 98, 16);
		add(lblNumrisations);
		
		JCheckBox chckbxDroit_7 = new JCheckBox("Droit");
		chckbxDroit_7.setBounds(6, 295, 64, 23);
		add(chckbxDroit_7);
		
		JCheckBox chckbxFait_8 = new JCheckBox("Fait");
		chckbxFait_8.setBounds(69, 295, 64, 23);
		add(chckbxFait_8);
		
		JLabel lblTranscriptionsBraille = new JLabel("Transcriptions braille");
		lblTranscriptionsBraille.setBounds(142, 299, 137, 16);
		add(lblTranscriptionsBraille);
		
		JCheckBox chckbxDroit_8 = new JCheckBox("Droit");
		chckbxDroit_8.setBounds(6, 310, 64, 23);
		add(chckbxDroit_8);
		
		JCheckBox chckbxFait_9 = new JCheckBox("Fait");
		chckbxFait_9.setBounds(69, 310, 59, 23);
		add(chckbxFait_9);
		
		JLabel lblAgrandissements = new JLabel("Agrandissements");
		lblAgrandissements.setBounds(142, 314, 115, 16);
		add(lblAgrandissements);
		
		JCheckBox chckbxDroit_9 = new JCheckBox("Droit");
		chckbxDroit_9.setBounds(6, 330, 64, 23);
		add(chckbxDroit_9);
		
		JCheckBox chckbxFait_10 = new JCheckBox("Fait");
		chckbxFait_10.setBounds(69, 330, 59, 23);
		add(chckbxFait_10);
		
		JLabel lblPrtDeDictaphone = new JLabel("Prêt de dictaphone");
		lblPrtDeDictaphone.setBounds(142, 334, 131, 16);
		add(lblPrtDeDictaphone);
		
		JCheckBox chckbxDroit_10 = new JCheckBox("Droit");
		chckbxDroit_10.setBounds(6, 345, 69, 23);
		add(chckbxDroit_10);
		
		JCheckBox chckbxFait_11 = new JCheckBox("Fait");
		chckbxFait_11.setBounds(69, 345, 64, 23);
		add(chckbxFait_11);
		
		JLabel lblAutres = new JLabel("Autres");
		lblAutres.setBounds(142, 349, 61, 16);
		add(lblAutres);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 344, 366, 26);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAmnagementsDeLa = new JLabel("Aménagements de la formation");
		lblAmnagementsDeLa.setBounds(68, 382, 205, 16);
		add(lblAmnagementsDeLa);
		
		JRadioButton rdbtnOui_2 = new JRadioButton("Oui");
		rdbtnOui_2.setBounds(58, 410, 54, 23);
		add(rdbtnOui_2);
		
		JRadioButton rdbtnNon_2 = new JRadioButton("Non");
		rdbtnNon_2.setBounds(181, 410, 59, 23);
		add(rdbtnNon_2);
		
		JCheckBox chckbxDroit_11 = new JCheckBox("Droit");
		chckbxDroit_11.setBounds(38, 445, 64, 23);
		add(chckbxDroit_11);
		
		JCheckBox chckbxFait_12 = new JCheckBox("Fait");
		chckbxFait_12.setBounds(108, 445, 59, 23);
		add(chckbxFait_12);
		
		JLabel lblDispenseDassiduit = new JLabel("Dispense d'assiduité");
		lblDispenseDassiduit.setBounds(175, 449, 137, 16);
		add(lblDispenseDassiduit);
		
		JCheckBox chckbxDroit_12 = new JCheckBox("Droit");
		chckbxDroit_12.setBounds(38, 469, 75, 23);
		add(chckbxDroit_12);
		
		JCheckBox chckbxFait_13 = new JCheckBox("Fait");
		chckbxFait_13.setBounds(108, 469, 59, 23);
		add(chckbxFait_13);
		
		JLabel lblAmnagementDeLa = new JLabel("Aménagement de la durée de formation");
		lblAmnagementDeLa.setBounds(175, 473, 261, 16);
		add(lblAmnagementDeLa);
		
		JCheckBox chckbxDroit_13 = new JCheckBox("Droit");
		chckbxDroit_13.setBounds(39, 495, 64, 23);
		add(chckbxDroit_13);
		
		JCheckBox chckbxFait_14 = new JCheckBox("Fait");
		chckbxFait_14.setBounds(108, 495, 59, 23);
		add(chckbxFait_14);
		
		JLabel lblAmnagementDesHoraires = new JLabel("Aménagement des horaires");
		lblAmnagementDesHoraires.setBounds(175, 499, 178, 16);
		add(lblAmnagementDesHoraires);
		
		JCheckBox chckbxDroit_14 = new JCheckBox("Droit");
		chckbxDroit_14.setBounds(39, 523, 64, 23);
		add(chckbxDroit_14);
		
		JCheckBox chckbxFait_15 = new JCheckBox("Fait");
		chckbxFait_15.setBounds(108, 523, 59, 23);
		add(chckbxFait_15);
		
		JLabel lblDispenseDeStage = new JLabel("Dispense de stage");
		lblDispenseDeStage.setBounds(175, 527, 122, 16);
		add(lblDispenseDeStage);

	}

	public AmenagementsCours(String utilisateur) {
		// TODO Auto-generated constructor stub
	}
}