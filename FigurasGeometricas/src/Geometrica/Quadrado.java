package Geometrica;

public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return Math.pow(getAltura(), 2);
	}

	@Override
	public double Pereimetro() {
		// TODO Auto-generated method stub
		return getAltura() + getBase() + getAltura() + getBase();
	}
	
	
	@Override
	public double calcDiagonal() {
		// TODO Auto-generated method stub
		return Diagonal.super.calcDiagonal();
	}
	
	@Override
	public String toString() {
		return "Quadrado [Area()=" + Area() + ", Pereimetro()=" + Pereimetro() + 
				 ", Diagoanl()=" + calcDiagonal() + "]";
	}
	
}
