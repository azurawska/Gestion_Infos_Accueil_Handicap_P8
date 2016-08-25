/**
 * 
 */
package interfaces;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;

/**
 * @author alexis
 *Interface implémentée par toutes les classes devant récupérer des données en mémoire dans un tableau afin de les utiliser pour compléter les différents formulaires.
 *
 */
public interface GestionFichierCSV {

	/**
	 * 
	 * @param fichier le fichier de données à enregistrer en mémoire et dont les données vont être utilisées dans un écran précis.
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 * @See Identite
	 * @See Authentification
	 * @See ParcoursAnterieurP8
	 * @See Projets
	 * @See CarnetDeVisiteEtCommentaires
	 * @See Menesr
	 * @See NotesReussite
	 * @See Inscriptions
	 * @See Handicap
	 * @See Amenagements
	 * @See AmenagementsCours
	 * @See AmenagementsExamens
	 */
	
	void gererInfosFichierCSV(LectureFichierCSV fichier) throws LongueurDifferenteListesException, NullArgumentException;
}