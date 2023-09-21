package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		//usando contruitor com par�metros definidos.
		Produto p1 = new Produto("Notebook", 4000.00, 0.25 );
				
		//usando construtor padr�o.
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 10000.00;
		p2.desconto = 0.50;
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		// Utilizando o primeiro metodo;
		double precoFinal1 = p1.precoComDesconto();
		
		// Segundo m�todo com parametro diferente.
		double precoFinal2 = p2.precoComDesconto(0.2);
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		double valorTotal = precoFinal1 + precoFinal2;
		
		System.out.printf("O valor total da compra �: R$%.2f", valorTotal);
	}
	
}
