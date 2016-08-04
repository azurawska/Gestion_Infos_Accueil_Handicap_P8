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
 *
 */
public interface DonneesTabbedPane {
	
	ArrayList<String> titresOnglets();
	ArrayList<AbstractJPanel> ongletsNouvelUtilisateur() throws LongueurDifferenteListesException, NullArgumentException;
	ArrayList<AbstractJPanel> ongletsUtilisateurExistant(String utilisateur) throws LongueurDifferenteListesException, NullArgumentException;
}