package org.kataBank;

import org.kataBank.account.BankAccount;

public class App {

	public static void main(String[] args) {

		try {
			BankAccount bankAccount = new BankAccount();

			bankAccount.deposit(500);
			bankAccount.withdraw(100);
			bankAccount.showOperationsDetails(System.out);

			bankAccount.deposit(-500);
			bankAccount.withdraw(-100);

		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}

	}

}
