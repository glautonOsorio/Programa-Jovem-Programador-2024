package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String word = read.nextLine().toLowerCase().trim();
        int aResult = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                aResult++;
            }
        }

        if (aResult == 0) {

            System.out.printf("A sua palavra %s não contem  letras a", word);
        } else {

            System.out.printf("A sua palavra %s contem %s letras a", word, aResult);
        }

    }

}
