package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a Classe aula";
		String aula3 = "trabalhando com Cursos s Sets";
		String aula4 = "Aula extra";
		
		//ArrayList é uma Lista Ordenada
		ArrayList<String> aulas = new ArrayList<String>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);

		//busca o elemento da posição(index) 2 do ArrayList
		System.out.println(aulas.get(2));
		
		//remove o elemento da posição(index) 0 do ArrayList
		aulas.remove(0);
		
		// Java chama o toString() do ArrayList trazendo um Array com os objetos da Lista
		System.out.println(aulas);
		
		//percorrendo uma Lista com For
		for(String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		//percorrendo um array com For e size
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		
		//metodo do proprio List, mesma coisa que um for
		aulas.forEach(aula -> {
			System.out.println("percorrendo: ");
			System.out.println(aula);
		});
		
		//ordenando uma Lista com sort
		Collections.sort(aulas);
		System.out.println("Aulas Ordenadas:");
		System.out.println(aulas);
		
		
	}
}
