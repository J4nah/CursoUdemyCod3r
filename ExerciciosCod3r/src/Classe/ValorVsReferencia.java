package Classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribui��o por valor (Tipo Primitivo)
		
		a++;
		b--;
		
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 10, 2022);
		Data d2 = d1; //Atribui��o por referencia (Objeto) -> as duas variaveis apontam para o msm objeto em mem�ria.
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadr�o(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
			
			
	}
	
	static void voltarDataParaValorPadr�o(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

}
