package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
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
		
		System.out.println("Todos os alunos Matriculados no curso: " + javaColecoes.getNome());
		
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}
		
		
	}
}
