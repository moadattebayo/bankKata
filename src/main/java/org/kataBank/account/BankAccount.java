package org.kataBank.account;

import java.time.LocalDate;

import org.kataBank.exception.NegativeAmountException;
import org.kataBank.operation.Operation;
import org.kataBank.operation.OperationType;
import org.kataBank.statement.History;
import org.kataBank.statement.Statement;
import org.kataBank.statement.Statements;

public class BankAccount {

	private double balance;
	private History<Statement> history;

	public BankAccount() {
		this.balance = 0;
		this.history = new Statements();
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount < 0) {
			throw new NegativeAmountException("The amount to deposit cannot be negative");
		}
		makeOperation(OperationType.DEPOSIT, amount);
	}

	public void withdraw(double amount) {
		if (amount < 0) {
			throw new NegativeAmountException("The amount to withdraw cannot be negative");
		}
		makeOperation(OperationType.WITHDRAW, -amount);
	}

	private void makeOperation(OperationType operationType, double amount) {

		balance += amount;
		Operation operation = new Operation(operationType, LocalDate.now(), Math.abs(amount));
		addToHistory(operation, getBalance());

	}

	private void addToHistory(Operation operation, double balance) {

		Statement statement = new Statement(operation, balance);
		this.getHistory().add(statement);

	}

	public History<Statement> getHistory() {
		return history;
	}

}
