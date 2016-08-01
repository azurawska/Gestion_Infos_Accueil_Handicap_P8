package fenetre.ecrans;

import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import data.LectureFichierCSV;

public class Projets extends JPanel {
	
	private boolean nouveau;
	private String numEtudiant;

	/**
	 * Create the panel.
	 */
	public Projets() {
		
		this.nouveau=true;
		
		setLayout(null);
		
		JLabel lblProjetDeFormation = new JLabel("1 : projet de formation");
		lblProjetDeFormation.setBounds(20, 26, 186, 14);
		add(lblProjetDeFormation);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(40, 55, 386, 176);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		add(textArea);
		
		JLabel lblProjets = new JLabel("2 : projet(s) professionnel(s)");
		lblProjets.setBounds(20, 231, 240, 14);
		add(lblProjets);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(40, 257, 386, 176);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		add(textArea_1);

	}
	
	public Projets(String numEtudiant) {
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		
		LectureFichierCSV fichierProjets = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/projets.csv");
		
		ArrayList<String[]> etudiants = fichierProjets.chargerFichier();
		String[] etudiant = fichierProjets.retournerInfosEtudiant(etudiants, this.numEtudiant);
		
		setLayout(null);
		
		JLabel lblProjetDeFormation = new JLabel("1 : projet de formation");
		lblProjetDeFormation.setBounds(20, 26, 186, 14);
		add(lblProjetDeFormation);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(40, 55, 386, 176);
		textArea.setText(etudiant[1]);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		add(textArea);
		
		JLabel lblProjets = new JLabel("2 : projet(s) professionnel(s)");
		lblProjets.setBounds(20, 231, 240, 14);
		add(lblProjets);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(40, 257, 386, 176);
		textArea_1.setText(etudiant[2]);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		add(textArea_1);
	}
}