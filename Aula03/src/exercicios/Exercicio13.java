package exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Avalie o nosso sistema com uma nota entre 0 e 10:");
        int num = read.nextInt();

        read.close();

        if (num > 10 || num < 0) {
            System.out.println("Você digitou um numero invalido");

        } else {

            switch (num) {
                case 10:
                case 9:
                    System.out.printf("Você nos avaliou em %s que seria o equivalente a um A", num);
                    break;
                case 8:
                    System.out.printf("Você nos avaliou em %s que seria o equivalente a um B", num);
                    break;

                case 7:
                    System.out.printf("Você nos avaliou em %s que seria o equivalente a um C", num);
                    break;
                case 6:
                    System.out.printf("Você nos avaliou em %s que seria o equivalente a um D", num);
                    break;
                case 5:
                    System.out.printf("Você nos avaliou em %s que seria o equivalente a um E", num);
                    break;

                default:
                    System.out.printf("Você nos avaliou em %s que seria o equivalente a um F", num);
                    break;
            }
        }

    }

}
