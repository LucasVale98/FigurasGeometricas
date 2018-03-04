package Geometrica;

public class Retangulo extends Poligono implements Diagonal {
	
	public Retangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Area() {
		return getBase() * getAltura();
	}

	@Override
	public double Pereimetro() {
		// TODO Auto-generated method stub
		return (getBase() + getAltura()) * 2;
	}
	
	
	@Override
	public double calcDiagonal() {
		// TODO Auto-generated method stub
		return Diagonal.super.calcDiagonal();
	}
	
	@Override
	public String toString() {
		return "Retangulo [Area()=" + Area() + ", Pereimetro()=" + Pereimetro() + 
				", Diagoanl()=" + calcDiagonal() + "]";
	}

}
