package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectureFichierTXT {

	private String file_path;
	
	public String getFile_path() {
		return file_path;
	}

	public LectureFichierTXT(String file_path) {
		this.file_path=file_path;
	}
	
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