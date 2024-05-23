package aplicacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Pessoa;

public class Programa06 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("Quantas funcionarios você vai cadastrar");
		int quantFunc = read.nextInt();

		for (int i = 0; i < quantFunc; i++) {

			read.nextLine();
			System.out.println("Funcionario " + (i + 1));

			System.out.print("Digite o Id: ");
			int Id = read.nextInt();
			read.nextLine();

			System.out.print("Digite seu nome: ");
			String nome = read.nextLine();

			System.out.print("Digite seu salario: ");
			double salario = read.nextDouble();

			Funcionario funcionario = new Funcionario(Id, nome, salario);
			list.add(funcionario);
		}

		read.nextLine();
		System.out.println("Digite o id da pessoa que você quer encontrar");
		int findId = read.nextInt();

		for (Funcionario funcionario : list) {

			if (funcionario.getId() == findId) {
				System.out.println("Digite a porcetagem que o salario ira aumentar?");
				double aumento = read.nextDouble();

				funcionario.setAumentoSalario(funcionario.getSalario(), aumento);

				System.out.println("Seu Id é " + funcionario.getId());
				System.out.println("Sua nome é " + funcionario.getNome());
				System.out.printf("Seu salario é %.2f" ,funcionario.getSalario());
				break;
			}

		}

	}

}
