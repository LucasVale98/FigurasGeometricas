package Geometrica;


public class Losango extends Poligono {
	
	private double perimetro;
	
	public Losango(double base, double altura, double perimetro) {
		super(base, altura);
		this.perimetro = perimetro;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return getBase() * getAltura();
	}

	@Override
	public double Pereimetro() {
		// TODO Auto-generated method stub
		return getPerimetro() - getAltura();
	}

	@Override
	public String toString() {
		return "Losango [Area()=" + Area() + ", Pereimetro()=" + Pereimetro() + "]";
	}
	
}
