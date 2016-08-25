package interfaces;

import data.LectureFichierTXT;

/**
 * @author alexis
 *Interface implémentée par les classes contenant des JLabel qui peuvent potentiellement changer d'une année à l'autre et par les classes contenant des JComboBox à remplir.
 */

public interface GestionFichierTXT {
	
	/**
	 * Méthode chargeant en mémoire le fichier passé en paramètre. Contrairement à la méthode gererInfosFichierCSV de l'interface GestionFichierCSV, le fichier sera, dans cette méthode, chargée dans une ArrayList<String> et non une ArrayList<String[]>
	 * @param lectureFichier le fichier à charger en mémoire
	 * @See Amenagements
	 * @See Menesr
	 * @See AmenagementsCours
	 * @See AmenagementsExamens
	 */
	
	void gererInfosFichierTXT(LectureFichierTXT lectureFichier);
}