package Controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String conceito = "";
		System.out.print("Digite a nota: ");
		int nota = ler.nextInt();

		switch (nota) {
		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
		case 6:
			conceito = "B";
			break;
		case 5:
		case 4:
		case 3:
			conceito = "C";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "D";
			break;
		default:
			conceito = "Não informado";

		}
		System.out.println("A nota recebe o conceito: " + conceito);
		ler.close();
	}

}
