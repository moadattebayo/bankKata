package org.kataBank.statement;

import java.io.PrintStream;

import org.kataBank.operation.Operation;

public class Statement {

	private Operation operation;
	private double currentBalance;

	public Statement(Operation operation, double currentBalance) {
		this.operation = operation;
		this.currentBalance = currentBalance;
	}

	public void print(PrintStream printer) {

		StringBuilder builder = new StringBuilder();
		builder.append(operation.getDate() + "\t");
		builder.append(operation.getType() + "\t");
		builder.append(operation.getAmount() + "\t");
		builder.append(currentBalance);
		printer.println(builder.toString());
	}
}
