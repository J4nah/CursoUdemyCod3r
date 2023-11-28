package oo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente ("João");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 0.1, 30);
		compra1.adicionarItem("Borracha", 0.5, 40);
		compra1.adicionarItem("Caderno", 30, 20);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Notebook", 10000, 10);
		compra2.adicionarItem("Mouse", 100, 10);
		compra2.adicionarItem("Celular", 5000, 3);
		
		
		c1.compras.add(compra1);
		c1.compras.add(compra2);
		
		System.out.println(c1.obterValorTotal());
		
	}

}
