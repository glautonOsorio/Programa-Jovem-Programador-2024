package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int numOperations;
        int num1;
        int num2;
        int again;
        double result;

        while (true) {
            System.out.println("Quantas operações de divisão você quer fazer?");
            numOperations = read.nextInt();
            if (numOperations == 0) {
                System.out.println("A aplicação encerrou");
                break;
            } else {

                for (int i = 1; i <= numOperations; i++) {
                    System.out.println("Digite o primeiro numero:");
                    num1 = read.nextInt();
                    System.out.println("Digite o segundo numero:");
                    num2 = read.nextInt();

                    if (num2 == 0) {
                        System.out.println("Divisão impossivel");
                    } else {
                        result = (double) num1 / num2;
                        System.out.printf("O resultado da divisão é: %.2f%n", result);
                    }
                }

                System.out.println("Quer continuar o progrma? 1 = sim | 2 = não");
                again = read.nextInt();

                if (again == 2) {
                    System.out.println("Termino da aplicação");
                    break;
                } else if (again != 1 && again != 2) {
                    System.out.println("Digitou o numero errado, a aplicação ira fechar");
                    break;
                } else {
                    System.out.println("A Aplicação ira reiniciar");

                }

            }

        }

        read.close();
    }
}
