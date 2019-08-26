package org.kataBank;

import org.kataBank.account.BankAccount;
import org.kataBank.util.BankAccountUtil;

public class App {

	public static void main(String[] args) {

		try {
			BankAccount bankAccount = new BankAccount();

			bankAccount.deposit(500);
			bankAccount.withdraw(100);
			BankAccountUtil.showOperationsDetails(bankAccount.getHistory(), System.out);

			bankAccount.deposit(-500);
			bankAccount.withdraw(-100);

		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}

	}

}
