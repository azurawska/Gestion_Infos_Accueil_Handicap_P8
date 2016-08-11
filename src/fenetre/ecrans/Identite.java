package fenetre.ecrans;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Scrollable;

import com.toedter.calendar.JDateChooser;

import data.LectureFichierCSV;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;

import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Identite extends AbstractJPanel implements Scrollable {
	private JDateChooser textField;
	private JDateChooser textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JDateChooser textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	
	private JRadioButton rdbtnM;
	private JRadioButton rdbtnMme;
	
	private boolean nouveau;
	
	private String numEtudiant;
	
	public Identite() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Date de création du dossier :");
		
		gestionChampsEtExceptions(lblNewLabel, 10, 11, 190, 14, null, true, true, null, null, null, null, null);
		
		textField = new JDateChooser();
		
		gestionChampsEtExceptions(textField, 204, 8, 150, 20, null, true, true, null, null, null, null, "");
		
		JLabel lblNewLabel_1 = new JLabel("Dernière mise à jour :");
		
		gestionChampsEtExceptions(lblNewLabel_1, 10, 36, 150, 14, null, true, true, null, null, null, null, null);
		
		textField_1 = new JDateChooser();
		
		gestionChampsEtExceptions(textField_1, 204,39, 150, 20, null, true, true, null, null, null, null, "");
		
		JLabel lblNewLabel_2 = new JLabel("N° Etudiant :");
		
		gestionChampsEtExceptions(lblNewLabel_2, 10, 73, 90, 14, null, true, true, null, null, null, null, null);
		
		textField_2 = new JTextField();
		
		gestionChampsEtExceptions(textField_2, 112, 70, 218, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		ButtonGroup monsieurMadame = new ButtonGroup();
		
		JRadioButton rdbtnM = new JRadioButton("M");
		
		gestionChampsEtExceptions(rdbtnM, 10, 103, 50, 23, null, true, true, null, null, null, null, null);
		
		JRadioButton rdbtnMme = new JRadioButton("Mme");
	
		gestionChampsEtExceptions(rdbtnMme, 50, 103, 70, 23, null, true, true, null, null, null, null, null);
		
		regrouperBoutons(monsieurMadame);
		
		JLabel lblNewLabel_3 = new JLabel("Nom de naissance :");
		
		gestionChampsEtExceptions(lblNewLabel_3, 10, 133, 130, 14, null, true, true, null, null, null, null, null);
		
		textField_3 = new JTextField();
		
		gestionChampsEtExceptions(textField_3, 140, 130, 190, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblNewLabel_4 = new JLabel("Nom d'époux(se) :");
		
		gestionChampsEtExceptions(lblNewLabel_4, 10, 159, 125, 14, null, true, true, null, null, null, null, null);
		
		textField_4 = new JTextField();
		
		gestionChampsEtExceptions(textField_4, 133, 161, 197, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblNewLabel_5 = new JLabel("Prénom :");
		
		gestionChampsEtExceptions(lblNewLabel_5, 20, 195, 55, 14, null, true, true, null, null, null, null, null);
		
		textField_5 = new JTextField();
		
		gestionChampsEtExceptions(textField_5, 87, 192, 243, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance :");
		
		gestionChampsEtExceptions(lblDateDeNaissance, 10, 234, 130, 14, null, true, true, null, null, null, null, null);
		
		textField_6 = new JDateChooser();
		
		gestionChampsEtExceptions(textField_6, 140, 231, 190, 20, null, true, true, null, null, null, null, "");
		
		JLabel lblNewLabel_6 = new JLabel("Domicile :");
		
		gestionChampsEtExceptions(lblNewLabel_6, 15, 259, 80, 14, null, true, true, null, null, null, null, null);
		
		textField_7 = new JTextField();
		
		gestionChampsEtExceptions(textField_7, 83, 262, 247, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblCodePostal = new JLabel("Code postal :");
		
		gestionChampsEtExceptions(lblCodePostal, 27, 300, 90, 14, null, true, true, null, null, null, null, null);
		
		textField_8 = new JTextField();
		
		gestionChampsEtExceptions(textField_8, 120, 293, 210, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblVille = new JLabel("Ville :");
		
		gestionChampsEtExceptions(lblVille, 36, 336, 40, 14, null, true, true, null, null, null, null, null);
		
		textField_9 = new JTextField();
		
		gestionChampsEtExceptions(textField_9, 87, 336, 243, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblTlphone = new JLabel("Téléphone :");
		
		gestionChampsEtExceptions(lblTlphone, 27, 380, 75, 14, null, true, true, null, null, null, null, null);
		
		textField_10 = new JTextField();
		
		gestionChampsEtExceptions(textField_10, 112, 377, 218, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblEmail = new JLabel("E-mail :");
		
		gestionChampsEtExceptions(lblEmail, 37, 413, 60, 14, null, true, true, null, null, null, null, null);
		
		textField_11 = new JTextField();
		
		gestionChampsEtExceptions(textField_11, 109, 408, 221, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblCoordonnesDunePersonnes = new JLabel("Coordonnées d'une personne à contacter en cas d'urgence : ");
		
		gestionChampsEtExceptions(lblCoordonnesDunePersonnes, 356, 11, 380, 14, null, true, true, null, null, null, null, null);
		
		JLabel lblNewLabel_7 = new JLabel("Nom :");
		
		gestionChampsEtExceptions(lblNewLabel_7, 366, 36, 46, 14, null, true, true, null, null, null, null, null);
		
		textField_12 = new JTextField();
		
		gestionChampsEtExceptions(textField_12, 494, 33, 150, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblNewLabel_8 = new JLabel("Prénom :");
	
		gestionChampsEtExceptions(lblNewLabel_8, 356, 61, 55, 14, null, true, true, null, null, null, null, null);
		
		textField_13 = new JTextField();
		
		gestionChampsEtExceptions(textField_13, 494, 67, 150, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblTlphone_1 = new JLabel("Téléphone :");
		
		gestionChampsEtExceptions(lblTlphone_1, 356, 95, 80, 14, null, true, true, null, null, null, null, null);
		
		textField_14 = new JTextField();
		
		gestionChampsEtExceptions(textField_14, 494, 92, 150, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblEmail_1 = new JLabel("E-mail :");
		
		gestionChampsEtExceptions(lblEmail_1, 366, 120, 60, 14, null, true, true, null, null, null, null, null);
		
		textField_15 = new JTextField();
		
		gestionChampsEtExceptions(textField_15, 494, 124, 150, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblCoordonnesDunPartenaire = new JLabel("Coordonnées d'un partenaire extérieur (psy, médecin, etc...) :");
		
		gestionChampsEtExceptions(lblCoordonnesDunPartenaire, 356, 164, 390, 14, null, true, true, null, null, null, null, null);
		
		JLabel lblNom = new JLabel("Fonction :");
	
		gestionChampsEtExceptions(lblNom, 366, 195, 45, 14, null, true, true, null, null, null, null, null);
		
		textField_16 = new JTextField();
		
		gestionChampsEtExceptions(textField_16, 467, 192, 177, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblPrnom = new JLabel("Nom :");
		
		gestionChampsEtExceptions(lblPrnom, 366, 234, 55, 14, null, true, true, null, null, null, null, "");
		
		textField_17 = new JTextField();
		
		gestionChampsEtExceptions(textField_17, 467, 223, 177, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblTlphone_2 = new JLabel("Prénom :");
	
		gestionChampsEtExceptions(lblTlphone_2, 356, 259, 75, 14, null, true, true, null, null, null, null, null);
		
		textField_18 = new JTextField();
		
		gestionChampsEtExceptions(textField_18, 467, 256, 177, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblEmail_2 = new JLabel("Téléphone :");
		
		gestionChampsEtExceptions(lblEmail_2, 366, 300, 60, 14, null, true, true, null, null, null, null, null);
		
		textField_19 = new JTextField();
		
		gestionChampsEtExceptions(textField_19, 467, 297, 177, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblFonction = new JLabel("E-mail :");
		
		gestionChampsEtExceptions(lblFonction, 366, 336, 65, 14, null, true, true, null, null, null, null, null);
		
		textField_20 = new JTextField();
		
		gestionChampsEtExceptions(textField_20, 467, 330, 177, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblNewLabel_9 = new JLabel("Commentaires :");
		
		gestionChampsEtExceptions(lblNewLabel_9, 356, 379, 130, 16, null, true, true, null, null, null, null, null);
		
		JTextArea textArea = new JTextArea();
		
		gestionChampsEtExceptions(textArea, 356, 393, 288, 141, Color.WHITE, true, true, true, null, null, null, "");
	}
	
	public Identite(String numEtudiant) throws LongueurDifferenteListesException, NullArgumentException {
		
		setLayout(null);
		
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		
		LectureFichierCSV fichierIdentite = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/identite.csv");
		
		ArrayList<String[]> etudiants = fichierIdentite.chargerFichier();
		
		String[] etudiant = fichierIdentite.retournerInfosEtudiant(etudiants, this.numEtudiant);
		
		JLabel lblNewLabel = new JLabel("Date de création du dossier :");
		
		gestionChampsEtExceptions(lblNewLabel, 10, 11, 190, 14, null, true, true, null, null, null, null, null);
		
		textField = new JDateChooser();
		
		gestionChampsEtExceptions(textField, 204, 8, 150, 20, null, true, false, null, null, null, null, etudiant[1]);
		
		JLabel lblNewLabel_1 = new JLabel("Dernière mise à jour :");
		
		gestionChampsEtExceptions(lblNewLabel_1, 10, 36, 150, 14, null, true, true, null, null, null, null, null);
		
		textField_1 = new JDateChooser();
		
		gestionChampsEtExceptions(textField_1, 204,39, 150, 20, null, true, false, null, null, null, null, etudiant[2]);
		
		JLabel lblNewLabel_2 = new JLabel("N° Etudiant :");
		
		gestionChampsEtExceptions(lblNewLabel_2, 10, 73, 90, 14, null, true, true, null, null, null, null, null);
		
		textField_2 = new JTextField();
		
		gestionChampsEtExceptions(textField_2, 112, 70, 218, 20, Color.GRAY, true, false, false, null, null, null, etudiant[0]);
		
		ButtonGroup monsieurMadame = new ButtonGroup();
		
		JRadioButton rdbtnM = new JRadioButton("M");
		
		gestionChampsEtExceptions(rdbtnM, 10, 103, 50, 23, null, true, false, null, null, null, null, null);
		
		JRadioButton rdbtnMme = new JRadioButton("Mme");
	
		gestionChampsEtExceptions(rdbtnMme, 50, 103, 70, 23, null, true, false, null, null, null, null, null);
		
		regrouperBoutons(monsieurMadame);
		
		JLabel lblNewLabel_3 = new JLabel("Nom de naissance :");
		
		gestionChampsEtExceptions(lblNewLabel_3, 10, 133, 130, 14, null, true, true, null, null, null, null, null);
		
		textField_3 = new JTextField();
		
		gestionChampsEtExceptions(textField_3, 140, 130, 190, 20, Color.GRAY, true, false, false, null, null, null, etudiant[4]);
		
		JLabel lblNewLabel_4 = new JLabel("Nom d'époux(se) :");
		
		gestionChampsEtExceptions(lblNewLabel_4, 10, 159, 125, 14, null, true, true, null, null, null, null, null);
		
		textField_4 = new JTextField();
		
		gestionChampsEtExceptions(textField_4, 133, 161, 197, 20, Color.GRAY, true, false, false, null, null, null, etudiant[5]);
		
		JLabel lblNewLabel_5 = new JLabel("Prénom :");
		
		gestionChampsEtExceptions(lblNewLabel_5, 20, 195, 55, 14, null, true, true, null, null, null, null, null);
		
		textField_5 = new JTextField();
		
		gestionChampsEtExceptions(textField_5, 87, 192, 243, 20, Color.GRAY, true, false, false, null, null, null, etudiant[6]);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance :");
		
		gestionChampsEtExceptions(lblDateDeNaissance, 10, 234, 130, 14, null, true, true, null, null, null, null, null);
		
		textField_6 = new JDateChooser();
		
		gestionChampsEtExceptions(textField_6, 140, 231, 190, 20, null, true, false, null, null, null, null, etudiant[7]);
		
		JLabel lblNewLabel_6 = new JLabel("Domicile :");
		
		gestionChampsEtExceptions(lblNewLabel_6, 15, 259, 80, 14, null, true, true, null, null, null, null, null);
		
		textField_7 = new JTextField();
		
		gestionChampsEtExceptions(textField_7, 83, 262, 247, 20, Color.WHITE, true, true, true, null, null, null, etudiant[8]);
		
		JLabel lblCodePostal = new JLabel("Code postal :");
		
		gestionChampsEtExceptions(lblCodePostal, 27, 300, 90, 14, null, true, true, null, null, null, null, null);
		
		textField_8 = new JTextField();
		
		gestionChampsEtExceptions(textField_8, 120, 293, 210, 20, Color.WHITE, true, true, true, null, null, null, etudiant[9]);
		
		JLabel lblVille = new JLabel("Ville :");
		
		gestionChampsEtExceptions(lblVille, 36, 336, 40, 14, null, true, true, null, null, null, null, null);
		
		textField_9 = new JTextField();
		
		gestionChampsEtExceptions(textField_9, 87, 336, 243, 20, Color.WHITE, true, true, true, null, null, null, etudiant[10]);
		
		JLabel lblTlphone = new JLabel("Téléphone :");
		
		gestionChampsEtExceptions(lblTlphone, 27, 380, 75, 14, null, true, true, null, null, null, null, null);
		
		textField_10 = new JTextField();
		
		gestionChampsEtExceptions(textField_10, 112, 377, 218, 20, Color.WHITE, true, true, true, null, null, null, etudiant[11]);
		
		JLabel lblEmail = new JLabel("E-mail :");
		
		gestionChampsEtExceptions(lblEmail, 37, 413, 60, 14, null, true, true, null, null, null, null, null);
		
		textField_11 = new JTextField();
		
		gestionChampsEtExceptions(textField_11, 109, 408, 221, 20, Color.WHITE, true, true, true, null, null, null, etudiant[12]);
		
		JLabel lblCoordonnesDunePersonnes = new JLabel("Coordonnées d'une personne à contacter en cas d'urgence : ");
		
		gestionChampsEtExceptions(lblCoordonnesDunePersonnes, 356, 11, 380, 14, null, true, true, null, null, null, null, null);
		
		JLabel lblNewLabel_7 = new JLabel("Nom :");
		
		gestionChampsEtExceptions(lblNewLabel_7, 366, 36, 46, 14, null, true, true, null, null, null, null, null);
		
		textField_12 = new JTextField();
		
		gestionChampsEtExceptions(textField_12, 494, 33, 150, 20, Color.WHITE, true, true, true, null, null, null, etudiant[13]);
		
		JLabel lblNewLabel_8 = new JLabel("Prénom :");
	
		gestionChampsEtExceptions(lblNewLabel_8, 356, 61, 55, 14, null, true, true, null, null, null, null, null);
		
		textField_13 = new JTextField();
		
		gestionChampsEtExceptions(textField_13, 494, 67, 150, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblTlphone_1 = new JLabel("Téléphone :");
		
		gestionChampsEtExceptions(lblTlphone_1, 356, 95, 80, 14, null, true, true, null, null, null, null, null);
		
		textField_14 = new JTextField();
		
		gestionChampsEtExceptions(textField_14, 494, 92, 150, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblEmail_1 = new JLabel("E-mail :");
		
		gestionChampsEtExceptions(lblEmail_1, 366, 120, 60, 14, null, true, true, null, null, null, null, null);
		
		textField_15 = new JTextField();
		
		gestionChampsEtExceptions(textField_15, 494, 124, 150, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblCoordonnesDunPartenaire = new JLabel("Coordonnées d'un partenaire extérieur (psy, médecin, etc...) :");
		
		gestionChampsEtExceptions(lblCoordonnesDunPartenaire, 356, 164, 390, 14, null, true, true, null, null, null, null, null);
		
		JLabel lblNom = new JLabel("Fonction :");
	
		gestionChampsEtExceptions(lblNom, 366, 195, 45, 14, null, true, true, null, null, null, null, null);
		
		textField_16 = new JTextField();
		
		gestionChampsEtExceptions(textField_16, 467, 192, 177, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblPrnom = new JLabel("Nom :");
		
		gestionChampsEtExceptions(lblPrnom, 366, 234, 55, 14, null, true, true, null, null, null, null, "");
		
		textField_17 = new JTextField();
		
		gestionChampsEtExceptions(textField_17, 467, 223, 177, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblTlphone_2 = new JLabel("Prénom :");
	
		gestionChampsEtExceptions(lblTlphone_2, 356, 259, 75, 14, null, true, true, null, null, null, null, null);
		
		textField_18 = new JTextField();
		
		gestionChampsEtExceptions(textField_18, 467, 256, 177, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblEmail_2 = new JLabel("Téléphone :");
		
		gestionChampsEtExceptions(lblEmail_2, 366, 300, 60, 14, null, true, true, null, null, null, null, null);
		
		textField_19 = new JTextField();
		
		gestionChampsEtExceptions(textField_19, 467, 297, 177, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblFonction = new JLabel("E-mail :");
		
		gestionChampsEtExceptions(lblFonction, 366, 336, 65, 14, null, true, true, null, null, null, null, null);
		
		textField_20 = new JTextField();
		
		gestionChampsEtExceptions(textField_20, 467, 330, 177, 20, Color.WHITE, true, true, true, null, null, null, "");
		
		JLabel lblNewLabel_9 = new JLabel("Commentaires :");
		
		gestionChampsEtExceptions(lblNewLabel_9, 356, 379, 130, 16, null, true, true, null, null, null, null, null);
		
		JTextArea textArea = new JTextArea();
		
		gestionChampsEtExceptions(textArea, 356, 393, 288, 141, Color.WHITE, true, true, true, null, null, null, "");
	}
		
		/*JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(356, 390, 290, 144);
		scrollPane.setViewportView(textArea);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane, null);*/
		
		/*JScrollPane scrollpane = new JScrollPane();
		scrollpane.setViewportView(this);
		scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);*/
		
		/*JScrollBar hbar = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 300);
		JScrollBar vbar = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 300);
		
		hbar.setUnitIncrement(2);
		vbar.setUnitIncrement(1);
		add(hbar, null);
		add(vbar, null);*/

	@Override
	public Dimension getPreferredScrollableViewportSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getScrollableTracksViewportWidth() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getScrollableTracksViewportHeight() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void regrouperBoutons(ButtonGroup buttons) {
		buttons.add(rdbtnM);
		buttons.add(rdbtnMme);
	}
}