package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTextField;

/**
 * Classe permettant de lire les données dans un fichier et de les charger en mémoire. Cette classe devra, par la suite, gérer l'écriture dans un fichier et donc être renommée autrement.
 * @author alexis
 *
 */

public class LectureFichierCSV {
	
	/**
	 * Chemin du fichier sur le disque dur.
	 */
	
	private String file_path;
	
	/**
	 * Constructeur d'une instance de la classe LectureFichierCSV prenant le fichier sur lequel on travaille en paramètre. Cette classe est utile, notamment, pour renseigner les écrans en fonction de l'étudiant recherché dans l'écran d'authentification.
	 * @param file_path: Le fichier de données.
	 */
	
	public LectureFichierCSV(String file_path) {
		this.file_path=file_path;
	}
	
	/**
	 * Charge le fichier passé en paramètre en mémoire.
	 * @return Le fichier chargé en mémoire dans une ArrayList de tableaux de String représentant une liste d'étudiants ayant chacun des infos, ces infos variant en fonction de l'écran dans lequel on navigue (identité, handicap, etc...).
	 */
	
	public ArrayList<String[]> chargerFichier() {
		FileReader fichier = null;
		BufferedReader premiereLigne = null;
		String ligne=null;
		String[] tableauIntermediaire=null;
		ArrayList<String[]> donnees = new ArrayList<String[]>();
		int i = 0;
		int j = 0;
		
		try {
			fichier = new FileReader(file_path);
			premiereLigne = new BufferedReader(fichier);
			ligne=premiereLigne.readLine();
			tableauIntermediaire = ligne.split(";");
			donnees.add(tableauIntermediaire);
			while((ligne = premiereLigne.readLine())!=null && i!=donnees.size()) { //Chargement du fichier en m�moire.
				tableauIntermediaire=ligne.split(";");
				donnees.add(tableauIntermediaire);
			}
			
		} catch(IOException exception) {
			exception.printStackTrace();
		} catch(Exception exception3) {
			exception3.printStackTrace();
		}
		finally {
			try {
				premiereLigne.close();
				fichier.close();
			} catch(IOException exception1) {
				exception1.printStackTrace();
			}
		}
		return donnees;
	}
	
	/**
	 * Méthode n'ayant servi qu'une fois pour créer une classe de test et véfier que la valeur retournée était bien celle que nous voulions, avant de continuer le projet.
	 * @param tableau: l'ensemble des lignes d'informations de chaque étudiant contenu dans le fichier en paramètre.
	 * @param index1: l'indice représentant un étudiant
	 * @param index2: l'indice représentant une information d'un étudiant
	 * @return
	 */
	
	public String getString(ArrayList<String[]> tableau, int index1, int index2) {
		String chaine = "";
		
		for(int i=0;i<tableau.size();i++) {
			if(i==index1) {
			for(int j=0;j<tableau.get(i).length;j++) {
				if(j==index2) {
					chaine=tableau.get(i)[j];
					}
				}
			}
		}
		
		return chaine;
	}
	
	/**
	 * Méthode retournant la chaine passée en paramètre si celle-ci existe dans le tableau également passé en paramètre.
	 * @param tableau: l'ensemble des étudiants et de leurs informations
	 * @param chaine: la chaine à retourner si elle existe.
	 * @return la chaîne passée en paramètre si elle a été trouvée dans le tableau.
	 */
	
	public String retournerChaine(ArrayList<String[]> tableau, String chaine) {
		
		for(int i=0;i<tableau.size();i++) {
			for(int j=0;j<tableau.get(i).length;j++) {
				if(tableau.get(i)[j].equals(chaine)) {
					return chaine;
				}
			}
		}
		return null;
	}
	
	/**
	 * Méthode retournant les chaîne qui se trouve à un index précis du tableau également passé en paramètre. Ces chaînes représentent une information commune aux étudiants (tous les noms des étudiants par exemple).
	 * @param tableau: l'ensemble des étudiants et de leurs informations;
	 * @param index: l'endroit du tableau où se trouve les chaînes à retourner.
	 * @return
	 */
	
	public ArrayList<String> retournerChaines(ArrayList<String[]> tableau, int index) {
		
		ArrayList<String> chaines = new ArrayList<String>();
		
		for(int i=0;i<tableau.size();i++) {
			chaines.add(tableau.get(i)[index]);
		}
		
		return chaines;
	}
	
	/**
	 * Méthode retournant l'indice de la chaîne passée en paramètre dans le tableau également passé en paramètre.
	 * @param tableau: l'ensemble des étudiants et de leurs informations;
	 * @param chaine: une des informations d'un des étudiants.
	 * @return L'indice du tableau où se trouve l'information passée en paramètre.
	 */
	
