package fenetre.ecrans;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.toedter.calendar.JDateChooser;

import data.LectureFichierCSV;
import data.LectureFichierTXT;
import exceptions.LongueurDifferenteListesException;
import exceptions.NullArgumentException;
import fenetre.composants.AbstractJPanel;
import fenetre.composants.Accompagnement;
import fenetre.composants.OuiNon;
import fenetre.composants.TransportSpecialise;
import interfaces.GestionFichierCSV;
import interfaces.GestionFichierTXT;
import interfaces.GroupementBoutons;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

/**
 * Ecran récapitulant les aides et prestations accordées par la MDPH à l'étudiant ainsi que certaines aides hors décision de la CDAPH (voir documentation technique du projet).
 * @author alexis
 *Classe qu'il faudra reprendre car incomplète par manque de temps.
 */

public class Menesr extends AbstractJPanel implements GestionFichierCSV, GestionFichierTXT, GroupementBoutons {
	
	private class StatutMdphEtAutresListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			
		}
	}
	
	/**
	 * Classe permettant d'afficher ou de faire disparaître les champs de saisie permettant de renseigner les coordonnées du transporteur de l'étudiant. 
	 * @author alexis
	 *
	 */
	
	private class TransportListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(rdbtnOui.isSelected()) {
				lblTypeDeTransport.setVisible(true);
				textField_1.setVisible(true);
				lblNomDeLa.setVisible(true);
				textField_2.setVisible(true);
				lblTlphone.setVisible(true);
				textField_3.setVisible(true);
				lblEmail.setVisible(true);
				textField_4.setVisible(true);
			}
			else {
				lblTypeDeTransport.setVisible(false);
				textField_1.setVisible(false);
				textField_1.setText("");
				lblNomDeLa.setVisible(false);
				textField_2.setVisible(false);
				textField_2.setText("");
				lblTlphone.setVisible(false);
				textField_3.setVisible(false);
				textField_3.setText("");
				lblEmail.setVisible(false);
				textField_4.setVisible(false);
				textField_4.setText("");
			}
		}
	}
	
	/**
	 * carte d'invalidité: se remplit automatiquement en fonction de l'item sélectionné dans la première comboBox
	 */
	
	private JTextField textField;
	
	/**
	 * Carte de priorité: se remplit automatiquement en fonction de l'item sélectionné dans la première comboBox
	 */
	
	private JTextField textField_1;
	
	private JTextField textField_2;
	
	private JTextField textField_3;
	
	private JTextField textField_4;
	
	private JTextField textField_5;
	
	private JTextField textField_6;
	
	private JTextField textField_7;
	
	private JTextField textField_8;
	
	private JTextField textField_9;
	
	/**
	 * Date du dernier dépôt de dossier à la MDPH
	 */
	
	private JDateChooser dateDernierDepotMdph;
	
	/**
	 * Libellé du champ
	 */
	
	private JLabel lblFicheMinistrielleN;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblDossierMdph;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblTauxDincapacit;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblCarteDinvalidit;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblCarteDePriorit;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblCarteEuropenneDe;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAccompagnementParUn;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblPrestationCompensationAu;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAideAuTravail;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblRecoursUn;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblReconnaissanceQualitTravailleur;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAllocationAdulteHandicap;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAutreProfessionnelDe;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblSuiviPsychologique;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblTransportSpcialisDans;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblTypeDeTransport;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblNomDeLa;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblTlphone;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblEmail;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAccompagnementParUn_1;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblDepartement;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblDateDernierDepotMdph;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAccompagnementParServiceMedicoSocial;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAutreMesureRelevantCdaph;
	

	/**
	 * Libellé du champ
	 */
	
	private JLabel lblAccompagnementParServiceSanitaire;
	
	/**
	 * Taux d'incapacité
	 */
	
	private JComboBox<String> comboBox;
	
	/**
	 * Carte européenne de stationnement
	 */
	
	private JComboBox<String> comboBox_1;
	
	/**
	 * Accompagnement par un auxiliaire de vie
	 */
	
	private JComboBox<String> comboBox_2;
	
	/**
	 * PCH
	 */
	
	private JComboBox<String> comboBox_3;
	
	/**
	 * ATPD
	 */
	
	private JComboBox<String> comboBox_4;
	
	/**
	 * Recours à un transport spécifique
	 */
	
	private JComboBox<String> comboBox_5;
	
	/**
	 * RQTH
	 */
	
	private JComboBox<String> comboBox_6;
	
	/**
	 * AAH
	 */
	
	private JComboBox<String> comboBox_7;
	
	/**
	 * Autre professionnel de soins et de rééducation
	 */
	
	private JComboBox<String> comboBox_8;
	
	/**
	 * Suivi psychologique
	 */
	
	private JComboBox<String> comboBox_9;
	
	/**
	 * Département du dépot du dossier
	 */
	
	private JComboBox<String> comboBox_10;
	
	private JComboBox<String> comboBox_11;
	
	private JComboBox<String> comboBox_12;
	
	private JComboBox<String> comboBox_13;
	
	private JComboBox<String> comboBox_14;
	
	/**
	 * Bouton Oui transport
	 */
	
	private OuiNon rdbtnOui;
	
	/**
	 * Bouton Non transport
	 */
	
	private OuiNon rdbtnNon;
	
	/**
	 * Bouton Oui assistant de vie
	 */
	
	private OuiNon rdbtnOui_1;
	
	/**
	 * Bouton Non assistant de vie
	 */
	
	private OuiNon rdbtnNon_1;
	
	/**
	 * Indique si l'étudiant est nouveau ou pas
	 */
	
	private boolean nouveau;
	
	/**
	 * Le numéro d'étudiant
	 */
	
	private String numEtudiant;
	
	/**
	 * Variable permettant de travailer avec le fichier contenant toutes les informations relatives aux aides fournies par la MDPH à chacun des étudiants
	 */
	
	private final LectureFichierCSV fichierMenesr = new LectureFichierCSV("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/csv/menesr.csv");

	/**
	 * Permet de remplir toutes les comboBox sauf la première pour savoir si l'étudiant possède tel ou tel droit
	 */
	
	private final LectureFichierTXT fichierStatut = new LectureFichierTXT("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/txt/statut.txt");
	
	/**
	 * Permet de remplir la première comboBox concernant les différents taux d'incapacité que la MDPH peut reconnaître à chacun des étudiants, celui-ci déterminant les droits qui lui sont ouverts ou non
	 */
	
	private final LectureFichierTXT fichierTauxIncapaciteMdph = new LectureFichierTXT("/Users/alexis/git/Gestion_Infos_Accueil_Handicap_P8/src/data/txt/taux_incapacite_mdph.txt");
	
	/**
	 * Create the panel for a new student.
	 * @throws NullArgumentException 
	 * @throws LongueurDifferenteListesException 
	 */
	public Menesr() throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=true;
		
		setLayout(null);
		
		lblFicheMinistrielleN = new JLabel("Fiche ministérielle N°");
		
		gestionChampsEtExceptions(lblFicheMinistrielleN, 31, 16, 144, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textField = new JTextField();
		
		gestionChampsEtExceptions(textField, 190, 11, 130, 26, Color.WHITE, true, true, true, null, null, null, null, "", null, null, null);
		
		lblDossierMdph = new JLabel("Dossier MDPH");
		
		gestionChampsEtExceptions(lblDossierMdph, 31, 44, 96, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox = new JComboBox();
		
		gestionChampsEtExceptions(comboBox, 190, 41, 171, 27, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblDepartement = new JLabel("Département de dépôt du dossier :");
		
		gestionChampsEtExceptions(lblDepartement, 375, 41, 220, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_11 = new JComboBox();
		
		gestionChampsEtExceptions(comboBox_11, 600, 41, 300, 16, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblTauxDincapacit = new JLabel("Taux d'incapacité");
		
		gestionChampsEtExceptions(lblTauxDincapacit, 31, 70, 124, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_1 = new JComboBox<String>();
		
		gestionChampsEtExceptions(comboBox_1, 190, 66, 254, 27, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblDateDernierDepotMdph = new JLabel("Date du dernier dépôt à la MDPH :");
		
		gestionChampsEtExceptions(lblDateDernierDepotMdph, 450, 70, 250, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		dateDernierDepotMdph = new JDateChooser();
		
		gestionChampsEtExceptions(dateDernierDepotMdph, 675, 70, 250, 16, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblCarteDinvalidit = new JLabel("Carte d'invalidité");
		
		gestionChampsEtExceptions(lblCarteDinvalidit, 31, 98, 116, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textField_5 = new JTextField();
		
		gestionChampsEtExceptions(textField_5, 159, 94, 116, 27, Color.WHITE, true, true, false, null, null, null, null, "", null, null, null);
		
		lblAccompagnementParServiceMedicoSocial = new JLabel("Accompagnement par un établissement ou un service médico-social");
		
		gestionChampsEtExceptions(lblAccompagnementParServiceMedicoSocial, 300, 94, 440, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_12 = new JComboBox<>();
		
		gestionChampsEtExceptions(comboBox_12, 730, 94, 50, 16, null, true, true, null, null, null, null, null, "", null, null, null);
		
		textField_7 = new JTextField();
		
		gestionChampsEtExceptions(textField_7, 800, 94, 150, 25, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		lblCarteDePriorit = new JLabel("Carte de priorité");
		
		gestionChampsEtExceptions(lblCarteDePriorit, 31, 118, 116, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		textField_6 = new JTextField();
		
		gestionChampsEtExceptions(textField_6, 159, 114, 116, 27, Color.WHITE, true, true, false, null, null, null, null, "", null, null, null);
		
		lblAccompagnementParServiceSanitaire = new JLabel("Accompagnement par un établissement ou service sanitaire");
		
		lblCarteEuropenneDe = new JLabel("Carte européenne de stationnement");
		
		gestionChampsEtExceptions(lblCarteEuropenneDe, 31, 143, 233, 16, null, true, true, null, null, null, null, null, "", null, null, null);
		
		comboBox_2 = new JComboBox<String>();
		
		gestionChampsEtExceptions(comboBox_2, 278, 136, 50, 23, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblAccompagnementParUn = new JLabel("Accompagnement par un auxiliaire de vie");
		
		gestionChampsEtExceptions(lblAccompagnementParUn, 19, 173, 267, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_3 = new JComboBox<String>();
		
		gestionChampsEtExceptions(comboBox_3, 298, 171, 50, 23, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblPrestationCompensationAu = new JLabel("Prestation Compensation au Handicap (PCH)");
		
		gestionChampsEtExceptions(lblPrestationCompensationAu, 31, 194, 283, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_4 = new JComboBox<String>();
		
		gestionChampsEtExceptions(comboBox_4, 321, 195, 50, 16, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblAideAuTravail = new JLabel("Aide au Travail Personnel à Domicile");
		
		gestionChampsEtExceptions(lblAideAuTravail, 31, 222, 240, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_5 = new JComboBox<String>();
		
		gestionChampsEtExceptions(comboBox_5, 264, 223, 50, 16, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblRecoursUn = new JLabel("Recours à un transport spécifique");
		
		gestionChampsEtExceptions(lblRecoursUn, 31, 250, 223, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_6 = new JComboBox<String>();
		
		gestionChampsEtExceptions(comboBox_6, 264, 251, 50, 16, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblReconnaissanceQualitTravailleur = new JLabel("Reconnaissance Qualité Travailleur Handicapé (RQTH)");
		
		gestionChampsEtExceptions(lblReconnaissanceQualitTravailleur, 31, 278, 345, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_7 = new JComboBox<String>();
		
		gestionChampsEtExceptions(comboBox_7, 372, 268, 50, 26, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblAllocationAdulteHandicap = new JLabel("Allocation Adulte Handicapé (AAH)");
		
		gestionChampsEtExceptions(lblAllocationAdulteHandicap, 31, 306, 223, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_8 = new JComboBox<String>();
		
		gestionChampsEtExceptions(comboBox_8, 264, 302, 50, 27, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblAutreProfessionnelDe = new JLabel("Autre professionnel de soins ou de rééducation");
		
		gestionChampsEtExceptions(lblAutreProfessionnelDe, 31, 334, 313, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_9 = new JComboBox<String>();
		
		gestionChampsEtExceptions(comboBox_9, 356, 330, 50, 27, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblSuiviPsychologique = new JLabel("Suivi psychologique");
		
		gestionChampsEtExceptions(lblSuiviPsychologique, 31, 362, 130, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		comboBox_10 = new JComboBox<String>();
		
		gestionChampsEtExceptions(comboBox_10, 173, 358, 50, 27, null, true, true, null, null, null, null, null, "", null, null, null);
		
		lblTransportSpcialisDans = new JLabel("Transport spécialisé dans le cadre des études");
		
		gestionChampsEtExceptions(lblTransportSpcialisDans, 31, 390, 294, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		rdbtnOui = new OuiNon("Oui");
		
		gestionChampsEtExceptions(rdbtnOui, 346, 386, 59, 23, null, true, true, null, false, null, null, new TransportListener(), "", null, null, null);
		
		rdbtnNon = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon, 407, 386, 66, 23, null, true, true, null, false, null, null, new TransportListener(), "", null, null, null);
		
		TransportSpecialise transport = new TransportSpecialise();
		regrouperBoutons(transport);
		
		lblTypeDeTransport = new JLabel("Type de transport :");
		
		gestionChampsEtExceptions(lblTypeDeTransport, 31, 412, 130, 16, null, false, true, null, null, null, null, null, null, null, null, null);
		
		textField_1 = new JTextField();
		
		gestionChampsEtExceptions(textField_1, 169, 407, 253, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		lblNomDeLa = new JLabel("Nom de la société :");
		
		gestionChampsEtExceptions(lblNomDeLa, 31, 432, 130, 16, null, false, true, null, null, null, null, null, null, null, null, null);
		
		textField_2 = new JTextField();
		
		gestionChampsEtExceptions(textField_2, 170, 427, 252, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		lblTlphone = new JLabel("Téléphone :");
		
		gestionChampsEtExceptions(lblTlphone, 31, 450, 81, 16, null, false, true, null, null, null, null, null, null, null, null, null);
		
		textField_3 = new JTextField();
		
		gestionChampsEtExceptions(textField_3, 173, 445, 249, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		lblEmail = new JLabel("E-mail :");
		
		gestionChampsEtExceptions(lblEmail, 31, 471, 61, 16, null, false, true, null, null, null, null, null, null, null, null, null);
		
		textField_4 = new JTextField();
		
		gestionChampsEtExceptions(textField_4, 173, 466, 249, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
		
		lblAccompagnementParUn_1 = new JLabel("Accompagnement par un assistant de vie/accompagnateur");
		
		gestionChampsEtExceptions(lblAccompagnementParUn_1, 31, 499, 381, 16, null, true, true, null, null, null, null, null, null, null, null, null);
		
		rdbtnOui_1 = new OuiNon("Oui");
		
		gestionChampsEtExceptions(rdbtnOui_1, 424, 492, 59, 23, null, true, true, null, false, null, null, null, "", null, null, null);
		
		rdbtnNon_1 = new OuiNon("Non");
		
		gestionChampsEtExceptions(rdbtnNon_1, 484, 495, 59, 23, null, true, true, null, false, null, null, null, "", null, null, null);
		
		Accompagnement accompagnement = new Accompagnement();
		regrouperBoutons(accompagnement);
	}

	/**
	 * Crée le panel en collectant les informations de l'étudiant à partir de son numéro lorsque celui-ci est répertorié
	 * @param numEtudiant
	 * @throws LongueurDifferenteListesException
	 * @throws NullArgumentException
	 */
	
	public Menesr(String numEtudiant) throws LongueurDifferenteListesException, NullArgumentException {
		this.nouveau=false;
		this.numEtudiant=numEtudiant;
		gererInfosFichierCSV(fichierMenesr);
	}

	@Override
	public void gererInfosFichierTXT(LectureFichierTXT lectureFichier) {
		
		ArrayList<String> donnees = lectureFichier.chargerFichier();
		
	}

	@Override
	public void gererInfosFichierCSV(LectureFichierCSV fichier)
			throws LongueurDifferenteListesException, NullArgumentException {
		
			ArrayList<String[]> etudiants = fichierMenesr.chargerFichier();
			String[] etudiant = fichierMenesr.retournerInfosEtudiant(etudiants, this.numEtudiant);
			
			setLayout(null);
			
			lblFicheMinistrielleN = new JLabel("Fiche ministérielle N°");
			
			gestionChampsEtExceptions(lblFicheMinistrielleN, 31, 16, 144, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			textField = new JTextField();
			
			gestionChampsEtExceptions(textField, 190, 11, 130, 26, Color.GRAY, true, true, false, null, null, null, null, "", null, null, null);
			
			lblDossierMdph = new JLabel("Dossier MDPH");
			
			gestionChampsEtExceptions(lblDossierMdph, 31, 44, 96, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			comboBox = new JComboBox();
			
			gestionChampsEtExceptions(comboBox, 190, 41, 171, 27, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblTauxDincapacit = new JLabel("Taux d'incapacité");
			
			gestionChampsEtExceptions(lblTauxDincapacit, 31, 70, 124, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			comboBox_1 = new JComboBox<String>();
			
			gestionChampsEtExceptions(comboBox_1, 190, 66, 254, 27, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblCarteDinvalidit = new JLabel("Carte d'invalidité");
			
			gestionChampsEtExceptions(lblCarteDinvalidit, 31, 98, 116, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			textField_5 = new JTextField();
			
			gestionChampsEtExceptions(textField_5, 159, 94, 116, 27, Color.WHITE, true, true, false, null, null, null, null, "", null, null, null);
			
			lblCarteDePriorit = new JLabel("Carte de priorité");
			
			gestionChampsEtExceptions(lblCarteDePriorit, 31, 118, 116, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			textField_6 = new JTextField();
			
			gestionChampsEtExceptions(textField_6, 159, 114, 116, 27, Color.WHITE, true, true, false, null, null, null, null, "", null, null, null);
			
			lblCarteEuropenneDe = new JLabel("Carte européenne de stationnement");
			
			gestionChampsEtExceptions(lblCarteEuropenneDe, 31, 143, 233, 16, null, true, true, null, null, null, null, null, "", null, null, null);
			
			comboBox_2 = new JComboBox<String>();
			
			gestionChampsEtExceptions(comboBox_2, 278, 136, 144, 23, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblAccompagnementParUn = new JLabel("Accompagnement par un auxiliaire de vie");
			
			gestionChampsEtExceptions(lblAccompagnementParUn, 19, 173, 267, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			comboBox_3 = new JComboBox<String>();
			
			gestionChampsEtExceptions(comboBox_3, 298, 171, 146, 23, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblPrestationCompensationAu = new JLabel("Prestation Compensation au Handicap (PCH)");
			
			gestionChampsEtExceptions(lblPrestationCompensationAu, 31, 194, 283, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			comboBox_4 = new JComboBox<String>();
			
			gestionChampsEtExceptions(comboBox_4, 321, 195, 123, 16, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblAideAuTravail = new JLabel("Aide au Travail Personnel à Domicile");
			
			gestionChampsEtExceptions(lblAideAuTravail, 31, 222, 240, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			comboBox_5 = new JComboBox<String>();
			
			gestionChampsEtExceptions(comboBox_5, 264, 223, 158, 16, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblRecoursUn = new JLabel("Recours à un transport spécifique");
			
			gestionChampsEtExceptions(lblRecoursUn, 31, 250, 223, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			comboBox_6 = new JComboBox<String>();
			
			gestionChampsEtExceptions(comboBox_6, 264, 251, 148, 16, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblReconnaissanceQualitTravailleur = new JLabel("Reconnaissance Qualité Travailleur Handicapé (RQTH)");
			
			gestionChampsEtExceptions(lblReconnaissanceQualitTravailleur, 31, 278, 345, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			comboBox_7 = new JComboBox<String>();
			
			gestionChampsEtExceptions(comboBox_7, 372, 268, 157, 26, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblAllocationAdulteHandicap = new JLabel("Allocation Adulte Handicapé (AAH)");
			
			gestionChampsEtExceptions(lblAllocationAdulteHandicap, 31, 306, 223, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			comboBox_8 = new JComboBox<String>();
			
			gestionChampsEtExceptions(comboBox_8, 264, 302, 223, 27, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblAutreProfessionnelDe = new JLabel("Autre professionnel de soins ou de rééducation");
			
			gestionChampsEtExceptions(lblAutreProfessionnelDe, 31, 334, 313, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			comboBox_9 = new JComboBox<String>();
			
			gestionChampsEtExceptions(comboBox_9, 356, 330, 173, 27, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblSuiviPsychologique = new JLabel("Suivi psychologique");
			
			gestionChampsEtExceptions(lblSuiviPsychologique, 31, 362, 130, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			comboBox_10 = new JComboBox<String>();
			
			gestionChampsEtExceptions(comboBox_10, 173, 358, 356, 27, null, true, true, null, null, null, null, null, "", null, null, null);
			
			lblTransportSpcialisDans = new JLabel("Transport spécialisé dans le cadre des études");
			
			gestionChampsEtExceptions(lblTransportSpcialisDans, 31, 390, 294, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			rdbtnOui = new OuiNon("Oui");
			
			gestionChampsEtExceptions(rdbtnOui, 346, 386, 59, 23, null, true, true, null, false, null, null, new TransportListener(), "", null, null, null);
			
			rdbtnNon = new OuiNon("Non");
			
			gestionChampsEtExceptions(rdbtnNon, 407, 386, 66, 23, null, true, true, null, false, null, null, new TransportListener(), "", null, null, null);
			
			TransportSpecialise transport = new TransportSpecialise();
			regrouperBoutons(transport);
			
			lblTypeDeTransport = new JLabel("Type de transport :");
			
			gestionChampsEtExceptions(lblTypeDeTransport, 31, 412, 130, 16, null, false, true, null, null, null, null, null, null, null, null, null);
			
			textField_1 = new JTextField();
			
			gestionChampsEtExceptions(textField_1, 169, 407, 253, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
			
			lblNomDeLa = new JLabel("Nom de la société :");
			
			gestionChampsEtExceptions(lblNomDeLa, 31, 432, 130, 16, null, false, true, null, null, null, null, null, null, null, null, null);
			
			textField_2 = new JTextField();
			
			gestionChampsEtExceptions(textField_2, 170, 427, 252, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
			
			lblTlphone = new JLabel("Téléphone :");
			
			gestionChampsEtExceptions(lblTlphone, 31, 450, 81, 16, null, false, true, null, null, null, null, null, null, null, null, null);
			
			textField_3 = new JTextField();
			
			gestionChampsEtExceptions(textField_3, 173, 445, 249, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
			
			lblEmail = new JLabel("E-mail :");
			
			gestionChampsEtExceptions(lblEmail, 31, 471, 61, 16, null, false, true, null, null, null, null, null, null, null, null, null);
			
			textField_4 = new JTextField();
			
			gestionChampsEtExceptions(textField_4, 173, 466, 249, 26, Color.WHITE, false, true, true, null, null, null, null, "", null, null, null);
			
			lblAccompagnementParUn_1 = new JLabel("Accompagnement par un assistant de vie/accompagnateur");
			
			gestionChampsEtExceptions(lblAccompagnementParUn_1, 31, 499, 381, 16, null, true, true, null, null, null, null, null, null, null, null, null);
			
			rdbtnOui_1 = new OuiNon("Oui");
			
			gestionChampsEtExceptions(rdbtnOui_1, 424, 492, 59, 23, null, true, true, null, false, null, null, null, "", null, null, null);
			
			rdbtnNon_1 = new OuiNon("Non");
			
			gestionChampsEtExceptions(rdbtnNon_1, 484, 495, 59, 23, null, true, true, null, false, null, null, null, "", null, null, null);
			
			Accompagnement accompagnement = new Accompagnement();
			regrouperBoutons(accompagnement);	
	}

	@Override
	public void regrouperBoutons(ButtonGroup boutons) {
		if(boutons instanceof TransportSpecialise) {
			boutons.add(rdbtnOui);
			boutons.add(rdbtnNon);
		}
		else if(boutons instanceof Accompagnement) {
			boutons.add(rdbtnOui_1);
			boutons.add(rdbtnNon_1);
		}
	}
}