package fenetre.ecrans;

import javax.swing.JLabel;

import com.toedter.calendar.JDateChooser;

import data.LectureFichierCSV;
import data.LectureFichierTXT;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import interfaces.DonneesTabbedPane;
import interfaces.GestionFichierCSV;
import interfaces.GestionFichierTXT;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTabbedPane;

public class Amenagements extends AbstractJPanel implements DonneesTabbedPane, GestionFichierTXT, GestionFichierCSV {
	
	private JDateChooser textField;
	
	private JComboBox<String> comboBox;
	
	private boolean nouveau;
	
	private String numEtudiant;
	
	private JLabel lblDateDeLa;
	private JLabel lblNomDuMdecin;
	
	private JTabbedPane tabbedPane;
	
	private final LectureFichierTXT fichierMedecins = new LectureFichierTXT("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/txt/medecins.txt");
	
	private final LectureFichierCSV fichierAmenagements = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/amenagements.csv");

	/**
	 * Create the panel.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public Amenagements() throws LongueurDifferenteListesException, NullArgumentException {
		
		this.nouveau=true;
		
		setLayout(null);
		
		lblDateDeLa = new JLabel("Date de la visite à la Médecine Préventive");
		
		gestionChampsEtExceptions(lblDateDeLa, 21, 6, 273, 14, null, true, true, null, null, null, null, null, null, null, null);
		
		textField = new JDateChooser();
	
		gestionChampsEtExceptions(textField, 332, 3, 150, 20, null, true, true, null, null, null, null, null, "", null, null);
		
		lblNomDuMdecin = new JLabel("Nom du médecin");
		
		gestionChampsEtExceptions(lblNomDuMdecin, 20, 46, 140, 14, null, true, true, null, null, null, null, null, null, null, null);
		
		comboBox = new JComboBox<String>();
	
		gestionChampsEtExceptions(comboBox, 290, 44, 186, 20, null, true, true, null, null, null, null, null, "", null, null);
		gererInfosFichierTXT(fichierMedecins);
		comboBox.setSelectedIndex(0);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		gestionChampsEtExceptions(tabbedPane, 30, 82, 719, 514, null, true, true, null, null, titresOnglets(), ongletsNouvelUtilisateur(), null, null, null, null);
	}

	public Amenagements(String numEtudiant) throws LongueurDifferenteListesException, NullArgumentException {
		
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		
		gererInfosFichierCSV(fichierAmenagements);
	}

	@Override
	public ArrayList<String> titresOnglets() {
		
		ArrayList<String> titresOnglets = new ArrayList<String>();
		titresOnglets.add("Cours");
		titresOnglets.add("Examens");
		
		return titresOnglets;
	}

	@Override
	public ArrayList<AbstractJPanel> ongletsNouvelUtilisateur()
			throws LongueurDifferenteListesException, NullArgumentException {
			ArrayList<AbstractJPanel> onglets = new ArrayList<AbstractJPanel>();
			onglets.add(new AmenagementsCours());
			onglets.add(new AmenagementsExamens());
			
			return onglets;
	}

	@Override
	public ArrayList<AbstractJPanel> ongletsUtilisateurExistant(String utilisateur)
			throws LongueurDifferenteListesException, NullArgumentException {
			ArrayList<AbstractJPanel> onglets = new ArrayList<AbstractJPanel>();
			onglets.add(new AmenagementsCours(utilisateur));
			onglets.add(new AmenagementsExamens(utilisateur));
			
			return onglets;
	}

	@Override
	public void gererInfosFichierTXT(LectureFichierTXT lectureFichier) {
		
		ArrayList<String> medecins = lectureFichier.chargerFichier();
		
		for(int i=0;i<medecins.size();i++) {
			comboBox.addItem(medecins.get(i));
		}
	}

	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier)
			throws LongueurDifferenteListesException, NullArgumentException {
		
		ArrayList<String[]> etudiants = fichier.chargerFichier();
		String [] etudiant = fichier.retournerInfosEtudiant(etudiants, this.numEtudiant);
		
		setLayout(null);
		
		lblDateDeLa = new JLabel("Date de la visite à la Médecine Préventive");
		
		gestionChampsEtExceptions(lblDateDeLa, 21, 6, 273, 14, null, true, true, null, null, null, null, null, null, null, null);
		
		textField = new JDateChooser();
	
		gestionChampsEtExceptions(textField, 332, 3, 150, 20, null, true, false, null, null, null, null, null, etudiant[1], null, null);
		
		lblNomDuMdecin = new JLabel("Nom du médecin");
		
		gestionChampsEtExceptions(lblNomDuMdecin, 20, 46, 140, 14, null, true, true, null, null, null, null, null, null, null, null);
		
		comboBox = new JComboBox<String>();
	
		gererInfosFichierTXT(fichierMedecins);
		gestionChampsEtExceptions(comboBox, 290, 44, 186, 20, null, true, true, null, null, null, null, null, etudiant[2], null, null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		gestionChampsEtExceptions(tabbedPane, 30, 82, 719, 514, null, true, true, null, null, titresOnglets(), ongletsUtilisateurExistant(this.numEtudiant), null, null, null, null);
	}
}