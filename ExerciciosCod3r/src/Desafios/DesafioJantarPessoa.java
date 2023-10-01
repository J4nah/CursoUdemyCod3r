package Desafios;

public class DesafioJantarPessoa {

	String nome;
	double peso;

	DesafioJantarPessoa(String nomePessoa, double pesoPessoa) {
		this.nome = nomePessoa;
		this.peso = pesoPessoa;
	}

	void comer(DesafioJantarComida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}

	String imprimir() {
		return "Nome: " + nome + "\nPeso " + peso + "Kg.";
	}

}
