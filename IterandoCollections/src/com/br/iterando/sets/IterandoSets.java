package com.br.iterando.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class IterandoSets {
	public static void main(String[] args) {
		Set<String> setsString = new LinkedHashSet<>();// LinkedHashSet para manter a ordem da lista
		
		setsString.add("Objeto 1");
		setsString.add("Objeto 2");
		setsString.add("Objeto 3");
		
		setsString.forEach(objeto -> {
			System.out.println(objeto);
		});
	}
}
