package fenetre;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import data.LectureFichier;
//import fenetre.Authentification.QuitNumEtudiantFieldMouseEvent;
//import fenetre.Authentification.SuivantAction;

public class Fenetre extends JFrame {
	
	private Authentification authentification;
	private Accueil accueil;

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
	
	private class Authentification extends JPanel {
		private JTextField textField_num_etudiant;
		private JTextField textField_nom;
		private JTextField textField_prenom;
		
		private JButton btnSuivant;
		
		private LectureFichier lectureFichier;
		
		private Accueil accueil;
		
		
		/**
		 * Create the panel.
		 */
		public Authentification() {
			setLayout(null);
			
			//accueil = new Accueil();
			
			JLabel lblNEtudiant = new JLabel("N° Etudiant :");
			lblNEtudiant.setBounds(66, 25, 100, 29);
			add(lblNEtudiant);
			
			textField_num_etudiant = new JTextField();
			textField_num_etudiant.setBounds(147, 29, 86, 20);
			add(textField_num_etudiant);
			textField_num_etudiant.setColumns(10);
			//textField_num_etudiant.setDocument(new PlainDocumentLimitTextField(this.textField_num_etudiant, 8));
			textField_num_etudiant.addMouseListener(new QuitNumEtudiantFieldMouseEvent());
			
			JLabel lblNom = new JLabel("Nom :");
			lblNom.setBounds(76, 69, 100, 14);
			add(lblNom);
			
			textField_nom = new JTextField();
			textField_nom.setBounds(147, 66, 86, 20);
			add(textField_nom);
			textField_nom.setColumns(10);
			
			JLabel lblPrnom = new JLabel("Prénom :");
			lblPrnom.setBounds(66, 113, 100, 14);
			add(lblPrnom);
			
			textField_prenom = new JTextField();
			textField_prenom.setBounds(147, 110, 86, 20);
			add(textField_prenom);
			textField_prenom.setColumns(10);
			
			btnSuivant = new JButton("Suivant");
			btnSuivant.setBounds(96, 164, 89, 23);
			btnSuivant.addActionListener(new SuivantAction());
			add(btnSuivant);

		}

		private class SuivantAction implements ActionListener {
			
