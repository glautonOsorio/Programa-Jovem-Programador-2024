package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num;
        int result = 0;
        int insertedNum = 0;

        while (true) {

            System.out.println("Digite um numero:");
            num = read.nextInt();

            if (num < 0) {

                System.out.println("Aplicação encerrada");

                if (insertedNum == 0) {
                    System.out.println("Você não inseriu nenhum numero positivo");

                } else {

                    System.out.printf("Essa é a quantidade de numeros positivos que você inseriu: %s%n", insertedNum);
                    System.out.printf("Essa é a soma de todos os numeros positivos: %s", result);
                }
                break;

            } else {
                insertedNum++;
                result += num;
                System.out.println("Numero adicionado");

            }

        }

    }

}
