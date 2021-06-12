package aula03;

public class TestaEscopo {
	public static void main(String[] args) {

		System.out.println("testando escopo de variaveis");

		int quantidadePessoas = 1;

		/**
		 * uma variavel é Iniciada a partir de quando foi declarada.
		 * e finaliza na chave que fecha o bloco na qual
		 * foi iniciada.
		 */
		boolean acompanhado;// ainda nao foi iniciada

		if (quantidadePessoas >= 2) {
			acompanhado = true;// foi iniciada
		} else {
			acompanhado = false;
		}
		
		System.out.println("Valor acompanhado é " + acompanhado);// foi finalizada
	}
}
