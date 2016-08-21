package fenetre.ecrans;

import javax.swing.JPanel;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import fenetre.composants.AffectationPrioritaire;
import interfaces.GestionFichierCSV;

import java.util.ArrayList;

import javax.swing.JCheckBox;

public class Inscription extends AbstractJPanel implements GestionFichierCSV {

	private boolean nouveau;
	private String numEtudiant;
	
	private AffectationPrioritaire chckbxAffectationPrioritaire;
	
	private final LectureFichierCSV fichierInscriptions = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/inscriptions.csv");
	
	/**
	 * Create the panel.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public Inscription() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		
		setLayout(null);
		
		chckbxAffectationPrioritaire = new AffectationPrioritaire("Affectation prioritaire");
		
		gestionChampsEtExceptions(chckbxAffectationPrioritaire, 6, 6, 173, 23, null, true, true, null, false, null, null, null, "", null, null);

	}

	public Inscription(String numEtudiant) throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		
		gererInfosFichierCSV(fichierInscriptions);
	}

	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier)
			throws LongueurDifferenteListesException, NullArgumentException {
			
		ArrayList<String[]> etudiants = this.fichierInscriptions.chargerFichier();
		String[] etudiant = this.fichierInscriptions.retournerInfosEtudiant(etudiants, this.numEtudiant);
		
		setLayout(null);
		
		chckbxAffectationPrioritaire = new AffectationPrioritaire("Affectation prioritaire");
		
		gestionChampsEtExceptions(chckbxAffectationPrioritaire, 6, 6, 173, 23, null, true, true, null, false, null, null, null, etudiant[1], null, null);
	}
}