package praticando;

public class Condicionais {
	public static void main(String[] args) {

		/**
		 * Qual a Melhor Forma e Porque?
		 * respos
		 * 
		 * 
		 * 
		 */
		
		/**
		 * 1° Forma atribui-se a variavel ligada o valor false, enta ela entra no else e
		 * imprime Desligada. se valor de ligada for true, ela imprime Ligada.
		 */
		boolean ligada = true;

		if (ligada == true) {
			System.out.println("A Lampada esta Ligada!");
		} else {
			System.out.println("A Lampada esta Desligada!");
		}

		
		/**
		 * 2° Forma
		 * se o valor de lampada ligada for 0 ela esta desligada
		 * se o valor for 1 ela esta ligada.
		 */
		int lampadaLigada = 3000;
		
		if(lampadaLigada == 0) {
			System.out.println("A Lampada esta desligada");
		} else if (lampadaLigada == 1){
			System.out.println("a lampada esta ligada");
		} else {
			System.out.println("So pode usar 0 ou 1");
		}

		/**
		 * 3° Forma
		 * para ligar os dois tem que ser verdade, mesma coisa para desligar
		 * desligada = 0 e lampada = false : lampada desligada
		 * desligada = 1 e lampada = true : lampada ligada
		 * desligada > 1 || != 0 : condição invalida
		 */
		int desligada = 1;
		boolean lampada = desligada == 1;
		
		if(lampada) {
			System.out.println("Ligada");
		} else if (desligada > 1 || desligada != 0) {
			System.out.println("condição invalida!");
		} else {
			System.out.println("Desligada");
		}
	}
}
