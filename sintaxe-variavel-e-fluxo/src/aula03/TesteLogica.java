package aula03;

public class TesteLogica {
	public static void main(String[] args) {
//		boolean lampadaAcesa = false;
//		
//		if(lampadaAcesa) {
//			System.out.println("esta acesa");
//		} else {
//			System.out.println("esta apagada");
//		}
		
//		int lampadaAcesa = 1;
		
//		if(lampadaAcesa != 0) {
//		System.out.println("esta acesa");
//	} else {
//		System.out.println("esta apagada");
//	}
		int acesa = 1;
		boolean lampadaAcesa = acesa == 0;
		if (lampadaAcesa) {
			System.out.println("Acesa");
		} else {
			System.out.println("apagada");
		}
	}
}
