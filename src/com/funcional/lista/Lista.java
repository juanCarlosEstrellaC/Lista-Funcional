package com.funcional.lista;

import java.util.function.Predicate;

public sealed interface Lista<T> permits Nil, Cons {

	// Atributos:
	Lista NIL = new Nil();

	// METODOS:
	T head();

	Lista<T> tail();

	boolean isEmpty();

	static <T> Lista<T> of(T h, Lista<T> t) { // of(8, NIL)
		return new Cons<>(h, t);
	}

	static <T> Lista<T> of(T... elems) { // "T..." = número variable de elementos de tipo T.
		Lista<T> ret = Lista.NIL;
		for (int i = elems.length - 1; i >= 0; i--) {
			T h = elems[i];
			var tmp = Lista.of(h, ret);
			ret = tmp;
		}
		return ret;
	}

	default Lista<T> append(T element) { // append = adjuntar al final de la lista
		if (this == NIL) { // Si la lista aún no tiene elementos, entonces:
			return Lista.of(element);
		} else { // Sino,
			return Lista.of(this.head(), this.tail().append(element)); // tail() es una lista es sí misma, por eso
																		// puede llamar a .append() []
		}
	}

	default Lista<T> appendTernario(T element) {
		return this == NIL ? Lista.of(element) : Lista.of(this.head(), this.tail().appendTernario(element));
	}
	
	default Lista<T> prepend(T element) { // prepend = anteponer al inicio de la lista.
		return Lista.of(element, this);
	}

	default Lista<T> removeFirst() {
		return this.tail();
	}
	
	default Lista<T> remove(T element) {
		if (element == this.head()) {
			return removeFirst();		// al final, aquí me devuelve el NIL, ie, el return = NIL, y con ese valor se desenvuelve de regreso.
		} else {
			T h = this.head();
			var t = this.tail().remove(element);
			return Lista.of(h, t);
		}

	}

	default Lista<T> removeTernario(T element) {
		return element == this.head() ? removeFirst() : Lista.of(this.head(), this.tail().removeTernario(element));
	}
	
	default Lista<T> drop(Integer n) {
		if (n == 0 || n < 0) {
			return this;
		} else {
			var r = this.tail();
			if (r != null) {
				n--;
				return r.drop(n);
			}
			return Lista.NIL;
		}

	}

	default Lista<T> drop2(Integer n) {
		if (this.isEmpty() || n < 0) { // cuando esté en el NIL o n < 0, entoces,
			return this;			   // retorna NIL
		} else {
			return this.tail().drop2(n - 1);
		}
	}
	
	default Lista<T> dropTernario(Integer n) {
		return this.isEmpty() || n < 0 ? this : this.tail().dropTernario(n - 1);
	}
	
	default Lista<T> dropWhile(Predicate<T> p) {
		if (!p.test(this.head())) { // asegurar con this == NIL? También?
			return this;
		} else {
			return this.tail().dropWhile(p);
		}
	}
	
	default Lista<T> dropWhileTernario(Predicate<T> p) {
		return (!p.test(this.head()) || this == NIL) ? this : this.tail().dropWhileTernario(p);
	}

	default Lista<T> concat(Lista<T> lista2) {
		if (lista2 == NIL) {
			return this;
		} else {
			var r = this.append(lista2.head());
			return r.concat(lista2.tail());
		} 
	}
	
	default Lista<T> concatTernario(Lista<T> lista2) {
		return (lista2 == NIL) ? this : this.append(lista2.head()).concatTernario(lista2.tail());
	}
	
	default Lista<T> take(int n) {
		if (n <= 0 || this == NIL) {
			return NIL;
		} else {
			var h = this.head();
			var t = this.tail().take(n-1);
			return t.prepend(h);
		}
	}
	
	default Lista<T> take2(int n) {
		if (n <= 0 || this.isEmpty()) {
			return NIL;
		} else {
			return Lista.of(this.head(), this.tail().take2(n-1));
		}
	}
	
	default Lista<T> takeTernario(int n) {
		return n <= 0 || this.isEmpty() ? NIL : Lista.of(this.head(), this.tail().takeTernario(n - 1));
	}

	default Lista<T> takeWhile(Predicate<T> p) {
		if (!p.test(this.head()) || this == NIL) {
			return NIL;
		} else {
			var h = this.head();
			var t = this.tail().takeWhile(p);
			return t.prepend(h);
		}
	}
	
	default Lista<T> takeWhileTernario(Predicate<T> p) {
		return !p.test(this.head()) || this == NIL ? NIL : this.tail().takeWhileTernario(p).prepend(this.head());
	}
	
	default Integer sumaDefault() {
		if (this == NIL) {
			return 0;
		} else {
			Integer h = (Integer) this.head();
			Integer t = this.tail().sumaDefault();
			return h+t;
		} 
	}

	default Integer sumaDefaultTernario() {
		return this == NIL ? 0 : (Integer) this.head() + this.tail().sumaDefaultTernario();
	}
	
	static Integer sumaStatic(Lista<Integer> lista) {
		if (lista == NIL) {
			return 0;
		} else {
			Integer h = lista.head();
			Integer t = Lista.sumaStatic(lista.tail());
			return h+t;
		} 
	}
	
	
	static Integer sumaStaticTernario(Lista<Integer> lista) {
		return lista == NIL ? 0 : lista.head() + Lista.sumaStaticTernario(lista.tail());
	}

	
	static Integer max(Lista<Integer> lista) {
		if (lista.isEmpty() || lista.tail().head() == null) {
			return lista.head();
		} else {
			Integer maxTmp = lista.head();
			Integer htail = lista.tail().head();

			if (htail > maxTmp) {
				maxTmp = htail;
			}

			Integer res = Lista.max(lista.tail());

			if (res > maxTmp) {
				maxTmp = res;
			}

			return maxTmp;
		}
	}

	
}

	



















