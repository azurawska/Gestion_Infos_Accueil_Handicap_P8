package fenetre;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.ecrans.Authentification;

public class Fenetre extends JFrame {

	private static Dimension screenSize;
	private Authentification authentification;
	private static Fenetre fenetre;

	/**
	 * Create the frame.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
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
	
	public static Fenetre getInstance() throws LongueurDifferenteListesException, NullArgumentException {
		if(fenetre==null) {
			fenetre = new Fenetre();
		}
		return fenetre;
	}
	
	public static Dimension getScreenSize() {
		return screenSize;
	}
}