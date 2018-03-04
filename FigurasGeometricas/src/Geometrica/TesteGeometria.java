package Geometrica;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class TesteGeometria {

	public static void main(String[] args) {
		
		ArrayList<Figura> figuras = new ArrayList<>(); 
		
		DecimalFormat format = new DecimalFormat();
		format.setMaximumFractionDigits(2);
		
		figuras.add(new Circulo(4));
		figuras.add(new Triangulo(2, 3, 1, 2, 1));
		figuras.add(new Losango(2.5, 3.4, 5.6));
		figuras.add(new Retangulo(5.4, 6.7));
		figuras.add(new Quadrado(4,4));
		figuras.add(new Trapezio(2, 4));
				
		for(Figura fig: figuras ) {
			
			System.out.println(fig.toString());
			
		}
		
	}

}
