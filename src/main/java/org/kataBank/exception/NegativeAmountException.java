package org.kataBank.exception;

public class NegativeAmountException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7184286134231329384L;

	public NegativeAmountException() {
	
	}

	public NegativeAmountException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NegativeAmountException(String message, Throwable cause) {
		super(message, cause);
	}

	public NegativeAmountException(String message) {
		super(message);
	}

	public NegativeAmountException(Throwable cause) {
		super(cause);
	}

}
