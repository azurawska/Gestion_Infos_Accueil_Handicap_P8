package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTabbedPane;

public class Amenagements extends JPanel {
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Amenagements() {
		setLayout(null);
		
		JLabel lblDateDeLa = new JLabel("Date de la visite à la Médecine Préventive");
		lblDateDeLa.setBounds(21, 6, 273, 14);
		add(lblDateDeLa);
		
		textField = new JTextField();
		textField.setBounds(332, 3, 102, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNomDuMdecin = new JLabel("Nom du médecin");
		lblNomDuMdecin.setBounds(20, 46, 140, 14);
		add(lblNomDuMdecin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(290, 44, 186, 20);
		add(comboBox);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 82, 719, 514);
		tabbedPane.add("Examens", new AmenagementsExamens());
		add(tabbedPane);
		AmenagementsCours amenagementsCours = new AmenagementsCours();
		tabbedPane.add("Cours", amenagementsCours);
	}

	public Amenagements(String numEtudiant) {
		// TODO Auto-generated constructor stub
	}
}