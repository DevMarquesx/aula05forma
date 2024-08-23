package principal;

import entidade.Forma;
import entidade.Retangulo;
import entidade.Triangulo;
import entidade.Forma;



public class Main {

	public static void main(String[] args) {
		
		Retangulo r = new Retangulo(10,10);
		
		Triangulo t = new Triangulo(10,10);
		
		System.out.println(r.calcularArea());
		
		System.out.println(t.calcularArea());
	}

	}

