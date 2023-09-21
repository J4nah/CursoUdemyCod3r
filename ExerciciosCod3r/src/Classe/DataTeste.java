package Classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d = new Data(21,9,1990);


		System.out.println(d.obterDataFormatada());
		
		var d2 = new Data(26,12,1987);
		
		System.out.println(d2.obterDataFormatada());
		
		Data d3 = new Data();
				
		System.out.println(d3.obterDataFormatada());

	}

}
