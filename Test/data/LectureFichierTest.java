/**
 * 
 */
package data;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Alexou
 *
 */
public class LectureFichierTest {
	
	LectureFichierCSV lectureFichier;
	ArrayList<String[]> donnees;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.LectureFichierCSV#getString(java.lang.String[][], int)}.
	 */
	@Test
	public void testGetString() {
		lectureFichier = new LectureFichierCSV("C:\\Users\\Alexou\\workspace\\Gestion_Infos_Accueil_Handicap_P8\\src\\data\\apoge.csv");
		donnees = lectureFichier.chargerFichier();
		
		assertEquals("DUPONT", lectureFichier.getString(donnees, 0, 2));
	}

}
