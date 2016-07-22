package fenetre;

import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class Inscription extends JPanel {

	/**
	 * Create the panel.
	 */
	public Inscription() {
		setLayout(null);
		
		JCheckBox chckbxAffectationPrioritaire = new JCheckBox("Affectation prioritaire");
		chckbxAffectationPrioritaire.setBounds(6, 6, 173, 23);
		add(chckbxAffectationPrioritaire);

	}
}
