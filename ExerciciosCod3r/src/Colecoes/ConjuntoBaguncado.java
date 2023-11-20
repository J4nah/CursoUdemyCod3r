package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Charactere
		
		System.out.println("Tamanho é: " + conjunto.size()); // size serve para saber o tamanho do conjunto.
		conjunto.add("teste");
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove('x')); //remove serve para remover um elemento.
		
		
		System.out.println("Tamanho é: " + conjunto.size());

		System.out.println(conjunto.contains('x')); //contains serve oara verificar se um determinado elemento está ou não dentro do conjunto, retornando true or false.
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // união entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	
	
		
	}
	
}
