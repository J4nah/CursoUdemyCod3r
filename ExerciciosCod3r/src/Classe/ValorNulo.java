package Classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		String s2 = null;
		System.out.println(s2.concat("?????")); //n�o � possivel acessar uma variavel que n�o aponta para nenhum local de mem�ria. Caso tente ir� gerar um erro de RunTime.
	}
	
	
}
