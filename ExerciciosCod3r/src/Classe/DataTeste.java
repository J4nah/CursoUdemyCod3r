package Classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d = new Data(21, 9, 1990);

		var d2 = new Data(26, 12, 1987);

		Data d3 = new Data();
		
		
		d.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		d3.imprimirDataFormatada();

	}

}
