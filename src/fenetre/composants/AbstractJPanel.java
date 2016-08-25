package fenetre.composants;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;

import com.toedter.calendar.JDateChooser;

import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;

/**
 * Classe étendue par tous les JPanel de l'application.
 * @author alexis
 *@See Identite
 *@See Authentification
 *@See ParcoursAnterieurP8
 *@See Handicap
 *@See Amenagements
 *@See AmenagementsCours
 *@See AmenagementsExamens
 *@See Projets
 *@See CarnetDeVisiteEtCommentaires
 *@See Inscription
 *@See Accueil
 *@See NotesReussite
 *@See ListeEtudiantsAvecNomOuPrenomCommuns
 */

public abstract class AbstractJPanel extends JPanel {
	
	/**
	 * Méthode centrale permettant de placer les composants sur chaque JPanel implémentant cette classe
	 * @param composant le composant à positionner sur le JPanel courant
	 * @param x position horizontale
	 * @param y position verticale
	 * @param width largeur
	 * @param height taille
	 * @param color couleur du composant dans le cas de JTextField et de JTextArea éditables ou non (blanc si oui, gris sinon). Ce para^tre est à null en dehors de ces cas-là.
	 * @param visible visibilité du composant
	 * @param enabled indique si le composant est actif ou pas (s'il peut être rempli par programmation, notamment dans le cas d'un JTextField. S'il est à false, le texte modifié n'apparaîtra pas.
	 * @param editable indique si le composant est éditable. Valable pour tous les champs de saisie.
	 * @param selected indique si le composant est sélectionné. Valable pour les composant de type JToggleButton
	 * @param titresOnglets liste des titres des onglets. Valable si le composant est un JTabbedPane. Null pour les autres types.
	 * @param onglets liste des onglets. Valable si le composant est un JTabbedPane. Null pour les autres types.
	 * @param event événement associé à un composant lorsqu'il doit se passer quelque chose quand on intéragit avec lui. Valable pour les boutons, les checkbox, certaines comboBox et les boutons radio. Null le reste du temps.
	 * @param chaine le texte que doit contenir un champ de saisi ou avec lequel doit être comparé le texte d'un composant afin que celui-ci puisse être sélectionné en conséquence selon certaines conditions. Cette chaîne devra servir, par la suite, à définir dynamiquement les textes des JLabel.
	 * @param handicapParticulier le JTextField qui doit contenir un texte spécifique lors de la consultation des informations d'un étudiant dans certains cas. Null le reste du temps.
	 *@See Handicap
	 * @param statutAmenagement Null si le composant n'est pas de type Droit ou Fait. Il est du type abstrait DroitFait qui est implémenté par Droit et Fait. Du coup, les cases à cocher droit et fait pour chaque type d'aménagements sont liées l'une à l'autre.
	 *@See AmenagementsCours
	 *@See AmenagementsExamens
	 *@See DroitFait
	 *@See Droit
	 *@See Fait
	 * @param pane le JScrollPane utiisé si les composants sont de type JTextArea ou JComboBox. Null le reste du temps. Celui-ci permet de mettre des barres de défilement sur ces champs.
	 */
	
