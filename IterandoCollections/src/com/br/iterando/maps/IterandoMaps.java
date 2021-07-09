package com.br.iterando.maps;

import java.util.*;

public class IterandoMaps {
	public static void main(String[] args) {
		Map<String, Integer> mapsString = new LinkedHashMap<String, Integer>();
		
		mapsString.put("Objeto 1", 0001);
		mapsString.put("Objeto 2", 0002);
		mapsString.put("Objeto 3", 0003);
		
		for (Map.Entry<String,Integer> iterator : mapsString.entrySet()) {
		    System.out.println(iterator.getKey());
		    System.out.println(iterator.getValue());
		}
		
		System.out.println("================");
		
		mapsString.forEach((key, value) -> {
			   System.out.println("key: " + key + ", value: " + value);
			});
	}
}
