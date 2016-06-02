package fenetre;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Authentification extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Authentification() {
		setLayout(null);
		
		JLabel lblNEtudiant = new JLabel("N° Etudiant :");
		lblNEtudiant.setBounds(66, 25, 62, 29);
		add(lblNEtudiant);
		
		textField = new JTextField();
		textField.setBounds(147, 29, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(76, 69, 46, 14);
		add(lblNom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 66, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Prénom :");
		lblPrnom.setBounds(66, 113, 46, 14);
		add(lblPrnom);
		
		textField_2 = new JTextField();
		textField_2.setBounds(147, 110, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.setBounds(96, 164, 89, 23);
		add(btnSuivant);

	}
}
