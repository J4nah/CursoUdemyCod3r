package Desafios;

public class DesafioClasse {

	String nome;
	double preco;
	static double desconto = 0.25;

	DesafioClasse() {
		
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return precoComDesconto() - descontoDoGerente;
	}

}
