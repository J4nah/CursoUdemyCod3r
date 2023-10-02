package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Quantos Alunos? ");
		int qtAlunos = ler.nextInt();

		System.out.println("Quantas notas por aluno? ");
		int qtNotas = ler.nextInt();

		double[][] notasDaSala = new double[qtAlunos][qtNotas];
		double total = 0;

		for (int a = 0; a < notasDaSala.length; a++) {
			for (int n = 0; n < notasDaSala[a].length; n++) {

				System.out.printf("Digite a nota %d do aluno %d: ", n + 1, a + 1);
				notasDaSala[a][n] = ler.nextDouble();
				total += notasDaSala[a][n];
			}
		}
		
		System.out.println();

		for (double[] notas : notasDaSala) {
			System.out.println(Arrays.toString(notas));

		}

		System.out.println("\nMédia = " + total / (qtAlunos * qtNotas));

		ler.close();

	}

}
