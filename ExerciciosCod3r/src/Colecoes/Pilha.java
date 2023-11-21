package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		// Last in First Out LIFO

		Deque<String> livros = new ArrayDeque<String>();

		livros.add("Harry Potter");
		livros.push("O Pequeno Principe");
		livros.push("As cronicas de Narnia");
		System.err.println(livros.size());

		System.out.println(livros.peek());
		System.out.println(livros.element());

		
		for(String livro : livros) {
			System.out.println(livro);
		}

		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
	}

}
