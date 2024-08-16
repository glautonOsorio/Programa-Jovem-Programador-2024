package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
		
		System.out.println("Digite a primeiro nota do aluno:");
		int score1 = read.nextInt();
		System.out.println("Digite a segunda nota do aluno:");
		int score2 = read.nextInt();
		System.out.println("Digite a terceira nota do aluno:");
		int score3 = read.nextInt();
		
		read.close();
		
		double result = (score1 + score2 + score3) / 3;
		
		if(result >= 7) {
			System.out.printf("O aluno foi aprovado com %s pontos",result);
		}else if(result <= 4) {
			System.out.printf("O aluno foi reprovado com %s pontos",result);
		}else {
			System.out.printf("O aluno esta em recuperação com %s pontos",result);
		}
	}

}
