package br.streams.java8;

import java.util.*;

public class TrabalhandoComStreams {
	public static void main(String[] args) {
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
		
		/** opera��es Intermediarias
		 * skip: pula a quantidade de dados e segue o fluxo
		 * limit: limita a cole��o a uma certa quantidade
		 * distinct: nao deixa exibir elementos repetidos, usa equals e hashcode pra fazer a compara��o
		 * filter: filtra algo da lista
		 */
	}
}
