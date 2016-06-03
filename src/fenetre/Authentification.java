package fenetre;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import action.SuivantAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.JButton;

public class Authentification extends JPanel {
	private static JTextField textField_num_etudiant;
	private static JTextField textField_nom;
	private static JTextField textField_prenom;
	
	private JButton btnSuivant;

	/**
	 * Create the panel.
	 */
	public Authentification() {
		setLayout(null);
		
		JLabel lblNEtudiant = new JLabel("N° Etudiant :");
		lblNEtudiant.setBounds(66, 25, 62, 29);
		add(lblNEtudiant);
		
		textField_num_etudiant = new JTextField();
		textField_num_etudiant.setBounds(147, 29, 86, 20);
		add(textField_num_etudiant);
		textField_num_etudiant.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(76, 69, 46, 14);
		add(lblNom);
		
		textField_nom = new JTextField();
		textField_nom.setBounds(147, 66, 86, 20);
		add(textField_nom);
		textField_nom.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Prénom :");
		lblPrnom.setBounds(66, 113, 46, 14);
		add(lblPrnom);
		
		textField_prenom = new JTextField();
		textField_prenom.setBounds(147, 110, 86, 20);
		add(textField_prenom);
		textField_prenom.setColumns(10);
		
		btnSuivant = new JButton("Suivant");
		btnSuivant.setBounds(96, 164, 89, 23);
		btnSuivant.addActionListener(new SuivantAction());
		add(btnSuivant);

	}

	public static JTextField getTextField_num_etudiant() {
		return textField_num_etudiant;
	}

	public static JTextField getTextField_nom() {
		return textField_nom;
	}

	public static JTextField getTextField_prenom() {
		return textField_prenom;
	}
}