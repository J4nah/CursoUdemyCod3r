package Controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a m�dia: ");
		double media = ler.nextDouble();

		if (media < 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parab�ns");
		}
		if(media <= 6.9 && media >= 4.5) {
			System.out.println("Recupera��o");
		}
		if(media < 4.5 && media >= 0.0) {
			System.out.println("Reprovado");
		}
		
		ler.close();

	}

}
