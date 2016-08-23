package fenetre.ecrans;

import javax.swing.JPanel;

import java.awt.Color;

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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class ParcoursAnterieurP8 extends AbstractJPanel implements GestionFichierCSV, GroupementBoutons {
	
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
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	
	private JLabel lblBaccalauratOuquivalent;
	private JLabel lblAnneDobtention;
	private JLabel lblAmnagementsMisEn;
	private JLabel lblPourLesCours;
	private JLabel lblPourLesExamens;
	private JLabel lblFormationParCorrespondance;
	private JLabel lblAccompagnementExtrieurPar;
	private JLabel lblAmnagementsMisEn_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	
	private OuiNon rdbtnOui;
	private OuiNon rdbtnNon;
	private OuiNon rdbtnOui_1;
	private OuiNon rdbtnNon_1;
	private OuiNon radioButton;
	private OuiNon radioButton_1;
	
	private boolean nouveau;
	private String numEtudiant;
	
	private final LectureFichierCSV fichierParcoursAnterieurP8 = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/parcours_ens_sup_ante_p8");

	/**
	 * Create the panel.
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
		
		gestionChampsEtExceptions(textField_3, 734, 209, 167, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
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
		
		gestionChampsEtExceptions(textField_4, 734, 369, 167, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
	}

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
		// TODO Auto-generated method stub
	}
}