package org.kataBank.statement;

import java.io.PrintStream;
import java.util.List;

public interface History<E> {

	List<E> getAll();

	void add(E record);

	void print(PrintStream printer);

}
