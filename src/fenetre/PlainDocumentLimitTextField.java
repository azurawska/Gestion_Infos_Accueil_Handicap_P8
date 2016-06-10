package fenetre;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;

public final class PlainDocumentLimitTextField extends PlainDocument {
	
	private JTextField textField;
	private int longueur_max_saisie;
	
	public PlainDocumentLimitTextField(JTextField textField, int longueur_max_saisie) {
		this.textField=textField;
		this.longueur_max_saisie=longueur_max_saisie;
	}
	
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		int longueurTotale = str.length();
		
		if(longueur_max_saisie<=longueurTotale) {
			super.insertString(offs, str, a);
		}
	}

}