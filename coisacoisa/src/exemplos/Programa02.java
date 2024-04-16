package exemplos;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota da sua avaliação");
		
		int nota = leia.nextInt();
		leia.close();
		
		if (nota >= 7) {
			
			System.out.println("Aluno Aprovado");

			
		} else {
			
			System.out.println("Aluno Reprovado");


		}
	}

}
