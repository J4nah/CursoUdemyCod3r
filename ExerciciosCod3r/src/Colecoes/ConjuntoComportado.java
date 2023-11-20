package Colecoes;

//import java.util.HashSet;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> lista = new HashSet<>(); // SET não tem ordenação
		SortedSet<String> lista = new TreeSet<>(); // Mantêm ordenação

		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");

		for (String candidato : lista) {
			System.out.println(candidato);
		}
	}

}