	public int retournerIndexChaine(ArrayList<String[]> tableau, String chaine) {
		for(int i=0;i<tableau.size();i++) {
			for(int j=0;j<tableau.get(i).length;j++) {
				if(tableau.get(i)[j].equals(chaine)) {
					return j;
				}
			}
		}
		return -1;
	}
	
	/**
	 * Méthode permettant d'obtenir tous les étudiants ayant le même nom et/ou le même prénom dans le cas d'une recherche qui ne se ferait pas via le numéro d'étudiant dans l'écran d'authentification.
	 * @param tableau: l'ensemble des étudiants et de leurs informations.
	 * @param chaines: les chaines communes;
	 * @return Les étudiants ayant au moins le même nom ou le même prénom.
	 * @See Authentification
	 */
	
	public ArrayList<String[]> retournerEtudiantsAvecChaineCommune(ArrayList<String[]> tableau, String[] chaines) {
		
		ArrayList<String[]> etudiantsAvecChaineCommune = new ArrayList<String[]>();
		
		for(int i=0;i<tableau.size();i++) {
			for(int j=0;j<tableau.get(i).length;j++) {
				for(int k=0;k<chaines.length;k++) {
					if(tableau.get(i)[j].equals(chaines[k])) {
						if(!etudiantsAvecChaineCommune.contains(tableau.get(i))) {
						etudiantsAvecChaineCommune.add(tableau.get(i));
						}
					}
				}
			}
		}
		return etudiantsAvecChaineCommune;
	}
	
	/**
	 * Méthode récupérant le nom et/ou le prénom dans l'écran d'authentification après le(s) avoir convertis entièrement en majuscules pour le nom et en minuscules avec la première lettre en majuscule pour le prénom, afin que la casse soit levée lors de la saisie.
	 * @param textField_1: le nom de famille
	 * @param textField_2: le prénom
	 * @return le tableau contenant le nom et le prénom qui servira comme paramètre ans la méthode retournant les étudiants avec chaines communes. 
	 */
	
	public String[] retournerChainesCommunes(JTextField textField_1, JTextField textField_2) {
		
		String[] chainesCommunes = new String[2];
		
		if(textField_1.getText().equals("")) {
			chainesCommunes[0]=textField_1.getText();
		}
		
		else {
			chainesCommunes[0]=textField_1.getText().toUpperCase();
		}
		
		if(textField_2.getText().equals("")) {
			chainesCommunes[1]=textField_2.getText();
		}
		
		else {
			chainesCommunes[1]=textField_2.getText().toLowerCase().substring(0, 1).toUpperCase() + textField_2.getText().substring(1).toLowerCase();
		}
		
		return chainesCommunes;
	}
	
	/**
	 * Retourne les informations d'un étudiant selon le fichier à partir du tableau passé en paramètre et d'un index donné.
	 * @param tableau: le tableau des étudiants et leurs informations
	 * @param index: l'indice représentant un tableau de String concernant un étudiant en particulier
	 * @deprecated utiliser la méthode retournerInfosEtudiants
	 * @return les informations d'un étudiant donné par son index
	 */
	
	public String[] retournerEtudiant(ArrayList<String[]> tableau, int index) {
		
		for(int i=0;i<tableau.size();i++) {
			if(i==index) {
				return tableau.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Réalise la même chose que la méthode retournerEtudiant qui prend un index en paramètre, sauf qu'elle prend le numéro d'étudiant directement.
	 * @param tableau les étudiants
	 * @param numEtudiant le numéro de l'étudiant dont il faut retourner les informations
	 * @return les informations de l'étudiant contenu dans le fichier indiqué par le file_path
	 */
	
	public String[] retournerInfosEtudiant(ArrayList<String[]> tableau, String numEtudiant) {
		
		for(int i=0;i<tableau.size();i++) {
			for(int j=0;j<tableau.get(i).length;j++) {
				if(tableau.get(i)[j].equals(numEtudiant)) {
					return tableau.get(i);
				}
			}
		}
		return null;
	}
	
	/**
	 * Méthode retournant les lignes contenant le numéro d'étudiant passé en paramètre. Cette méthode servira notamment à remplir le tableau de l'écran inscription ainsi que le tableau que contiendra par la suite l'écran de parcours avant l'entrée à Paris 8.
	 * @param tableau les étudaitn
	 * @param numEtudiant le numéro d'étudiant
	 * @return l'ensemble des lignes dont le numéro d'étudiant est le même
	 */
	
	public ArrayList<String[]> retournerInfosMultiplesEtudiant(ArrayList<String[]> tableau, String numEtudiant) {
		
		ArrayList<String[]> infosMultiplesEtudiant = new ArrayList<String[]>();
		
		for(int i=0;i<tableau.size();i++) {
			for(int j=0;j<tableau.get(i).length;j++) {
				if(tableau.get(i)[j].equals(numEtudiant)) {
					infosMultiplesEtudiant.add(tableau.get(i));
				}
			}
		}
		
		return infosMultiplesEtudiant;
	}
}