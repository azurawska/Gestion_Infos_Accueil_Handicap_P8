package fenetre;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.JButton;

public class Authentification extends JPanel {
	private JTextField textField_num_etudiant;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	
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
		textField_num_etudiant.addMouseListener(new QuitNumEtudiantFieldMouseEvent());
		
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
	
	private class SuivantAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(textField_num_etudiant.getText().equals("") && textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Veuillez renseigner au moins l'un des trois champs SVP.", "Erreur", JOptionPane.ERROR_MESSAGE);
			}
			else {
				if(!textField_num_etudiant.getText().equals("") && textField_nom.getText().equals("") && textField_nom.getText().equals("")) {
					
				}
			}
			
		}
		
	}
	
	private class QuitNumEtudiantFieldMouseEvent implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if(!textField_num_etudiant.getText().equals("")) {
				textField_nom.setText("");
				textField_nom.setEditable(false);
				textField_prenom.setText("");
				textField_prenom.setEditable(false);
			}
			else {
				textField_nom.setEditable(true);
				textField_prenom.setEditable(true);
			}
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}