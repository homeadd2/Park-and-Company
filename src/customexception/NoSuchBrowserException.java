package customexception;

public class NoSuchBrowserException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoSuchBrowserException(String exMsg) {
		super(exMsg);
	}

}
