package fenetre.composants;

import javax.swing.Action;
import javax.swing.Icon;

/**
 * Classe utilisée dans la classe Handicap. Elle permet de préciser un type de handicap faisant partie d'un regroupement de handicap.
 * @author alexis
 *@see Handicap
 *@see AbstractJPanel
 */

public class HandicapAPreciser extends HandicapParticulier {

	/**
	 * 
	 */

	public HandicapAPreciser() {
		// TODO Auto-generated constructor stub
	}

	public HandicapAPreciser(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public HandicapAPreciser(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public HandicapAPreciser(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public HandicapAPreciser(Icon icon, boolean selected) {
		super(icon, selected);
		// TODO Auto-generated constructor stub
	}

	public HandicapAPreciser(String text, boolean selected) {
		super(text, selected);
		// TODO Auto-generated constructor stub
	}

	public HandicapAPreciser(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	public HandicapAPreciser(String text, Icon icon, boolean selected) {
		super(text, icon, selected);
		// TODO Auto-generated constructor stub
	}
}