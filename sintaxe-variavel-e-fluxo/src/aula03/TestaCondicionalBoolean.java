package aula03;

public class TestaCondicionalBoolean {
	public static void main(String[] args) {
		System.out.println("testando condicionais com boolean");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = true;
//		if (idade >= 18 || quantidadePessoas >= 2) {
//			System.out.println("seja bem vindo");
//		} else {
//			System.out.println("infelizmente voce nao pode entrar.");
//		}
		
		if (idade >= 18 || acompanhado) {
		System.out.println("seja bem vindo");
	} else {
		System.out.println("infelizmente voce nao pode entrar.");
	}
	}
}
