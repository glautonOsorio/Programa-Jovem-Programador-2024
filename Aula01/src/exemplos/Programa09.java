package exemplos;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		
		
		
		
		System.out.println("Digite o seu nome: ");
		String nome = read.nextLine();
		System.out.println("Bem vindo " + nome);
		read.next();
		System.out.println("Digite o sua idade: ");
		int idade = read.nextInt();
		System.out.println("Sua idade é " + idade);
		read.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
