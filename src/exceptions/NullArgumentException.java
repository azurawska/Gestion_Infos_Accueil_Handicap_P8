package exceptions;

/**
 * Classe concernant les onglets et leurs titres respectifs pour savoir s'il y en a une des deux qui n'est pas renseignée.
 * @author alexis
 *
 */

public class NullArgumentException extends Exception {

	/**
	 * Exception qui ne sera peut-être jamais lancée.
	 * @See Main
	 */
	
	public NullArgumentException() {
		System.out.println("L'une des listes passées en paramètres est null.");
	}
}