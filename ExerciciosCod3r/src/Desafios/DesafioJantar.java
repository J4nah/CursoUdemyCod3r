package Desafios;

public class DesafioJantar {

	public static void main(String[] args) {

		DesafioJantarPessoa p = new DesafioJantarPessoa("Jos�", 75.0);

		DesafioJantarComida c = new DesafioJantarComida("Macarr�o", 0.500);
		DesafioJantarComida c2 = new DesafioJantarComida("Carne", 0.300);

		System.out.println(p.imprimir());
		p.comer(c);
		System.out.println(p.imprimir());
		p.comer(c2);
		System.out.println(p.imprimir());
		p.comer(c);
		p.comer(c2);
		System.out.println(p.imprimir());

	}

}
