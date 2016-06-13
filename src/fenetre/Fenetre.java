package fenetre;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Fenetre extends JFrame {
	
	private Authentification authentification;
	private Accueil accueil;

	/**
	 * Create the frame.
	 */
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);
		this.authentification = new Authentification();
		setContentPane(authentification);
		
		if (authentification.getFound() == false)
		this.authentification.setVisible(true);
		
		else {
		this.accueil = new Accueil();
		this.accueil.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(accueil);
		this.accueil.setVisible(true);
		}
		setVisible(true);
		
	}
	
	public void changerPanel(JPanel old_panel, JPanel new_panel) {
		old_panel.setVisible(false);
		setContentPane(new_panel);
		new_panel.setVisible(true);
	}
}