package org.kataBank.statement;

import java.io.PrintStream;

import org.kataBank.operation.Operation;

public class Statement {

	private final Operation operation;
	private final double currentBalance;

	public Statement(Operation operation, double currentBalance) {
		this.operation = operation;
		this.currentBalance = currentBalance;
	}

	public void print(PrintStream printer) {

		StringBuilder builder = new StringBuilder();
		builder.append(getOperation().getDate() + "   ");
		builder.append(getOperation().getType() + "   ");
		builder.append(getOperation().getAmount() + "   ");
		builder.append("Balance   " + getCurrentBalance());
		printer.println(builder.toString());
	}

	public Operation getOperation() {
		return operation;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

}
