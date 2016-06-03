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

	/**
	 * Create the frame.
	 */
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.authentification = new Authentification();
		this.authentification.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(authentification);
		this.authentification.setVisible(true);
		setVisible(true);
	}
}