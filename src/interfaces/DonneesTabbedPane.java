/**
 * 
 */
package interfaces;

import java.util.ArrayList;

import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;

/**
 * @author alexis
 *Interface implémentée pour toutes les classes contenant des TabbedPane (Accueil et Amenagements).
 */
public interface DonneesTabbedPane {
	
	/**
	 * 
	 * @return la liste des titres des onglets.
	 */
	
	ArrayList<String> titresOnglets();
	
	/**
	 * 
	 * @return les onglets dans le cas d'un nouvel utilisateur
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
	ArrayList<AbstractJPanel> ongletsNouvelUtilisateur() throws LongueurDifferenteListesException, NullArgumentException;
	
	/**
	 * 
	 * @param utilisateur l'étudiant
	 * @return les onglets dans le cas d'un utilisateur déjà répertorié.
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
	ArrayList<AbstractJPanel> ongletsUtilisateurExistant(String utilisateur) throws LongueurDifferenteListesException, NullArgumentException;
}