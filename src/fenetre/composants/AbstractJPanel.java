package fenetre.composants;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;

import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;

public abstract class AbstractJPanel extends JPanel {
	
	private void definirEtAjouterChamp(JComponent composant, int x, int y, int width, int height, boolean visible, boolean enabled, Boolean editable, ArrayList<String> titresOnglets, ArrayList<AbstractJPanel> onglets, EventListener event, String chaine) {
		
		composant.setBounds(x, y, width, height);
		composant.setVisible(visible);
		composant.setEnabled(enabled);
		if(composant instanceof JTextComponent) {
			((JTextComponent) composant).setEditable(editable);
			((JTextComponent) composant).setText(chaine);
		}
		add(composant);
		
		if(composant instanceof JTextField) {
			((JTextField) composant).setColumns(10);
			if(!event.equals(null)) {
				composant.addMouseListener((MouseListener) event);
			}
		}
		else if(composant instanceof JTextArea) {
			((JTextArea) composant).setLineWrap(true);
			((JTextArea) composant).setWrapStyleWord(true);
		}
		else if(composant instanceof JTabbedPane) {
			for(int i=0;i<titresOnglets.size();i++) {
				for(int j=0;j<onglets.size();j++) {
					((JTabbedPane) composant).addTab(titresOnglets.get(i), onglets.get(j));
				}
			}
		}
		else if(composant instanceof JRadioButton) {
			((JRadioButton) composant).addChangeListener((ChangeListener) event);
		}
		else if(composant instanceof JButton) {
			((JButton) composant).addActionListener((ActionListener) event);
		}
		else if(composant instanceof RegroupementTypeHandicap) {
			((RegroupementTypeHandicap) composant).addChangeListener((ChangeListener) event);
			}
	
	}
	
	protected void gestionChampsEtExceptions(JComponent composant, int x, int y, int width, int height, boolean visible, boolean enabled, Boolean editable, ArrayList<String> titresOnglets, ArrayList<AbstractJPanel> onglets, EventListener event, String chaine) throws LongueurDifferenteListesException, NullArgumentException {
		
		try {
		if((!titresOnglets.equals(null) && onglets.equals(null)) || (!onglets.equals(null) && titresOnglets.equals(null))) {
			throw new NullArgumentException();
		}
		
		if(!titresOnglets.equals(null) && !onglets.equals(null)) {
			if(titresOnglets.size()!=onglets.size()) {
				throw new LongueurDifferenteListesException();
			}
			else {
					definirEtAjouterChamp(composant, x, y, width, height, visible, enabled, editable, titresOnglets, onglets, event, chaine);
				
				}
		}
	} catch(NullPointerException e) {
		
		definirEtAjouterChamp(composant, x, y, width, height, visible, enabled, editable, titresOnglets, onglets, event, chaine);
		
		}
	}
}