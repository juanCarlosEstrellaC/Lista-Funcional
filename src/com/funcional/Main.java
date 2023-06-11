package com.funcional;

import com.funcional.lista.Lista;

public class Main {
	public static void main(String[] args) {

//		Lista<Integer> miLista = Lista.of(2, 3, 7, 4, 8);  // miLista es un Cons[c]
//		System.out.println("Cabezera de miLista: "+miLista.head());
//		System.out.println("miLista: "+ miLista+"\n");
//		
//		var empty = Lista.of();
//		System.out.println("Lista vacía: "+ empty+"\n");
//
//		var nuevaLista = miLista.append(99);
//		System.out.println("nuevaLista a partir de miLista: "+nuevaLista+"\n");
//		
//		var nuevaLista2 = empty.append(5);
//		System.out.println("nuevaLista2 a partir de empty: "+nuevaLista2+"\n");
//		
//		var nuevaLista3 = nuevaLista.prepend(88);
//		System.out.println("nuevaLista3 a partir de nuevaLista, anteponiendo un elemento: "+nuevaLista3+"\n");
//		
//		var listaRem = miLista.removeFirst();
//		System.out.println(listaRem);
//		
//		var listaRem2 = miLista.remove(3);
//		System.out.println(listaRem2);
//		
//		var listaRem3 = miLista.remove(7);
//		System.out.println(listaRem3);
//		
//		var listaRem4 = miLista.remove(8);
//		System.out.println(listaRem4);
		
		// JUEVES, 8 JUN:
//		Lista<Integer> miLista = Lista.of(2, 3, 7, 4, 8);  
//		Lista<Integer> miLista2 = Lista.of(6,9); 
//
//		System.out.print("Mi Drop: ");
//		var listaDrop = miLista.drop(2);
//		System.out.println(listaDrop);
//
//		System.out.print("Profe Drop: ");
//		var listaDrop2 = miLista.drop2(20);
//		System.out.println(listaDrop2);
//		
//		System.out.print("Drop while: ");
//		var listaWhile = miLista.dropWhile(p -> p%2 == 0);
//		System.out.println(listaWhile);
//		
//		System.out.print("Concat: ");
//		var listaConcat = miLista.concat(miLista2);
//		System.out.println(listaConcat);
//		
//		System.out.print("Take: ");
//		var listaTake = miLista.take(-99);
//		System.out.println(listaTake);
//		
//		System.out.print("Take2: ");
//		var listaTake2 = miLista.take2(-99);
//		System.out.println(listaTake2);
//		
//		System.out.print("Take while: ");
//		var listaTakeWhile = miLista.takeWhile(p -> p%2 == 0);
//		System.out.println(listaTakeWhile);
		
//		// VIERNES, 9 JUN:
//		Lista<Integer> miLista = Lista.of(2, 3, 7, 4, 8);  
//		System.out.print("Max: ");
//		Integer s = Lista.sumaStatic(miLista);
//		System.out.println(s);
		
		
		// SÁBADO, 10 JUN
		Lista<Integer> miLista = Lista.of(2, 3, 7, 4, 8);  
		Lista<Integer> miLista2 = Lista.of(6,9); 
//		Lista<Integer> miLista = Lista.of(9);  

		
		System.out.print("Max: ");
		var listaMax = Lista.max(miLista);
		System.out.println(listaMax);
		
		System.out.println("dom");
		System.out.println("nuev");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
