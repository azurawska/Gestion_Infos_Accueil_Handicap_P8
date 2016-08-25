package fenetre.ecrans;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import fenetre.composants.AffectationPrioritaire;
import interfaces.GestionFichierCSV;

import java.util.ArrayList;

/**
 * Ecran concernant les inscriptions de l'étudiant par année d'études. Cette classe est à développer.
 * @author alexis
 *
 */

public class Inscription extends AbstractJPanel implements GestionFichierCSV {

	/**
	 * Indique si l'étudiant est nouveau ou pas
	 */
	
	private boolean nouveau;
	
	/**
	 * Le numéro d'étudiant
	 */
	
	private String numEtudiant;
	
	/**
	 * Indique si l'étudiant est prioritaire concernant son affectation au sein de l'université Paris 8 en fonction de sa zone géographique d'habitation
	 */
	
	private AffectationPrioritaire chckbxAffectationPrioritaire;
	
	/**
	 * Variable permettant de travailler avec le fichier contenant les informations concernant les inscriptions à l'université Paris 8 pour chaque étudiant
	 */
	
	private final LectureFichierCSV fichierInscriptions = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/inscriptions.csv");
	
	/**
	 * Create the panel for a new student.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public Inscription() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		
		setLayout(null);
		
		chckbxAffectationPrioritaire = new AffectationPrioritaire("Affectation prioritaire");
		
		gestionChampsEtExceptions(chckbxAffectationPrioritaire, 6, 6, 173, 23, null, true, true, null, false, null, null, null, "", null, null, null);

	}

	/**
	 * Crée le panel en collectant les informations de l'étudiant à partir de son numéro lorsque celui-ci est répertorié
	 * @param numEtudiant le numéro d'étudiant
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
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
		
		gestionChampsEtExceptions(chckbxAffectationPrioritaire, 6, 6, 173, 23, null, true, true, null, false, null, null, null, etudiant[1], null, null, null);
	}
}