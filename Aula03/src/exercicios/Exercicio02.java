package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int x;
        int y;

        while (true) {
            System.out.println("Digite Qual sera o valor de x:");
            x = read.nextInt();
            System.out.println("Digite Qual sera o valor de y:");
            y = read.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            } else {
                System.out.println("Encerrando operações");
                break;
            }
        }
        read.close();

    }

}
