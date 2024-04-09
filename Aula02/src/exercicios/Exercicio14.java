package exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("Digite 1 caso queira um oi, 2 caso queira um tchau, 3 caso queira um queijo:");
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
			System.out.println("Você ganhou um queijo");
			inventario = "queijo";
			
			System.out.println("Gostaria de comer o queijo? 1 para sim e 2 para não");
			int num2 = read.nextInt();
			
			if(num2 == 1 ) {
				inventario = "";
				System.out.println("Voce decidiu comer o queijo");
			}else {
				System.out.println("Você decidiu guardar o queijo para depois");
			}
				
			
			break;

		default:
			
			System.out.println("Digitou um numero errado");
			break;
		}
		read.close();


	}

}
