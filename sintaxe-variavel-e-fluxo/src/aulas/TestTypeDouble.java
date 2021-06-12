package aulas;

public class TestTypeDouble {
	public static void main(String[] args) {
		double salario = 1250.70;
		System.out.println("Meu Salario é " + salario);
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		/**
		 * java nao deixa dividir um inteiro por outro
		 * entao ele força o resultado = 2
		 */
		double outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		/**
		 * java pega o que tem maior capacidade de armazenamento (5.0)
		 * e realiza a divisao
		 */
		double outraDivisao2 = 5.0 / 2;
		System.out.println(outraDivisao);
	}
}
