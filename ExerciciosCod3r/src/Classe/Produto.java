package Classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	// construtor não recebe retorno, pq automaticamente o Java reconhece que ele retorna um novo objeto.

	// construtor com parâmetro, quando utiliza parâmetros no construtor, o padrão deixa de existir.
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}

	// construtor padrão pode ser criado e utilizado normalmente.
	Produto() {

	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	// pode ter dois metodos com o mesmo nome, porém com parametros diferentes.
	double precoComDesconto(double descontoDoGerente) {
		return precoComDesconto() - descontoDoGerente;
	}

}
