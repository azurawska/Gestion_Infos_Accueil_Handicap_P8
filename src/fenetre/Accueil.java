package fenetre;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Accueil extends JPanel {

	/**
	 * Create the panel.
	 */
	public Accueil() {
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 36, 1024, 714);
		
		tabbedPane.addTab("Parcours", new ParcoursAnterieurP8());
		tabbedPane.addTab("Inscription", new Inscription());
		tabbedPane.addTab("Projets", new Projets());
		tabbedPane.addTab("Handicap", new Handicap());
		tabbedPane.addTab("Amenagement", new Amenagements());
		tabbedPane.addTab("Identite", new Identite());
		tabbedPane.addTab("Menesr", new Menesr());
		tabbedPane.addTab("Notes", new NotesReussite());
		tabbedPane.addTab("Autres", new CarnetDeVisiteEtCommentaires());
		add(tabbedPane);
		
		JLabel lblNumEtudiant = new JLabel("New label");
		lblNumEtudiant.setBounds(132, 11, 46, 14);
		add(lblNumEtudiant);
		
		JLabel lblNom = new JLabel("New label");
		lblNom.setBounds(226, 11, 46, 14);
		add(lblNom);
		
		JLabel lblPrenom = new JLabel("New label");
		lblPrenom.setBounds(354, 11, 46, 14);
		add(lblPrenom);
		
		Icon icon = new ImageIcon("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\fenetre\\accueil.jpg");
		
		JButton btnNewButton = new JButton(icon);
		btnNewButton.setBounds(22, 2, 45, 23);
		add(btnNewButton);

	}
}