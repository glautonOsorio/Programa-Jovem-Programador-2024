package Aula03.src.desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafios02 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int num;
        int atempts = 6;

        int randomNum = random.nextInt(100);

        while (true) {

            System.out.println("Tente adivinhar o numero aleatorio entre 1 e 100;");
            num = read.nextInt();

            if (num <= 0 || num > 100) {
                System.out.println("Numero errado digite novamente");

            } else {
                if (atempts == 0) {
                    System.out.println("Você falhou como ser humano");
                    System.out.printf(" O numero era: %s%n", randomNum);
                    break;
                }
                if (num > randomNum) {
                    atempts--;
                    System.out.println("O numero e menor que o numero inserido");
                    System.out.printf("Você ainda tem %s tentativas %n", atempts);

                } else if (num < randomNum) {
                    atempts--;
                    System.out.println("O numero e maior que o numero inserido");
                    System.out.printf("Você ainda tem %s tentativas %n", atempts);
                } else {

                    System.out.println("Você acertou o numero aleatorio!");
                    break;

                }
            }

        }
        read.close();

    }

}
