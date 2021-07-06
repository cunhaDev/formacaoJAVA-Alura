package aula.collectiona.formacaoJava;

public class Array {
	public static void main(String[] args) {

		// criando um array de inteiros
		int[] idades = new int[5];
		
		for(int i = 0; i < idades.length ; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}
		
		//atribuindo valores as posi�oes do array
		idades[0] = 12;
		idades[1] = 23;
		idades[2] = 34;
		idades[3] = 45;
		idades[4] = 7;
		
		//acessando a posi��o de um array para mostrar o valor
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

		//Array do tipo Object > objeto literal que suporta qualquer coisa
		Object[] obj = new Object[5];
		obj[0] = "String";
		obj[1] = 1324;
		obj[2] = true;
		obj[3] = 'c';
		obj[4] = 15246541687465465L;

	}
}
