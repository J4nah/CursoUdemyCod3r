package Fundamentos.operadores;

public class relacionais {

	public static void main(String[] args) {

		int a = 97;
		int b = 'a';

		System.out.println(a == b); // igualdade
		System.out.println(30 != 7); // diferente
		System.out.println(3 > 4); // maior
		System.out.println(3 >= 3); // maior ou igual
		System.out.println(3 < 7); // menor
		System.out.println(30 <= 7); // menor ou igual

		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean desconto = bomComportamento && passouPorMedia;

		System.out.println("Tem desconto? " + desconto);

	}

}
