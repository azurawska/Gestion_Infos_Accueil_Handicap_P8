package fenetre.composants;

import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class ButtonGroupAmeliore extends ButtonGroup {

	public ButtonGroupAmeliore() {
		// TODO Auto-generated constructor stub
		super();
	}

	public void addAll(ArrayList<AbstractButton> buttons) {
		for(int i=0;i<buttons.size();i++) {
			this.add(buttons.get(i));
		}
	}
	
	public void removeAll(ArrayList<AbstractButton> button) {
		for(int i=0;i<buttons.size();i++) {
			this.remove(buttons.get(i));
		}
	}
}