package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();

		usuarios.put(1, "Astolpho");
		usuarios.put(1, "Rodolpho");
		usuarios.put(2, "Andre");
		usuarios.put(3, "José");
		usuarios.put(4, "Marta");

		System.out.println(usuarios.size());
		System.out.println(usuarios);
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Marta"));
		
		for(int key : usuarios.keySet()) {
			System.out.println(key);
		}
		
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());
		}
	}

}
