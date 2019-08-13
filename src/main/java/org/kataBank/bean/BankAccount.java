package org.kataBank.bean;

public class BankAccount {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void deposit(double d) {
		balance += d;
	}

	public void withdraw(double d) {
		balance -= d;
	}

}
