package com.model;

public class FuncionarioModel {

	private String name;
	private String cpf;
	private String cargo;
	private int situacaoFuncionario;

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
