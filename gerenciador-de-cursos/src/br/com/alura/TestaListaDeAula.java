package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisando Arraylist", 20);
		Aula a2 = new Aula("Listas de objetos", 10);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		//Collections.sort(aulas);
		
		//1° tipo de Comparator
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		//2° tipo de Comparator, Java 8
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
	}
}
