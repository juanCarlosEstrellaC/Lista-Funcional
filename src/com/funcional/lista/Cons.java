package com.funcional.lista;

// Cons = Es una lista con cabezera y cola.
// Cons = construct = construcción. 
public final class Cons<T> implements Lista<T> {
	
	private final T head;
	private final Lista<T> tail;  

	public Cons(T head, Lista<T> tail) {
		this.head = head;
		this.tail = tail;
	}

	@Override
	public T head() {
		return head;
	}

	@Override
	public Lista<T> tail() {
		return tail;
	}

	@Override
	public boolean isEmpty() {
		return false; 
	}

	//toString
	@Override
	public String toString() {
		return String.format("[%s,%s]", head, tail.toString());
	}
}
