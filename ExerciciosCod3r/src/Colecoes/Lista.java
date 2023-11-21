package Colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);

		lista.add(new Usuario("Paulo"));
		lista.add(new Usuario("José"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("João"));

		System.out.println(lista.get(3)); // pode acessar pelo indice

		lista.remove(1); // remove pelo indice.

		lista.remove(new Usuario("João")); // remove pelo objeto especifico.

		for (Usuario u : lista) {
			System.out.println(u);
		}

	}

}
