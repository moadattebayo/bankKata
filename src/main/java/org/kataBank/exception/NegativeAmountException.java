package org.kataBank.exception;

public class NegativeAmountException extends RuntimeException {

	private static final long serialVersionUID = 7184286134231329384L;

	public NegativeAmountException(String message) {
		super(message);
	}
}
