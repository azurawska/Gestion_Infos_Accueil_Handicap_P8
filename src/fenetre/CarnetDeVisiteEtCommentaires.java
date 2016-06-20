package fenetre;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CarnetDeVisiteEtCommentaires extends JPanel {

	/**
	 * Create the panel.
	 */
	public CarnetDeVisiteEtCommentaires() {
		setLayout(null);
		
		JLabel lblIndiquerLesJours = new JLabel("Indiquer le(s) jour(s) de(s) (la) rencontre(s) et son (leurs) objet(s) :");
		lblIndiquerLesJours.setBounds(23, 26, 380, 14);
		add(lblIndiquerLesJours);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 51, 707, 436);
		add(textArea);

	}
}
