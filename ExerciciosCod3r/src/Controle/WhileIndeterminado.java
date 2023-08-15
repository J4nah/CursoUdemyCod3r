package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String palavra = "";

		while (!palavra.equalsIgnoreCase("Sair")) {
			System.out.println("Digite uma palavra: ");
			palavra = ler.nextLine();
		}
		
		ler.close();
	}
}
