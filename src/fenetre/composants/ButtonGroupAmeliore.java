package fenetre.composants;

import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 * @deprecated Classe qui n'a jamais été utilisée mais qui avait pour but de simplifier l'ajout et la suppression de boutons avant de se rendre compte que cela compliquait la tâche.
 * @author alexis
 *
 */

public class ButtonGroupAmeliore extends ButtonGroup {

	public ButtonGroupAmeliore() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Méthode permettant d'ajouter une liste de boutons à un ButtonGroup. 
	 * @deprecated
	 * @param buttons la liste des boutons à ajouter au ButtonGroup.
	 */
	
	public void addAll(ArrayList<AbstractButton> buttons) {
		for(int i=0;i<buttons.size();i++) {
			this.add(buttons.get(i));
		}
	}
	
	/**
	 * Supprime tous les boutons contenus dans la liste passées en paramètre.
	 * @param button la liste des boutons à supprimer du ButtonGroup
	 * @deprecated
	 */
	
	public void removeAll(ArrayList<AbstractButton> button) {
		for(int i=0;i<buttons.size();i++) {
			this.remove(buttons.get(i));
		}
	}
}