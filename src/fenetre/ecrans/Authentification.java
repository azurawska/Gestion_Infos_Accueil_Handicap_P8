package fenetre.ecrans;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.Fenetre;
import fenetre.composants.AbstractJPanel;
import fenetre.composants.JTextFieldIdentifiant;
import interfaces.GestionFichierCSV;

/**
 * Classe représentant le premier écran de l'application pour rechercher un étudiant, le mettre à jour ou en créer un nouveau.
 * @author alexis
 *
 */

public class Authentification extends AbstractJPanel implements GestionFichierCSV {
	
	/**
	 * Champ de saisie du numéro d'étudiant.
	 */
	
	private JTextFieldIdentifiant textField_num_etudiant;
	
	/**
	 * Champ de saisie du nom de famille de l'étudiant
	 */
	
	private JTextField textField_nom;
	
	/**
	 * Champ de saisie du prénom de l'étudiant
	 */
	
	private JTextField textField_prenom;
	
	/**
	 * Bouton permettant d'accéder à l'écran d'accueil lorsque l'étudiant est répertorié
	 */
	
	private JButton btnSuivant;
	
	/**
	 * Bouton permettant d'accéder à l'écran d'accueil lorsque l'on veut créer un nouvel étudiant
	 */
	
	private JButton btnNouveau;
	
	/**
	 * Ecran d'accueil
	 */
	
	private Accueil accueil;
	
	/**
	 * Tableau contenant tout le fichier identite.csv en mémoire
	 */
	
	private ArrayList<String[]> donneesEtudiants;
	
	/**
	 * Tableau contenant tous les étudiants ayant au moins leur nom ou leur prénom en commun.
	 */
	
	private ArrayList<String[]> donneesEtudiantsAvecChainesCommunes;
	
	/**
	 * Tableau contenant tous les noms de famille de naissance des étudiants.
	 */
	
	private ArrayList<String> chainesNomNaissance;
	
	/**
	 * Tableau contenant tous les noms maritaux des étudiants
	 */
	
	private ArrayList<String> chainesNomMarie;
	
	/**
	 * Tableau contenant tous les prénoms des étudiants
	 */
	
	private ArrayList<String> chainesPrenom;
	
	/**
	 * Tableau contenant toutes les informations relative à un étudiant
	 */
	
	private String[] etudiant;
	
	/**
	 * Tableau contenant les chaines communes récupérées via les champs de saisie du nom et du prénom
	 */
	
	private String[] chainesCommunes;
	
	/**
	 * Variable permettant de travailler avec le fichier Identite.csv contenant toutes les informations générales relatives aux étudiants
	 */
	
	private final LectureFichierCSV lectureFichier = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/identite.csv");
	
	/**
	 * Tous les étudiants ayant au moins une chaine en commun (nom ou prénom)
	 */
	
	private StringBuilder chainesEtudiantsTrouves;
	
	/**
	 * Création du panel d'authentification.
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
	public Authentification() throws LongueurDifferenteListesException, NullArgumentException {
		setLayout(null);
		int x = 300, y = 150, pasx = 100, pasy = 30;
		int sizex= 86, sizey = 20;
		//this.setBounds(Fenetre.getInstance().getBounds());
		JScrollPane scrollPane = new JScrollPane(this);
		scrollPane.setBounds(this.getBounds());
		//add(scrollPane);
		
		//x= Fenetre.getInstance().screenSize.width/2-(pasx+sizex)/2; y = Fenetre.getInstance().screenSize.height/6;
		
		JLabel lblNEtudiant = new JLabel("N° Etudiant :");
		
		gestionChampsEtExceptions(lblNEtudiant, x, y, 100, 29, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textField_num_etudiant = new JTextFieldIdentifiant();
		
		gestionChampsEtExceptions(textField_num_etudiant, x+pasx, y, sizex, sizey, Color.WHITE, true, true, true, null, null, null, new QuitNumEtudiantFieldMouseEvent(), "", null, null, null);
		
		JLabel lblNom = new JLabel("Nom :");
		
		gestionChampsEtExceptions(lblNom, x, y+pasy, 100, 14, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textField_nom = new JTextField();
		
		gestionChampsEtExceptions(textField_nom, x+pasx, y+pasy, sizex, sizey, Color.WHITE, true, true, true, null, null, null, null, "", null, null, null);
		
		JLabel lblPrnom = new JLabel("Prénom :");
		
		gestionChampsEtExceptions(lblPrnom, x, y+2*pasy, 100, 14, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textField_prenom = new JTextField();
		
		gestionChampsEtExceptions(textField_prenom, x+pasx, y+2*pasy, sizex, sizey, Color.WHITE, true, true, true, null, null, null, null, "", null, null, null);
		
		btnSuivant = new JButton("Suivant");
		
		gestionChampsEtExceptions(btnSuivant, x+pasx, y+4*pasy, 89, 23, null, true, true, null, null, null, null, new SuivantAction(), null, null, null, null);
		
		btnNouveau = new JButton("Nouveau");
		
		gestionChampsEtExceptions(btnNouveau, x+pasx, y+5*pasy, 89, 23, null, true, true, null, null, null, null, new NouveauAction(), null, null, null, null);
	}
	
	/**
	 * Classe utilisée pour accéder à l'écran d'accueil afin de créer un nouvel utilisateur une fois le bouton "Nouveau" cliqué.
	 * @author alexis
	 *
	 */
	
