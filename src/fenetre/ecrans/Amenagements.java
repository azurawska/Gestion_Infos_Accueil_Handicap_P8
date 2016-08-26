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

/**
 * Ecran d'aménagements comportant la date de dernière visite à la médecine préventive ainsi que le nom du médecin, en plus des onglets d'aménagements pour les cours et les examens.
 * @author alexis
 *@see AbstractJPanel
 */

public class Amenagements extends AbstractJPanel implements DonneesTabbedPane, GestionFichierTXT, GestionFichierCSV {
	
	/**
	 * Le champ de renseignement de la date de la dernière viste à la médecine préventive de l'étudiant
	 */
	
	private JDateChooser textField;
	
	/**
	 * Liste déroulante contenant le nom des médecins travaillant à la médecine préventive
	 */
	
	private JComboBox<String> comboBox;
	
	/**
	 * Indique si l'étudiant est nouveau (true) ou pas (false)
	 */
	
	private boolean nouveau;
	
	/**
	 * Le numéro d'étudiant
	 */
	
	private String numEtudiant;
	
	/**
	 * Libellé du champ de date
	 */
	
	private JLabel lblDateDeLa;
	
	/**
	 * Libellé du cahmp de la comboBox des médecins
	 */
	
	private JLabel lblNomDuMdecin;
	
	/**
	 * Le conteneur des onglets représentant tous les écrans de l'application
	 */
	
	private JTabbedPane tabbedPane;
	
	/**
	 * Variable permettant de travailler sur le fichier contenant le nom des médecins travaillant à la médecine préventive
	 */
	
	private final LectureFichierTXT fichierMedecins = new LectureFichierTXT("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/txt/medecins.txt");
	
	/**
	 * Variable permettant de travailler sur le fichier contenant la date de la visite à la médecine préventive ainsi que le médecin ayant reçu l'étudiant
	 */
	
	private final LectureFichierCSV fichierAmenagements = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/amenagements.csv");

	/**
	 * Create the panel for a new student.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public Amenagements() throws LongueurDifferenteListesException, NullArgumentException {
		
		this.nouveau=true;
		
		setLayout(null);
		
		lblDateDeLa = new JLabel("Date de la visite à la Médecine Préventive");
		
		gestionChampsEtExceptions(lblDateDeLa, 21, 6, 273, 14, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textField = new JDateChooser();
	
		gestionChampsEtExceptions(textField, 332, 3, 150, 20, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblNomDuMdecin = new JLabel("Nom du médecin");
		
		gestionChampsEtExceptions(lblNomDuMdecin, 20, 46, 140, 14, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox = new JComboBox<String>();
	
		gestionChampsEtExceptions(comboBox, 290, 44, 186, 20, null, true, true, null, null, null, null, null, "", null, null, null);
		gererInfosFichierTXT(fichierMedecins);
		comboBox.setSelectedIndex(0);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		gestionChampsEtExceptions(tabbedPane, 30, 82, 719, 514, null, true, true, null, null, titresOnglets(), ongletsNouvelUtilisateur(), null, null, null, null, null);
	}

	/**
	 * Crée le panel en récupérant les informations collectées à partir du numéro d'étudiant.
	 * @param numEtudiant le numéro d'étudiant
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
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
		
		gestionChampsEtExceptions(lblDateDeLa, 21, 6, 273, 14, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textField = new JDateChooser();
	
		gestionChampsEtExceptions(textField, 332, 3, 150, 20, null, true, false, null, null, null, null, null, etudiant[1], null, null, null);
		
		lblNomDuMdecin = new JLabel("Nom du médecin");
		
		gestionChampsEtExceptions(lblNomDuMdecin, 20, 46, 140, 14, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox = new JComboBox<String>();
	
		gererInfosFichierTXT(fichierMedecins);
		gestionChampsEtExceptions(comboBox, 290, 44, 186, 20, null, true, true, null, null, null, null, null, etudiant[2], null, null, null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		gestionChampsEtExceptions(tabbedPane, 30, 82, 719, 514, null, true, true, null, null, titresOnglets(), ongletsUtilisateurExistant(this.numEtudiant), null, null, null, null, null);
	}
}