package fenetre;

import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import data.LectureFichier;

public class CarnetDeVisiteEtCommentaires extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private boolean nouveau;
	private String numEtudiant;
	
	public CarnetDeVisiteEtCommentaires() {
		this.nouveau=true;
		
		setLayout(null);
		
		JLabel lblIndiquerLesJours = new JLabel("Indiquer le(s) jour(s) de(s) (la) rencontre(s) et son (leurs) objet(s) :");
		lblIndiquerLesJours.setBounds(23, 26, 420, 14);
		add(lblIndiquerLesJours);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 51, 707, 436);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		add(textArea);
	}
	
	public CarnetDeVisiteEtCommentaires(String numEtudiant) {
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		
		LectureFichier fichierCarnetVisite = new LectureFichier("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/carnet_des_visites_et_commentaires.csv");
		
		ArrayList<String[]> etudiants = fichierCarnetVisite.chargerFichier();
		
		ArrayList<String[]> infosMultiplesEtudiants = fichierCarnetVisite.retournerInfosMultiplesEtudiant(etudiants, this.numEtudiant);
		
		StringBuilder infosEtudiant = new StringBuilder();
		
		for(int i=0;i<infosMultiplesEtudiants.size();i++) {
			for(int j=1;j<infosMultiplesEtudiants.get(i).length;j++) {
				infosEtudiant.append(infosMultiplesEtudiants.get(i)[j] + " ");
			}
			infosEtudiant.append("\n\n");
		}
		
		setLayout(null);
		
		JLabel lblIndiquerLesJours = new JLabel("Indiquer le(s) jour(s) de(s) (la) rencontre(s) et son (leurs) objet(s) :");
		lblIndiquerLesJours.setBounds(23, 26, 420, 14);
		add(lblIndiquerLesJours);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 51, 707, 436);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setText(infosEtudiant.toString());
		add(textArea);
	}
}