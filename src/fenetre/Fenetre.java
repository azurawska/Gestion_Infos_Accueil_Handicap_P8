package fenetre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Fenetre extends JFrame {
	
	private Authentification authentification;

	/**
	 * Create the frame.
	 */
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		authentification = new Authentification();
		authentification.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(authentification);
	}

}
