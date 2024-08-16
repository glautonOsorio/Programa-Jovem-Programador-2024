package exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite 1 caso queira um oi, 2 caso queira um tchau, 3 caso queira uma batata:");
		int num = read.nextInt();

		String inventario;

		switch (num) {
		case 1:
			System.out.println("Oi como vai?");
			break;
		case 2:
			System.out.println("Tchau até a proxima");
			break;
		case 3:
			System.out.println("Você ganhou uma batata");
			inventario = "batata";

			System.out.println("Gostaria de comer a batata? 1 para sim e 2 para não");
			int num2 = read.nextInt();

			if (num2 == 1) {
				inventario = "";
				System.out.println("Voce decidiu comer a batata");
			} else if (num2 == 2) {
				System.out.println("Você decidiu guardar a batata para depois");
			} else {
				inventario = "";
				System.out.println("Digitou um numero errado e sua batata foi roubada");
			}

			break;

		default:

			System.out.println("Digitou um numero errado");
			break;
		}
		read.close();

	}

}
