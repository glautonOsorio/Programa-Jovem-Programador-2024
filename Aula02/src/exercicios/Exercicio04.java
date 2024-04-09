package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o nome de um dia da semana:");
		String day = read.nextLine();
		
		read.close();
		
		switch (day.toLowerCase()) {
		case "segunda":
		case "terça":
		case "quarta":
		case "quinta":
		case "sexta":
			System.out.printf("Você digitou %s, que é um dia util %n",day);
			break;
		case "sabado":
		case "domingo":
		
			System.out.printf("Você digitou %s, que é um fim de semana",day);
			break;
	

		default:
			System.out.println("Você digitou um valor errado");
			break;
		}

		

	}

}
