package Aula04.src.exemplos;


import java.util.Arrays;
import java.util.Scanner;

public class CadastrolAluno {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String[] alunos = new String[50];
		alunos[0] = "Diogo";
		alunos[1] = "Heitor";
		alunos[2] = "João";
		alunos[3] = "Fabio";
		alunos[4] = "Rogério";
		alunos[5] = "Milton";
		alunos[6] = "Anderson";

		while (true) {

			System.out.println("Bem vindo ao sistema");
			System.out.println("Digite 1 para cadastrar um aluno");
			System.out.println("Digite 2 para remover um aluno");
			System.out.println("Digite 3 para sair do sistema");
			int opcao = leia.nextInt();
			leia.nextLine();

			if (opcao == 1) {

				System.out.println("Digite o nome do aluno: ");
				String nome = leia.nextLine();

				for (int i = 0; i < alunos.length; i++) {
					if (alunos[i] == null) {
						alunos[i] = nome;
						System.out.println("Aluno cadastrado");
						break;
					}
				}

			} else if (opcao == 2) {

			} else if (opcao == 3) {
				System.out.println("Saindo");
				break;
			} else {
				System.out.println("Opção inválida");
			}

		}
	}
}