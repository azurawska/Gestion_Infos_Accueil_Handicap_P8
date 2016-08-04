package fenetre.ecrans;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import fenetre.composants.AbstractJPanel;

import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class ParcoursAnterieurP8 extends AbstractJPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public ParcoursAnterieurP8() {
		setLayout(null);
		
		JLabel lblBaccalauratOuquivalent = new JLabel("Baccalauréat ou équivalent");
		lblBaccalauratOuquivalent.setBounds(18, 18, 172, 16);
		add(lblBaccalauratOuquivalent);
		
		textField = new JTextField();
		textField.setBounds(237, 13, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblAnneDobtention = new JLabel("Année d'obtention");
		lblAnneDobtention.setBounds(18, 46, 123, 16);
		add(lblAnneDobtention);
		
		textField_1 = new JTextField();
		textField_1.setBounds(237, 41, 130, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAmnagementsMisEn = new JLabel("Aménagements mis en place et/ou matériel pédagogique mis à disposition avant le baccalauréat :");
		lblAmnagementsMisEn.setBounds(18, 74, 626, 16);
		add(lblAmnagementsMisEn);
		
		JLabel lblPourLesCours = new JLabel("Pour les cours :");
		lblPourLesCours.setBounds(18, 102, 110, 16);
		add(lblPourLesCours);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(121, 90, 204, 84);
		add(textArea);
		
		JLabel lblPourLesExamens = new JLabel("Pour les examens :");
		lblPourLesExamens.setBounds(337, 102, 123, 16);
		add(lblPourLesExamens);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(464, 90, 233, 71);
		add(textArea_1);
		
		JLabel lblFormationParCorrespondance = new JLabel("Formation par correspondance (si oui, préciser l'organisme)");
		lblFormationParCorrespondance.setBounds(25, 186, 380, 16);
		add(lblFormationParCorrespondance);
		
		JRadioButton rdbtnOui = new JRadioButton("Oui");
		rdbtnOui.setBounds(404, 182, 60, 23);
		add(rdbtnOui);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setBounds(460, 182, 60, 23);
		add(rdbtnNon);
		
		textField_2 = new JTextField();
		textField_2.setBounds(529, 181, 168, 26);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAccompagnementExtrieurPar = new JLabel("Accompagnement extérieur par un service/établissement (médico-social ou sanitaire, avsi,...)");
		lblAccompagnementExtrieurPar.setBounds(24, 214, 599, 16);
		add(lblAccompagnementExtrieurPar);
		
		JRadioButton rdbtnOui_1 = new JRadioButton("Oui");
		rdbtnOui_1.setBounds(620, 210, 60, 23);
		add(rdbtnOui_1);
		
		JRadioButton rdbtnNon_1 = new JRadioButton("Non");
		rdbtnNon_1.setBounds(674, 210, 60, 23);
		add(rdbtnNon_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(734, 209, 167, 26);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAmnagementsMisEn_1 = new JLabel("Aménagements mis en place et/ou matériel pédagogique mis à disposition après l'obtention du baccalauréat :");
		lblAmnagementsMisEn_1.setBounds(25, 237, 702, 16);
		add(lblAmnagementsMisEn_1);
		
		JLabel label = new JLabel("Pour les cours :");
		label.setBounds(31, 265, 110, 16);
		add(label);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(134, 265, 204, 84);
		add(textArea_2);
		
		JLabel label_1 = new JLabel("Pour les examens :");
		label_1.setBounds(350, 265, 123, 16);
		add(label_1);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(475, 252, 233, 71);
		add(textArea_3);
		
		JLabel label_2 = new JLabel("Accompagnement extérieur par un service/établissement (médico-social ou sanitaire, avsi,...)");
		label_2.setBounds(18, 374, 599, 16);
		add(label_2);
		
		JRadioButton radioButton = new JRadioButton("Oui");
		radioButton.setBounds(620, 370, 60, 23);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Non");
		radioButton_1.setBounds(674, 370, 60, 23);
		add(radioButton_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(734, 369, 167, 26);
		add(textField_4);

	}

	public ParcoursAnterieurP8(String numEtudiant) {
		// TODO Auto-generated constructor stub
	}
}
