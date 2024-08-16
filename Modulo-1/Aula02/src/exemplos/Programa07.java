package exemplos;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");

		int num1 = read.nextInt();

		System.out.println("Digite o segundo numero:");

		int num2 = read.nextInt();

		read.nextLine();

		System.out.println("Qual a operação? [+,-,*,/]");

		char operator = read.nextLine().charAt(0);

		double result = 0;

		read.close();

		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.printf("A soma de %s e %s é: %s", num1, num2, result);
			break;
		case '-':
			result = num1 - num2;
			System.out.printf("A subtração de %s e %s é: %s", num1, num2, result);
			break;
		case '*':
			result = num1 * num2;
			System.out.printf("A multiplicação de %s e %s é: %s", num1, num2, result);
			break;
		case '/':
			if (num2 == 0) {
				System.out.println("Não se pode dividir por 0");
				return;
			}
			result = num1 / num2;
			System.out.printf("A divisão de %s e %s é: %s", num1, num2, result);
			break;

		default:
			System.out.println("Opção invalida");
			break;
		}

	}

}
