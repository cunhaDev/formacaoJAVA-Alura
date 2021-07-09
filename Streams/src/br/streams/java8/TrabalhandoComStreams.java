package br.streams.java8;

import java.util.*;

public class TrabalhandoComStreams {
	public static void main(String[] args) {
		Set<String> listaDePessoas = new LinkedHashSet<>();
		
		listaDePessoas.add("Mateus");
		listaDePessoas.add("Maria");
		listaDePessoas.add("Joao");
		listaDePessoas.add("Filipy");
		listaDePessoas.add("Carol");
		
		listaDePessoas.stream().forEach(p -> {
			System.out.println(p);
		});
	}
}
