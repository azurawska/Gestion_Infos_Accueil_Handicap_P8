package fenetre.composants;

import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 * Classe utilisée dans la classe Authentification pour que le champ de numéro d'étudiant ne soit plus éditable une fois que quelque chose est écrit dedans.
 * @author alexis
 *@see Authentification
 *@see AbstractJPanel
 */

public final class JTextFieldIdentifiant extends JTextField {

	public JTextFieldIdentifiant() {
		// TODO Auto-generated constructor stub
		super();
	}

	public JTextFieldIdentifiant(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public JTextFieldIdentifiant(int columns) {
		super(columns);
		// TODO Auto-generated constructor stub
	}

	public JTextFieldIdentifiant(String text, int columns) {
		super(text, columns);
		// TODO Auto-generated constructor stub
	}

	public JTextFieldIdentifiant(Document doc, String text, int columns) {
		super(doc, text, columns);
		// TODO Auto-generated constructor stub
	}
}