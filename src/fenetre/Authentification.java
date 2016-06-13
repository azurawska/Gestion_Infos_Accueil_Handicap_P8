package fenetre;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import data.LectureFichier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.JButton;

public class Authentification extends JPanel {
	private JTextField textField_num_etudiant;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	
	private JButton btnSuivant;
	
	private LectureFichier lectureFichier;
	
	private Accueil accueil;
	
	private boolean found;
	
	/**
	 * Create the panel.
	 */
	public Authentification() {
		this.found=false;
		setLayout(null);
		
		accueil = new Accueil();
		
		JLabel lblNEtudiant = new JLabel("N° Etudiant :");
		lblNEtudiant.setBounds(66, 25, 62, 29);
		add(lblNEtudiant);
		
		textField_num_etudiant = new JTextField();
		textField_num_etudiant.setBounds(147, 29, 86, 20);
		add(textField_num_etudiant);
		textField_num_etudiant.setColumns(10);
		//textField_num_etudiant.setDocument(new PlainDocumentLimitTextField(this.textField_num_etudiant, 8));
		textField_num_etudiant.addMouseListener(new QuitNumEtudiantFieldMouseEvent());
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(76, 69, 46, 14);
		add(lblNom);
		
		textField_nom = new JTextField();
		textField_nom.setBounds(147, 66, 86, 20);
		add(textField_nom);
		textField_nom.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Prénom :");
		lblPrnom.setBounds(66, 113, 46, 14);
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
	
	public boolean getFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}

	private class SuivantAction implements ActionListener {
		
