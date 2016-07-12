package fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import data.LectureFichier;
//import fenetre.Authentification.QuitNumEtudiantFieldMouseEvent;
//import fenetre.Authentification.SuivantAction;

public class Fenetre extends JFrame {
	
	private Authentification authentification;
	private Accueil accueil;
	
	private int num_etudiant;
	private ArrayList<String[]> donneesEtudiantsAvecChainesCommunes;

	/**
	 * Create the frame.
	 */
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);
		this.authentification = new Authentification();
		setContentPane(authentification);
		this.authentification.setVisible(true);
		setVisible(true);
	}
	
	private class Authentification extends JPanel implements KeyListener {
		private JTextField textField_num_etudiant;
		private JTextField textField_nom;
		private JTextField textField_prenom;
		
		private JButton btnSuivant;
		
		private JButton btnNouveau;
		
		private LectureFichier lectureFichier;
		
		private Accueil accueil;
		
		
		/**
		 * Create the panel.
		 */
		public Authentification() {
			setLayout(null);
			
			//accueil = new Accueil();
			
			JLabel lblNEtudiant = new JLabel("N° Etudiant :");
			lblNEtudiant.setBounds(300, 150, 100, 29);
			add(lblNEtudiant);
			
			textField_num_etudiant = new JTextField();
			textField_num_etudiant.setBounds(400, 150, 86, 20);
			add(textField_num_etudiant);
			textField_num_etudiant.setColumns(10);
			//textField_num_etudiant.setDocument(new PlainDocumentLimitTextField(this.textField_num_etudiant, 8));
			textField_num_etudiant.addMouseListener(new QuitNumEtudiantFieldMouseEvent());
			
			JLabel lblNom = new JLabel("Nom :");
			lblNom.setBounds(300, 180, 100, 14);
			add(lblNom);
			
			textField_nom = new JTextField();
			textField_nom.setBounds(400, 180, 86, 20);
			add(textField_nom);
			textField_nom.setColumns(10);
			
			JLabel lblPrnom = new JLabel("Prénom :");
			lblPrnom.setBounds(300, 210, 100, 14);
			add(lblPrnom);
			
			textField_prenom = new JTextField();
			textField_prenom.setBounds(400, 210, 86, 20);
			add(textField_prenom);
			textField_prenom.setColumns(10);
			
			btnSuivant = new JButton("Suivant");
			btnSuivant.setBounds(400, 250, 89, 23);
			btnSuivant.addActionListener(new SuivantAction());
			add(btnSuivant);
			
			btnNouveau = new JButton("Nouveau");
			btnNouveau.setBounds(400, 280, 89, 23);
			btnNouveau.addActionListener(new NouveauAction());
			add(btnNouveau);
			
			addKeyListener(this);
		}
		
		private class NouveauAction implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				accueil = new Accueil();
				authentification.setVisible(false);
				setContentPane(accueil);
				accueil.setVisible(true);
			}
			
		}
		
		private class SuivantAction implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				suivant();
			}
		}
		
		private class QuitNumEtudiantFieldMouseEvent implements MouseListener {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if(!textField_num_etudiant.getText().equals("")) {
					textField_nom.setText("");
					textField_nom.setEditable(false);
					textField_prenom.setText("");
					textField_prenom.setEditable(false);
				}
				else {
					textField_nom.setEditable(true);
					textField_prenom.setEditable(true);
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		
		private class Accueil extends JPanel {
			
			private String numEtudiant;
			private String nom;
			private String prenom;
			
			/**
			 * Create the panel for a new user.
			 */
			
			public Accueil() {
				
				setLayout(null);
				
				JLabel lblNumEtudiant = new JLabel(this.numEtudiant);
				lblNumEtudiant.setBounds(132, 11, 150, 14);
				add(lblNumEtudiant);
				
				JLabel lblNom = new JLabel(this.nom);
				lblNom.setBounds(226, 11, 150, 14);
				add(lblNom);
				
				JLabel lblPrenom = new JLabel(this.prenom);
				lblPrenom.setBounds(354, 11, 150, 14);
				add(lblPrenom);
				
				JButton btnNewButton_1 = new JButton("Ok");
				btnNewButton_1.setBounds(404, 5, 61, 29);
				add(btnNewButton_1);
				
				JButton btnAnnuler = new JButton("Annuler");
				btnAnnuler.setBounds(487, 5, 77, 29);
				add(btnAnnuler);
				
				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane.setBounds(0, 50, 1024, 700);
				tabbedPane.addTab("Identité", new Identite(true, ""));
				tabbedPane.addTab("Parcours", new ParcoursAnterieurP8());
				tabbedPane.addTab("Inscription", new Inscription());
				tabbedPane.addTab("Projets", new Projets());
				tabbedPane.addTab("Handicap", new Handicap());
				tabbedPane.addTab("Amenagement", new Amenagements());
				tabbedPane.addTab("Menesr", new Menesr());
				tabbedPane.addTab("Notes", new NotesReussite());
				tabbedPane.addTab("Autres", new CarnetDeVisiteEtCommentaires());
				add(tabbedPane);
				
				Icon icon = new ImageIcon("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/fenetre/accueil.jpg");
				
				JButton btnNewButton = new JButton(icon);
				btnNewButton.setBounds(22, 2, 45, 23);
				add(btnNewButton);
				
				btnNewButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						accueil.setVisible(false);
						setContentPane(authentification);
						authentification.setVisible(true);
					}
				});
			}
			
			/**
			 * Create the panel with student number, Family Name and First Name.
			 */
			public Accueil(String numEtudiant, String nom, String prenom) {
				
				this.numEtudiant=numEtudiant;
				this.nom=nom;
				this.prenom=prenom;
				
				setLayout(null);
				
				JLabel lblNumEtudiant = new JLabel(this.numEtudiant);
				lblNumEtudiant.setBounds(132, 11, 150, 14);
				add(lblNumEtudiant);
				
				JLabel lblNom = new JLabel(this.nom);
				lblNom.setBounds(226, 11, 150, 14);
				add(lblNom);
				
				JLabel lblPrenom = new JLabel(this.prenom);
				lblPrenom.setBounds(354, 11, 150, 14);
				add(lblPrenom);
				
				JButton btnNewButton_1 = new JButton("Ok");
				btnNewButton_1.setBounds(404, 5, 61, 29);
				add(btnNewButton_1);
				
				JButton btnAnnuler = new JButton("Annuler");
				btnAnnuler.setBounds(487, 5, 77, 29);
				add(btnAnnuler);
				
				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane.setBounds(0, 50, 1024, 700);
				tabbedPane.addTab("Identité", new Identite(false, this.numEtudiant));
				tabbedPane.addTab("Parcours", new ParcoursAnterieurP8());
				tabbedPane.addTab("Inscription", new Inscription());
				tabbedPane.addTab("Projets", new Projets());
				tabbedPane.addTab("Handicap", new Handicap());
				tabbedPane.addTab("Amenagement", new Amenagements());
				tabbedPane.addTab("Menesr", new Menesr());
				tabbedPane.addTab("Notes", new NotesReussite());
				tabbedPane.addTab("Autres", new CarnetDeVisiteEtCommentaires());
				add(tabbedPane);
				
				Icon icon = new ImageIcon("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/fenetre/accueil.jpg");
				
				JButton btnNewButton = new JButton(icon);
				btnNewButton.setBounds(22, 2, 45, 23);
				add(btnNewButton);
				
				btnNewButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						accueil.setVisible(false);
						setContentPane(authentification);
						authentification.setVisible(true);
					}
				});
			}
			
			public String getNumEtudiant() {
				return this.numEtudiant;
			}
			
			private class Identite extends JPanel {

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
				
				private boolean nouveau;
				
				private String numEtudiant;
				
				public Identite(boolean nouveau, String numEtudiant) {
					
					setLayout(null);
					
					this.nouveau=nouveau;
					this.numEtudiant=numEtudiant;
					
					LectureFichier fichierIdentite = new LectureFichier("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/identite.csv");
					
					ArrayList<String[]> etudiants = fichierIdentite.chargerFichier();
					
					String[] etudiant = fichierIdentite.retournerInfosEtudiant(etudiants, this.numEtudiant);
					
					JLabel lblNewLabel = new JLabel("Date de création du dossier :");
					lblNewLabel.setBounds(10, 11, 190, 14);
					add(lblNewLabel);
					
					textField = new JDateChooser();
					textField.setBounds(204, 8, 150, 20);
					textField.getDateEditor().setEnabled(false);
					String dateCreationDossierAConvertir = etudiant[1];
					Date dateCreationDossier=null;
					SimpleDateFormat formatDateCreationDossier = new SimpleDateFormat("dd/MM/yyyy");
					try {
						dateCreationDossier = formatDateCreationDossier.parse(dateCreationDossierAConvertir);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					textField.getDateEditor().setDate(dateCreationDossier);
					add(textField);
					
					JLabel lblNewLabel_1 = new JLabel("Dernière mise à jour :");
					lblNewLabel_1.setBounds(10, 36, 150, 14);
					add(lblNewLabel_1);
					
					textField_1 = new JDateChooser();
					textField_1.setBounds(204, 39, 150, 20);
					textField_1.getDateEditor().setEnabled(false);
					String dateMiseAJourDossierAConvertir = etudiant[2];
					Date dateMiseAJourDossier=null;
					SimpleDateFormat formatDateMiseAJourDossier = new SimpleDateFormat("dd/MM/yyyy");
					try {
						dateMiseAJourDossier = formatDateMiseAJourDossier.parse(dateMiseAJourDossierAConvertir);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					textField_1.getDateEditor().setDate(dateMiseAJourDossier);
					add(textField_1);
					
					JLabel lblNewLabel_2 = new JLabel("N° Etudiant :");
					lblNewLabel_2.setBounds(10, 73, 90, 14);
					add(lblNewLabel_2);
					
					textField_2 = new JTextField();
					textField_2.setBounds(112, 70, 218, 20);
					add(textField_2);
					if(this.nouveau==false) {
						textField_2.setEditable(false);
						textField_2.setBackground(Color.GRAY);
						textField_2.setText(etudiant[0]);
					}
					else {
						textField_2.setEditable(true);
					}
					textField_2.setColumns(10);
					
					ButtonGroup monsieurMadame = new ButtonGroup();
					
					JRadioButton rdbtnM = new JRadioButton("M");
					rdbtnM.setBounds(10, 103, 50, 23);
					if(this.nouveau==false) {
						rdbtnM.setEnabled(false);
					}
					else {
						rdbtnM.setEnabled(true);
					}
					add(rdbtnM);
					
					JRadioButton rdbtnMme = new JRadioButton("Mme");
					rdbtnMme.setBounds(50, 103, 70, 23);
					if(this.nouveau==false) {
						rdbtnMme.setEnabled(false);
					}
					else {
						rdbtnMme.setEnabled(true);
					}
					add(rdbtnMme);
					
					monsieurMadame.add(rdbtnM);
					monsieurMadame.add(rdbtnMme);
					
					if(rdbtnM.getText().equals(etudiant[3])) {
						rdbtnM.setSelected(true);
					}
					else {
						rdbtnMme.setSelected(true);
					}
					
					JLabel lblNewLabel_3 = new JLabel("Nom de naissance :");
					lblNewLabel_3.setBounds(10, 133, 130, 14);
					add(lblNewLabel_3);
					
					textField_3 = new JTextField();
					textField_3.setBounds(140, 130, 190, 20);
					if(this.nouveau==false) {
						textField_3.setEditable(false);
						textField_3.setBackground(Color.GRAY);
						textField_3.setText(etudiant[4]);
					}
					else {
						textField_3.setEditable(true);
					}
					add(textField_3);
					textField_3.setColumns(10);
					
					JLabel lblNewLabel_4 = new JLabel("Nom d'époux(se) :");
					lblNewLabel_4.setBounds(10, 159, 125, 14);
					add(lblNewLabel_4);
					
					textField_4 = new JTextField();
					textField_4.setBounds(133, 161, 197, 20);
					if(this.nouveau==false) {
						textField_4.setEditable(false);
						textField_4.setBackground(Color.GRAY);
						textField_4.setText(etudiant[5]);
					}
					else {
						textField_4.setEditable(true);
					}
					add(textField_4);
					textField_4.setColumns(10);
					
					JLabel lblNewLabel_5 = new JLabel("Prénom :");
					lblNewLabel_5.setBounds(20, 195, 55, 14);
					add(lblNewLabel_5);
					
					textField_5 = new JTextField();
					textField_5.setBounds(87, 192, 243, 20);
					if(this.nouveau==false) {
						textField_5.setEditable(false);
						textField_5.setBackground(Color.GRAY);
						textField_5.setText(etudiant[6]);
					}
					else {
						textField_5.setEditable(true);
					}
					add(textField_5);
					textField_5.setColumns(10);
					
					JLabel lblDateDeNaissance = new JLabel("Date de naissance :");
					lblDateDeNaissance.setBounds(10, 234, 130, 14);
					add(lblDateDeNaissance);
					
					textField_6 = new JDateChooser();
					textField_6.setBounds(140, 231, 190, 20);
					textField_6.getDateEditor().setEnabled(false);
					String dateDeNaissanceAConvertir = etudiant[7];
					Date dateDeNaissance=null;
					SimpleDateFormat formatDateDeNaissance = new SimpleDateFormat("dd/MM/yyyy");
					try {
						dateDeNaissance = formatDateDeNaissance.parse(dateDeNaissanceAConvertir);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					textField_6.getDateEditor().setDate(dateDeNaissance);
					add(textField_6);
					
					JLabel lblNewLabel_6 = new JLabel("Domicile :");
					lblNewLabel_6.setBounds(15, 259, 80, 14);
					add(lblNewLabel_6);
					
					textField_7 = new JTextField();
					textField_7.setBounds(83, 262, 247, 20);
					if(this.nouveau==false) {
						textField_7.setEditable(false);
						textField_7.setBackground(Color.GRAY);
						textField_7.setText(etudiant[8]);
					}
					else {
						textField_7.setEditable(true);
					}
					add(textField_7);
					textField_7.setColumns(10);
					
					JLabel lblCodePostal = new JLabel("Code postal :");
					lblCodePostal.setBounds(27, 300, 90, 14);
					add(lblCodePostal);
					
					textField_8 = new JTextField();
					textField_8.setBounds(120, 293, 210, 20);
					if(this.nouveau==false) {
						textField_8.setEditable(false);
						textField_8.setBackground(Color.GRAY);
						textField_8.setText(etudiant[9]);
					}
					else {
						textField_8.setEditable(true);
					}
					add(textField_8);
					textField_8.setColumns(10);
					
					JLabel lblVille = new JLabel("Ville :");
					lblVille.setBounds(36, 336, 40, 14);
					add(lblVille);
					
					textField_9 = new JTextField();
					textField_9.setBounds(87, 336, 243, 20);
					if(this.nouveau==false) {
						textField_9.setEditable(false);
						textField_9.setBackground(Color.GRAY);
						textField_9.setText(etudiant[10]);
					}
					else {
						textField_9.setEditable(true);
					}
					add(textField_9);
					textField_9.setColumns(10);
					
					JLabel lblTlphone = new JLabel("Téléphone :");
					lblTlphone.setBounds(27, 380, 75, 14);
					add(lblTlphone);
					
					textField_10 = new JTextField();
					textField_10.setBounds(112, 377, 218, 20);
					if(this.nouveau==false) {
						textField_10.setEditable(false);
						textField_10.setBackground(Color.GRAY);
						textField_10.setText(etudiant[11]);
					}
					else {
						textField_10.setEditable(true);
					}
					add(textField_10);
					textField_10.setColumns(10);
					
					JLabel lblEmail = new JLabel("E-mail :");
					lblEmail.setBounds(37, 413, 60, 14);
					add(lblEmail);
					
					textField_11 = new JTextField();
					textField_11.setBounds(109, 408, 221, 20);
					if(this.nouveau==false) {
						textField_11.setEditable(false);
						textField_11.setBackground(Color.GRAY);
						textField_11.setText(etudiant[12]);
					}
					else {
						textField_11.setEditable(true);
					}
					add(textField_11);
					textField_11.setColumns(10);
					
					JLabel lblCoordonnesDunePersonnes = new JLabel("Coordonnées d'une personne à contacter en cas d'urgence : ");
					lblCoordonnesDunePersonnes.setBounds(356, 11, 380, 14);
					add(lblCoordonnesDunePersonnes);
					
					JLabel lblNewLabel_7 = new JLabel("Nom :");
					lblNewLabel_7.setBounds(366, 36, 46, 14);
					add(lblNewLabel_7);
					
					textField_12 = new JTextField();
					textField_12.setBounds(494, 33, 150, 20);
					add(textField_12);
					textField_12.setColumns(10);
					if(this.nouveau==false) {
						textField_12.setText(etudiant[13]);
					}
					
					JLabel lblNewLabel_8 = new JLabel("Prénom :");
					lblNewLabel_8.setBounds(356, 61, 55, 14);
					add(lblNewLabel_8);
					
					textField_13 = new JTextField();
					textField_13.setBounds(494, 67, 150, 20);
					add(textField_13);
					textField_13.setColumns(10);
					if(this.nouveau==false) {
						textField_13.setText(etudiant[14]);
					}
					
					JLabel lblTlphone_1 = new JLabel("Téléphone :");
					lblTlphone_1.setBounds(356, 95, 80, 14);
					add(lblTlphone_1);
					
					textField_14 = new JTextField();
					textField_14.setBounds(494, 92, 150, 20);
					add(textField_14);
					textField_14.setColumns(10);
					if(this.nouveau==false) {
						textField_14.setText(etudiant[15]);
					}
					
					JLabel lblEmail_1 = new JLabel("E-mail :");
					lblEmail_1.setBounds(366, 120, 60, 14);
					add(lblEmail_1);
					
					textField_15 = new JTextField();
					textField_15.setBounds(494, 124, 150, 20);
					add(textField_15);
					textField_15.setColumns(10);
					if(this.nouveau==false) {
						textField_15.setText(etudiant[16]);
					}
					
					JLabel lblCoordonnesDunPartenaire = new JLabel("Coordonnées d'un partenaire extérieur (psy, médecin, etc...) :");
					lblCoordonnesDunPartenaire.setBounds(356, 164, 390, 14);
					add(lblCoordonnesDunPartenaire);
					
					JLabel lblNom = new JLabel("Nom :");
					lblNom.setBounds(366, 195, 45, 14);
					add(lblNom);
					
					textField_16 = new JTextField();
					textField_16.setBounds(467, 192, 177, 20);
					add(textField_16);
					textField_16.setColumns(10);
					if(this.nouveau==false) {
						textField_16.setText(etudiant[17]);
					}
					
					JLabel lblPrnom = new JLabel("Prénom :");
					lblPrnom.setBounds(366, 234, 55, 14);
					add(lblPrnom);
					
					textField_17 = new JTextField();
					textField_17.setBounds(467, 223, 177, 20);
					add(textField_17);
					textField_17.setColumns(10);
					if(this.nouveau==false) {
						textField_17.setText(etudiant[18]);
					}
					
					JLabel lblTlphone_2 = new JLabel("Téléphone :");
					lblTlphone_2.setBounds(356, 259, 75, 14);
					add(lblTlphone_2);
					
					textField_18 = new JTextField();
					textField_18.setBounds(467, 256, 177, 20);
					add(textField_18);
					textField_18.setColumns(10);
					if(this.nouveau==false) {
						textField_18.setText(etudiant[19]);
					}
					
					JLabel lblEmail_2 = new JLabel("E-mail :");
					lblEmail_2.setBounds(366, 300, 60, 14);
					add(lblEmail_2);
					
					textField_19 = new JTextField();
					textField_19.setBounds(467, 297, 177, 20);
					add(textField_19);
					textField_19.setColumns(10);
					if(this.nouveau==false) {
						textField_19.setText(etudiant[20]);
					}
					
					JLabel lblFonction = new JLabel("Fonction :");
					lblFonction.setBounds(366, 336, 65, 14);
					add(lblFonction);
					
					textField_20 = new JTextField();
					textField_20.setBounds(467, 330, 177, 20);
					add(textField_20);
					textField_20.setColumns(10);
					if(this.nouveau==false) {
						textField_20.setText(etudiant[21]);
					}
					
					JLabel lblNewLabel_9 = new JLabel("Commentaires :");
					lblNewLabel_9.setBounds(356, 379, 130, 16);
					add(lblNewLabel_9);
					
					JTextArea textArea = new JTextArea();
					textArea.setBounds(356, 393, 288, 141);
					add(textArea);
					if(this.nouveau==false) {
						textArea.setText(etudiant[22]);
					}
				}
			}
		}
		
		public void suivant() {
			if(textField_num_etudiant.getText().equals("") && textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Veuillez renseigner au moins l'un des trois champs SVP.", "Erreur", JOptionPane.ERROR_MESSAGE);
			}
			else {
				try {
				
					if(!textField_num_etudiant.getText().equals("")) {
					num_etudiant = Integer.parseInt(textField_num_etudiant.getText());
						String num_etudiant_reconverti=Integer.toString(num_etudiant);
						lectureFichier = new LectureFichier("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/identite.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						num_etudiant_reconverti=lectureFichier.retournerChaine(donneesEtudiants, num_etudiant_reconverti);
						
						if(num_etudiant_reconverti!=null) {
							//JOptionPane.showMessageDialog(null, "Etudiant trouv� !", "", JOptionPane.INFORMATION_MESSAGE);
							String[] etudiant = lectureFichier.retournerInfosEtudiant(donneesEtudiants, num_etudiant_reconverti);
							authentification.setVisible(false);
							accueil = new Accueil(etudiant[0], etudiant[5], etudiant[6]);
							setContentPane(accueil);
							accueil.setVisible(true);
						}
						else {
							JOptionPane.showMessageDialog(null, "Numéro d'étudiant invalide.", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(!textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
						
						lectureFichier = new LectureFichier("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/identite.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 4);
						ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 5);
						
						if(chainesNomNaissance.contains(chainesCommunes[0])) {
							if(donneesEtudiantsAvecChainesCommunes.size()==1) {
								//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
								authentification.setVisible(false);
								accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
								setContentPane(accueil);
								accueil.setVisible(true);
							}
							else {
								StringBuilder chainesEtudiantsTrouves = new StringBuilder();
								
								for(int i=0;i<donneesEtudiantsAvecChainesCommunes.size();i++) {
									for(int j=0;j<donneesEtudiantsAvecChainesCommunes.get(i).length;j++) {
										chainesEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(i)[j] + "\n");
									}
								}
								JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
							}
						}
						else {
							if(chainesNomMarie.contains(chainesCommunes[0])) {
								if(donneesEtudiantsAvecChainesCommunes.size()==1) {
									//JOptionPane.showMessageDialog(null, "Etudant Trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
									authentification.setVisible(false);
									accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
									setContentPane(accueil);
									accueil.setVisible(true);
								}
								else {
									StringBuilder chainesEtudiantsTrouves = new StringBuilder();
									
									for(int i=0;i<donneesEtudiantsAvecChainesCommunes.size();i++) {
										for(int j=0;j<donneesEtudiantsAvecChainesCommunes.get(i).length;j++) {
											chainesEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(i)[j] + "\n");
										}
									}
									JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce nom de famille.", "Erreur", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
					else if(!textField_prenom.getText().equals("") && textField_nom.getText().equals("")) {
						lectureFichier = new LectureFichier("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/identite.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 6);
						
						if(chainesPrenom.contains(chainesCommunes[1])) {
							if(donneesEtudiantsAvecChainesCommunes.size()==1) {
								//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
								authentification.setVisible(false);
								accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
								setContentPane(accueil);
								accueil.setVisible(true);
							}
							else {
								StringBuilder chainesEtudiantsTrouves = new StringBuilder();
								
								for(int i=0;i<donneesEtudiantsAvecChainesCommunes.size();i++) {
									for(int j=0;j<donneesEtudiantsAvecChainesCommunes.get(i).length;j++) {
										chainesEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(i)[j] + "\n");
									}
								}
								JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce prénom.", "Erreur", JOptionPane.ERROR_MESSAGE);
						}
					}
					else if(!textField_nom.getText().equals("") && !textField_prenom.getText().equals("")) {
						lectureFichier = new LectureFichier("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/identite.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 4);
						ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 5);
						ArrayList<String> chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 6);
						
						if(chainesNomNaissance.contains(chainesCommunes[0])) {
							if(chainesPrenom.contains(chainesCommunes[1])) {
								if(donneesEtudiantsAvecChainesCommunes.size()==1) {
									//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
									authentification.setVisible(false);
									accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
									setContentPane(accueil);
									accueil.setVisible(true);
								}
								else {
									StringBuilder chainesEtudiantsTrouves = new StringBuilder();
									
									for(int i=0;i<donneesEtudiantsAvecChainesCommunes.size();i++) {
										for(int j=0;j<donneesEtudiantsAvecChainesCommunes.get(i).length;j++) {
											chainesEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(i)[j] + "\n");
										}
									}
									JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce nom et ce prénom", "Erreur", JOptionPane.ERROR_MESSAGE);
							}
						}
						else {
							if(chainesNomMarie.contains(chainesCommunes[0])) {
								if(chainesPrenom.contains(chainesCommunes[1])) {
									if(donneesEtudiantsAvecChainesCommunes.size()==1) {
										//JOptionPane.showMessageDialog(null, "Etudiant trouv� !", "", JOptionPane.INFORMATION_MESSAGE);
										authentification.setVisible(false);
										accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
										setContentPane(accueil);
										accueil.setVisible(true);
									}
									else {
										StringBuilder chainesEtudiantsTrouves = new StringBuilder();
										
										for(int i=0;i<donneesEtudiantsAvecChainesCommunes.size();i++) {
											for(int j=0;j<donneesEtudiantsAvecChainesCommunes.get(i).length;j++) {
												chainesEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(i)[j] + "\n");
											}
										}
										JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
									}
								}
								else {
									JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce nom et ce prénom.", "Erreur", JOptionPane.ERROR_MESSAGE);
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce nom et ce prénom.", "Erreur", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
					
			} catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Le champ numéro étudiant ne doit contenir que des chiffres.", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				suivant();
			}
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				System.exit(0);
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}