package br.com.alura;

import java.util.*;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}
	
	public void adciona(Aula aula) {
		this.aulas.add(aula);
	}

}
