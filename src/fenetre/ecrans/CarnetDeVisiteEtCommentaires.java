package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import interfaces.GestionFichierCSV;

/**
 * Ecran récaptiulant les visites à l'accueil handicap ainsi que leurs objets respectifs.
 * @author alexis
 *
 */

public class CarnetDeVisiteEtCommentaires extends AbstractJPanel implements GestionFichierCSV {
	
	/**
	 * Indique si l'étudiant est nouveau ou pas.
	 */
	
	private boolean nouveau;
	
	/**
	 * Le numéro d'étudiant
	 */
	
	private String numEtudiant;
	
	/**
	 * Variable permettant de travailler avec le fichier contenant les dates de visite à l'accueil handicap et leurs objets respectifs.
	 */
	
	private final LectureFichierCSV fichierCarnetVisite = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/carnet_des_visites_et_commentaires.csv");
	
	/**
	 * Create the panel for a new student.
	 */
	
	public CarnetDeVisiteEtCommentaires() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		
		JScrollPane pane = new JScrollPane();
		
		setLayout(null);
		
		JLabel lblIndiquerLesJours = new JLabel("Indiquer le(s) jour(s) de(s) (la) rencontre(s) et son (leurs) objet(s) :");
		
		gestionChampsEtExceptions(lblIndiquerLesJours, 23, 26, 420, 14, null, true, true, null, null, null, null, null, null, null, null, null);
		
		JTextArea textArea = new JTextArea();
		
		gestionChampsEtExceptions(textArea, 10, 51, 707, 436, null, true, true, true, null, null, null, null, "", null, null, pane);
		
		gestionChampsEtExceptions(pane, 10, 51, 707, 436, null, true, true, null, null, null, null, null, null, null, null, null);
	}
	
	/**
	 * Crée le panel en collectant les informations de l'étudiant à partir de son numéro lorsque celui-ci est répertorié
	 * @param numEtudiant le numéro d'étudiant
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
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
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblIndiquerLesJours = new JLabel("Indiquer le(s) jour(s) de(s) (la) rencontre(s) et son (leurs) objet(s) :");
		
		JScrollPane pane = new JScrollPane();
		
		gestionChampsEtExceptions(lblIndiquerLesJours, 23, 26, 420, 14, null, true, true, null, null, null, null, null, null, null, null, null);
	
		gestionChampsEtExceptions(textArea, 10, 51, 707, 436, null, true, true, true, null, null, null, null, infosEtudiant.toString(), null, null, pane);
		
		gestionChampsEtExceptions(pane, 10, 51, 707, 436, null, true, true, null, null, null, null, null, null, null, null, null);
		
	}
}