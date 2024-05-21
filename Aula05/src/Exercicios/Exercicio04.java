package src.Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus celcius: ");
		double temperature = read.nextDouble();

		double temperatureF = Transform(temperature);

		System.out.println("A temperature formatada em F é " + temperatureF);

	}

	public static double Transform(double temp) {

		double F = 1.8 * temp + 32;

		return F;

	}

}
