package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		//First in First Out FIFO
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila.
		// a != � o comportamento quando a fila est� cheia.
		fila.add("Maria"); // retorna falso
		fila.offer("Bia"); // lan�a uma exce�ao
		fila.add("Jos�");
		fila.offer("Jo�o");
		fila.add("Ana");
		fila.offer("Joana");
		
		System.out.println(fila.peek()); // retorna falso se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a uma exce�ao se a fila estiver vazia.
		System.out.println(fila.element());
		
		// fila.size(); tamanho da fila
		// fila.clear(); limpa a fila
		// fila.isEmpty(); saber se a fila esta ou n�o cheia
		
		
		System.out.println(fila.poll()); // -> retorna o elemento e remove
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
