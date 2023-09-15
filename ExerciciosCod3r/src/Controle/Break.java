package Controle;

//pode ser usado com while, com swith case, utilizado para desvio de fluxo atual...

public class Break {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;

			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}

}
