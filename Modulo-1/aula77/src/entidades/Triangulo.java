package entidades;

public class Triangulo {
	
	// Caracteristicas
	public double a;
	public double b;
	public double c;
	
	
	// Comportamento
	public double calcularArea() {
		double p = (a + b + c)/2;
		double area = Math.sqrt(  p * (p - a) * (p - b)  * (p - c));
		return area;
	}

}
