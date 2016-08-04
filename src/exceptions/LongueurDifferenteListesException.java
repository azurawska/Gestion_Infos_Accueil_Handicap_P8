package exceptions;

public class LongueurDifferenteListesException extends Exception {

	public LongueurDifferenteListesException() {
		// TODO Auto-generated constructor stub
		System.out.println("Les listes d'onglets et de titres d'onglets n'ont pas la même longueur !");
	}
}