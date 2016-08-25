/**
 * 
 */
package interfaces;

import fenetre.composants.Droit;
import fenetre.composants.Fait;

/**
 * @author alexis
 *Interface implémentée par les classes AmenagementsCours et AmenagementsExamens
 */
public interface GestionCasesCochesAmenagements {
	
	/**
	 * Méthode permettant la gestion des cases cochées (droit coché si fait coché, apparition de certains composants si certaines cases cochées, etc...)
	 * @param droit un droit à un aménagement représenté sous forme d'une JCheckBox (appliqué ou pas, car coché si case fait cochée)
	 * @param fait droit à un aménagement appliqué représenté lui aussi sous forme d'une JCheckBox
	 * @See Droit
	 * @See Fait
	 */
	
	void gererCasesCochesAmenagements(Droit droit, Fait fait);

}