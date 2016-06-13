package fenetre;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Accueil extends JPanel {

	/**
	 * Create the panel.
	 */
	public Accueil() {
		setLayout(null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 50, 1024, 700);
		tabbedPane.addTab("Identite", new FicheIdentite());
		ParcoursAnterieurP8 parcoursAnterieurP8 = new ParcoursAnterieurP8();
		tabbedPane.addTab("Parcours", parcoursAnterieurP8);
		tabbedPane.addTab("Inscription", new Inscription());
		tabbedPane.addTab("Projets", new Projets());
		tabbedPane.addTab("Handicap", new TypeHandicap());
		tabbedPane.addTab("Amenagement", new Amenagements());
		tabbedPane.addTab("Menesr", new Menesr());
		tabbedPane.addTab("Notes", new NotesReussite());
		tabbedPane.addTab("Autres", new CarnetDeVisiteEtCommentaires());
		add(tabbedPane);

	}
}
