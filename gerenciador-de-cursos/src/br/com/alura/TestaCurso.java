package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando COllection Java", "Mateus Cunha");

		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 25));

		javaColecoes.adciona(new Aula("Trabalhando com ArrayList", 25));
		javaColecoes.adciona(new Aula("Criando Classe Aula", 25));
		javaColecoes.adciona(new Aula("Modelando Colecoes", 25));
		
		System.out.println(javaColecoes.getAulas());
	}

}
