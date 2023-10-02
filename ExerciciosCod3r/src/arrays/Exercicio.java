package arrays;

import java.util.Arrays;


public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA)); //valor padrão
		
		notasAlunoA[0] = 10.0;
		notasAlunoA[1] = 5.0;
		notasAlunoA[2] = 7.1;
		notasAlunoA[3] = 8.2;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]); // acessa o idex que você quiser dentro do array.
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); // acessa o ultimo idex do array.
		//System.out.println(notasAlunoA[4]); ERRO! porque está fora dos limites do array.
		
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
			System.out.println("Nota Aluno A: " + total);
		}
		System.out.println("\nMédia: " + total / notasAlunoA.length + "\n");
		
		double totalB = 0;
		double [] notasAlunoB = {6.5, 7.5, 8.8, 9.0};
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
			System.out.println("Nota Aluno B: " + totalB);
		}
		System.out.println("\nMédia: " + totalB / notasAlunoB.length);
	}

}
