package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando COllection Java", "Mateus Cunha");

		javaColecoes.adciona(new Aula("Trabalhando com ArrayList", 25));
		javaColecoes.adciona(new Aula("Criando Classe Aula", 25));
		javaColecoes.adciona(new Aula("Modelando Colecoes", 25));
		
		List<Aula> aulasImutaveis =  javaColecoes.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);

	}
}
