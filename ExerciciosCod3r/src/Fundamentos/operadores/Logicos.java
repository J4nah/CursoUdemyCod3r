package Fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);

		System.out.println("\nTabela Verdade E (and) &&");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);

		System.out.println("\nTabela Verdade OU (or) ||");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("\nTabela Verdade OU EXCLUSIVO (xor) ^");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("\nTabela Verdade Negação (not) !");
		System.out.println(!true);
		System.out.println(!false);

	}

}
