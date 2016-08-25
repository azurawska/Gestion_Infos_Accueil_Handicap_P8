import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.Fenetre;
import fenetre.composants.AbstractJPanel;

/**
 * Classe de lancement de l'application
 * @author alexis
 *
 */

public class Main {

	/**
	 * 
	 * @param args
	 * @throws LongueurDifferenteListesException: Lorsque la méthode gestionChampsEtExceptions de la classe AbstractJpanel est exécutée, celle-ci renvoie cette exception si les listes d'onglets et de leurs titres respectifs sont de longueurs différentes.
	 * @throws NullArgumentException: Cette exception ne sera sans doute jamais lancée. Initialement prévue au cas où il y aurait seulement l'une des deux listes qui n'était pas à null. Or, le NullPointerException s'en trouvera, sans doute, lancé d'office, après réflexion, si ce cas se présentait.
	 * @see AbstractJPanel
	 */
	
	public static void main(String[] args) throws LongueurDifferenteListesException, NullArgumentException {
		// TODO Auto-generated method stub
		Fenetre fenetre = Fenetre.getInstance();
	}
}