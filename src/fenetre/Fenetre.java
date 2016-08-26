package fenetre;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.ecrans.Authentification;

/**
 * Classe définissant la fenêtre qui contiendra tous les écrans de l'application.
 * @author alexis
 *
 */

public class Fenetre extends JFrame {

	/**
	 * Dimensions de la fenêtre (taille et largeur).
	 */
	
	private static Dimension screenSize;
	
	/**
	 * Premier écran au lancement de l'application.
	 */
	
	private Authentification authentification;
	
	/**
	 * Instance de la fenêtre utilisable par l'écran d'authentification et d'accueil.
	 */
	
	private static Fenetre fenetre;
	
	/**
	 * Create the frame.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException
	 * @see Main
	 * Définit la taille de la fenêtre et instancie le premier écran de celle-ci lors du lancement de l'application (authentification). 
	 *Le constructeur est volontairement privée afin d'utiliser le pattern Singleton permettant de n'instancier qu'une seule fois un objet afin de ne pas user torp de mémoire inutilement et surtout pour pouvoir modifier le contentPane de la fenêtre, chose qu'il est impossible de faire si on n'utilise pas ce pattern, car on ne peut pas y accéder, celui-ci dépendant de la Fenêtre et non du JPanel en cours.
	 */
	private Fenetre() throws LongueurDifferenteListesException, NullArgumentException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		//screenSize.setSize(1000, 500);
		setBounds(0, 0, screenSize.width, screenSize.height);
		authentification = new Authentification();
		setContentPane(authentification);
		authentification.setVisible(true);
		setVisible(true);
		/*JScrollPane scrollpane = new JScrollPane(this);
		scrollpane.setBounds(this.getBounds());
		add(scrollpane);*/
	}
	
	/**
	 * 
	 * @return une instance de la fenêtre si elle n'est pas créée ou l'instance courante si elle existe.
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 * @see Main
	 */
	
	public static Fenetre getInstance() throws LongueurDifferenteListesException, NullArgumentException {
		if(fenetre==null) {
			fenetre = new Fenetre();
		}
		return fenetre;
	}
	
	/**
	 * 
	 * @return les dimensions de la fenêtres afin de pouvoir modifier les valeurs brutes de positionnement des composants dans les différents panels par la suite. Cela permettra de gérer les barres de défilement dans les panels, la plupart ayant un contenu qui n'est, pour l'instant, pas visible en entier. Cela permettra, uniquement à partir de cette classe-ci, de modifier la taille de la fenêtre et de faire en sorte qu'elle s'ajuste à chaque type d'écran.
	 */
	
	public static Dimension getScreenSize() {
		return screenSize;
	}
}