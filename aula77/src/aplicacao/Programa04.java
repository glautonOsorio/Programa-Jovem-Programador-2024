package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Pessoa;

public class Programa04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();

		// Armazenar as pessoas menores de idade da lista principal
		List<Pessoa> listaMenores = new ArrayList<>();

		System.out.println("Quantas pessoas você vai cadastrar");
		int qtdPessoas = leia.nextInt();

		double soma = 0;
		int menor16 = 0;
		for (int i = 0; i < qtdPessoas; i++) {

			leia.nextLine();
			System.out.println("Pessoa " + (i + 1));

			System.out.print("Digite seu nome: ");
			String nome = leia.nextLine();

			System.out.print("Digite sua altura: ");
			double altura = leia.nextDouble();

			System.out.print("Digite sua idade: ");
			int idade = leia.nextInt();

			System.out.print("Digite sua peso: ");
			double peso = leia.nextDouble();

			Pessoa pessoa = new Pessoa(nome, altura, idade, peso);
			lista.add(pessoa);
			// Somando as alturas
			soma = soma + pessoa.getAltura();

			if (!pessoa.ehMaiorDeIdade()) {
				listaMenores.add(pessoa);
				menor16++;
			}
		}
		double media = soma / qtdPessoas;
		System.out.println("Média das alturas: " + media);

		System.out.println("Quantidade de pessoas menores de idade: " + menor16);
		System.out.println("Nomes dos menores de idade");

		for (int i = 0; i < listaMenores.size(); i++) {
			System.out.println(listaMenores.get(i).getNome());
		}

		for (Pessoa pessoa : listaMenores) {
			System.out.println(pessoa.getNome());
		}

		leia.nextLine();
		System.out.println("Digite o nome da pessoa que você quer encontrar");
		String nome = leia.nextLine();

		for (Pessoa pessoa : lista) {

			if (pessoa.getNome().equals(nome)) {
				System.out.println(nome + " encontrado!");

				System.out.println("Sua altura é " + pessoa.getAltura());
				System.out.println("Sua idade é " + pessoa.getIdade());
				System.out.println("Seu peso é " + pessoa.getPeso());
			}

		}

	}

}
