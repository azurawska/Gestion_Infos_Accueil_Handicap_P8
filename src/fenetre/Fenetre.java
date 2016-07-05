package fenetre;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import data.LectureFichier;
//import fenetre.Authentification.QuitNumEtudiantFieldMouseEvent;
//import fenetre.Authentification.SuivantAction;

public class Fenetre extends JFrame {
	
	private Authentification authentification;
	private Accueil accueil;
	
	private int num_etudiant;
	private ArrayList<String[]> donneesEtudiantsAvecChainesCommunes;
	private boolean nouveau;

	/**
	 * Create the frame.
	 */
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);
		this.authentification = new Authentification();
		setContentPane(authentification);
		this.authentification.setVisible(true);
		addKeyListener(new SuivantClavier());
		addKeyListener(new QuitApplication());
		setVisible(true);
	}
	
	private class Authentification extends JPanel {
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
		}
		
		private class NouveauAction implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				authentification.setVisible(false);
				setContentPane(new Accueil("", "", ""));
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
			 * Create the panel.
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
				
				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane.setBounds(0, 50, 1024, 700);
				tabbedPane.addTab("Identité", new Identite());
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
						lectureFichier = new LectureFichier("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						num_etudiant_reconverti=lectureFichier.retournerChaine(donneesEtudiants, num_etudiant_reconverti);
						
						if(num_etudiant_reconverti!=null) {
							//JOptionPane.showMessageDialog(null, "Etudiant trouv� !", "", JOptionPane.INFORMATION_MESSAGE);
							String[] etudiant = lectureFichier.retournerEtudiant(donneesEtudiants, num_etudiant_reconverti);
							authentification.setVisible(false);
							accueil = new Accueil(etudiant[0], etudiant[3], etudiant[4]);
							setContentPane(accueil);
							accueil.setVisible(true);
						}
						else {
							JOptionPane.showMessageDialog(null, "Numéro d'étudiant invalide.", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(!textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
						
						lectureFichier = new LectureFichier("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 2);
						ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 3);
						
						if(chainesNomNaissance.contains(chainesCommunes[0])) {
							if(donneesEtudiantsAvecChainesCommunes.size()==1) {
								//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
								authentification.setVisible(false);
								accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[2], donneesEtudiantsAvecChainesCommunes.get(0)[4]);
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
									accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[3], donneesEtudiantsAvecChainesCommunes.get(0)[4]);
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
						lectureFichier = new LectureFichier("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 4);
						
						if(chainesPrenom.contains(chainesCommunes[1])) {
							if(donneesEtudiantsAvecChainesCommunes.size()==1) {
								//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
								authentification.setVisible(false);
								accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[3], donneesEtudiantsAvecChainesCommunes.get(0)[4]);
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
						lectureFichier = new LectureFichier("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 2);
						ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 3);
						ArrayList<String> chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 4);
						
						if(chainesNomNaissance.contains(chainesCommunes[0])) {
							if(chainesPrenom.contains(chainesCommunes[1])) {
								if(donneesEtudiantsAvecChainesCommunes.size()==1) {
									//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
									authentification.setVisible(false);
									accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[2], donneesEtudiantsAvecChainesCommunes.get(0)[4]);
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
										accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[3], donneesEtudiantsAvecChainesCommunes.get(0)[4]);
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
	}
	
	private class SuivantClavier implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				//suivant();
			}
		}
		
	}
	
	private class QuitApplication implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				System.exit(EXIT_ON_CLOSE);
			}
		}
		
	}
}