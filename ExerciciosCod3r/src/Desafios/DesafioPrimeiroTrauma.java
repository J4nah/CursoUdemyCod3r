package Desafios;

public class DesafioPrimeiroTrauma {

	int a = 13; //para ser acessado é necessário criar uma instancia;
	static int b = 45; //membro de classe pode ser acessado por outro membro de classe;
	
	public static void main(String[] args) {
		
		DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();
		
		System.out.println(p.a);
		
		
		System.out.println(b);
	}
	
}
