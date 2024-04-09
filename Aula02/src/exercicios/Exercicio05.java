package exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int num1 = read.nextInt();
		System.out.println("Digite o segundo numero:");
		int num2 = read.nextInt();
		System.out.println("Digite o terceiro numero:");
		int num3 = read.nextInt();
		
		read.close();
		
		if(num1 > num2 && num1 > num3) {
			System.out.printf("O %s é o maior numero",num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.printf("O %s é o maior numero",num2);			
		}else {
			System.out.printf("O %s é o maior numero", num3);
		}

		
	}

}
