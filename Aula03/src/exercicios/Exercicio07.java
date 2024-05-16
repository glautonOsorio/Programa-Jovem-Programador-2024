package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite uma batata em numero");
        int batata = read.nextInt();
        int result = 1;

        if (batata == 0 || batata == 1) {

            System.out.println("O fatorial é " + 1);

        } else {

            for (int i = 2; i <= batata; i++) {
                result *= i;
            }

            System.out.printf("O Fatorial de %s é : %s", batata, result);
        }
    }

}