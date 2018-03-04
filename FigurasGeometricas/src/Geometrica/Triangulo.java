package Geometrica;

public class Triangulo extends Poligono {
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		super(base, altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return (getAltura() * getBase()) / 2;
	}

	@Override
	public double Pereimetro() {
		// TODO Auto-generated method stub
		return getLado1() + getLado2() + getLado3();
	}


	@Override
	public String toString() {
		return "Triangulo [Area()=" + Area() + ", Pereimetro()=" + Pereimetro() + "]";
	}

}
