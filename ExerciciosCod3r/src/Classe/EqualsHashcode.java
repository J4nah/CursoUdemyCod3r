package Classe;

public class EqualsHashcode {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "João Pedro";
		u1.email = "jp@ezmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "João Pedro";
		u2.email = "jp@ezmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		//System.out.println(u2.equals(new Date()));
		
		
	
	}

}
