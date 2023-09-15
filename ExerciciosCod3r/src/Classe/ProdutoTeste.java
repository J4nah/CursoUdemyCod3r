package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4000.00;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 10000.00;
		p2.desconto = 0.50;
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		double valorTotal = precoFinal1 + precoFinal2;
		
		System.out.printf("O valor total da compra é: R$%.2f", valorTotal);
	}
	
}
