package org.kataBank.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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


}
