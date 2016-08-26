package fenetre.composants;

import javax.swing.Action;
import javax.swing.Icon;

/**
 *Classe utilisée dans les classes AmenagementsCours et AmenagementsExamens. 
 * @author alexis
 *@see AmenagementsCours
 *@see AmenagementsExamens
 *@see AbstractJPanel
 */

public class Fait extends DroitFait {

	public Fait() {
		// TODO Auto-generated constructor stub
	}

	public Fait(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public Fait(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public Fait(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public Fait(Icon icon, boolean selected) {
		super(icon, selected);
		// TODO Auto-generated constructor stub
	}

	public Fait(String text, boolean selected) {
		super(text, selected);
		// TODO Auto-generated constructor stub
	}

	public Fait(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	public Fait(String text, Icon icon, boolean selected) {
		super(text, icon, selected);
		// TODO Auto-generated constructor stub
	}
}