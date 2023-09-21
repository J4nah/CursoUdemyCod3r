package Classe;

public class AreaCirc {
	
	double raio;
	
	//O PI foi definido como constate e statico ent�o ele � pertencente a classe, e n�o � instancia.
	final static double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	
}
