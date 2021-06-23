package com.view;

import com.model.FuncionarioModel;

public class TelaCadastroFuncionarios {
	public static void main(String[] args) {
		FuncionarioModel funcionario01 = new FuncionarioModel("Desenvolvedor de Software Junior", 1);
		funcionario01.setName("Mateus Cunha da silva");
		funcionario01.setCpf("0002581024-06");
		funcionario01.setSituacaoFuncionario(1);
		
		System.out.println("Funcionario "
		+ funcionario01.getName() +
		" Cadastrado como " + funcionario01.getCargo());
		System.out.println("Situação do Funcionario: " + funcionario01.getSituacaoFuncionario());
		funcionario01.verificaSituacaoFuncionario(funcionario01.getSituacaoFuncionario());
	}
}
