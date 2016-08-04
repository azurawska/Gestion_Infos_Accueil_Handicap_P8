package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import fenetre.composants.AbstractJPanel;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class Menesr extends AbstractJPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Menesr() {
		setLayout(null);
		
		JLabel lblFicheMinistrielleN = new JLabel("Fiche ministérielle N°");
		lblFicheMinistrielleN.setBounds(31, 16, 144, 16);
		add(lblFicheMinistrielleN);
		
		textField = new JTextField();
		textField.setBounds(190, 11, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblDossierMdph = new JLabel("Dossier MDPH");
		lblDossierMdph.setBounds(31, 44, 96, 16);
		add(lblDossierMdph);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(190, 41, 171, 27);
		add(comboBox);
		
		JLabel lblTauxDincapacit = new JLabel("Taux d'incapacité");
		lblTauxDincapacit.setBounds(31, 70, 124, 16);
		add(lblTauxDincapacit);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(190, 66, 254, 27);
		add(comboBox_1);
		
		JLabel lblCarteDinvalidit = new JLabel("Carte d'invalidité");
		lblCarteDinvalidit.setBounds(31, 98, 116, 16);
		add(lblCarteDinvalidit);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(159, 94, 116, 27);
		add(comboBox_2);
		
		JLabel lblCarteDePriorit = new JLabel("Carte de priorité");
		lblCarteDePriorit.setBounds(31, 118, 116, 16);
		add(lblCarteDePriorit);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(159, 114, 116, 27);
		add(comboBox_3);
		
		JLabel lblCarteEuropenneDe = new JLabel("Carte européenne de stationnement");
		lblCarteEuropenneDe.setBounds(31, 143, 233, 16);
		add(lblCarteEuropenneDe);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(278, 136, 144, 23);
		add(comboBox_4);
		
		JLabel lblAccompagnementParUn = new JLabel("Accompagnement par un auxiliaire de vie");
		lblAccompagnementParUn.setBounds(19, 173, 267, 16);
		add(lblAccompagnementParUn);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(298, 171, 146, 23);
		add(comboBox_5);
		
		JLabel lblPrestationCompensationAu = new JLabel("Prestation Compensation au Handicap (PCH)");
		lblPrestationCompensationAu.setBounds(31, 194, 283, 16);
		add(lblPrestationCompensationAu);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(321, 195, 123, 16);
		add(comboBox_6);
		
		JLabel lblAideAuTravail = new JLabel("Aide au Travail Personnel à Domicile");
		lblAideAuTravail.setBounds(31, 222, 240, 16);
		add(lblAideAuTravail);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(264, 223, 158, 16);
		add(comboBox_7);
		
		JLabel lblRecoursUn = new JLabel("Recours à un transport spécifique");
		lblRecoursUn.setBounds(31, 250, 223, 16);
		add(lblRecoursUn);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(264, 251, 148, 16);
		add(comboBox_8);
		
		JLabel lblReconnaissanceQualitTravailleur = new JLabel("Reconnaissance Qualité Travailleur Handicapé (RQTH)");
		lblReconnaissanceQualitTravailleur.setBounds(31, 278, 345, 16);
		add(lblReconnaissanceQualitTravailleur);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(372, 268, 157, 26);
		add(comboBox_9);
		
		JLabel lblAllocationAdulteHandicap = new JLabel("Allocation Adulte Handicapé (AAH)");
		lblAllocationAdulteHandicap.setBounds(31, 306, 223, 16);
		add(lblAllocationAdulteHandicap);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBounds(264, 302, 223, 27);
		add(comboBox_10);
		
		JLabel lblAutreProfessionnelDe = new JLabel("Autre professionnel de soins ou de rééducation");
		lblAutreProfessionnelDe.setBounds(31, 334, 313, 16);
		add(lblAutreProfessionnelDe);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setBounds(356, 330, 173, 27);
		add(comboBox_11);
		
		JLabel lblSuiviPsychologique = new JLabel("Suivi psychologique");
		lblSuiviPsychologique.setBounds(31, 362, 130, 16);
		add(lblSuiviPsychologique);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setBounds(173, 358, 356, 27);
		add(comboBox_12);
		
		JLabel lblTransportSpcialisDans = new JLabel("Transport spécialisé dans le cadre des études");
		lblTransportSpcialisDans.setBounds(31, 390, 294, 16);
		add(lblTransportSpcialisDans);
		
		JRadioButton rdbtnOui = new JRadioButton("Oui");
		rdbtnOui.setBounds(346, 386, 59, 23);
		add(rdbtnOui);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setBounds(407, 386, 66, 23);
		add(rdbtnNon);
		
		JLabel lblTypeDeTransport = new JLabel("Type de transport :");
		lblTypeDeTransport.setBounds(31, 412, 130, 16);
		add(lblTypeDeTransport);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 407, 253, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNomDeLa = new JLabel("Nom de la société :");
		lblNomDeLa.setBounds(31, 432, 130, 16);
		add(lblNomDeLa);
		
		textField_2 = new JTextField();
		textField_2.setBounds(170, 427, 252, 26);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTlphone = new JLabel("Téléphone :");
		lblTlphone.setBounds(31, 450, 81, 16);
		add(lblTlphone);
		
		textField_3 = new JTextField();
		textField_3.setBounds(173, 445, 249, 26);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setBounds(31, 471, 61, 16);
		add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(173, 466, 249, 26);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAccompagnementParUn_1 = new JLabel("Accompagnement par un assistant de vie/accompagnateur");
		lblAccompagnementParUn_1.setBounds(31, 499, 381, 16);
		add(lblAccompagnementParUn_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Oui\n");
		rdbtnNewRadioButton.setBounds(424, 492, 59, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNon_1 = new JRadioButton("Non");
		rdbtnNon_1.setBounds(484, 495, 59, 23);
		add(rdbtnNon_1);

	}

	public Menesr(String numEtudiant) {
		// TODO Auto-generated constructor stub
	}
}
