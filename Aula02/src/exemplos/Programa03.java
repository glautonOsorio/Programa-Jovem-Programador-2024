package exemplos;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String emailJafeito = "email@email.com";
		String senhaJafeito = "batata";
		
		System.out.println("Qual o seu email?");
		String email = read.nextLine();
		System.out.println("Qual a sua senha?");
		String senha = read.nextLine();
		
		
		if (email.equals(emailJafeito) && senha.equals(senhaJafeito)) {
			System.out.printf("Bem vindo %s",email);
			
		} else {
			
			System.out.println("Senha ou email errado");

		}

		read.close();
		
	}


}
