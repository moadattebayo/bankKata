package org.kataBank.operation;

import java.time.LocalDate;

public class Operation {

	private final OperationType type;
	private final LocalDate date;
	private final double amount;
	
	public Operation(OperationType type, LocalDate date, double amount) {
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
