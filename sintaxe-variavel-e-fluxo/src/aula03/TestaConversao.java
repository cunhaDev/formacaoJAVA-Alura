package aula03;

public class TestaConversao {
	public static void main(String[] args) {
		/**
		 * CASTING = ele transforma o double em int
		 * ele faz a conversao quando nao é possivel fazer
		 * da forma automatica
		 */
		double salario = 1250.70;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 65416521L;
		short numeroPequeno = 2030;
		byte b = 127;
	}
}
