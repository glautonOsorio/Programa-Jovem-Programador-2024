package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int choice;
		int gas = 0;
		int diesel = 0;
		int alcool = 0;

		while (true) {

			System.out.println("Menu");
			System.out.println("1. Álcool");
			System.out.println("2. Gasolina");
			System.out.println("3. Diesel");
			System.out.println("4. Fim");
			System.out.println("Enter 1, 2, 3, or 4");
			choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("Álcool adicionada com sucesso");
				alcool += 1;
			} else if (choice == 2) {
				System.out.println("Gasolina adicionada com sucesso");
				gas += 1;
			} else if (choice == 3) {
				System.out.println("Diesel adicionada com sucesso");
				diesel += 1;
			} else if (choice == 4) {
				System.out.println("Pedido Fechado");
				System.out.printf("Gasolina: %s%n", gas);
				System.out.printf("Álcool: %s%n", alcool);
				System.out.printf("Diesel: %s%n", diesel);
				break;
			} else {
				System.out.println("Digitou algo errado");
			}

		}

		scan.close();

	}

}