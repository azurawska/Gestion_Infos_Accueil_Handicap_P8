package fenetre.composants;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBox;

/**
 * Classe utilisée dans la classe Handicap. Permet de qualifier les checkBox représentant des regroupements de handicaps (moteur, visuel, etc...).
 * @author alexis
 *@See Handicap
 *@See AbstractJPanel
 */

public class RegroupementTypeHandicap extends JCheckBox {

	public RegroupementTypeHandicap() {
		// TODO Auto-generated constructor stub
	}

	public RegroupementTypeHandicap(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public RegroupementTypeHandicap(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public RegroupementTypeHandicap(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public RegroupementTypeHandicap(Icon icon, boolean selected) {
		super(icon, selected);
		// TODO Auto-generated constructor stub
	}

	public RegroupementTypeHandicap(String text, boolean selected) {
		super(text, selected);
		// TODO Auto-generated constructor stub
	}

	public RegroupementTypeHandicap(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	public RegroupementTypeHandicap(String text, Icon icon, boolean selected) {
		super(text, icon, selected);
		// TODO Auto-generated constructor stub
	}
}