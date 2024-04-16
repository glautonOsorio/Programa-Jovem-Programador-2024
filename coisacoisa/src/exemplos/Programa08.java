package exemplos;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = leia.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = leia.nextInt();
		leia.nextLine(); // limpar o buffer

		System.out.println("Qual a operação? [+,-,*,/]");
		char operacao = leia.nextLine().charAt(0);

		double resultado = 0;
		if (operacao == '+') {
			resultado = num1 + num2;
		} else if (operacao == '-') {
			resultado = num1 - num2;
		} else if (operacao == '*') {
			resultado = num1 * num2;
		} else if (operacao == '/') {
			// if aninhado
			if (num2 != 0) {
				resultado = num1 / num2;
			} else {
				System.out.println("ERRO! DIVISAO POR ZERO!");
				
			}
		} else {
			System.out.println("Opção inválida");
		}

		System.out.println("O resultado da operação foi " + resultado);
		leia.close();


	}

}
