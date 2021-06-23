package com.view;

import com.model.VendedorModel;

public class TelaVendas {
	public static void main(String[] args) {
		VendedorModel vendedor01 = new VendedorModel("Vendedor", 1);
		vendedor01.setName("Marcos");
		System.out.println(vendedor01.emitirNotaDeVenda());
		
	}
}
