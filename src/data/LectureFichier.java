package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureFichier {
	
	private String file_path;
	
	/**
	 * Constructeur d'une instance de la classe LectureFichier prenant le fichier sur lequel on travaille en param�tres.
	 * @param file_path
	 */
	
	public LectureFichier(String file_path) {
		this.file_path=file_path;
	}
	
	/**
	 * Charge le fichier pass� en param�tre en m�moire.
	 * @return Le fichier charg� en m�moire dans un tableau.
	 */
	
	public String[][] chargerFichier() {
		FileReader fichier = null;
		BufferedReader tampon = null;
		String[][] donnees=null;
		String ligne;
		String[] tableauIntermediaire;
		int i = 0;
		int j = 0;
		
		try {
			fichier = new FileReader(file_path);
			tampon = new BufferedReader(fichier);
			ligne = tampon.readLine();
			int nbMotsLigne=ligne.length(); //Donne le nombre de mots que contient une ligne.
			while((ligne = tampon.readLine())!=null) { //Compte le nombre de lignes du fichier
				i++;
			}
			donnees = new String[i][nbMotsLigne]; //Cr�ation du tableau de mani�re dynamique en fonction du nombre de donn�es dans le fichier.
			tableauIntermediaire = new String[nbMotsLigne];
			
			while((ligne = tampon.readLine())!=null && i!=donnees.length) { //Chargement du fichier en m�moire.
				tableauIntermediaire=ligne.split(";");
				donnees[j]=tableauIntermediaire;
			}
			
		} catch(IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				tampon.close();
				fichier.close();
			} catch(IOException exception1) {
				exception1.printStackTrace();
			}
		}
		return donnees;
	}
}