package exemplos;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = leia.nextInt();
		
		leia.nextLine();
		System.out.println("Você é estudante? [s/n] ");
		char ehEstudante = leia.nextLine().toLowerCase().charAt(0);
	
		if ( (ehEstudante != 's') && (ehEstudante != 'n') ) {
			System.out.println("Opção invalida");			
		} else if (idade < 18   || ehEstudante == 's'  ) {
			System.out.println("Paga Meia");		
		} else {
			System.out.println("Paga Inteira");
		}
		
		
		
		
		
		
		
	
	}

}
