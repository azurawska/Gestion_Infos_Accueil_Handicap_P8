package fenetre;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Identite extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	/**
	 * Create the panel.
	 */
	public Identite() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Date de création du dossier :");
		lblNewLabel.setBounds(10, 11, 170, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(204, 8, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Dernière mise à jour :");
		lblNewLabel_1.setBounds(10, 36, 130, 14);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(204, 39, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("N° Etudiant :");
		lblNewLabel_2.setBounds(10, 73, 75, 14);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(204, 70, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M");
		rdbtnNewRadioButton.setBounds(10, 103, 38, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMme = new JRadioButton("Mme");
		rdbtnMme.setBounds(50, 103, 60, 23);
		add(rdbtnMme);
		
		JLabel lblNewLabel_3 = new JLabel("Nom de naissance :");
		lblNewLabel_3.setBounds(10, 133, 120, 14);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(204, 130, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nom d'époux(se) :");
		lblNewLabel_4.setBounds(10, 159, 110, 14);
		add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(204, 161, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Prénom :");
		lblNewLabel_5.setBounds(20, 195, 55, 14);
		add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(204, 192, 86, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance :");
		lblDateDeNaissance.setBounds(10, 234, 115, 14);
		add(lblDateDeNaissance);
		
		textField_6 = new JTextField();
		textField_6.setBounds(214, 231, 86, 20);
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Domicile :");
		lblNewLabel_6.setBounds(27, 259, 55, 14);
		add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(83, 262, 247, 20);
		add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblCodePostal = new JLabel("Code postal :");
		lblCodePostal.setBounds(27, 300, 75, 14);
		add(lblCodePostal);
		
		textField_8 = new JTextField();
		textField_8.setBounds(186, 293, 86, 20);
		add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setBounds(36, 336, 30, 14);
		add(lblVille);
		
		textField_9 = new JTextField();
		textField_9.setBounds(186, 336, 86, 20);
		add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblTlphone = new JLabel("Téléphone :");
		lblTlphone.setBounds(27, 380, 75, 14);
		add(lblTlphone);
		
		textField_10 = new JTextField();
		textField_10.setBounds(186, 377, 86, 20);
		add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setBounds(37, 413, 46, 14);
		add(lblEmail);
		
		textField_11 = new JTextField();
		textField_11.setBounds(186, 408, 86, 20);
		add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblCoordonnesDunePersonnes = new JLabel("Coordonnées d'une personne à contacter en cas d'urgence : ");
		lblCoordonnesDunePersonnes.setBounds(356, 11, 350, 14);
		add(lblCoordonnesDunePersonnes);
		
		JLabel lblNewLabel_7 = new JLabel("Nom :");
		lblNewLabel_7.setBounds(366, 36, 46, 14);
		add(lblNewLabel_7);
		
		textField_12 = new JTextField();
		textField_12.setBounds(427, 33, 86, 20);
		add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Prénom :");
		lblNewLabel_8.setBounds(356, 61, 55, 14);
		add(lblNewLabel_8);
		
		textField_13 = new JTextField();
		textField_13.setBounds(427, 64, 86, 20);
		add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblTlphone_1 = new JLabel("Téléphone :");
		lblTlphone_1.setBounds(356, 95, 69, 14);
		add(lblTlphone_1);
		
		textField_14 = new JTextField();
		textField_14.setBounds(427, 92, 86, 20);
		add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblEmail_1 = new JLabel("E-mail :");
		lblEmail_1.setBounds(366, 120, 46, 14);
		add(lblEmail_1);
		
		textField_15 = new JTextField();
		textField_15.setBounds(427, 120, 86, 20);
		add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblCoordonnesDunPartenaire = new JLabel("Coordonnées d'un partenaire extérieur (psy, médecin, etc...) :");
		lblCoordonnesDunPartenaire.setBounds(356, 164, 350, 14);
		add(lblCoordonnesDunPartenaire);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(366, 195, 45, 14);
		add(lblNom);
		
		textField_16 = new JTextField();
		textField_16.setBounds(467, 192, 86, 20);
		add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Prénom :");
		lblPrnom.setBounds(366, 234, 55, 14);
		add(lblPrnom);
		
		textField_17 = new JTextField();
		textField_17.setBounds(467, 223, 86, 20);
		add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblTlphone_2 = new JLabel("Téléphone :");
		lblTlphone_2.setBounds(356, 259, 75, 14);
		add(lblTlphone_2);
		
		textField_18 = new JTextField();
		textField_18.setBounds(467, 256, 86, 20);
		add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblEmail_2 = new JLabel("E-mail :");
		lblEmail_2.setBounds(366, 296, 46, 14);
		add(lblEmail_2);
		
		textField_19 = new JTextField();
		textField_19.setBounds(467, 287, 86, 20);
		add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblFonction = new JLabel("Fonction :");
		lblFonction.setBounds(366, 336, 65, 14);
		add(lblFonction);
		
		textField_20 = new JTextField();
		textField_20.setBounds(467, 330, 86, 20);
		add(textField_20);
		textField_20.setColumns(10);

	}
}
