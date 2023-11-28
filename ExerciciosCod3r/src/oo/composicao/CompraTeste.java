package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra c1 = new Compra();
		c1.cliente = "Maria";

		c1.itens.add(new Item("Celular", 1, 10000));
		c1.itens.add(new Item("Notebook", 3, 15000));
		c1.itens.add(new Item("Mouse", 3, 100));

		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}
}
