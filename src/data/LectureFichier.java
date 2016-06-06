package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectureFichier {
	
	private String file_path;
	
	/**
	 * Constructeur d'une instance de la classe LectureFichier prenant le fichier sur lequel on travaille en paramètres.
	 * @param file_path
	 */
	
	public LectureFichier(String file_path) {
		this.file_path=file_path;
	}
	
	/**
	 * Charge le fichier passé en paramètre en mémoire.
	 * @return Le fichier chargé en mémoire dans un tableau.
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
			while((ligne = premiereLigne.readLine())!=null && i!=donnees.size()) { //Chargement du fichier en mémoire.
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
}