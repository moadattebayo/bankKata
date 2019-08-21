package org.kataBank.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

<<<<<<< HEAD
import org.junit.jupiter.api.Test;
import org.kataBank.account.BankAccount;
=======
import org.junit.jupiter.api.Test;
import org.kataBank.account.BankAccount;
>>>>>>> branch 'branch__1_1' of https://github.com/moadattebayo/bankKata.git

public class BankAccountTest {

	private final BankAccount bankAccount = new BankAccount();

	@Test
	public void when_50_is_deposited_then_balance_increases_by_50() {

		double oldBalance = bankAccount.getBalance();
		bankAccount.deposit(50);
		assertEquals(bankAccount.getBalance(), oldBalance + 50);
	}

	@Test
	public void when_50_is_withdrawed_then_balance_decreases_by_50() {

		double oldBalance = bankAccount.getBalance();
		bankAccount.withdraw(50);
		assertEquals(bankAccount.getBalance(), oldBalance - 50);
	}

	@Test
	public void when_details_are_desplayed_the_number_of_displayed_lines_is_equal_to_the_number_of_operations() {

		java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
		System.setOut(new java.io.PrintStream(out));

		bankAccount.deposit(150);
		bankAccount.withdraw(150);

		bankAccount.showOperationsDetails();
		String displayedText = out.toString();
		if (displayedText.length() != 0) {
			String[] splitted = displayedText.split("\r\n");
			assertEquals(splitted.length, bankAccount.getHistory().getAll().size());
		} else {
			assertEquals(displayedText.length(), 0);
		}
	}

}
