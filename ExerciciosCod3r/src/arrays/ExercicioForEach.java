package arrays;

public class ExercicioForEach {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];

		notasAlunoA[0] = 10.0;
		notasAlunoA[1] = 5.0;
		notasAlunoA[2] = 7.1;
		notasAlunoA[3] = 8.2;

		for (double nota : notasAlunoA) {
			System.out.println("Nota: " + nota);
		}
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		System.out.println("Média: " + total / notasAlunoA.length + "\n");

		double totalB = 0;
		double[] notasAlunoB = { 6.5, 7.5, 8.8, 9.0 };

		for (double notaB : notasAlunoB) {
			System.out.println("Nota: " + notaB);
		}
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}

		System.out.println("\nMédia: " + totalB / notasAlunoB.length);

	}

}
