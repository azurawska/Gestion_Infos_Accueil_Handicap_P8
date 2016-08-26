package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.Fenetre;
import fenetre.composants.AbstractJPanel;
import interfaces.DonneesTabbedPane;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Ecran d'accueil de l'application après authentification ou pour créer un utilisateur.
 * @author alexis
 *@see AbstractJPanel
 */

public class Accueil extends AbstractJPanel implements DonneesTabbedPane {

	/**
	 * Classe permettant de revenir à l'écran d'authantification lorsque l'utilisateur clique sur le bouton "Maison" en haut à gauche de l'écran d'accueil.
	 * @author alexis
	 *
	 */
	
	private class AuthentificationListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setVisible(false);
			try {
				authentification= new Authentification();
			} catch (LongueurDifferenteListesException | NullArgumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Fenetre.getInstance().setContentPane(authentification);
			} catch (LongueurDifferenteListesException | NullArgumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			authentification.setVisible(true);
		}
	}
	
	/**
	 * Le numéro d'étudient
	 */

	private String numEtudiant;
	
	/**
	 * Le nom de famile de l'étudiant (de naissance ou marital)
	 */
	private String nom;
	
	/**
	 * Le prénom de l'étudiant
	 */
	
	private String prenom;
	
	private Authentification authentification;
	
	/**
	 * Create the panel for a new student.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	
	public Accueil() throws LongueurDifferenteListesException, NullArgumentException {
		
		JScrollPane scrollPane = new JScrollPane(this);
		scrollPane.setBounds(this.getBounds());
		
		setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Ok");
		
		gestionChampsEtExceptions(btnNewButton_1, Fenetre.getInstance().getScreenSize().width/2-10-61, 5, 61, 29, null, true, true, null, null, null, null, null, null, null, null, null);
		
		JButton btnAnnuler = new JButton("Annuler");
		
		gestionChampsEtExceptions(btnAnnuler, Fenetre.getInstance().getScreenSize().width/2+10, 5, 77, 29, null, true, true, null, null, null, null, null, null, null, null, null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		gestionChampsEtExceptions(tabbedPane, 0, 50, Fenetre.getInstance().getScreenSize().width, Fenetre.getInstance().getScreenSize().height-50, null, true, true, null, null, titresOnglets(), ongletsNouvelUtilisateur(), null, null, null, null, null);
		
		Icon icon = new ImageIcon("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/fenetre/img/accueil.jpg");
		
		JButton btnNewButton = new JButton(icon);
		
		gestionChampsEtExceptions(btnNewButton, 22, 2, 45, 23, null, true, true, null, null, null, null, new AuthentificationListener(), null, null, null, null);
	}
	
	/**
	 * Create the panel with student number, Family Name and First Name.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public Accueil(String numEtudiant, String nom, String prenom) throws LongueurDifferenteListesException, NullArgumentException {
		
		this.numEtudiant=numEtudiant;
		this.nom=nom;
		this.prenom=prenom;
		
		JScrollPane scrollPane = new JScrollPane(this);
		scrollPane.setBounds(this.getBounds());
		
		setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Ok");
		
		gestionChampsEtExceptions(btnNewButton_1, Fenetre.getInstance().getScreenSize().width/2-10-61, 5, 61, 29, null, true, true, null, null, null, null, null, null, null, null, null);
		
		JButton btnAnnuler = new JButton("Annuler");
		
		gestionChampsEtExceptions(btnAnnuler, Fenetre.getInstance().getScreenSize().width/2+10, 5, 77, 29, null, true, true, null, null, null, null, null, null, null, null, null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		gestionChampsEtExceptions(tabbedPane, 0, 50, Fenetre.getInstance().getScreenSize().width, Fenetre.getInstance().getScreenSize().height-50, null, true, true, null, null, titresOnglets(), ongletsUtilisateurExistant(this.numEtudiant), null, null, null, null, null);
		
		Icon icon = new ImageIcon("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/fenetre/img/accueil.jpg");
		
		JButton btnNewButton = new JButton(icon);
		
		gestionChampsEtExceptions(btnNewButton, 22, 2, 45, 23, null, true, true, null, null, null, null, new AuthentificationListener(), null, null, null, null);
	}

	@Override
	public ArrayList<String> titresOnglets() {
		// TODO Auto-generated method stub
		ArrayList<String> titresOnglets = new ArrayList<String>();
		
		titresOnglets.add("Identité");
		titresOnglets.add("Parcours");
		titresOnglets.add("Inscription");
		titresOnglets.add("Projets");
		titresOnglets.add("Handicap");
		titresOnglets.add("Aménagements");
		titresOnglets.add("Menesr");
		titresOnglets.add("Notes");
		titresOnglets.add("Autres");
		
		return titresOnglets;
	}

	@Override
	public ArrayList<AbstractJPanel> ongletsNouvelUtilisateur() throws LongueurDifferenteListesException, NullArgumentException {
		// TODO Auto-generated method stub
		ArrayList<AbstractJPanel> onglets = new ArrayList<AbstractJPanel>();
		
		onglets.add(new Identite());
		onglets.add(new ParcoursAnterieurP8());
		onglets.add(new Inscription());
		onglets.add(new Projets());
		onglets.add(new Handicap());
		onglets.add(new Amenagements());
		onglets.add(new Menesr());
		onglets.add(new NotesReussite());
		onglets.add(new CarnetDeVisiteEtCommentaires());
		
		return onglets;
	}

	@Override
	public ArrayList<AbstractJPanel> ongletsUtilisateurExistant(String utilisateur) throws LongueurDifferenteListesException, NullArgumentException {
		// TODO Auto-generated method stub
		ArrayList<AbstractJPanel> onglets = new ArrayList<AbstractJPanel>();
		
		onglets.add(new Identite(utilisateur));
		onglets.add(new ParcoursAnterieurP8(utilisateur));
		onglets.add(new Inscription(utilisateur));
		onglets.add(new Projets(utilisateur));
		onglets.add(new Handicap(utilisateur));
		onglets.add(new Amenagements(utilisateur));
		onglets.add(new Menesr(utilisateur));
		onglets.add(new NotesReussite(utilisateur));
		onglets.add(new CarnetDeVisiteEtCommentaires(utilisateur));
		
		return onglets;
	}
}