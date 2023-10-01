package Classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		String s2 = null;
		System.out.println(s2.concat("?????")); //não é possivel acessar uma variavel que não aponta para nenhum local de memória. Caso tente irá gerar um erro de RunTime.
	}
	
	
}
