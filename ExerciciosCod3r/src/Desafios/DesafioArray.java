package Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		int qt;

		Scanner ler = new Scanner(System.in);
		System.out.println("Quantas notas voc� quer lan�ar? ");
		qt = ler.nextInt();

		double notas[] = new double[qt];

		double notaLancada = 0.0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = ler.nextDouble();
		}

		for (double nota : notas) {
			notaLancada += nota;
		}
		System.out.println(Arrays.toString(notas));
		System.out.println("M�dia: " + notaLancada / notas.length);

		ler.close();

	}

}
