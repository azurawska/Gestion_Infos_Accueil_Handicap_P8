package exceptions;

/**
 * Classe d'exception concernant la longueur des listes pour les onglets.
 * @author alexis
 *@see Accueil
 *@see Amenagements
 */

public class LongueurDifferenteListesException extends Exception {

	/**
	 * Exception lancée en cas de longueur de listes différentes entre les onglets et les titres si celles-ci ne sont pas nulles toutes les deux.
	 * @see Main
	 */
	
	public LongueurDifferenteListesException() {
		// TODO Auto-generated constructor stub
		System.out.println("Les listes d'onglets et de titres d'onglets n'ont pas la même longueur !");
	}
}