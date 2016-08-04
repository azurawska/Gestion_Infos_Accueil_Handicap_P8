package exceptions;

public class NullArgumentException extends Exception {

	public NullArgumentException() {
		System.out.println("L'une des listes passées en paramètres est null.");
	}
}