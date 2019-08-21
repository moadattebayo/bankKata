package org.kataBank.operation;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationTest {

	@Test
	public void when_type_is_null_then_an_exception_is_generated() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Operation(null, LocalDate.now(), 100);
		});
	}

	@Test
	public void when_date_is_null_then_an_exception_is_generated() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Operation(OperationType.WITHDRAW, null, 100);
		});
	}

}
