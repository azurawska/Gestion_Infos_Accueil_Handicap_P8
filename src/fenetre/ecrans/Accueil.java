package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import fenetre.Fenetre;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Accueil extends JPanel {

	private String numEtudiant;
	private String nom;
	private String prenom;
	
	private Authentification authentification;
	
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
		btnNewButton_1.setBounds(Fenetre.getInstance().getScreenSize().width/2-10-61, 5, 61, 29);
		add(btnNewButton_1);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(Fenetre.getInstance().getScreenSize().width/2+10, 5, 77, 29);
		add(btnAnnuler);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 50, Fenetre.getInstance().getScreenSize().width, Fenetre.getInstance().getScreenSize().height-50);
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
		
		Icon icon = new ImageIcon("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/fenetre/img/accueil.jpg");
		
		JButton btnNewButton = new JButton(icon);
		btnNewButton.setBounds(22, 2, 45, 23);
		add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				authentification= new Authentification();
				Fenetre.getInstance().setContentPane(authentification);
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
		tabbedPane.addTab("Identité", new Identite(this.numEtudiant));
		tabbedPane.addTab("Parcours", new ParcoursAnterieurP8(this.numEtudiant));
		tabbedPane.addTab("Inscription", new Inscription(this.numEtudiant));
		tabbedPane.addTab("Projets", new Projets(this.numEtudiant));
		tabbedPane.addTab("Handicap", new Handicap(this.numEtudiant));
		tabbedPane.addTab("Amenagement", new Amenagements(this.numEtudiant));
		tabbedPane.addTab("Menesr", new Menesr(this.numEtudiant));
		tabbedPane.addTab("Notes", new NotesReussite(this.numEtudiant));
		tabbedPane.addTab("Autres", new CarnetDeVisiteEtCommentaires(this.numEtudiant));
		add(tabbedPane);
		
		Icon icon = new ImageIcon("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/fenetre/img/accueil.jpg");
		
		JButton btnNewButton = new JButton(icon);
		btnNewButton.setBounds(22, 2, 45, 23);
		add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				authentification=new Authentification();
				Fenetre.getInstance().setContentPane(authentification);
				authentification.setVisible(true);
			}
		});
	}
}