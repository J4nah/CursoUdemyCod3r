package Desafios;


public class DesafioClasseTeste {

	public static void main(String[] args) {

		var p1 = new DesafioClasse();
		p1.nome = "Notebook";
		p1.preco = 5000.00;

		var p2 = new DesafioClasse();
		p2.nome = "Celular";
		p2.preco = 10000.00;

		
		double precoFinal1 = p1.precoComDesconto();

		double precoFinal2 = p2.precoComDesconto();

		System.out.println("Notebook R$: " + p1.preco + " Com desconto R$: " + precoFinal1);
		System.out.println("Celular R$: " + p2.preco + " Com desconto R$: " + precoFinal2);
		
		

		double valorTotal = precoFinal1 + precoFinal2;

		System.out.printf("O valor total da compra é: R$%.2f", valorTotal);
	}

}
