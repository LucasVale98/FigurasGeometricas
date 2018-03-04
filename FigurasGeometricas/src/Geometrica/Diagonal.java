package Geometrica;

public interface Diagonal {
	
	
	public default double calcDiagonal(double base, double altura) {
		
		return Math.pow(base , 2) + Math.pow(altura , 2);
		
	}

}
