package fenetre;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Accueil extends JPanel {

	/**
	 * Create the panel.
	 */
	public Accueil() {
		setLayout(null);
		
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
		
		JLabel lblNumEtudiant = new JLabel("New label");
		lblNumEtudiant.setBounds(22, 11, 46, 14);
		add(lblNumEtudiant);
		
		JLabel lblNom = new JLabel("New label");
		lblNom.setBounds(101, 11, 46, 14);
		add(lblNom);
		
		JLabel lblPrenom = new JLabel("New label");
		lblPrenom.setBounds(212, 11, 46, 14);
		add(lblPrenom);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(268, 7, 89, 23);
		add(btnOk);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(367, 7, 89, 23);
		add(btnAnnuler);

	}
}