package aplicacao;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite as informações do triangulo X");
		double aX = leia.nextDouble();
		double bX = leia.nextDouble();
		double cX = leia.nextDouble();
		
		double pX = (aX + bX + cX)/2;
		double areaX = Math.sqrt(  pX * (pX - aX) * (pX - bX)  * (pX - cX));
		
		
		System.out.println("Digite as informações do triangulo Y");
		double aY = leia.nextDouble();
		double bY = leia.nextDouble();
		double cY = leia.nextDouble();
		
		double pY = (aY + bY + cY)/2;
		double areaY = Math.sqrt(  pY * (pY - aY) * (pY - bY)  * (pY - cY));

		System.out.println("Area do triangulo X " + areaX);
		System.out.println("Area do triangulo Y " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area X");
		} else {
			System.out.println("Maior area Y");
		}
		
	}

}