package fenetre.ecrans;

import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import interfaces.GestionFichierCSV;

public class CarnetDeVisiteEtCommentaires extends AbstractJPanel implements GestionFichierCSV {

	/**
	 * Create the panel.
	 */
	
	private boolean nouveau;
	private String numEtudiant;
	private final LectureFichierCSV fichierCarnetVisite = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/carnet_des_visites_et_commentaires.csv");
	
	public CarnetDeVisiteEtCommentaires() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		
		setLayout(null);
		
		JLabel lblIndiquerLesJours = new JLabel("Indiquer le(s) jour(s) de(s) (la) rencontre(s) et son (leurs) objet(s) :");
		
		gestionChampsEtExceptions(lblIndiquerLesJours, 23, 26, 420, 14, null, true, true, null, null, null, null, null, null, null, null);
		
		JTextArea textArea = new JTextArea();
		
		gestionChampsEtExceptions(textArea, 10, 51, 707, 436, null, true, true, true, null, null, null, null, "", null, null);
	}
	
	public CarnetDeVisiteEtCommentaires(String numEtudiant) throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		
		gererInfosFichierCSV(fichierCarnetVisite);
	}

	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier)
			throws LongueurDifferenteListesException, NullArgumentException {
		
		ArrayList<String[]> etudiants = fichier.chargerFichier();
		
		ArrayList<String[]> infosMultiplesEtudiants = fichier.retournerInfosMultiplesEtudiant(etudiants, this.numEtudiant);
		
		StringBuilder infosEtudiant = new StringBuilder();
		
		for(int i=0;i<infosMultiplesEtudiants.size();i++) {
			for(int j=1;j<infosMultiplesEtudiants.get(i).length;j++) {
				infosEtudiant.append(infosMultiplesEtudiants.get(i)[j] + " ");
			}
			infosEtudiant.append("\n\n");
		}
		
		setLayout(null);
		
		JLabel lblIndiquerLesJours = new JLabel("Indiquer le(s) jour(s) de(s) (la) rencontre(s) et son (leurs) objet(s) :");
		
		gestionChampsEtExceptions(lblIndiquerLesJours, 23, 26, 420, 14, null, true, true, null, null, null, null, null, null, null, null);
		
		JTextArea textArea = new JTextArea();
		
		gestionChampsEtExceptions(textArea, 10, 51, 707, 436, null, true, true, true, null, null, null, null, infosEtudiant.toString(), null, null);
		
	}
}