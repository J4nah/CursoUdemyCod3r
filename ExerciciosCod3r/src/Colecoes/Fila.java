package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		//First in First Out FIFO
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila.
		// a != é o comportamento quando a fila está cheia.
		fila.add("Maria"); // retorna falso
		fila.offer("Bia"); // lança uma exceçao
		fila.add("José");
		fila.offer("João");
		fila.add("Ana");
		fila.offer("Joana");
		
		System.out.println(fila.peek()); // retorna falso se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceçao se a fila estiver vazia.
		System.out.println(fila.element());
		
		// fila.size(); tamanho da fila
		// fila.clear(); limpa a fila
		// fila.isEmpty(); saber se a fila esta ou não cheia
		
		
		System.out.println(fila.poll()); // -> retorna o elemento e remove
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
