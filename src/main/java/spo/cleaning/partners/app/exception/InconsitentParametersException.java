package spo.cleaning.partners.app.exception;

/**
 * Exception when we have inconsistency parameters. For exemple when they are
 * null.
 * 
 * @author nsanzfia
 *
 */
@SuppressWarnings("serial")
public class InconsitentParametersException extends Exception {

	public InconsitentParametersException() {
		super();
	}

	public InconsitentParametersException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InconsitentParametersException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public InconsitentParametersException(final String message) {
		super(message);
	}

	public InconsitentParametersException(final Throwable cause) {
		super(cause);
	}

}
