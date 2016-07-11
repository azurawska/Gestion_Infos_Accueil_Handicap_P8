package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTextField;

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
	
	public ArrayList<String> retournerChaines(ArrayList<String[]> tableau, int index) {
		
		ArrayList<String> chaines = new ArrayList<String>();
		
		for(int i=0;i<tableau.size();i++) {
			chaines.add(tableau.get(i)[index]);
		}
		
		return chaines;
	}
	
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
	
	public String[] retournerEtudiant(ArrayList<String[]> tableau, int index) {
		
		for(int i=0;i<tableau.size();i++) {
			if(i==index) {
				return tableau.get(i);
			}
		}
		return null;
	}
	
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
}