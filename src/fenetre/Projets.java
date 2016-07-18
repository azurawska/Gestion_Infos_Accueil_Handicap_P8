package fenetre;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Projets extends JPanel {

	/**
	 * Create the panel.
	 */
	public Projets() {
		setLayout(null);
		
		JLabel lblProjetDeFormation = new JLabel("1 : projet de formation");
		lblProjetDeFormation.setBounds(20, 26, 186, 14);
		add(lblProjetDeFormation);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(40, 55, 386, 176);
		add(textArea);
		
		JLabel lblProjets = new JLabel("2 : projet(s) professionnel(s)");
		lblProjets.setBounds(20, 231, 240, 14);
		add(lblProjets);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(40, 257, 386, 176);
		add(textArea_1);

	}

}