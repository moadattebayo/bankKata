package org.kataBank.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kataBank.account.BankAccount;
import org.kataBank.exception.NegativeAmountException;
import org.kataBank.operation.Operation;
import org.kataBank.operation.OperationType;
import org.kataBank.statement.History;
import org.kataBank.statement.Statement;

public class BankAccountTest {

	private BankAccount bankAccount;

	@BeforeEach
	public void init() {

		bankAccount = new BankAccount();
	}

	@Test
	public void when_50_is_deposited_then_balance_increases_by_50() {

		bankAccount.deposit(50);
		assertEquals(bankAccount.getBalance(), 50);
	}

	@Test
	public void when_50_is_withdrawed_then_balance_decreases_by_50() {

		bankAccount.withdraw(50);
		assertEquals(bankAccount.getBalance(), -50);
	}

	@Test
	public void when_details_are_desplayed_the_number_of_displayed_lines_is_equal_to_the_number_of_operations() {

		java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
		System.setOut(new java.io.PrintStream(out));

		bankAccount.deposit(150);
		bankAccount.withdraw(150);

		History<Statement> statements = bankAccount.getHistory();

		assertEquals(statements.getAll().size() , 2);
	}

	@Test
	public void when_we_deposit_a_negative_amount_an_exception_is_thrown() {

		Assertions.assertThrows(NegativeAmountException.class, () -> {
			bankAccount.deposit(-500);
		});
	}

	@Test
	public void when_we_withdraw_a_negative_amount_an_exception_is_thrown() {

		Assertions.assertThrows(NegativeAmountException.class, () -> {
			bankAccount.withdraw(-500);
		});
	}

	@Test
	public void when_we_deposit_500_then_history_contains_the_deposit_operation_with_current_balance() {

		bankAccount.deposit(500);
		Operation expectedOperation = new Operation(OperationType.DEPOSIT, LocalDate.now(), 500);
		Statement expectedStatement = new Statement(expectedOperation, 500);

		Statement existingStatement = bankAccount.getHistory().getAll().get(0);
		Operation existingOperation = existingStatement.getOperation();

		assertEquals(existingStatement.getCurrentBalance(), expectedStatement.getCurrentBalance());
		assertEquals(existingOperation.getDate(), expectedOperation.getDate());
		assertEquals(existingOperation.getType(), expectedOperation.getType());
		assertEquals(existingOperation.getAmount(), expectedOperation.getAmount());
	}

	@Test
	public void when_we_withdraw_500_then_history_contains_the_withdrawal_operation_with_current_balance()
			throws NegativeAmountException {

		bankAccount.withdraw(500);
		Operation expectedOperation = new Operation(OperationType.WITHDRAW, LocalDate.now(), 500);
		Statement expectedStatement = new Statement(expectedOperation, -500);

		Statement existingStatement = bankAccount.getHistory().getAll().get(0);
		Operation existingOperation = existingStatement.getOperation();

		assertEquals(existingStatement.getCurrentBalance(), expectedStatement.getCurrentBalance());
		assertEquals(existingOperation.getDate(), expectedOperation.getDate());
		assertEquals(existingOperation.getType(), expectedOperation.getType());
		assertEquals(existingOperation.getAmount(), expectedOperation.getAmount());
	}

}
