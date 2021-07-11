package br.streams.java8;

import java.util.*;
import java.util.stream.Collectors;

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
		
		/** Opera��es Intermediarias
		 * skip: pula a quantidade de dados e segue o fluxo
		 * limit: limita a cole��o a uma certa quantidade
		 * distinct: nao deixa exibir elementos repetidos, usa equals e hashcode pra fazer a compara��o
		 * filter: filtra algo da lista
		 */
		
		listaDePessoas.stream()
		.skip(1)//ignora primeiro nome
		.limit(2)//limita a lista a 2 nomes
		.distinct() //tira tudo que for igual e deixa so 
		.forEach(p -> {
			System.out.println(p);// tem que exibir Maria, joao
		});
		
		/**
		 * Opera��es Finais
		 * Quando chamar uma dessas opera��es finais, o stream termina e nao pode
		 * mas fazer nenhuma opera��o
		 * forEach: faz itera��o na collection
		 * count: retorna a quantidade de itens da cole��o
		 * min: pega o menor valor da stream
		 * max: pega o maior valor da stream
		 * collect: guarda o resultado em uma nova variavel
		 */
		
		List<String> novaLista = listaDePessoas.stream().collect(Collectors.toList());
		System.out.println(novaLista);
	}
}
