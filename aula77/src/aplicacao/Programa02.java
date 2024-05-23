package aplicacao;

import java.util.Scanner;

import entidades.Triangulo;

public class Programa02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);		
		System.out.println("Digite as informações do triangulo X");
		double a = leia.nextDouble();
		double b = leia.nextDouble();
		double c = leia.nextDouble();
		
		
		// Instanciação do objeto
		Triangulo trianguloX = new Triangulo();
		trianguloX.a = a;
		trianguloX.b = b;
		trianguloX.c = c;
		double areaX = trianguloX.calcularArea();
		
		
		System.out.println("Digite as informações do triangulo Y");
		a = leia.nextDouble();
		b = leia.nextDouble();
		c = leia.nextDouble();
		
		Triangulo trianguloY = new Triangulo();
		trianguloY.a = a;
		trianguloY.b = b;
		trianguloY.c = c;
		double areaY = trianguloY.calcularArea();
		
		System.out.println("Area do triangulo X " + areaX);
		System.out.println("Area do triangulo Y " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area X");
		} else {
			System.out.println("Maior area Y");
		}
		
		
	}

}
