package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String secretWord = "temporizador";
        boolean test = false;
        String word;

        while (true) {

            System.out.printf("Digite uma palavra de %s%n:", secretWord.length());
            word = read.nextLine().toLowerCase();
            if (word.length() != secretWord.length()) {
                System.out.printf("A letra tem que ter %s%n digitos", secretWord.length());

            } else {

                for (int i = 0; i < secretWord.length(); i++) {

                    if (word.charAt(i) == secretWord.charAt(i)) {
                        test = true;
                    } else {
                        break;
                    }
                }

                if (test == false) {
                    System.out.println("Você errou a palavra tente novamente");

                } else {
                    System.out.println("Você acertou a palavra parabéns");
                    break;
                }
            }
        }
        read.close();

    }

}
