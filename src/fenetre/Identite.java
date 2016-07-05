package fenetre;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.text.DateFormat;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Scrollable;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Identite extends JPanel implements Scrollable {
	private JDateChooser textField;
	private JDateChooser textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	/**
	 * Create the panel.
	 */
	public Identite() {
		setLayout(null);
		
		/*JScrollPane scrollpane = new JScrollPane();
		scrollpane.setViewportView(this);
		scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);*/
		
		JScrollBar hbar = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 300);
		JScrollBar vbar = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 300);
		
		hbar.setUnitIncrement(2);
		vbar.setUnitIncrement(1);
		add(hbar, null);
		add(vbar, null);
		
		JLabel lblNewLabel = new JLabel("Date de création du dossier :");
		lblNewLabel.setBounds(10, 11, 190, 14);
		add(lblNewLabel);
		
		textField = new JDateChooser();
		textField.setBounds(204, 8, 150, 20);
		textField.getDateEditor().setEnabled(false);
		//textField.setBackground(Color.GRAY);
		add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Dernière mise à jour :");
		lblNewLabel_1.setBounds(10, 36, 150, 14);
		add(lblNewLabel_1);
		
		textField_1 = new JDateChooser();
		textField_1.setBounds(204, 39, 150, 20);
		textField_1.getDateEditor().setEnabled(false);
		add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("N° Etudiant :");
		lblNewLabel_2.setBounds(10, 73, 90, 14);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 70, 218, 20);
		add(textField_2);
		textField_2.setEditable(false);
		textField_2.setBackground(Color.GRAY);
		textField_2.setColumns(10);
		
		ButtonGroup monsieurMadame = new ButtonGroup();
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setBounds(10, 103, 50, 23);
		rdbtnM.setEnabled(false);
		add(rdbtnM);
		
		JRadioButton rdbtnMme = new JRadioButton("Mme");
		rdbtnMme.setBounds(50, 103, 70, 23);
		rdbtnMme.setEnabled(false);
		add(rdbtnMme);
		
		monsieurMadame.add(rdbtnM);
		monsieurMadame.add(rdbtnMme);
		
		JLabel lblNewLabel_3 = new JLabel("Nom de naissance :");
		lblNewLabel_3.setBounds(10, 133, 130, 14);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 130, 190, 20);
		textField_3.setEditable(false);
		textField_3.setBackground(Color.GRAY);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nom d'époux(se) :");
		lblNewLabel_4.setBounds(10, 159, 125, 14);
		add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(133, 161, 197, 20);
		textField_4.setEditable(false);
		textField_4.setBackground(Color.GRAY);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Prénom :");
		lblNewLabel_5.setBounds(20, 195, 55, 14);
		add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(87, 192, 243, 20);
		textField_5.setEditable(false);
		textField_5.setBackground(Color.GRAY);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance :");
		lblDateDeNaissance.setBounds(10, 234, 130, 14);
		add(lblDateDeNaissance);
		
		textField_6 = new JTextField();
		textField_6.setBounds(140, 231, 190, 20);
		textField_6.setEditable(false);
		textField_6.setBackground(Color.GRAY);
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Domicile :");
		lblNewLabel_6.setBounds(15, 259, 80, 14);
		add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(83, 262, 247, 20);
		textField_7.setEditable(false);
		textField_7.setBackground(Color.GRAY);
		add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblCodePostal = new JLabel("Code postal :");
		lblCodePostal.setBounds(27, 300, 90, 14);
		add(lblCodePostal);
		
		textField_8 = new JTextField();
		textField_8.setBounds(120, 293, 210, 20);
		textField_8.setEditable(false);
		textField_8.setBackground(Color.GRAY);
		add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setBounds(36, 336, 40, 14);
		add(lblVille);
		
		textField_9 = new JTextField();
		textField_9.setBounds(87, 336, 243, 20);
		textField_9.setEditable(false);
		textField_9.setBackground(Color.GRAY);
		add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblTlphone = new JLabel("Téléphone :");
		lblTlphone.setBounds(27, 380, 75, 14);
		add(lblTlphone);
		
		textField_10 = new JTextField();
		textField_10.setBounds(112, 377, 218, 20);
		textField_10.setEditable(false);
		textField_10.setBackground(Color.GRAY);
		add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setBounds(37, 413, 60, 14);
		add(lblEmail);
		
		textField_11 = new JTextField();
		textField_11.setBounds(109, 408, 221, 20);
		textField_11.setEditable(false);
		textField_11.setBackground(Color.GRAY);
		add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblCoordonnesDunePersonnes = new JLabel("Coordonnées d'une personne à contacter en cas d'urgence : ");
		lblCoordonnesDunePersonnes.setBounds(356, 11, 380, 14);
		add(lblCoordonnesDunePersonnes);
		
		JLabel lblNewLabel_7 = new JLabel("Nom :");
		lblNewLabel_7.setBounds(366, 36, 46, 14);
		add(lblNewLabel_7);
		
		textField_12 = new JTextField();
		textField_12.setBounds(494, 33, 150, 20);
		add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Prénom :");
		lblNewLabel_8.setBounds(356, 61, 55, 14);
		add(lblNewLabel_8);
		
		textField_13 = new JTextField();
		textField_13.setBounds(494, 67, 150, 20);
		add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblTlphone_1 = new JLabel("Téléphone :");
		lblTlphone_1.setBounds(356, 95, 80, 14);
		add(lblTlphone_1);
		
		textField_14 = new JTextField();
		textField_14.setBounds(494, 92, 150, 20);
		add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblEmail_1 = new JLabel("E-mail :");
		lblEmail_1.setBounds(366, 120, 60, 14);
		add(lblEmail_1);
		
		textField_15 = new JTextField();
		textField_15.setBounds(494, 124, 150, 20);
		add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblCoordonnesDunPartenaire = new JLabel("Coordonnées d'un partenaire extérieur (psy, médecin, etc...) :");
		lblCoordonnesDunPartenaire.setBounds(356, 164, 390, 14);
		add(lblCoordonnesDunPartenaire);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(366, 195, 45, 14);
		add(lblNom);
		
		textField_16 = new JTextField();
		textField_16.setBounds(467, 192, 177, 20);
		add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Prénom :");
		lblPrnom.setBounds(366, 234, 55, 14);
		add(lblPrnom);
		
		textField_17 = new JTextField();
		textField_17.setBounds(467, 223, 177, 20);
		add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblTlphone_2 = new JLabel("Téléphone :");
		lblTlphone_2.setBounds(356, 259, 75, 14);
		add(lblTlphone_2);
		
		textField_18 = new JTextField();
		textField_18.setBounds(467, 256, 177, 20);
		add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblEmail_2 = new JLabel("E-mail :");
		lblEmail_2.setBounds(366, 300, 60, 14);
		add(lblEmail_2);
		
		textField_19 = new JTextField();
		textField_19.setBounds(467, 297, 177, 20);
		add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblFonction = new JLabel("Fonction :");
		lblFonction.setBounds(366, 336, 65, 14);
		add(lblFonction);
		
		textField_20 = new JTextField();
		textField_20.setBounds(467, 330, 177, 20);
		add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Commentaires :");
		lblNewLabel_9.setBounds(356, 379, 130, 16);
		add(lblNewLabel_9);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(356, 393, 288, 141);
		add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(356, 390, 290, 144);
		scrollPane.setViewportView(textArea);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane, null);
		
		
		/*JScrollPane scrollpaneCommentaires = new JScrollPane(textArea);
		add(scrollpaneCommentaires);*/

	}

	@Override
	public Dimension getPreferredScrollableViewportSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getScrollableTracksViewportWidth() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getScrollableTracksViewportHeight() {
		// TODO Auto-generated method stub
		return false;
	}
}
