package Fundamentos.desafios;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		/*trabalho na terça.
		trabalho na quinta.
		tv 50' com os 2 trabalhos .
		tv 32' com apenas 1 dos trabalhos.
		comprando tanto uma como outra toma sorvete.
		se nenhum der certo n toma sorvete e n vai ao shopping.
		*/
		
		boolean trabalho2 = true;
		boolean trabalho1 = true;
			
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 && trabalho2;
		
		System.out.println("Comprou TV de 50\"? " + tv50);
		System.out.println("Comprou TV de 32\"? " + tv32);
		System.out.println("Comprou sorvete\"? " + sorvete);

		// Operador Unário
		System.out.println("Mais Saudável\"? " + !sorvete);
	
		
		
		
		
	}
	
}
