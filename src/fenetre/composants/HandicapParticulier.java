package fenetre.composants;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBox;

/**
 * Classe utilisée dans la classe Handicap afin de différencier les regroupements de handicap (moteurs, visuels, etc...) avec un handicap faisant partie d'un de ces regroupements (cécité, fauteuil manuel, etc...)
 * @author alexis
 *@see Handicap
 *@see AbstractJPanel
 */

public class HandicapParticulier extends JCheckBox {

	public HandicapParticulier() {
		// TODO Auto-generated constructor stub
	}

	public HandicapParticulier(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public HandicapParticulier(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public HandicapParticulier(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public HandicapParticulier(Icon icon, boolean selected) {
		super(icon, selected);
		// TODO Auto-generated constructor stub
	}

	public HandicapParticulier(String text, boolean selected) {
		super(text, selected);
		// TODO Auto-generated constructor stub
	}

	public HandicapParticulier(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	public HandicapParticulier(String text, Icon icon, boolean selected) {
		super(text, icon, selected);
		// TODO Auto-generated constructor stub
	}
}