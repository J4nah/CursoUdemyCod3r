package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// if (...) senten�a; ou {}
		// while (...) senten�a; ou {}
		// for (...;...;...) senten�a; ou {}

		// do senten�a; ou while (...);

		Scanner ler = new Scanner(System.in);
		String texto = "";

		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.println("Quer sair? ");
			texto = ler.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigada!");
		ler.close();

	}
}
