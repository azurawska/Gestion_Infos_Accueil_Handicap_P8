package action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import fenetre.Authentification;

public class SuivantAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(Authentification.getTextField_num_etudiant().getText()=="" && Authentification.getTextField_nom().getText()=="" && Authentification.getTextField_prenom().getText()=="") {
			JOptionPane.showMessageDialog(null, "Veuillez renseigner au moins l'un des trois champs SVP.", "Erreur", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}