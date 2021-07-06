package aula.collectiona.formacaoJava.arrays;

import java.util.ArrayList;

public class ArraiList {

	public static void main(String[] args) {
		//ArrayList : implementação do List, uma lista ordenada 
		ArrayList lista = new ArrayList();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("Lista Ordenada Numero -> " + lista.get(i));
		}
	}

}
