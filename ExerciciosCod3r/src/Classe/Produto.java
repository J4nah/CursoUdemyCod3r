package Classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	// construtor n�o recebe retorno, pq automaticamente o Java reconhece que ele retorna um novo objeto.

	// construtor com par�metro, quando utiliza par�metros no construtor, o padr�o deixa de existir.
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}

	// construtor padr�o pode ser criado e utilizado normalmente.
	Produto() {

	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	// pode ter dois metodos com o mesmo nome, por�m com parametros diferentes.
	double precoComDesconto(double descontoDoGerente) {
		return precoComDesconto() - descontoDoGerente;
	}

}
