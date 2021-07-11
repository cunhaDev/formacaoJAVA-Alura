package br.streams.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsIntermediarias {
	public static void main(String[] args) {
		
		/** Operações Intermediarias
		 * skip: pula a quantidade de dados e segue o fluxo
		 * limit: limita a coleção a uma certa quantidade
		 * distinct: nao deixa exibir elementos repetidos, usa equals e hashcode pra fazer a comparação
		 * filter: filtra algo da lista
		 * map: transforma os dados (transformação de uma coisa pra outra)
		 */
		
		Set<String> listaDePessoas = new LinkedHashSet<>();
		
		listaDePessoas.add("Mateus");
		listaDePessoas.add("Maria");
		listaDePessoas.add("Maria");
		listaDePessoas.add("Joao");
		listaDePessoas.add("Joao");
		listaDePessoas.add("Filipy");
		listaDePessoas.add("Carol");
		
		listaDePessoas.stream()
		.skip(1)//ignora primeiro nome
		.limit(2)//limita a lista a 2 nomes
		.distinct() //tira tudo que for igual e deixa so 
		.forEach(p -> {
			System.out.println(p);// tem que exibir Maria, joao
		});
		
	}
}
