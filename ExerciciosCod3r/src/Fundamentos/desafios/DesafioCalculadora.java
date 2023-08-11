package Fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		/*calculadora
		 * ler num1, ler num2, + - / * %
		 */

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double num1 = ler.nextDouble();
		System.out.println("Digite mais um numero: ");
		double num2 = ler.nextDouble();

		System.out.println("qual operação matematica deseja fazer? ");
		String op = ler.next();
		
		double result = "+".equals(op) ? num1 + num2 : 0;
		result = "-".equals(op) ? num1 - num2 : result;
		result = "*".equals(op) ? num1 * num2 : result;
		result = "/".equals(op) ? num1 / num2 : result;
		result = "%".equals(op) ? num1 % num2 : result;

		System.out.printf(" %.2f %s %.2f = %.2f", num1, op, num2, result);
		ler.close();

	}

}
