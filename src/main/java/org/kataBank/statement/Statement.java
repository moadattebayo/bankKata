package org.kataBank.statement;

import org.kataBank.operation.Operation;

public class Statement {

	private final Operation operation;
	private final double currentBalance;

	public Statement(Operation operation, double currentBalance) {
		this.operation = operation;
		this.currentBalance = currentBalance;
	}

	public Operation getOperation() {
		return operation;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

}
