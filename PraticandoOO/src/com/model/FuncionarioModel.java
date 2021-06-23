package com.model;

public class FuncionarioModel {

	private String name;
	private String cpf;
	private String cargo;
	private int situacaoFuncionario;

	/**
	 * Construtor da Classe Funcionario usado para Obrigar que todos tenham Cargo e
	 * Situação Inicial.
	 * @param cargo: cargo em que o funcionario atua
	 * @param situacaoFuncionario: situação do usuario(Ativo ou não).
	 */
	public FuncionarioModel(String cargo, int situacaoFuncionario) {
		this.cargo = cargo;
		this.situacaoFuncionario = situacaoFuncionario;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSituacaoFuncionario() {
		return situacaoFuncionario;
	}

	public void setSituacaoFuncionario(int situacaoFuncionario) {
		this.situacaoFuncionario = situacaoFuncionario;
	}

}
