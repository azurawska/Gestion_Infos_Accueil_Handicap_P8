package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Classe permettant de charger un fichier txt en mémoire. Cette classe est notamment utilisé pour le remplissage des comboBox et servira, par la suite, à écrire dynamiquement les JLabels de certains écrans, qui sont, pour le moment, écrits en brut.
 * @author alexis
 *
 */

public class LectureFichierTXT {

	/**
	 * Le chemin du fichier sur le disque dur.
	 */
	
	private String file_path;
	
	/**
	 * 
	 * @return Le chemin absolu du fichier sur le disque dur.
	 */
	
	public String getFile_path() {
		return file_path;
	}

	/**
	 * Construit une instance de LectureFichierTXT.
	 * @param file_path: Le chemin absolu du fichier sur le disque dur.
	 */
	
	public LectureFichierTXT(String file_path) {
		this.file_path=file_path;
	}
	
	/**
	 * Méthode permettant de charger en mémoire le fichier trouvé par l'application grâce à la variable file_path.
	 * @return: Le tableau contenant les données du fichier chargées en mémoire.
	 */
	
	public ArrayList<String> chargerFichier() {
		
		FileReader fichier = null;
		BufferedReader ligne = null;
		String donnee = null;
		ArrayList<String> donnees = new ArrayList<String>();
		
		try {
			fichier = new FileReader(file_path);
			ligne = new BufferedReader(fichier);
			
			while((donnee=ligne.readLine())!=null) {
				donnees.add(donnee);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ligne.close();
				fichier.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return donnees;
	}
}