package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Mateus Cunha");
		alunos.add("paulo Silveira");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Caroline Mota");
		alunos.add("Alexander Franca");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

	}
}
