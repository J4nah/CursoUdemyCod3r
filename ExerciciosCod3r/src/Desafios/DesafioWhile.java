package Desafios;

import java.util.Scanner;

//digite nota valida 0 - 10
// somar todas as notas
// somar as notas validas 
//media das notas validas
//quantas notas validas foram digitadas
//-1 sai do programa
public class DesafioWhile {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int contador = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.println("Digite a nota ou -1 para sair: ");
			nota = ler.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				contador++;
			} else if (nota != -1) {
				System.out.println("Nota invalida!!!!");
			}
		}

		double media = total / contador;

		System.out.printf("a média total é: %.2f\nO numero de notas válidas: %d", media, contador);
		ler.close();

	}
}
