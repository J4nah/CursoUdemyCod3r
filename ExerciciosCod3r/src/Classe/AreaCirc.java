package Classe;

public class AreaCirc {
	
	double raio;
	
	//O PI foi definido como constate e statico então ele é pertencente a classe, e não à instancia.
	final static double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	
}
