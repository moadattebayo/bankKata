package org.kataBank.statement;

import java.util.List;

public interface History<E> {

	List<E> getAll();

	void add(E record);

}
