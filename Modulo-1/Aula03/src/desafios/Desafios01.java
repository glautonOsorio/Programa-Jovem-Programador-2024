package Aula03.src.desafios;

import java.util.Scanner;

public class Desafios01 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int num;

        while (true) {

            System.out.println("Digite um numero e saiba o seus divisores");
            num = read.nextInt();

            if (num <= 0) {
                System.out.println("Não existem divisões de zero ou não digite um numero negativo, tente novamente ");

            } else {

                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        System.out.printf("Divisor: %s%n", i);
                    }
                }
                break;
            }
        }
        read.close();

    }

}