	private class NouveauAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			accueil();
		}
	}
	
	/**
	 * Permet d'accéder à l'écran d'accueil ou non en fonction des informations renseignées dans les champs de saisies une fois le bouton "Suivant" cliqué.
	 * @author alexis
	 *
	 */
	
	private class SuivantAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				suivant();
			} catch (LongueurDifferenteListesException | NullArgumentException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	/**
	 * Permet de gérer le fait que les champs de saisie nom et prénom ne soient pas éditables si le champ de saisie numéro étudiant est renseigné, le numéro d'étudiant étant unique.
	 * @author alexis
	 *
	 */
	
	private class QuitNumEtudiantFieldMouseEvent implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if(!textField_num_etudiant.getText().equals("")) {
				textField_nom.setText("");
				textField_nom.setEditable(false);
				textField_prenom.setText("");
				textField_prenom.setEditable(false);
			}
			else {
				textField_nom.setEditable(true);
				textField_prenom.setEditable(true);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
	}
	
	/**
	 * Gère le traitement des informations récupérées via les champs de saisie de l'écran d'authentification.
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
	private void suivant() throws LongueurDifferenteListesException, NullArgumentException {
		
		gererInfosFichierCSV(lectureFichier);
	}
	
	/**
	 * Permet d'afficher l'écran d'accueil si l'étudiant n'est pas répertorié.
	 */
	
	private void accueil() {
		setVisible(false);
		try {
			accueil = new Accueil();
		} catch (LongueurDifferenteListesException | NullArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Fenetre.getInstance().setContentPane(accueil);
		} catch (LongueurDifferenteListesException | NullArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		accueil.setVisible(true);
	}
	
	/**
	 * Permet d'accéder à l'accueil dans le cas où l'étudiant existe, est connu du service handicap et est répertorié.
	 * @param numEtudiant le numéro d'étudiant
	 * @param nom le nom de famille (de naissance ou marital)
	 * @param prenom le prénom
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
	private void accueil(String numEtudiant, String nom, String prenom) throws LongueurDifferenteListesException, NullArgumentException {
		this.setVisible(false);
		accueil = new Accueil(numEtudiant, nom, prenom);
		Fenetre.getInstance().setContentPane(accueil);
		accueil.setVisible(true);
	}
	
	/**
	 * 
	 * @param tableau
	 * @return les étudiants ayant le même nom et/ou le même prénom.
	 */
	
	private StringBuilder plusieursEtudiantsSelectionnes(ArrayList<String[]> tableau) {
		
		StringBuilder plusieursEtudiantsSelectionnes = new StringBuilder();
		
		for(int i=0;i<tableau.size();i++) {
			for(int j=0;j<tableau.get(i).length;j++) {
				plusieursEtudiantsSelectionnes.append(tableau.get(i)[j] + "\n");
			}
		}
		return plusieursEtudiantsSelectionnes;
	}
	
	/**
	 * Charge en mémoire les étudiants avec des chaînes communes.
	 */
	
	private void chargementEtudiantsAvecChainesCommunes() {
		donneesEtudiants = lectureFichier.chargerFichier();
		chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
		donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
	}
	
	/**
	 * Charge tous les noms de famille des étudiants en mémoire.
	 */
	
	private void chargerChainesNoms() {
		chargementEtudiantsAvecChainesCommunes();
		chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 4);
		chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 5);
	}
	
	/**
	 * Charge tous les prénoms des étudiants en mémoire.
	 */
	
	private void chargerChainesPrenoms() {
		chargementEtudiantsAvecChainesCommunes();
		chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 6);
	}
	
	/**
	 * Charge les noms et prénoms des étudiants en mémoire dans le cas où les champs nom et prénoms sont renseignés tous les deux.
	 */
	
	private void chargerChainesNomsPrenoms() {
		chargerChainesNoms();
		chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 6);
	}

	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier) throws LongueurDifferenteListesException, NullArgumentException {
		
		int num_etudiant;
		
		if(textField_num_etudiant.getText().equals("") && textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Veuillez renseigner au moins l'un des trois champs SVP.", "Erreur", JOptionPane.ERROR_MESSAGE);
		}
		else {
			try {
			
				if(!textField_num_etudiant.getText().equals("")) {
					num_etudiant = Integer.parseInt(textField_num_etudiant.getText());
					String num_etudiant_reconverti=Integer.toString(num_etudiant);
					donneesEtudiants = fichier.chargerFichier();
					num_etudiant_reconverti=fichier.retournerChaine(donneesEtudiants, num_etudiant_reconverti);
					
					if(num_etudiant_reconverti!=null) {
						etudiant = fichier.retournerInfosEtudiant(donneesEtudiants, num_etudiant_reconverti);
						accueil(etudiant[0], etudiant[5], etudiant[6]);
					}
					else {
						JOptionPane.showMessageDialog(null, "Numéro d'étudiant invalide.", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(!textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
					chargerChainesNoms();
					
					if(chainesNomNaissance.contains(chainesCommunes[0])) {
						if(donneesEtudiantsAvecChainesCommunes.size()==1) {
							accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
						}
						else {
							chainesEtudiantsTrouves = plusieursEtudiantsSelectionnes(donneesEtudiantsAvecChainesCommunes);
							JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else {
						if(chainesNomMarie.contains(chainesCommunes[0])) {
							if(donneesEtudiantsAvecChainesCommunes.size()==1) {
								accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
							}
							else {
								chainesEtudiantsTrouves = plusieursEtudiantsSelectionnes(donneesEtudiantsAvecChainesCommunes);
								JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce nom de famille.", "Erreur", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				else if(!textField_prenom.getText().equals("") && textField_nom.getText().equals("")) {
					chargerChainesPrenoms();
					
					if(chainesPrenom.contains(chainesCommunes[1])) {
						if(donneesEtudiantsAvecChainesCommunes.size()==1) {
							accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
						}
						else {
							chainesEtudiantsTrouves = plusieursEtudiantsSelectionnes(donneesEtudiantsAvecChainesCommunes);
							JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce prénom.", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(!textField_nom.getText().equals("") && !textField_prenom.getText().equals("")) {
					chargerChainesNomsPrenoms();
					
					if(chainesNomNaissance.contains(chainesCommunes[0])) {
						if(chainesPrenom.contains(chainesCommunes[1])) {
							if(donneesEtudiantsAvecChainesCommunes.size()==1) {
								accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
							}
							else {
								chainesEtudiantsTrouves = plusieursEtudiantsSelectionnes(donneesEtudiantsAvecChainesCommunes);
								JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce nom et ce prénom", "Erreur", JOptionPane.ERROR_MESSAGE);
						}
					}
					else {
						if(chainesNomMarie.contains(chainesCommunes[0])) {
							if(chainesPrenom.contains(chainesCommunes[1])) {
								if(donneesEtudiantsAvecChainesCommunes.size()==1) {
									accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
								}
								else {
									chainesEtudiantsTrouves = plusieursEtudiantsSelectionnes(donneesEtudiantsAvecChainesCommunes);
									JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce nom et ce prénom.", "Erreur", JOptionPane.ERROR_MESSAGE);
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce nom et ce prénom.", "Erreur", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				
		} catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Le champ numéro étudiant ne doit contenir que des chiffres.", "Erreur", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}