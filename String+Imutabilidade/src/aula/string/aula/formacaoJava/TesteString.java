package aula.string.aula.formacaoJava;

public class TesteString {
	public static void main(String[] args) {
		/**
		 * uma String nao pode ser alterada;
		 */
		String teste = "Alura";
		
		String outra = "aluraa";
		teste.replace(outra, teste);
		
		System.out.println(teste);
		System.out.println(outra);
	}
}
