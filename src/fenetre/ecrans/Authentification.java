package fenetre.ecrans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import data.LectureFichierCSV;
import fenetre.Fenetre;

public class Authentification extends JPanel {
	
	private JTextField textField_num_etudiant;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	
	private JButton btnSuivant;
	
	private JButton btnNouveau;
	
	private Accueil accueil;
	
	public Authentification() {
		setLayout(null);
		int x = 300, y = 150, pasx = 100, pasy = 30;
		int sizex= 86, sizey = 20;
		
		//x= Fenetre.getInstance().screenSize.width/2-(pasx+sizex)/2; y = Fenetre.getInstance().screenSize.height/6;
		
		JLabel lblNEtudiant = new JLabel("N° Etudiant :");
		lblNEtudiant.setBounds(x, y, 100, 29);
		add(lblNEtudiant);
		
		textField_num_etudiant = new JTextField();
		textField_num_etudiant.setBounds(x+pasx, y, sizex, sizey);
		add(textField_num_etudiant);
		textField_num_etudiant.setColumns(10);
		//textField_num_etudiant.setDocument(new PlainDocumentLimitTextField(this.textField_num_etudiant, 8));
		textField_num_etudiant.addMouseListener(new QuitNumEtudiantFieldMouseEvent());
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(x, y+pasy, 100, 14);
		add(lblNom);
		
		textField_nom = new JTextField();
		textField_nom.setBounds(x+pasx, y+pasy, sizex, sizey);
		add(textField_nom);
		textField_nom.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Prénom :");
		lblPrnom.setBounds(x, y+2*pasy, 100, 14);
		add(lblPrnom);
		
		textField_prenom = new JTextField();
		textField_prenom.setBounds(x+pasx, y+2*pasy, sizex, sizey);
		add(textField_prenom);
		textField_prenom.setColumns(10);
		
		btnSuivant = new JButton("Suivant");
		btnSuivant.setBounds(x+pasx,y+4*pasy, 89, 23);
		btnSuivant.addActionListener(new SuivantAction());
		btnSuivant.addKeyListener(new SuivantActionClavier());
		add(btnSuivant);
		
		btnNouveau = new JButton("Nouveau");
		btnNouveau.setBounds(x+pasx, y+5*pasy, 89, 23);
		btnNouveau.addActionListener(new NouveauAction());
		add(btnNouveau);
	}
	
	private class NouveauAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setVisible(false);
			accueil = new Accueil();
			Fenetre.getInstance().setContentPane(accueil);
			accueil.setVisible(true);
		}
	}
	
	private class SuivantAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			suivant();
		}
	}
	
	private class SuivantActionClavier implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				suivant();
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
	
	private void suivant() {
		
		LectureFichierCSV lectureFichier = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/identite.csv");
		
		int num_etudiant;
		
		ArrayList<String[]> donneesEtudiants;
		ArrayList<String[]> donneesEtudiantsAvecChainesCommunes;
		
		ArrayList<String> chainesNomNaissance;
		ArrayList<String> chainesNomMarie;
		ArrayList<String> chainesPrenom;
		
		String[] etudiant;
		String[] chainesCommunes;
		
		StringBuilder chainesEtudiantsTrouves;
		
		if(textField_num_etudiant.getText().equals("") && textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Veuillez renseigner au moins l'un des trois champs SVP.", "Erreur", JOptionPane.ERROR_MESSAGE);
		}
		else {
			try {
			
				if(!textField_num_etudiant.getText().equals("")) {
					num_etudiant = Integer.parseInt(textField_num_etudiant.getText());
					String num_etudiant_reconverti=Integer.toString(num_etudiant);
					donneesEtudiants = lectureFichier.chargerFichier();
					num_etudiant_reconverti=lectureFichier.retournerChaine(donneesEtudiants, num_etudiant_reconverti);
					
					if(num_etudiant_reconverti!=null) {
						//JOptionPane.showMessageDialog(null, "Etudiant trouv� !", "", JOptionPane.INFORMATION_MESSAGE);
						etudiant = lectureFichier.retournerInfosEtudiant(donneesEtudiants, num_etudiant_reconverti);
						this.setVisible(false);
						accueil = new Accueil(etudiant[0], etudiant[5], etudiant[6]);
						Fenetre.getInstance().setContentPane(accueil);
						accueil.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Numéro d'étudiant invalide.", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(!textField_nom.getText().equals("") && textField_prenom.getText().equals("")) {
					donneesEtudiants = lectureFichier.chargerFichier();
					chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
					donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
					chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 4);
					chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 5);
					
					if(chainesNomNaissance.contains(chainesCommunes[0])) {
						if(donneesEtudiantsAvecChainesCommunes.size()==1) {
							//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
							this.setVisible(false);
							accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
							Fenetre.getInstance().setContentPane(accueil);
							accueil.setVisible(true);
						}
						else {
							chainesEtudiantsTrouves = new StringBuilder();
							
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
								this.setVisible(false);
								accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
								Fenetre.getInstance().setContentPane(accueil);
								accueil.setVisible(true);
							}
							else {
								chainesEtudiantsTrouves = new StringBuilder();
								
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
					donneesEtudiants = lectureFichier.chargerFichier();
					chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
					donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
					chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 6);
					
					if(chainesPrenom.contains(chainesCommunes[1])) {
						if(donneesEtudiantsAvecChainesCommunes.size()==1) {
							//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
							this.setVisible(false);
							accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
							Fenetre.getInstance().setContentPane(accueil);
							accueil.setVisible(true);
						}
						else {
							chainesEtudiantsTrouves = new StringBuilder();
							
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
					donneesEtudiants = lectureFichier.chargerFichier();
					chainesCommunes = lectureFichier.retournerChainesCommunes(textField_nom, textField_prenom);
					donneesEtudiantsAvecChainesCommunes=lectureFichier.retournerEtudiantsAvecChaineCommune(donneesEtudiants, chainesCommunes);
					chainesNomNaissance = lectureFichier.retournerChaines(donneesEtudiants, 4);
					chainesNomMarie = lectureFichier.retournerChaines(donneesEtudiants, 5);
					chainesPrenom=lectureFichier.retournerChaines(donneesEtudiants, 6);
					
					if(chainesNomNaissance.contains(chainesCommunes[0])) {
						if(chainesPrenom.contains(chainesCommunes[1])) {
							if(donneesEtudiantsAvecChainesCommunes.size()==1) {
								//JOptionPane.showMessageDialog(null, "Etudiant trouvé !", "", JOptionPane.INFORMATION_MESSAGE);
								this.setVisible(false);
								accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
								Fenetre.getInstance().setContentPane(accueil);
								accueil.setVisible(true);
							}
							else {
								chainesEtudiantsTrouves = new StringBuilder();
								
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
									this.setVisible(false);
									accueil = new Accueil(donneesEtudiantsAvecChainesCommunes.get(0)[0], donneesEtudiantsAvecChainesCommunes.get(0)[5], donneesEtudiantsAvecChainesCommunes.get(0)[6]);
									Fenetre.getInstance().setContentPane(accueil);
									accueil.setVisible(true);
								}
								else {
									chainesEtudiantsTrouves = new StringBuilder();
									
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