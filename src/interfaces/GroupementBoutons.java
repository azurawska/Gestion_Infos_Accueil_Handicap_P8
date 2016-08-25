/**
 * 
 */
package interfaces;

import javax.swing.ButtonGroup;

/**
 * @author alexis
 * Interface implémentée par tous les écrans contenant des groupes de boutons radio où il ne doit y en avoir qu'un seul qui doit être coché sur tous.
 */
public interface GroupementBoutons {
	
	/**
	 * Méthode groupant des boutons radio dans le ButtonGroup passé en paramètres.
	 * @param boutons le ButtonGroup contenant les boutons afin qu'un seul bouton ne puisse être sélectionné.
	 * @See Handicap
	 * @See Identite
	 * @See AmenagementsCours
	 * @See AmenagementsExamens
	 * @See ParcoursAnterieurP8
	 * @See Menesr
	 */
	
	void regrouperBoutons(ButtonGroup boutons);
}