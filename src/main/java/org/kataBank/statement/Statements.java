package org.kataBank.statement;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Statements implements History<Statement> {

	List<Statement> accountStatements = new ArrayList<>();
	
	@Override
	public List<Statement> getAll() {
		return accountStatements;
	}

	@Override
	public void add(Statement record) {
		accountStatements.add(record);
	}

	@Override
	public void print(PrintStream printer) {
		
		this.getAll().stream()
			.forEach(as -> as.print(printer));
	}

}
