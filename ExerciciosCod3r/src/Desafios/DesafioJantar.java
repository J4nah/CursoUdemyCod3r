package Desafios;

public class DesafioJantar {

	public static void main(String[] args) {

		DesafioJantarPessoa p = new DesafioJantarPessoa("José", 75.0);

		DesafioJantarComida c = new DesafioJantarComida("Macarrão", 0.500);
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
