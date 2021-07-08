package br.com.alura;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Collection Java", "Mateus Cunha");

		javaColecoes.adciona(new Aula("Trabalhando com ArrayList", 25));
		javaColecoes.adciona(new Aula("Criando Classe Aula", 25));
		javaColecoes.adciona(new Aula("Modelando Colecoes", 25));
		
		Aluno a1 = new Aluno("Mateus cunha", 1234);
		Aluno a2 = new Aluno("Carol Mota", 1265);
		Aluno a3 = new Aluno("ALex Franca", 1238);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos Matriculados no curso: " + javaColecoes.getNome());
		
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
	}
}
