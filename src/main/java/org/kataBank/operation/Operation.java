package org.kataBank.operation;

import java.time.LocalDate;

public class Operation {

	private final OperationType type;
	private final LocalDate date;
	private final double amount;

	public Operation(OperationType type, LocalDate date, double amount) {

		if (date == null) {
			throw new IllegalArgumentException("Date cannot be null!");
		}
		if (type == null) {
			throw new IllegalArgumentException("Type cannot be null!");
		}
		this.type = type;
		this.date = date;
		this.amount = amount;
	}

	public OperationType getType() {
		return type;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

}