			private int num_etudiant;
			private ArrayList<String[]> donneesEtudiantsAvecChainesCommunes;

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(textField_num_etudiant.getText().equals("") && textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Veuillez renseigner au moins l'un des trois champs SVP.", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
				else {
					try {
					
						if(!textField_num_etudiant.getText().equals("")) {
						num_etudiant = Integer.parseInt(textField_num_etudiant.getText());
							String num_etudiant_reconverti=Integer.toString(num_etudiant);
							lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
							ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
							num_etudiant_reconverti=lectureFichier.retournerChaine(donneesEtudiants, num_etudiant_reconverti);
							
							if(num_etudiant_reconverti!=null) {
								//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
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
							
							lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
							ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
							String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
							this.donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
							ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 2);
							ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 3);
							
							if(chainesNomNaissance.contains(chainesCommunes[0])) {
								if(this.donneesEtudiantsAvecChainesCommunes.size()==1) {
									//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
									authentification.setVisible(false);
									accueil = new Accueil(this.donneesEtudiantsAvecChainesCommunes.get(0)[0], this.donneesEtudiantsAvecChainesCommunes.get(0)[2], this.donneesEtudiantsAvecChainesCommunes.get(0)[4]);
									setContentPane(accueil);
									accueil.setVisible(true);
								}
								else {
									StringBuilder chainesEtudiantsTrouves = new StringBuilder();
									
									for(int i=0;i<this.donneesEtudiantsAvecChainesCommunes.size();i++) {
										for(int j=0;j<this.donneesEtudiantsAvecChainesCommunes.get(i).length;j++) {
											chainesEtudiantsTrouves.append(this.donneesEtudiantsAvecChainesCommunes.get(i)[j] + "\n");
										}
									}
									JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								if(chainesNomMarie.contains(chainesCommunes[0])) {
									if(this.donneesEtudiantsAvecChainesCommunes.size()==1) {
										//JOptionPane.showMessageDialog(null, "Etudant Trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
										authentification.setVisible(false);
										accueil = new Accueil(this.donneesEtudiantsAvecChainesCommunes.get(0)[0], this.donneesEtudiantsAvecChainesCommunes.get(0)[3], this.donneesEtudiantsAvecChainesCommunes.get(0)[4]);
										setContentPane(accueil);
										accueil.setVisible(true);
									}
									else {
										StringBuilder chainesEtudiantsTrouves = new StringBuilder();
										
										for(int i=0;i<this.donneesEtudiantsAvecChainesCommunes.size();i++) {
											for(int j=0;j<this.donneesEtudiantsAvecChainesCommunes.get(i).length;j++) {
												chainesEtudiantsTrouves.append(this.donneesEtudiantsAvecChainesCommunes.get(i)[j] + "\n");
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
							lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
							ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
							String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
							this.donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
							ArrayList<String> chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 4);
							
							if(chainesPrenom.contains(chainesCommunes[1])) {
								if(this.donneesEtudiantsAvecChainesCommunes.size()==1) {
									//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
									authentification.setVisible(false);
									accueil = new Accueil(this.donneesEtudiantsAvecChainesCommunes.get(0)[0], this.donneesEtudiantsAvecChainesCommunes.get(0)[3], this.donneesEtudiantsAvecChainesCommunes.get(0)[4]);
									setContentPane(accueil);
									accueil.setVisible(true);
								}
								else {
									StringBuilder chainesEtudiantsTrouves = new StringBuilder();
									
									for(int i=0;i<this.donneesEtudiantsAvecChainesCommunes.size();i++) {
										for(int j=0;j<this.donneesEtudiantsAvecChainesCommunes.get(i).length;j++) {
											chainesEtudiantsTrouves.append(this.donneesEtudiantsAvecChainesCommunes.get(i)[j] + "\n");
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
							lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
							ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
							String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
							this.donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
							ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 2);
							ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 3);
							ArrayList<String> chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 4);
							
							if(chainesNomNaissance.contains(chainesCommunes[0])) {
								if(chainesPrenom.contains(chainesCommunes[1])) {
									if(this.donneesEtudiantsAvecChainesCommunes.size()==1) {
										//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
										authentification.setVisible(false);
										accueil = new Accueil(this.donneesEtudiantsAvecChainesCommunes.get(0)[0], this.donneesEtudiantsAvecChainesCommunes.get(0)[2], this.donneesEtudiantsAvecChainesCommunes.get(0)[4]);
										setContentPane(accueil);
										accueil.setVisible(true);
									}
									else {
										StringBuilder chainesEtudiantsTrouves = new StringBuilder();
										
										for(int i=0;i<this.donneesEtudiantsAvecChainesCommunes.size();i++) {
											for(int j=0;j<this.donneesEtudiantsAvecChainesCommunes.get(i).length;j++) {
												chainesEtudiantsTrouves.append(this.donneesEtudiantsAvecChainesCommunes.get(i)[j] + "\n");
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
										if(this.donneesEtudiantsAvecChainesCommunes.size()==1) {
											//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
											authentification.setVisible(false);
											accueil = new Accueil(this.donneesEtudiantsAvecChainesCommunes.get(0)[0], this.donneesEtudiantsAvecChainesCommunes.get(0)[3], this.donneesEtudiantsAvecChainesCommunes.get(0)[4]);
											setContentPane(accueil);
											accueil.setVisible(true);
										}
										else {
											StringBuilder chainesEtudiantsTrouves = new StringBuilder();
											
											for(int i=0;i<this.donneesEtudiantsAvecChainesCommunes.size();i++) {
												for(int j=0;j<this.donneesEtudiantsAvecChainesCommunes.get(i).length;j++) {
													chainesEtudiantsTrouves.append(this.donneesEtudiantsAvecChainesCommunes.get(i)[j] + "\n");
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
				lblNumEtudiant.setBounds(22, 11, 100, 14);
				add(lblNumEtudiant);
				
				JLabel lblNom = new JLabel(this.nom);
				lblNom.setBounds(101, 11, 100, 14);
				add(lblNom);
				
				JLabel lblPrenom = new JLabel(this.prenom);
				lblPrenom.setBounds(212, 11, 100, 14);
				add(lblPrenom);
				
				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane.setBounds(0, 50, 1024, 700);
				tabbedPane.addTab("Identite", new Identite());
				ParcoursAnterieurP8 parcoursAnterieurP8 = new ParcoursAnterieurP8();
				tabbedPane.addTab("Parcours", parcoursAnterieurP8);
				tabbedPane.addTab("Inscription", new Inscription());
				tabbedPane.addTab("Projets", new Projets());
				tabbedPane.addTab("Handicap", new Handicap());
				tabbedPane.addTab("Amenagement", new Amenagements());
				tabbedPane.addTab("Menesr", new Menesr());
				tabbedPane.addTab("Notes", new NotesReussite());
				tabbedPane.addTab("Autres", new CarnetDeVisiteEtCommentaires());
				add(tabbedPane);
			}
		}
	}
}