package Geometrica;

import java.util.Random;

public class Circulo extends Figura {
	
	public double raio;
	
	Random random = new Random();
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double Pereimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * getRaio();
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", Area()=" + Area() + ", Pereimetro()=" + Pereimetro() + "]";
	}
	
}