	private void definirEtAjouterChamp(JComponent composant, int x, int y, int width, int height, Color color, boolean visible, boolean enabled, Boolean editable, Boolean selected, ArrayList<String> titresOnglets, ArrayList<AbstractJPanel> onglets, EventListener event, String chaine, JTextField handicapParticulier, DroitFait statutAmenagement, JScrollPane pane) {
		
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
		if(composant instanceof JToggleButton) {
			((JToggleButton) composant).setSelected(selected);
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
			pane.setViewportView(composant);
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
		else if(composant instanceof OuiNon) {
			((OuiNon) composant).addChangeListener((ChangeListener) event);
			if(!chaine.equals("")) {
			if(((OuiNon) composant).getText().equals(chaine)) {
				((OuiNon) composant).setSelected(true);
			}
			else  {
					((OuiNon) composant).setSelected(false);
				}
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
			if(!chaine.equals("")) {
				if(chaine.equals("Non")) {
					((HandicapParticulier) composant).setSelected(false);
				}
				else {
					((HandicapParticulier) composant).setSelected(true);
				}
			}
			if(composant instanceof HandicapAPreciser) {
				((HandicapAPreciser) composant).addChangeListener((ChangeListener) event);
				handicapParticulier.setText(chaine);
			}
		}
		else if(composant instanceof JComboBox<?>) {
			if(!chaine.equals("")) {
				((JComboBox<String>) composant).setSelectedItem(chaine);
			}
		}
		else if(composant instanceof Fait) {
			((Fait) composant).addChangeListener((ChangeListener) event);
			if(((Fait) composant).getText().equals(chaine)) {
				((Fait) composant).setSelected(true);
			}
		}
		else if(composant instanceof Droit) {
			if(((Droit) composant).getText().equals(chaine)) {
				((Droit) composant).setSelected(true);
			}
		}
		else if(composant instanceof DroitParticulier) {
			handicapParticulier.setText(chaine);
		}
		else if(composant instanceof AffectationPrioritaire) {
			if(!chaine.equals("")) {
				if(chaine.equals("Oui")) {
					((AffectationPrioritaire) composant).setSelected(true);
				}
				else {
					((AffectationPrioritaire) composant).setSelected(false);
				}
			}
		}
		else if(composant instanceof JList<?>) {
			((JList<String>) composant).setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			pane.setViewportView(composant);
			if(!chaine.equals("") && !chaine.equals("Non")) {
			((JList<String>) composant).setSelectedValue(chaine, true);
			statutAmenagement.setSelected(true);
			}
		}
	}
	
	/**
	 * Méthode appelée par toutes les classes étendant cette classe. Cette méthode appelle la méthode centrale (voir plus haut).
	 * @param composant le composant à positionner sur le JPanel courant
	 * @param x position horizontale
	 * @param y position verticale
	 * @param width largeur
	 * @param height taille
	 * @param color couleur du composant dans le cas de JTextField et de JTextArea éditables ou non (blanc si oui, gris sinon). Ce para^tre est à null en dehors de ces cas-là.
	 * @param visible visibilité du composant
	 * @param enabled indique si le composant est actif ou pas (s'il peut être rempli par programmation, notamment dans le cas d'un JTextField. S'il est à false, le texte modifié n'apparaîtra pas.
	 * @param editable indique si le composant est éditable. Valable pour tous les champs de saisie.
	 * @param selected indique si le composant est sélectionné. Valable pour les composant de type JToggleButton
	 * @param titresOnglets liste des titres des onglets. Valable si le composant est un JTabbedPane. Null pour les autres types.
	 * @param onglets liste des onglets. Valable si le composant est un JTabbedPane. Null pour les autres types.
	 * @param event événement associé à un composant lorsqu'il doit se passer quelque chose quand on intéragit avec lui. Valable pour les boutons, les checkbox, certaines comboBox et les boutons radio. Null le reste du temps.
	 * @param chaine le texte que doit contenir un champ de saisi ou avec lequel doit être comparé le texte d'un composant afin que celui-ci puisse être sélectionné en conséquence selon certaines conditions. Cette chaîne devra servir, par la suite, à définir dynamiquement les textes des JLabel.
	 * @param handicapParticulier le JTextField qui doit contenir un texte spécifique lors de la consultation des informations d'un étudiant dans certains cas. Null le reste du temps.
	 *@See Handicap
	 * @param statutAmenagement Null si le composant n'est pas de type Droit ou Fait. Il est du type abstrait DroitFait qui est implémenté par Droit et Fait. Du coup, les cases à cocher droit et fait pour chaque type d'aménagements sont liées l'une à l'autre.
	 *@See AmenagementsCours
	 *@See AmenagementsExamens
	 *@See DroitFait
	 *@See Droit
	 *@See Fait
	 * @param pane le JScrollPane utiisé si les composants sont de type JTextArea ou JComboBox. Null le reste du temps. Celui-ci permet de mettre des barres de défilement sur ces champs.
	 * @throws NullArgumentException
	 * @throws LongueurDifferenteListesException
	 */
	
	protected void gestionChampsEtExceptions(JComponent composant, int x, int y, int width, int height, Color color, boolean visible, boolean enabled, Boolean editable, Boolean selected, ArrayList<String> titresOnglets, ArrayList<AbstractJPanel> onglets, EventListener event, String chaine, JTextField handicapParticulier, DroitFait statutAmenagement, JScrollPane pane) throws LongueurDifferenteListesException, NullArgumentException {
		
		try {
		if((!titresOnglets.equals(null) && onglets.equals(null)) || (!onglets.equals(null) && titresOnglets.equals(null))) {
			throw new NullArgumentException();
		}
		
		if(!titresOnglets.equals(null) && !onglets.equals(null)) {
			if(titresOnglets.size()!=onglets.size()) {
				throw new LongueurDifferenteListesException();
			}
			else {
					definirEtAjouterChamp(composant, x, y, width, height, color, visible, enabled, editable, selected, titresOnglets, onglets, event, chaine, handicapParticulier, statutAmenagement, pane);
				
				}
		}
	} catch(NullPointerException e) {
		
		definirEtAjouterChamp(composant, x, y, width, height, color, visible, enabled, editable, selected, titresOnglets, onglets, event, chaine, handicapParticulier, statutAmenagement, pane);
		
		}
	}
}