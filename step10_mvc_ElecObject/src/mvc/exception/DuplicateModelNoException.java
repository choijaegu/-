package mvc.exception;

public class DuplicateModelNoException extends Exception {
	public DuplicateModelNoException() {}
	public DuplicateModelNoException(String message) {
		super(message);
	}
}