		private int num_etudiant;

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(textField_num_etudiant.getText().equals("") && textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
				//JOptionPane.showMessageDialog(null, "Veuillez renseigner au moins l'un des trois champs SVP.", "Erreur", JOptionPane.ERROR_MESSAGE);
				
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
							JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
							
						}
						else {
							JOptionPane.showMessageDialog(null, "Numéro d'étudiant invalide.", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
				}
					/*else if(!textField_nom.getText().equals("") && !textField_prenom.getText().equals("")) {
						lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						ArrayList<String[]> donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 2);
						ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 3);
						ArrayList<String> chainesPrenom = lectureFichier.retournerChaines(donneesEtudiants, 4);
						
						for(int i=0;i<chainesNomNaissance.size();i++) {
							for(int j=0;j<chainesNomMarie.size();j++) {
								for(int k=0;k<chainesPrenom.size();k++) {
									if((textField_nom.getText().equals(chainesNomNaissance.get(i)) || textField_nom.getText().equals(chainesNomMarie.get(j))) && textField_prenom.getText().equals(chainesPrenom.get(k))) {
										if(donneesEtudiantsAvecChainesCommunes.size()==0) {
											JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce nom et/ou ce prénom.", "Erreur", JOptionPane.ERROR_MESSAGE);
										}
										else if(donneesEtudiantsAvecChainesCommunes.size()==1) {
											JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
										}
										else {
											StringBuilder chaineEtudiantsTrouves = new StringBuilder();
											
											for(int l=0;l<donneesEtudiantsAvecChainesCommunes.size();l++) {
												for(int m=0;m<donneesEtudiantsAvecChainesCommunes.get(l).length;m++) {
													chaineEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(l)[m] + "\n");
												}
											}
											JOptionPane.showMessageDialog(null, chaineEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
										}
									}
								}
							}
						}
					}
					else if(!textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
						lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						ArrayList<String[]> donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 2);
						ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 3);
						
						for(int i=0;i<chainesNomNaissance.size();i++) {
							for(int j=0;j<chainesNomMarie.size();j++) {
								if(textField_nom.equals(chainesNomNaissance.get(i)) || textField_nom.equals(chainesNomMarie.get(j))) {
									if(donneesEtudiantsAvecChainesCommunes.size()==0) {
										JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce nom de famille.", "Erreur", JOptionPane.ERROR_MESSAGE);
									}
									else if(donneesEtudiantsAvecChainesCommunes.size()==1) {
										JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
									}
									else {
										StringBuilder chaineEtudiantsTrouves = new StringBuilder();
										
										for(int k=0;k<donneesEtudiantsAvecChainesCommunes.size();k++) {
											for(int l=0;l<donneesEtudiantsAvecChainesCommunes.get(k).length;l++) {
												chaineEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(k)[l] + "\n");
											}
										}
										JOptionPane.showMessageDialog(null, chaineEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
									}
								}
							}
						}
					}
					else if(textField_nom.equals("") && !textField_prenom.equals("")) {
						lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						ArrayList<String[]> donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesPrenom = lectureFichier.retournerChaines(donneesEtudiants, 4);
						
						for(int i=0;i<chainesPrenom.size();i++) {
							if(textField_prenom.equals(chainesPrenom.get(i))) {
								if(donneesEtudiantsAvecChainesCommunes.size()==0) {
									JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce prénom.", "Erreur", JOptionPane.ERROR_MESSAGE);
								}
								else if(donneesEtudiantsAvecChainesCommunes.size()==1) {
									JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									StringBuilder chaineEtudiantsTrouves = new StringBuilder();
									
									for(int j=0;j<donneesEtudiantsAvecChainesCommunes.size();j++) {
										for(int k=0;k<donneesEtudiantsAvecChainesCommunes.get(j).length;k++) {
											chaineEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(j)[k] + "\n");
										}
									}
									JOptionPane.showMessageDialog(null, chaineEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
					}*/
					
					/*else if(!textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
						lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						ArrayList<String[]> donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 2);
						ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 3);
						
						for(int i=0;i<chainesNomNaissance.size();i++) {
							if(chainesNomNaissance.get(i).equals(textField_nom.getText())) {
								if(donneesEtudiantsAvecChainesCommunes.size()==1) {
									JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(donneesEtudiantsAvecChainesCommunes.size()>1) {
									StringBuilder chainesEtudiantsTrouves = new StringBuilder();
									
									for(int j=0;j<donneesEtudiantsAvecChainesCommunes.size();j++) {
										for(int k=0;k<donneesEtudiantsAvecChainesCommunes.get(j).length;k++) {
											chainesEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(j)[k] + "\n");
										}
									}
									JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								for(int j=0;j<chainesNomMarie.size();j++) {
									if(chainesNomMarie.get(j).equals(textField_nom)) {
										if(donneesEtudiantsAvecChainesCommunes.size()==1) {
											JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
										}
										else if(donneesEtudiantsAvecChainesCommunes.size()>1) {
											StringBuilder chainesEtudiantsTrouves = new StringBuilder();
											
											for(int k=0;k<donneesEtudiantsAvecChainesCommunes.size();k++) {
												for(int l=0;l<donneesEtudiantsAvecChainesCommunes.get(k).length;l++) {
													chainesEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(k)[l] + "\n");
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
						}
					}
					else if(!textField_prenom.getText().equals("") && textField_nom.getText().equals("")) {
						lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						ArrayList<String[]> donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 4);
						
						for(int i=0;i<chainesPrenom.size();i++) {
							if(chainesPrenom.get(i).equals(textField_prenom.getText())) {
								if(donneesEtudiantsAvecChainesCommunes.size()==1) {
									JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(donneesEtudiantsAvecChainesCommunes.size()>1) {
									StringBuilder chainesEtudiantsTrouves = new StringBuilder();
									
									for(int j=0;j<donneesEtudiantsAvecChainesCommunes.size();j++) {
										for(int k=0;k<donneesEtudiantsAvecChainesCommunes.get(j).length;k++) {
											chainesEtudiantsTrouves.append(donneesEtudiantsAvecChainesCommunes.get(j)[k] + "\n");
										}
									}
									JOptionPane.showMessageDialog(null, chainesEtudiantsTrouves.toString(), "", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Aucun étudiant ne porte ce prénom.", "", JOptionPane.ERROR_MESSAGE);
							}
						}
					}*/
					else if(!textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
						
						lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						ArrayList<String[]> donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 2);
						ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 3);
						
						if(chainesNomNaissance.contains(chainesCommunes[0])) {
							if(donneesEtudiantsAvecChainesCommunes.size()==1) {
								JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
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
									JOptionPane.showMessageDialog(null, "Etudant Trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
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
						lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						ArrayList<String[]> donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 4);
						
						if(chainesPrenom.contains(chainesCommunes[1])) {
							if(donneesEtudiantsAvecChainesCommunes.size()==1) {
								JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
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
						lectureFichier = new LectureFichier("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
						ArrayList<String[]> donneesEtudiants = lectureFichier.chargerFichier();
						String[] chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
						ArrayList<String[]> donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
						ArrayList<String> chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 2);
						ArrayList<String> chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 3);
						ArrayList<String> chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 4);
						
						if(chainesNomNaissance.contains(chainesCommunes[0])) {
							if(chainesPrenom.contains(chainesCommunes[1])) {
								if(donneesEtudiantsAvecChainesCommunes.size()==1) {
									JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
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
										JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
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
}