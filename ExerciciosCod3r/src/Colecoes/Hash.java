package Colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		HashSet<Usuario> usuario = new HashSet<Usuario>();

		usuario.add(new Usuario("José"));
		usuario.add(new Usuario("Pedro"));
		usuario.add(new Usuario("Astolpho"));

		System.out.println(usuario.contains(new Usuario("Astolpho")));

	}

}
