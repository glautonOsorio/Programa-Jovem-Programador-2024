package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int num1;

		while (true) {

			System.out.println("Digite um numero:");
			num1 = read.nextInt();

			if (num1 >= 1) {

				for (int i = 1; i <= num1; i++) {
					int multi1 = i * i;
					int multi2 = multi1 * i;
					System.out.printf("Resposta: %s | %s | %s%n", i, multi1, multi2);

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