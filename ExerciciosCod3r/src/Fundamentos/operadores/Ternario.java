package Fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		//operador Ternario
		double media = 7.5;
		String resultado = media >= 7.0 ? "Aprovado" : "em recuperação";
		
		System.out.println("O aluno está: " + resultado);
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean desconto = bomComportamento && passouPorMedia;
		
		String resultado2 = desconto ? "Sim" : "Não";
		
		System.out.printf("Tem desconto? %s", resultado2);
		
	}
	
}
