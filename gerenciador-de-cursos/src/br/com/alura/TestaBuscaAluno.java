package br.com.alura;

public class TestaBuscaAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Collection Java", "Mateus Cunha");

		javaColecoes.adciona(new Aula("Trabalhando com ArrayList", 25));
		javaColecoes.adciona(new Aula("Criando Classe Aula", 25));
		javaColecoes.adciona(new Aula("Modelando Colecoes", 25));

		Aluno a1 = new Aluno("Mateus cunha", 1234);
		Aluno a2 = new Aluno("Carol Mota", 1265);
		Aluno a3 = new Aluno("Rodrigo Turini", 34672);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 1234?");
		System.out.println(javaColecoes.buscaMatricula(1234));
	}
}
