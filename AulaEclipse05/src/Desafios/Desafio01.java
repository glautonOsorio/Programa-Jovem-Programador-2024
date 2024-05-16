package Desafios;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite a hora de entrada:");
		double horaEntrada = read.nextDouble();
		System.out.println("Digite a hora de saida:");
		double horaSaida = read.nextDouble();

		double calcularEntrada = calcularEncargos(horaEntrada, horaSaida, 2.0, 0.5);

		System.out.println("Valor a pagar é : R$" + calcularEntrada);

	}

	public static double calcularEncargos(double entrada, double saida, double valorPadrao, double valorAdicional) {

		double horas = entrada - saida;

		if (horas <= 3.0) {

			return valorPadrao;

		} else {
			double horasAdicionais = horas - 3;

			return valorPadrao + (horasAdicionais * (valorPadrao + valorAdicional));

		}

	}

}
