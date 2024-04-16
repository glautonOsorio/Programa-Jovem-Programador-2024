package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite um valor entre 0 e 100");
		int num = read.nextInt();

		read.close();

		if (num >= 0 && num <= 25) {
			System.out.println("Seu numero esta entre 0 e 25");

		} else if (num > 25 && num <= 50) {
			System.out.println("Seu numero esta entre 25 e 50");
		} else if (num > 50 && num <= 75) {
			System.out.println("Seu numero esta entre 50 e 75");

		} else if (num > 75 && num <= 100) {
			System.out.println("Seu numero esta entre 75 e 100");

		} 
		 else if (num < 0 ) {
			System.out.println("Você digitou um numero negativo, tem que ser entre 0 e 100");

		} else {

			System.out.println("Você digitou um numero errado");
		}

	}

}
