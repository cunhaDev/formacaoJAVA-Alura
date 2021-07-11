package optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Java8Optional {
	public static void main(String[] args) {
		/** uma classe para trabalhar com valores null */
		
		/**
		 * Criando Optional:
		 * 
		 * of -> retorna o valor
		 * empty -> retorna vazio
		 * ofNullable -> retorna null
		 * 
		 * Usando Optional:
		 * 
		 * isPresent -> true ou false se esta ou nao
		 * get -> pega o valor do optional
		 * 
		 * ifPresent -> retorna o valor atraves de uma lambda
		 * orElse -> retorna um valor default caso nao dê certo
		 * orElseGet -> retorna o valor atraves de uma lambda
		 * orElseThrow -> retorna uma lambda com excessao
		 */

		String s = "1";
//		Optional<Integer> numero = converteNumero(s);
//		numero.ifPresent(n -> System.out.println(n));
		
//		converteNumero(s).ifPresent(n -> System.out.println(n));
		
//		Integer numero = converteNumero(s).orElse(0);
//		Integer numero = converteNumero(s).orElseGet(() -> 0);
		Integer numero = converteNumero(s).orElseThrow(() -> new NullPointerException("Valor Nulo"));
		System.out.println(numero);
		
		Stream.of(1, 2, 3)
		.findFirst()
		.ifPresent(n -> System.out.println(n));
	}

	//tipo de retorno optional com seu tipo
	public static Optional<Integer> converteNumero(String numeroStr) {
		try {
			//converte a String em numero
			Integer integer = Integer.valueOf(numeroStr);
			//se der certo retorna o optional com inteiro
			return Optional.of(integer);
		} catch (Exception e) {
			//se der errado retorna o optional vazio
			return Optional.empty();
		}
	}

}
