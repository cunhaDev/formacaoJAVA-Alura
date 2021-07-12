package com.lambdas;

import java.util.stream.IntStream;

public class TiposDeLambdas {
	public static void main(String[] args) {
		
		/**
		 * Tipos de Lambda:
		 * 
		 * quando quer informar o tipo do parametro (int ...) -> ...
		 */
		
		IntStream.range(0, 5)
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
	}
}
