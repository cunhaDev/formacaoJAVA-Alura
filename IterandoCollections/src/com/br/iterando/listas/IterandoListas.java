package com.br.iterando.listas;

import java.util.*;

public class IterandoListas {

	public static void main(String[] args) {
		List<String> arrayString = new ArrayList<>();
		
		arrayString.add("Objeto 1");
		arrayString.add("Objeto 2");
		arrayString.add("Objeto 3");
		
		for(int i = 0; i < arrayString.size(); i++) {
			System.out.println(arrayString.get(i));
		}
		
		for(String objetos : arrayString) {
			System.out.println(objetos);
		}
		
	int	A = 1;
	int	B = 1;
		int result = (A + B) * A / B;
		System.out.println(result);
	}

}
