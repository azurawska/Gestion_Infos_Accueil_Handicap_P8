package fenetre.ecrans;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import fenetre.composants.AccompagnementExterieurApresBac;
import fenetre.composants.AccompagnementExterieurAvantBac;
import fenetre.composants.FormationParCorrespondance;
import fenetre.composants.OuiNon;
import interfaces.GestionFichierCSV;
import interfaces.GroupementBoutons;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

/**
 * Ecran retraçant le parcours de l'étudiant avant son entrée à l'université Paris 8 - Vincennes - Saint-Denis ou une de ses composantes (IUT par exemple).
 * @author alexis
 *
 */

public class ParcoursAnterieurP8 extends AbstractJPanel implements GestionFichierCSV, GroupementBoutons {
	
	/**
	 * Classe utilisée pour préciser l'organisme de formation par correspondance si le bouton "Oui" est coché.
	 * @author alexis
	 *
	 */
	
	private class OuiNonFormationParCorrespondanceListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnOui.isSelected()) {
				textField_2.setVisible(true);
			}
			else {
				textField_2.setVisible(false);
				textField_2.setText("");
			}
		}
	}
	
	/**
	 * Classe utilisée pour préciser l'établissement ou le service d'accompagnement de l'étudiant avant le bac s'il en avait un.
	 * @author alexis
	 *
	 */
	
	private class OuiNonAccompagnementExterieurAvantBacListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnOui_1.isSelected()) {
				textField_3.setVisible(true);
			}
			else {
				textField_3.setVisible(false);
				textField_3.setText("");
			}
		}
	}
	
	/**
	 * Classe permettant de préciser l'établissement ou le service d'accompagnement de l'étudiant s'il en a un.
	 * @author alexis
	 *
	 */
	
	private class OuiNonAccompagnementExterieurApresBacListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(radioButton.isSelected()) {
				textField_4.setVisible(true);
			}
			else {
				textField_4.setVisible(false);
				textField_4.setText("");
			}
		}
	}
	
	/**
	 * Bac ou équivalent
	 */
	
	private JTextField textField;
	
	/**
	 * Année d'obtention
	 */
	
	private JTextField textField_1;
	
	/**
	 * Organisme de formation par correspondance
	 */
	
	private JTextField textField_2;
	
	/**
	 * Centre ou service médico-social avant bac
	 */
	
	private JTextField textField_3;
	
	/**
	 * Centre ou service médico-social après bac
	 */
	
	private JTextField textField_4;
	
	private JTextArea textArea;
	
	private JTextArea textArea_1;
	
	private JTextArea textArea_2;
	
	private JTextArea textArea_3;
	
	/**
	 * Libellé du champ
	 */
	
	private JLabel lblBaccalauratOuquivalent;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAnneDobtention;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAmnagementsMisEn;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblPourLesCours;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblPourLesExamens;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblFormationParCorrespondance;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAccompagnementExtrieurPar;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAmnagementsMisEn_1;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel label;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel label_1;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel label_2;
	
	/**
	 * Bouton Oui formation par correspondance
	 */
	
	private OuiNon rdbtnOui;
	
	/**
	 * Bouton Non formation par correspondance
	 */
	
	private OuiNon rdbtnNon;
	
	/**
	 * Bouton Oui centre médico-social antébac
	 */
	
	private OuiNon rdbtnOui_1;
	
	/**
	 * Bouton Non centre médico-social antébac
	 */
	
	private OuiNon rdbtnNon_1;
	
	/**
	 * Bouton Oui centre médico-social postbac
	 */
	
	private OuiNon radioButton;
	
	/**
	 * Bouton Non centre médico-social postbac
	 */
	
	private OuiNon radioButton_1;
	
	/**
	 * Indique si l'étudiant est nouveau ou pas
	 */
	
	private boolean nouveau;
	
	/**
	 * Le numéro d'étudiant
	 */
	
	private String numEtudiant;
	
	/**
	 * Variable permettant de travailler avec le fichier concernant le parcours de chacun des étudiants avant leur entrée au sein de l'université Paris 8
	 */
	
	private final LectureFichierCSV fichierParcoursAnterieurP8 = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/parcours_ens_sup_ante_p8.csv");

	/**
	 * Create the panel for a new student.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public ParcoursAnterieurP8() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		
		setLayout(null);
		
		lblBaccalauratOuquivalent = new JLabel("Baccalauréat ou équivalent");
		
		gestionChampsEtExceptions(lblBaccalauratOuquivalent, 18, 18, 172, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textField = new JTextField();
		
		gestionChampsEtExceptions(textField, 237, 13, 130, 26, Color.WHITE, true, true, true, null, null, null, null, "", null, null, null);
		
		lblAnneDobtention = new JLabel("Année d'obtention");
		
		gestionChampsEtExceptions(lblAnneDobtention, 18, 46, 123, 16, null, true, true, true, null, null, null, null, "", null, null, null);
		
		textField_1 = new JTextField();
		
		gestionChampsEtExceptions(textField_1, 237, 41, 130, 26, Color.WHITE, true, true, true, null, null, null, null, "", null, null, null);
		
		lblAmnagementsMisEn = new JLabel("Aménagements mis en place et/ou matériel pédagogique mis à disposition avant le baccalauréat :");
		
		gestionChampsEtExceptions(lblAmnagementsMisEn, 18, 74, 626, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		lblPourLesCours = new JLabel("Pour les cours :");
		
		gestionChampsEtExceptions(lblPourLesCours, 18, 102, 110, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		JScrollPane pane = new JScrollPane();
		
		gestionChampsEtExceptions(pane, 121, 90, 204, 84, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textArea = new JTextArea();
		
		gestionChampsEtExceptions(textArea, 121, 90, 204, 84, Color.WHITE, true, true, true, null, null, null, null, "", null, null, pane);
		
		lblPourLesExamens = new JLabel("Pour les examens :");
		
		gestionChampsEtExceptions(lblPourLesExamens, 337, 102, 123, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		JScrollPane pane2 = new JScrollPane();
		
		gestionChampsEtExceptions(pane2, 464, 90, 233, 71, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textArea_1 = new JTextArea();
		
		gestionChampsEtExceptions(textArea_1, 464, 90, 233, 71, Color.WHITE, true, true, true, null, null, null, null, "", null, null, pane2);
		
		lblFormationParCorrespondance = new JLabel("Formation par correspondance (si oui, préciser l'organisme)");
		
		gestionChampsEtExceptions(lblFormationParCorrespondance, 25, 186, 380, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		rdbtnOui = new OuiNon("Oui");
		
		gestionChampsEtExceptions(rdbtnOui, 404, 182, 60, 23, null, true, true, null, false, null, null, new OuiNonFormationParCorrespondanceListener(), "", textField_2, null, null);
		
		rdbtnNon = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon, 460, 182, 60, 23, null, true, true, null, false, null, null, new OuiNonFormationParCorrespondanceListener(), "", textField_2, null, null);
		
		FormationParCorrespondance formationParCorrespondance = new FormationParCorrespondance();
		regrouperBoutons(formationParCorrespondance);
		
		textField_2 = new JTextField();
		
		gestionChampsEtExceptions(textField_2, 529, 181, 168, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		lblAccompagnementExtrieurPar = new JLabel("Accompagnement extérieur par un service/établissement (médico-social ou sanitaire, avsi,...)");
		
		gestionChampsEtExceptions(lblAccompagnementExtrieurPar, 24, 214, 599, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		rdbtnOui_1 = new OuiNon("Oui");
		
		gestionChampsEtExceptions(rdbtnOui_1, 620, 210, 60, 23, null, true, true, null, false, null, null, new OuiNonAccompagnementExterieurAvantBacListener(), "", textField_3, null, null);
		
		rdbtnNon_1 = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon_1, 674, 210, 60, 23, null, true, true, null, false, null, null, new OuiNonAccompagnementExterieurAvantBacListener(), "", textField_3, null, null);
		
		AccompagnementExterieurAvantBac accompagnementExterieurAvantBac = new AccompagnementExterieurAvantBac();
		regrouperBoutons(accompagnementExterieurAvantBac);
		
		textField_3 = new JTextField();
		
		gestionChampsEtExceptions(textField_3, 734, 209, 250, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		lblAmnagementsMisEn_1 = new JLabel("Aménagements mis en place et/ou matériel pédagogique mis à disposition après l'obtention du baccalauréat :");
		
		gestionChampsEtExceptions(lblAmnagementsMisEn_1, 25, 237, 702, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		label = new JLabel("Pour les cours :");
		
		gestionChampsEtExceptions(label, 31, 265, 110, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		JScrollPane pane3 = new JScrollPane();
		
		gestionChampsEtExceptions(pane3, 134, 265, 204, 84, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textArea_2 = new JTextArea();
		
		gestionChampsEtExceptions(textArea_2, 134, 265, 204, 84, Color.WHITE, true, true, true, null, null, null, null, "", null, null, pane3);
		
		label_1 = new JLabel("Pour les examens :");
		
		gestionChampsEtExceptions(label_1, 350, 265, 123, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		JScrollPane pane4 = new JScrollPane();
		
		gestionChampsEtExceptions(pane4, 475, 252, 233, 71, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textArea_3 = new JTextArea();
		
		gestionChampsEtExceptions(textArea_3, 475, 252, 233, 71, Color.WHITE, true, true, true, null, null, null, null, "", null, null, pane4);
		
		label_2 = new JLabel("Accompagnement extérieur par un service/établissement (médico-social ou sanitaire, avsi,...)");
		
		gestionChampsEtExceptions(label_2, 18, 374, 599, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		radioButton = new OuiNon("Oui");
		
		gestionChampsEtExceptions(radioButton, 620, 370, 60, 23, null, true, true, null, false, null, null, new OuiNonAccompagnementExterieurApresBacListener(), "", textField_4, null, null);
		
		radioButton_1 = new OuiNon("Non");
		
		gestionChampsEtExceptions(radioButton_1, 674, 370, 60, 23, null, true, true, null, false, null, null, new OuiNonAccompagnementExterieurApresBacListener(), "", textField_4, null, null);
		
		AccompagnementExterieurApresBac accompagnementExterieurApresBac = new AccompagnementExterieurApresBac();
		regrouperBoutons(accompagnementExterieurApresBac);
		
		textField_4 = new JTextField();
		
		gestionChampsEtExceptions(textField_4, 734, 369, 250, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
	}

	/**
	 * Crée le panel en collectant les informations de l'étudiant à partir de son numéro lorsque celui-ci est répertorié
	 * @param numEtudiant le numéro d'étudiant
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
	public ParcoursAnterieurP8(String numEtudiant) throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		gererInfosFichierCSV(fichierParcoursAnterieurP8);
	}

	@Override
	public void regrouperBoutons(ButtonGroup boutons) {
		if(boutons instanceof FormationParCorrespondance) {
			boutons.add(rdbtnOui);
			boutons.add(rdbtnNon);
		}
		else if(boutons instanceof AccompagnementExterieurAvantBac) {
			boutons.add(rdbtnOui_1);
			boutons.add(rdbtnNon_1);
		}
		else if(boutons instanceof AccompagnementExterieurApresBac) {
			boutons.add(radioButton);
			boutons.add(radioButton_1);
		}
	}

	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier)
			throws LongueurDifferenteListesException, NullArgumentException {
		
			textField_2 = new JTextField();
			
			textField_3 = new JTextField();
			
			textField_4 = new JTextField();
		
			ArrayList<String[]> etudiants = fichierParcoursAnterieurP8.chargerFichier();
			String[] etudiant = fichier.retournerInfosEtudiant(etudiants, this.numEtudiant);
			
			setLayout(null);
			
			lblBaccalauratOuquivalent = new JLabel("Baccalauréat ou équivalent");
			
			gestionChampsEtExceptions(lblBaccalauratOuquivalent, 18, 18, 172, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			textField = new JTextField();
			
			gestionChampsEtExceptions(textField, 237, 13, 130, 26, Color.GRAY, true, true, false, null, null, null, null, etudiant[1], null, null, null);
			
			lblAnneDobtention = new JLabel("Année d'obtention");
			
			gestionChampsEtExceptions(lblAnneDobtention, 18, 46, 123, 16, null, true, true, true, null, null, null, null, null, null, null, null);
			
			textField_1 = new JTextField();
			
			gestionChampsEtExceptions(textField_1, 237, 41, 130, 26, Color.GRAY, true, true, false, null, null, null, null, etudiant[2], null, null, null);
			
			lblAmnagementsMisEn = new JLabel("Aménagements mis en place et/ou matériel pédagogique mis à disposition avant le baccalauréat :");
			
			gestionChampsEtExceptions(lblAmnagementsMisEn, 18, 74, 626, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			lblPourLesCours = new JLabel("Pour les cours :");
			
			gestionChampsEtExceptions(lblPourLesCours, 18, 102, 110, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			JScrollPane pane = new JScrollPane();
			
			gestionChampsEtExceptions(pane, 121, 90, 204, 84, null, true, true, null, null, null, null, null, null, null, null, null);
			
			textArea = new JTextArea();
			
			gestionChampsEtExceptions(textArea, 121, 90, 204, 84, Color.WHITE, true, true, true, null, null, null, null, etudiant[3], null, null, pane);
			
			lblPourLesExamens = new JLabel("Pour les examens :");
			
			gestionChampsEtExceptions(lblPourLesExamens, 337, 102, 123, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			JScrollPane pane2 = new JScrollPane();
			
			gestionChampsEtExceptions(pane2, 464, 90, 233, 71, null, true, true, null, null, null, null, null, null, null, null, null);
			
			textArea_1 = new JTextArea();
			
			gestionChampsEtExceptions(textArea_1, 464, 90, 233, 71, Color.WHITE, true, true, true, null, null, null, null, etudiant[4], null, null, pane2);
			
			lblFormationParCorrespondance = new JLabel("Formation par correspondance (si oui, préciser l'organisme)");
			
			gestionChampsEtExceptions(lblFormationParCorrespondance, 25, 186, 380, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			rdbtnOui = new OuiNon("Oui");
			
			gestionChampsEtExceptions(textField_2, 529, 181, 168, 26, Color.WHITE, false, true, true, null, null, null, null, etudiant[6], null, null, null);
			
			gestionChampsEtExceptions(rdbtnOui, 404, 182, 60, 23, null, true, true, null, false, null, null, new OuiNonFormationParCorrespondanceListener(), etudiant[5], textField_2, null, null);
			
			rdbtnNon = new OuiNon("Non");
			
			gestionChampsEtExceptions(rdbtnNon, 460, 182, 60, 23, null, true, true, null, false, null, null, new OuiNonFormationParCorrespondanceListener(), etudiant[5], textField_2, null, null);
			
			FormationParCorrespondance formationParCorrespondance = new FormationParCorrespondance();
			regrouperBoutons(formationParCorrespondance);
			
			lblAccompagnementExtrieurPar = new JLabel("Accompagnement extérieur par un service/établissement (médico-social ou sanitaire, avsi,...)");
			
			gestionChampsEtExceptions(lblAccompagnementExtrieurPar, 24, 214, 599, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(textField_3, 734, 209, 250, 26, Color.WHITE, false, true, true, null, null, null, null, etudiant[8], null, null, null);
			
			rdbtnOui_1 = new OuiNon("Oui");
			
			gestionChampsEtExceptions(rdbtnOui_1, 620, 210, 60, 23, null, true, true, null, false, null, null, new OuiNonAccompagnementExterieurAvantBacListener(), etudiant[7], textField_3, null, null);
			
			rdbtnNon_1 = new OuiNon("Non");
			
			gestionChampsEtExceptions(rdbtnNon_1, 674, 210, 60, 23, null, true, true, null, false, null, null, new OuiNonAccompagnementExterieurAvantBacListener(), etudiant[7], textField_3, null, null);
			
			AccompagnementExterieurAvantBac accompagnementExterieurAvantBac = new AccompagnementExterieurAvantBac();
			regrouperBoutons(accompagnementExterieurAvantBac);
			
			lblAmnagementsMisEn_1 = new JLabel("Aménagements mis en place et/ou matériel pédagogique mis à disposition après l'obtention du baccalauréat :");
			
			gestionChampsEtExceptions(lblAmnagementsMisEn_1, 25, 237, 702, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			label = new JLabel("Pour les cours :");
			
			gestionChampsEtExceptions(label, 31, 265, 110, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			JScrollPane pane3 = new JScrollPane();
			
			gestionChampsEtExceptions(pane3, 134, 265, 204, 84, null, true, true, null, null, null, null, null, null, null, null, null);
			
			textArea_2 = new JTextArea();
			
			gestionChampsEtExceptions(textArea_2, 134, 265, 204, 84, Color.WHITE, true, true, true, null, null, null, null, etudiant[15], null, null, pane3);
			
			label_1 = new JLabel("Pour les examens :");
			
			gestionChampsEtExceptions(label_1, 350, 265, 123, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			JScrollPane pane4 = new JScrollPane();
			
			gestionChampsEtExceptions(pane4, 475, 252, 233, 71, null, true, true, null, null, null, null, null, null, null, null, null);
			
			textArea_3 = new JTextArea();
			
			gestionChampsEtExceptions(textArea_3, 475, 252, 233, 71, Color.WHITE, true, true, true, null, null, null, null, etudiant[16], null, null, pane4);
			
			label_2 = new JLabel("Accompagnement extérieur par un service/établissement (médico-social ou sanitaire, avsi,...)");
			
			gestionChampsEtExceptions(label_2, 18, 374, 599, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			gestionChampsEtExceptions(textField_4, 734, 369, 250, 26, Color.WHITE, false, true, true, null, null, null, null, etudiant[18], null, null, null);
			
			radioButton = new OuiNon("Oui");
			
			gestionChampsEtExceptions(radioButton, 620, 370, 60, 23, null, true, true, null, false, null, null, new OuiNonAccompagnementExterieurApresBacListener(), etudiant[17], textField_4, null, null);
			
			radioButton_1 = new OuiNon("Non");
			
			gestionChampsEtExceptions(radioButton_1, 674, 370, 60, 23, null, true, true, null, false, null, null, new OuiNonAccompagnementExterieurApresBacListener(), etudiant[17], textField_4, null, null);
			
			AccompagnementExterieurApresBac accompagnementExterieurApresBac = new AccompagnementExterieurApresBac();
			regrouperBoutons(accompagnementExterieurApresBac);
	}
}