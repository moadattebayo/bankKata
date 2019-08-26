package org.kataBank.util;

import java.io.PrintStream;

import org.kataBank.statement.History;
import org.kataBank.statement.Statement;

public class BankAccountUtil {

	public static void showOperationsDetails(History<Statement> statements, PrintStream printer) {
		statements.getAll().stream()
			.forEach(as -> BankAccountUtil.print(as, printer));
	}

	public static void print(Statement statement, PrintStream printer) {
		StringBuilder builder = new StringBuilder();
		builder.append(statement.getOperation().getDate() + "   ");
		builder.append(statement.getOperation().getType() + "   ");
		builder.append(statement.getOperation().getAmount() + "   ");
		builder.append("Balance   " + statement.getCurrentBalance());
		printer.println(builder.toString());
	}
}
