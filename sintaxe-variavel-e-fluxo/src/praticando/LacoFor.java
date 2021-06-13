package praticando;

public class LacoFor {
	public static void main(String[] args) {
		/**
		 * Objetivo: imprimir um quedrado 5x5 de #
		 */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j <= 5; j++) {
				System.out.print("#");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
