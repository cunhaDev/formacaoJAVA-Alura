package br.streams.java8;

import java.util.*;
import java.util.stream.*;

public class StreamsFinais {
	public static void main(String[] args) {
		/**
		 * Operações Finais Quando chamar uma dessas operações finais, o stream termina
		 * e nao pode mas fazer nenhuma operação
		 * forEach: faz iteração na collection
		 * count: retorna a quantidade de itens da coleção
		 * min: pega o menor valor da stream
		 * max: pega o maior valor da stream
		 * collect: guarda o resultado em uma nova variavel
		 * map: 
		 */
		
		List<Integer> lista = Arrays.asList(1,2,3,4,4,6,5,8,9,9);

//		lista.stream().forEach(e -> System.out.println(e)); percorre o array
		
//		long a = lista.stream().count(); retorna a quantidade de itens do array
//		System.out.println(a);
		
//		Optional<Integer> a = lista.stream().min(Comparator.naturalOrder()); pega o valor minimo
//		System.out.println(a.get());
		
//		Optional<Integer> a = lista.stream().max(Comparator.naturalOrder());pega o valor miximo
//		System.out.println(a.get());
		
//		List<Integer> novaLista =  lista.stream() cria uma nova lista com o resultado final
//				.filter(e -> e % 2 == 0)
//				.collect(Collectors.toList());
//		System.out.println(novaLista);
		
		/**
		 * Collectors:
		 * -> toList, cria uma nova lista com o resultado final
		 * -> groupingBy, agrupa e cria uma lista com o resultado agrupado
		 * -> joining, agrupa Strings, junção de todos as string em uma unica string
		 */
	}
}
