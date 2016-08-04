package fenetre.ecrans;

import javax.swing.JPanel;

import fenetre.composants.AbstractJPanel;

import javax.swing.JCheckBox;

public class Inscription extends AbstractJPanel {

	/**
	 * Create the panel.
	 */
	public Inscription() {
		setLayout(null);
		
		JCheckBox chckbxAffectationPrioritaire = new JCheckBox("Affectation prioritaire");
		chckbxAffectationPrioritaire.setBounds(6, 6, 173, 23);
		add(chckbxAffectationPrioritaire);

	}

	public Inscription(String numEtudiant) {
		// TODO Auto-generated constructor stub
	}
}
