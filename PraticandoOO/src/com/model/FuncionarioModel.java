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
	
	/**
	 * metodo que valida se o funcionario esta ou nao ativo
	 * @param situacaoFuncionario: situação do usuario(Ativo ou não)
	 * @return dependendo da situação sera imprimido ativo ou inativo
	 */
	public boolean verificaSituacaoFuncionario(int situacaoFuncionario) {
		if(situacaoFuncionario == 1) {
			System.out.println("Funcionario Ativo");
			return true;
		} else if(situacaoFuncionario == 0){
			System.out.println("Funcionario Inativo!");
			return false;
		} else {
			System.out.println("Situação Desconhecida!");
			return false;
		}
	}
	
	//Getters e Setters
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
