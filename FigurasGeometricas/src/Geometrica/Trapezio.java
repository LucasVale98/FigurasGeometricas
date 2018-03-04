package Geometrica;

public class Trapezio extends Poligono{

	public double baMenor;
	
	public Trapezio(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	public double getBaMenor() {
		return baMenor;
	}

	public void setBaMenor(double baMenor) {
		this.baMenor = baMenor;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return ((getBase() + getBaMenor()) * getAltura()  ) / 2;
	}

	@Override
	public double Pereimetro() {
		// TODO Auto-generated method stub
		return ( getBase() * getAltura() )/2;
	}

	@Override
	public String toString() {
		return "Trapezio [Area()=" + Area() + ", Pereimetro()=" + Pereimetro() + "]";
	}

}
