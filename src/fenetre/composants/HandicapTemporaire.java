package fenetre.composants;

import javax.swing.Action;
import javax.swing.Icon;

/**
 * Classe utilisée dans la classe Handicap. Permet de préciser la nature du handicap.
 * @author alexis
 * @see Handicap
 * @see AbstractJPanel
 *
 */

public final class HandicapTemporaire extends DureeHandicap {

	public HandicapTemporaire() {
		// TODO Auto-generated constructor stub
	}

	public HandicapTemporaire(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public HandicapTemporaire(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public HandicapTemporaire(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public HandicapTemporaire(Icon icon, boolean selected) {
		super(icon, selected);
		// TODO Auto-generated constructor stub
	}

	public HandicapTemporaire(String text, boolean selected) {
		super(text, selected);
		// TODO Auto-generated constructor stub
	}

	public HandicapTemporaire(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	public HandicapTemporaire(String text, Icon icon, boolean selected) {
		super(text, icon, selected);
		// TODO Auto-generated constructor stub
	}

}