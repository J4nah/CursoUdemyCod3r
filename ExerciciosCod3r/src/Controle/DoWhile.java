package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// if (...) sentença; ou {}
		// while (...) sentença; ou {}
		// for (...;...;...) sentença; ou {}

		// do sentença; ou while (...);

		Scanner ler = new Scanner(System.in);
		String texto = "";

		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = ler.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigada!");
		ler.close();

	}
}
