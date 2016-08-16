package fenetre.composants;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Date;

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

import com.toedter.calendar.JDateChooser;

import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;

public abstract class AbstractJPanel extends JPanel {
	
	private void definirEtAjouterChamp(JComponent composant, int x, int y, int width, int height, Color color, boolean visible, boolean enabled, Boolean editable, Boolean selected, ArrayList<String> titresOnglets, ArrayList<AbstractJPanel> onglets, EventListener event, String chaine, JTextField handicapParticulier) {
		
		composant.setBounds(x, y, width, height);
		composant.setVisible(visible);
		if(!(composant instanceof JDateChooser)) {
		composant.setEnabled(enabled);
		}
		if(composant instanceof JTextComponent) {
			((JTextComponent) composant).setEditable(editable);
			((JTextComponent) composant).setText(chaine);
			composant.setBackground(color);
		}
		add(composant);
		
		if(composant instanceof JTextField) {
			((JTextField) composant).setColumns(10);
			if(composant instanceof JTextFieldIdentifiant) {
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
					if(i==j) {
					((JTabbedPane) composant).addTab(titresOnglets.get(i), onglets.get(j));
					}
				}
			}
		}
		else if(composant instanceof DureeHandicap) {
			((DureeHandicap) composant).addChangeListener((ChangeListener) event);
			if(!chaine.equals("")) {
				if(chaine.equals("Non")) {
					((DureeHandicap) composant).setSelected(false);
				}
				else {
					((DureeHandicap) composant).setSelected(true);
					if(composant instanceof HandicapTemporaire) {
						handicapParticulier.setText(chaine);
					}
				}
			}
		}
		else if(composant instanceof TypeHandicapSensoriel) {
			((TypeHandicapSensoriel) composant).addChangeListener((ChangeListener) event);
			if(!chaine.equals("")) {
				if(!chaine.equals("Non")) {
					((TypeHandicapSensoriel) composant).setSelected(true);
					handicapParticulier.setText(chaine);
				}
				else {
					((TypeHandicapSensoriel) composant).setSelected(false);
				}
			}
		}
		else if(composant instanceof Sexe) {
			if(((Sexe) composant).getText().equals(chaine)) {
				((Sexe) composant).setSelected(true);
			}
			else {
				((Sexe) composant).setSelected(false);
			}
		}
		else if(composant instanceof JButton) {
			((JButton) composant).addActionListener((ActionListener) event);
		}
		else if(composant instanceof RegroupementTypeHandicap) {
			((RegroupementTypeHandicap) composant).addChangeListener((ChangeListener) event);
			if(!chaine.equals("")) {
			if(chaine.equals("Non")) {
				((RegroupementTypeHandicap) composant).setSelected(false);
			}
			else {
				((RegroupementTypeHandicap) composant).setSelected(true);
				if(composant instanceof FamilleHandicapNonDefinie) {
					handicapParticulier.setText(chaine);
				}
			}
		}
	}
		else if(composant instanceof JDateChooser) {
			
			Date date=null;
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			try {
				if(!chaine.equals("")) {
				date=dateFormat.parse(chaine);
				}
				((JDateChooser) composant).getDateEditor().setDate(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
			}
			if(enabled==true) {
			((JDateChooser) composant).getDateEditor().setEnabled(false);
			}
			else {
				composant.setEnabled(enabled);
			}
		}
		else if(composant instanceof HandicapParticulier) {
			((HandicapParticulier) composant).setSelected(selected);
			if(composant instanceof HandicapAPreciser) {
				((HandicapParticulier) composant).addChangeListener((ChangeListener) event);
				handicapParticulier.setText(chaine);
			}
		}
	}
	
	protected void gestionChampsEtExceptions(JComponent composant, int x, int y, int width, int height, Color color, boolean visible, boolean enabled, Boolean editable, Boolean selected, ArrayList<String> titresOnglets, ArrayList<AbstractJPanel> onglets, EventListener event, String chaine, JTextField handicapParticulier) throws LongueurDifferenteListesException, NullArgumentException {
		
		try {
		if((!titresOnglets.equals(null) && onglets.equals(null)) || (!onglets.equals(null) && titresOnglets.equals(null))) {
			throw new NullArgumentException();
		}
		
		if(!titresOnglets.equals(null) && !onglets.equals(null)) {
			if(titresOnglets.size()!=onglets.size()) {
				throw new LongueurDifferenteListesException();
			}
			else {
					definirEtAjouterChamp(composant, x, y, width, height, color, visible, enabled, editable, selected, titresOnglets, onglets, event, chaine, handicapParticulier);
				
				}
		}
	} catch(NullPointerException e) {
		
		definirEtAjouterChamp(composant, x, y, width, height, color, visible, enabled, editable, selected, titresOnglets, onglets, event, chaine, handicapParticulier);
		
		}
	}
}