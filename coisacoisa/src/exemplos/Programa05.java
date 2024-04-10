package exemplos;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Restaurante");
		System.out.println("Digite 1 para carnes");
		System.out.println("Digite 2 para bebidas");
		System.out.println("Digite 3 para sobremesas");
		
		int opcao = leia.nextInt();
		
		if ( opcao == 1) {
			System.out.println("Você selecionou a opção carnes");
		} else if ( opcao == 2) {
			System.out.println("Você selecionou a opção bebidas");
		} else if ( opcao == 3) {
			System.out.println("Você selecionou a opção sobremesas");
		} else {
			System.out.println("Opção inválida");
		}
		
		leia.close();
	}

}
