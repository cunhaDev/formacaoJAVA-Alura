package aula.collections.formacaoJava.arrays;

import java.util.ArrayList;

public class ArrayListEquals {
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Objeto 1");
		lista.add("Objeto 1");
		
		// contains verifica se ja existe o objeto na lista
		boolean existe = lista.contains("Objeto 1");
		System.out.println("Existe? " + existe);
	}
}
