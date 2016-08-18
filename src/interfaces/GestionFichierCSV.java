/**
 * 
 */
package interfaces;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;

/**
 * @author alexis
 *
 */
public interface GestionFichierCSV {

	void gererInfosFichierCSV(LectureFichierCSV fichier) throws LongueurDifferenteListesException, NullArgumentException;
}