package fenetre.composants;

import javax.swing.Action;
import javax.swing.Icon;

/**
 * Classe utilisée dans la classe Handicap permettant de les différencier des regroupements de handicap, ceux-ci étant à préciser d'office.
 * @see Handicap
 * @see AbstractJPanel
 * @author alexis
 *
 */

public final class FamilleHandicapNonDefinie extends RegroupementTypeHandicap {

	public FamilleHandicapNonDefinie() {
		// TODO Auto-generated constructor stub
	}

	public FamilleHandicapNonDefinie(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public FamilleHandicapNonDefinie(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public FamilleHandicapNonDefinie(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public FamilleHandicapNonDefinie(Icon icon, boolean selected) {
		super(icon, selected);
		// TODO Auto-generated constructor stub
	}

	public FamilleHandicapNonDefinie(String text, boolean selected) {
		super(text, selected);
		// TODO Auto-generated constructor stub
	}

	public FamilleHandicapNonDefinie(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	public FamilleHandicapNonDefinie(String text, Icon icon, boolean selected) {
		super(text, icon, selected);
		// TODO Auto-generated constructor stub
	}

}