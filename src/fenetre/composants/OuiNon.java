package fenetre.composants;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JRadioButton;

/**
 * Classe utilisée dans les JPanel contenant des boutons radio de type oui/non.
 * @author alexis
 *@see AbstractJPanel
 *@see AmenagementsCours
 *@see AmenagementsExamens
 *@see ParcoursAnterieurP8
 */

public class OuiNon extends JRadioButton {

	public OuiNon() {
		// TODO Auto-generated constructor stub
	}

	public OuiNon(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public OuiNon(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public OuiNon(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public OuiNon(Icon icon, boolean selected) {
		super(icon, selected);
		// TODO Auto-generated constructor stub
	}

	public OuiNon(String text, boolean selected) {
		super(text, selected);
		// TODO Auto-generated constructor stub
	}

	public OuiNon(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	public OuiNon(String text, Icon icon, boolean selected) {
		super(text, icon, selected);
		// TODO Auto-generated constructor stub
	}
}