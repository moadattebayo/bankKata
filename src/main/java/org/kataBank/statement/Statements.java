package org.kataBank.statement;

import java.util.ArrayList;
import java.util.List;

public class Statements implements History<Statement> {

	private List<Statement> accountStatements = new ArrayList<>();

	@Override
	public List<Statement> getAll() {
		return accountStatements;
	}

	@Override
	public void add(Statement record) {
		accountStatements.add(record);
	}

}
