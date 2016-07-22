package fenetre;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Fenetre extends JFrame {

	static Dimension screenSize;
	private Authentification authentification;
	private static Fenetre fenetre;

	/**
	 * Create the frame.
	 */
	private Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		//screenSize.setSize(1000, 500);
		setBounds(0, 0, screenSize.width, screenSize.height);
		authentification = new Authentification();
		setContentPane(authentification);
		authentification.setVisible(true);
		setVisible(true);
	}
	
	public static Fenetre getInstance() {
		if(fenetre==null) {
			fenetre = new Fenetre();
		}
		return fenetre;
	}
}