package aula.collectiona.formacaoJava;

public class Array {
	public static void main(String[] args) {

		// criando um array de inteiros
		int[] idades = new int[5];
		
		for(int i = 0; i < idades.length ; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}
		
		//atribuindo valores as posiçoes do array
/*		idades[0] = 12;
		idades[1] = 23;
		idades[2] = 34;
		idades[3] = 45;
		idades[4] = 7;
		
		//acessando a posição de um array para mostrar o valor
		try {
			System.out.println(idades[45]);
		} catch (Exception e) {
			System.out.println("Execption -> " + e);
		}
		
		//mostrando o tamanho de um array
		try {
			System.out.println("Tamanho do Array -> " + idades.length);
		} catch (Exception e) {
			System.out.println("Execption -> " + e);
		}
*/


	}
}
