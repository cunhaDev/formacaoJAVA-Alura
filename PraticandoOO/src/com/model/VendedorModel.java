package com.model;

public class VendedorModel extends FuncionarioModel{

	public VendedorModel(String cargo, int situacaoFuncionario) {
		super(cargo, situacaoFuncionario);
	}

	public String emitirNotaDeVenda() {
		return " **************************************** \n"
				+ " Nota Fiscal Imprimida por: " + super.getName()
				+ "\n **************************************** ";
	}
}
