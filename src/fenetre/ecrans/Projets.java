package fenetre.ecrans;

import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;

public class Projets extends AbstractJPanel {
	
	private boolean nouveau;
	private String numEtudiant;

	/**
	 * Create the panel.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public Projets() throws LongueurDifferenteListesException, NullArgumentException {
		
		this.nouveau=true;
		
		setLayout(null);
		
		JLabel lblProjetDeFormation = new JLabel("1 : projet de formation");
		
		gestionChampsEtExceptions(lblProjetDeFormation, 20, 26, 186, 14, true, true, null, null, null, null, null);
		
		JTextArea textArea = new JTextArea();
		
		gestionChampsEtExceptions(textArea, 40, 55, 386, 176, true, true, true, null, null, null, "");
		
		JLabel lblProjets = new JLabel("2 : projet(s) professionnel(s)");
		
		gestionChampsEtExceptions(lblProjets, 20, 231, 240, 14, true, true, true, null, null, null, null);
		
		JTextArea textArea_1 = new JTextArea();
		
		gestionChampsEtExceptions(textArea_1, 40, 257, 386, 176, true, true, true, null, null, null, "");

	}
	
	public Projets(String numEtudiant) throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		
		LectureFichierCSV fichierProjets = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/projets.csv");
		
		ArrayList<String[]> etudiants = fichierProjets.chargerFichier();
		String[] etudiant = fichierProjets.retournerInfosEtudiant(etudiants, this.numEtudiant);
		
		setLayout(null);
		
		JLabel lblProjetDeFormation = new JLabel("1 : projet de formation");
		
		gestionChampsEtExceptions(lblProjetDeFormation, 20, 26, 186, 14, true, true, null, null, null, null, null);
		
		JTextArea textArea = new JTextArea();
		
		gestionChampsEtExceptions(textArea, 40, 55, 386, 176, true, true, true, null, null, null, etudiant[1]);
		
		JLabel lblProjets = new JLabel("2 : projet(s) professionnel(s)");
		
		gestionChampsEtExceptions(lblProjets, 20, 231, 240, 14, true, true, true, null, null, null, null);
		
		JTextArea textArea_1 = new JTextArea();
		
		gestionChampsEtExceptions(textArea_1, 40, 257, 386, 176, true, true, true, null, null, null, etudiant[2]);
	}
}