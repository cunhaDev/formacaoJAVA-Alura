package aula.collections.formacaoJava.arrays;

import java.util.ArrayList;

public class ArraiList {

	public static void main(String[] args) {
		
		/**
		 * ArrayList : implementação do List, uma lista ordenada
		 * este Array guarda somente String pois sua tipagem foi Definida <String>
		 * se nao por tipo ele aceita um Object
		 */
		ArrayList<String> lista = new ArrayList<String>();

		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		lista.add("5");

		
		for(int interator = 0; interator < lista.size(); interator++) {
			System.out.println("Lista Ordenada Numero -> " + lista.get(interator));
		}
	}
	
	/**
	 * Quando se coloca um tipo de dados em um ArrayList, implicitamente o System faz um cast e converte
	 * o Object padrão para o valor definido no Array.
	 * 
	 * <> = Generics, onde é passsado um determindo tipo
	 * 
	 * a conversao de Object do para Generics é feita implicitamente
	 */

}
