package fenetre.composants;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBox;

/**
 * Classe serant a traiter un cas particulier de JCheckBox ne pouvant pas être traité avec le seul cas générique
 * @see AbstractJPanel
 * @author alexis
 *
 */

public class AffectationPrioritaire extends JCheckBox {

	public AffectationPrioritaire() {
		// TODO Auto-generated constructor stub
	}

	public AffectationPrioritaire(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public AffectationPrioritaire(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public AffectationPrioritaire(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public AffectationPrioritaire(Icon icon, boolean selected) {
		super(icon, selected);
		// TODO Auto-generated constructor stub
	}

	public AffectationPrioritaire(String text, boolean selected) {
		super(text, selected);
		// TODO Auto-generated constructor stub
	}

	public AffectationPrioritaire(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	public AffectationPrioritaire(String text, Icon icon, boolean selected) {
		super(text, icon, selected);
		// TODO Auto-generated constructor stub
	}
}