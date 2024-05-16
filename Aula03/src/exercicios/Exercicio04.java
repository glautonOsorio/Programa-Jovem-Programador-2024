package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int num1;
		int result;

		while (true) {

			System.out.println("Digite um numero entre 1 até 1000 para mostrar todos os impares até o numero digitado");
			num1 = read.nextInt();

			if (num1 >= 1 && num1 <= 1000) {

				for (int i = 1; i <= num1; i++) {
					result = i % 2;
					if (result != 0) {
						System.out.printf("Impar: %s%n", i);
					}
				}
				break;
			} else {
				System.out.println("Digite o numero novamente");
				read.nextLine();
			}
		}
		read.close();
	}

}