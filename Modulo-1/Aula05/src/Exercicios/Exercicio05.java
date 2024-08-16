package src.Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a primeira palavra: ");
		String word1 = scanner.nextLine();

		System.out.print("Digite a segunda palavra: ");
		String word2 = scanner.nextLine();

		String result = Comparcao(word1, word2);

		System.out.println(result);

		scanner.close();
	}

	

	public static String Comparcao(String word1, String word2) {
		String error;

		boolean equals = true;

		if (word1.length() != word2.length()) {
			error = "A letra tem que ter " + word2.length() + " digitos";

			return error;

		} else {

			for (int i = 0; i < word2.length(); i++) {

				if (word1.charAt(i) != word2.charAt(i)) {
					equals = false;
					break;
				}

			}
			if (equals == false) {
				error = "A palavra não é igual";
				return error;

			} else {

				String right = "Você acertou a comparação de palavra";
				return right;
			}

		}
	}

}
